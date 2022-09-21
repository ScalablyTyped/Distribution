package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartArgumentAxisStrips
  extends StObject
     with dxPolarChartCommonAxisSettingsStripStyle {
  
  /**
    * Specifies a color for a strip.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an end value for a strip.
    */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * An object that defines the label configuration properties of a strip.
    */
  @JSName("label")
  var label_dxPolarChartArgumentAxisStrips: js.UndefOr[dxPolarChartArgumentAxisStripsLabel] = js.undefined
  
  /**
    * Specifies a start value for a strip.
    */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}
object dxPolarChartArgumentAxisStrips {
  
  inline def apply(): dxPolarChartArgumentAxisStrips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisStrips]
  }
  
  extension [Self <: dxPolarChartArgumentAxisStrips](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndValue(value: Double | js.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setLabel(value: dxPolarChartArgumentAxisStripsLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setStartValue(value: Double | js.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
