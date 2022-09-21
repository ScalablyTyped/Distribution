package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Delay
import typings.devextreme.mod.DevExpress.PositionConfig
import typings.devextreme.mod.DevExpress.common.Position
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPopoverOptions[TComponent]
  extends StObject
     with dxPopupOptions[TComponent] {
  
  /**
    * Configures UI component visibility animations. This object contains two fields: show and hide.
    */
  @JSName("animation")
  var animation_dxPopoverOptions: js.UndefOr[dxPopoverAnimation] = js.undefined
  
  /**
    * Specifies properties of popover hiding. Ignored if the shading property is set to true.
    */
  var hideEvent: js.UndefOr[Delay | String] = js.undefined
  
  /**
    * An object defining UI component positioning properties.
    */
  @JSName("position")
  var position_dxPopoverOptions: js.UndefOr[Position | PositionConfig] = js.undefined
  
  /**
    * Specifies properties for displaying the UI component.
    */
  var showEvent: js.UndefOr[Delay | String] = js.undefined
  
  /**
    * The target element associated with the widget.
    */
  var target: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
}
object dxPopoverOptions {
  
  inline def apply[TComponent](): dxPopoverOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopoverOptions[TComponent]]
  }
  
  extension [Self <: dxPopoverOptions[?], TComponent](x: Self & dxPopoverOptions[TComponent]) {
    
    inline def setAnimation(value: dxPopoverAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setHideEvent(value: Delay | String): Self = StObject.set(x, "hideEvent", value.asInstanceOf[js.Any])
    
    inline def setHideEventUndefined: Self = StObject.set(x, "hideEvent", js.undefined)
    
    inline def setPosition(value: Position | PositionConfig): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowEvent(value: Delay | String): Self = StObject.set(x, "showEvent", value.asInstanceOf[js.Any])
    
    inline def setShowEventUndefined: Self = StObject.set(x, "showEvent", js.undefined)
    
    inline def setTarget(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
