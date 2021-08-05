package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarPopoverConstructorOptions extends StObject {
  
  /**
    * Popover button icon.
    */
  var icon: js.UndefOr[NativeImage_] = js.undefined
  
  /**
    * Items to display in the popover.
    */
  var items: TouchBar
  
  /**
    * Popover button text.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * `true` to display a close button on the left of the popover, `false` to not show
    * it. Default is `true`.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
}
object TouchBarPopoverConstructorOptions {
  
  inline def apply(items: TouchBar): TouchBarPopoverConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarPopoverConstructorOptions]
  }
  
  extension [Self <: TouchBarPopoverConstructorOptions](x: Self) {
    
    inline def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItems(value: TouchBar): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
  }
}
