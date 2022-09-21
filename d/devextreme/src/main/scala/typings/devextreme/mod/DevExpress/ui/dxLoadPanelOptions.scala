package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.PositionConfig
import typings.devextreme.mod.DevExpress.common.PositionAlignment
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLoadPanelOptions
  extends StObject
     with dxOverlayOptions[dxLoadPanel] {
  
  /**
    * Configures UI component visibility animations. This object contains two fields: show and hide.
    */
  @JSName("animation")
  var animation_dxLoadPanelOptions: js.UndefOr[dxLoadPanelAnimation] = js.undefined
  
  /**
    * Specifies the UI component&apos;s container.
    */
  var container: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * The delay in milliseconds after which the load panel is displayed.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * A URL pointing to an image to be used as a load indicator.
    */
  var indicatorSrc: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed in the load panel. Ignored in the Material Design theme.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Positions the UI component.
    */
  @JSName("position")
  var position_dxLoadPanelOptions: js.UndefOr[PositionAlignment | PositionConfig | js.Function] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to show a load indicator.
    */
  var showIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to show the pane behind the load indicator.
    */
  var showPane: js.UndefOr[Boolean] = js.undefined
}
object dxLoadPanelOptions {
  
  inline def apply(): dxLoadPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLoadPanelOptions]
  }
  
  extension [Self <: dxLoadPanelOptions](x: Self) {
    
    inline def setAnimation(value: dxLoadPanelAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setContainer(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setIndicatorSrc(value: String): Self = StObject.set(x, "indicatorSrc", value.asInstanceOf[js.Any])
    
    inline def setIndicatorSrcUndefined: Self = StObject.set(x, "indicatorSrc", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPosition(value: PositionAlignment | PositionConfig | js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowIndicator(value: Boolean): Self = StObject.set(x, "showIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowIndicatorUndefined: Self = StObject.set(x, "showIndicator", js.undefined)
    
    inline def setShowPane(value: Boolean): Self = StObject.set(x, "showPane", value.asInstanceOf[js.Any])
    
    inline def setShowPaneUndefined: Self = StObject.set(x, "showPane", js.undefined)
  }
}
