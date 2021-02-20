package typings.focusLock

import typings.std.Element
import typings.std.HTMLDocument
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siblingMod {
  
  @JSImport("focus-lock/dist/es5/sibling", "focusNextElement")
  @js.native
  def focusNextElement(baseElement: Element): Unit = js.native
  @JSImport("focus-lock/dist/es5/sibling", "focusNextElement")
  @js.native
  def focusNextElement(baseElement: Element, options: FocusNextOptions): Unit = js.native
  
  @JSImport("focus-lock/dist/es5/sibling", "focusPrevElement")
  @js.native
  def focusPrevElement(baseElement: Element): Unit = js.native
  @JSImport("focus-lock/dist/es5/sibling", "focusPrevElement")
  @js.native
  def focusPrevElement(baseElement: Element, options: FocusNextOptions): Unit = js.native
  
  @js.native
  trait FocusNextOptions extends StObject {
    
    var cycle: js.UndefOr[Boolean] = js.native
    
    var scope: js.UndefOr[HTMLElement | HTMLDocument] = js.native
  }
  object FocusNextOptions {
    
    @scala.inline
    def apply(): FocusNextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusNextOptions]
    }
    
    @scala.inline
    implicit class FocusNextOptionsMutableBuilder[Self <: FocusNextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
      
      @scala.inline
      def setScope(value: HTMLElement | HTMLDocument): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
