package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarPopoverConstructorOptions extends StObject {
  
  /**
    * Popover button icon.
    */
  var icon: js.UndefOr[NativeImage_] = js.native
  
  /**
    * Items to display in the popover.
    */
  var items: TouchBar = js.native
  
  /**
    * Popover button text.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * `true` to display a close button on the left of the popover, `false` to not show
    * it. Default is `true`.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
}
object TouchBarPopoverConstructorOptions {
  
  @scala.inline
  def apply(items: TouchBar): TouchBarPopoverConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarPopoverConstructorOptions]
  }
  
  @scala.inline
  implicit class TouchBarPopoverConstructorOptionsMutableBuilder[Self <: TouchBarPopoverConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setItems(value: TouchBar): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
  }
}
