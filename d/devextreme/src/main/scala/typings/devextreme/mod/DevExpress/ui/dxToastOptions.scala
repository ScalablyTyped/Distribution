package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.PositionConfig
import typings.devextreme.mod.DevExpress.ui.dxToast.ToastType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxToastOptions
  extends StObject
     with dxOverlayOptions[dxToast] {
  
  /**
    * Configures UI component visibility animations. This object contains two fields: show and hide.
    */
  @JSName("animation")
  var animation_dxToastOptions: js.UndefOr[dxToastAnimation] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the toast is closed if a user clicks it.
    */
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the toast is closed if a user swipes it out of the screen boundaries.
    */
  var closeOnSwipe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time span in milliseconds during which the Toast UI component is visible.
    */
  var displayTime: js.UndefOr[Double] = js.undefined
  
  /**
    * The Toast message text.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Positions the UI component.
    */
  @JSName("position")
  var position_dxToastOptions: js.UndefOr[PositionConfig | String] = js.undefined
  
  /**
    * Specifies the Toast UI component type.
    */
  var `type`: js.UndefOr[ToastType] = js.undefined
}
object dxToastOptions {
  
  inline def apply(): dxToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToastOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxToastOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: dxToastAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setCloseOnSwipe(value: Boolean): Self = StObject.set(x, "closeOnSwipe", value.asInstanceOf[js.Any])
    
    inline def setCloseOnSwipeUndefined: Self = StObject.set(x, "closeOnSwipe", js.undefined)
    
    inline def setDisplayTime(value: Double): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
    
    inline def setDisplayTimeUndefined: Self = StObject.set(x, "displayTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPosition(value: PositionConfig | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setType(value: ToastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
