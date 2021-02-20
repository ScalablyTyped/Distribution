package typings.focusWithin

import typings.std.HTMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-within", JSImport.Namespace)
  @js.native
  def apply(document: HTMLDocument): Unit = js.native
  @JSImport("focus-within", JSImport.Namespace)
  @js.native
  def apply(document: HTMLDocument, opts: FocusWithinOpts): Unit = js.native
  
  @js.native
  trait FocusWithinOpts extends StObject {
    
    var attr: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
  }
  object FocusWithinOpts {
    
    @scala.inline
    def apply(): FocusWithinOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusWithinOpts]
    }
    
    @scala.inline
    implicit class FocusWithinOptsMutableBuilder[Self <: FocusWithinOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: Boolean): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
