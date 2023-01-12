package typings.focusWithin

import typings.std.HTMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(document: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].apply(document.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(document: HTMLDocument, opts: FocusWithinOpts): Unit = (^.asInstanceOf[js.Dynamic].apply(document.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("focus-within", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FocusWithinOpts extends StObject {
    
    var attr: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
  }
  object FocusWithinOpts {
    
    inline def apply(): FocusWithinOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusWithinOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusWithinOpts] (val x: Self) extends AnyVal {
      
      inline def setAttr(value: Boolean): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
