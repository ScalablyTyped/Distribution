package typings.focusLock

import typings.std.Element
import typings.std.FocusOptions
import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setFocusMod {
  
  @JSImport("focus-lock/dist/es5/setFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def focusOn(target: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusOn")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusOn(target: Element, focusOptions: FocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusOn")(target.asInstanceOf[js.Any], focusOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusOn(target: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusOn")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusOn(target: HTMLElement, focusOptions: FocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusOn")(target.asInstanceOf[js.Any], focusOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusOn(target: HTMLFrameElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusOn")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusOn(target: HTMLFrameElement, focusOptions: FocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusOn")(target.asInstanceOf[js.Any], focusOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setFocus(topNode: HTMLElement, lastNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFocus")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setFocus(topNode: HTMLElement, lastNode: Element, options: FocusLockFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFocus")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FocusLockFocusOptions extends StObject {
    
    var focusOptions: js.UndefOr[FocusOptions] = js.undefined
  }
  object FocusLockFocusOptions {
    
    inline def apply(): FocusLockFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusLockFocusOptions]
    }
    
    extension [Self <: FocusLockFocusOptions](x: Self) {
      
      inline def setFocusOptions(value: FocusOptions): Self = StObject.set(x, "focusOptions", value.asInstanceOf[js.Any])
      
      inline def setFocusOptionsUndefined: Self = StObject.set(x, "focusOptions", js.undefined)
    }
  }
}
