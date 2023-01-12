package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.DashStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonAxisSettingsConstantLineStyle extends StObject {
  
  /**
    * Specifies the color of constant lines.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the dash style of constant lines.
    */
  var dashStyle: js.UndefOr[DashStyle] = js.undefined
  
  /**
    * Configures constant line labels.
    */
  var label: js.UndefOr[dxChartCommonAxisSettingsConstantLineStyleLabel] = js.undefined
  
  /**
    * Generates a pixel-measured empty space between the left/right side of a constant line and the constant line label.
    */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Generates a pixel-measured empty space between the top/bottom side of a constant line and the constant line label.
    */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width of constant lines in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxChartCommonAxisSettingsConstantLineStyle {
  
  inline def apply(): dxChartCommonAxisSettingsConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsConstantLineStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartCommonAxisSettingsConstantLineStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setLabel(value: dxChartCommonAxisSettingsConstantLineStyleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPaddingLeftRight(value: Double): Self = StObject.set(x, "paddingLeftRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftRightUndefined: Self = StObject.set(x, "paddingLeftRight", js.undefined)
    
    inline def setPaddingTopBottom(value: Double): Self = StObject.set(x, "paddingTopBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopBottomUndefined: Self = StObject.set(x, "paddingTopBottom", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
