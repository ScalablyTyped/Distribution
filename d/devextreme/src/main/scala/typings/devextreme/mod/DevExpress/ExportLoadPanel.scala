package typings.devextreme.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportLoadPanel extends StObject {
  
  /**
    * Specifies whether the load panel is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the height of the load panel in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a URL pointing to an image to be used as a loading indicator.
    */
  var indicatorSrc: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to shade the UI component when the load panel is shown.
    */
  var shading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the shading color. Applies only if shading is true.
    */
  var shadingColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to show the loading indicator.
    */
  var showIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show the pane of the load panel.
    */
  var showPane: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies text displayed on the load panel.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the width of the load panel in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ExportLoadPanel {
  
  inline def apply(): ExportLoadPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportLoadPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportLoadPanel] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIndicatorSrc(value: String): Self = StObject.set(x, "indicatorSrc", value.asInstanceOf[js.Any])
    
    inline def setIndicatorSrcUndefined: Self = StObject.set(x, "indicatorSrc", js.undefined)
    
    inline def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    inline def setShowIndicator(value: Boolean): Self = StObject.set(x, "showIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowIndicatorUndefined: Self = StObject.set(x, "showIndicator", js.undefined)
    
    inline def setShowPane(value: Boolean): Self = StObject.set(x, "showPane", value.asInstanceOf[js.Any])
    
    inline def setShowPaneUndefined: Self = StObject.set(x, "showPane", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
