package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupOptions extends StObject {
  
  /**
    * Called when menu is closed.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The index of the menu item to be positioned under the mouse cursor at the
    * specified coordinates. Default is -1.
    *
    * @platform darwin
    */
  var positioningItem: js.UndefOr[Double] = js.native
  
  /**
    * Default is the focused window.
    */
  var window: js.UndefOr[BrowserWindow] = js.native
  
  /**
    * Default is the current mouse cursor position. Must be declared if `y` is
    * declared.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Default is the current mouse cursor position. Must be declared if `x` is
    * declared.
    */
  var y: js.UndefOr[Double] = js.native
}
object PopupOptions {
  
  @scala.inline
  def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  
  @scala.inline
  implicit class PopupOptionsMutableBuilder[Self <: PopupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setPositioningItem(value: Double): Self = StObject.set(x, "positioningItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositioningItemUndefined: Self = StObject.set(x, "positioningItem", js.undefined)
    
    @scala.inline
    def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
