package typings.focusLock

import typings.std.Element
import typings.std.FocusOptions
import typings.std.HTMLDocument
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siblingMod {
  
  @JSImport("focus-lock/dist/es5/sibling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def focusNextElement(baseElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusNextElement")(baseElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusNextElement(baseElement: Element, options: FocusNextOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusNextElement")(baseElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def focusPrevElement(baseElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusPrevElement")(baseElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusPrevElement(baseElement: Element, options: FocusNextOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusPrevElement")(baseElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FocusNextOptions extends StObject {
    
    /**
      * enables cycling inside the scope
      * @default true
      */
    var cycle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * options for focus action to control it more precisely (ie. `{ preventScroll: true }`)
      */
    var focusOptions: js.UndefOr[FocusOptions] = js.undefined
    
    /**
      * the component to "scope" focus in
      * @default document.body
      */
    var scope: js.UndefOr[HTMLElement | HTMLDocument] = js.undefined
  }
  object FocusNextOptions {
    
    inline def apply(): FocusNextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusNextOptions]
    }
    
    extension [Self <: FocusNextOptions](x: Self) {
      
      inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
      
      inline def setFocusOptions(value: FocusOptions): Self = StObject.set(x, "focusOptions", value.asInstanceOf[js.Any])
      
      inline def setFocusOptionsUndefined: Self = StObject.set(x, "focusOptions", js.undefined)
      
      inline def setScope(value: HTMLElement | HTMLDocument): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
