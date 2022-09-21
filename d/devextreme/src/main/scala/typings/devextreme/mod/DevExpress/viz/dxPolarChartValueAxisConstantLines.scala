package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartValueAxisConstantLines
  extends StObject
     with dxPolarChartCommonAxisSettingsConstantLineStyle {
  
  /**
    * Specifies whether to display the constant line behind or in front of the series.
    */
  var displayBehindSeries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to extend the axis to display the constant line.
    */
  var extendAxis: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object defining constant line label properties.
    */
  @JSName("label")
  var label_dxPolarChartValueAxisConstantLines: js.UndefOr[dxPolarChartValueAxisConstantLinesLabel] = js.undefined
  
  /**
    * Specifies a value to be displayed by a constant line.
    */
  var value: js.UndefOr[Double | js.Date | String] = js.undefined
}
object dxPolarChartValueAxisConstantLines {
  
  inline def apply(): dxPolarChartValueAxisConstantLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxisConstantLines]
  }
  
  extension [Self <: dxPolarChartValueAxisConstantLines](x: Self) {
    
    inline def setDisplayBehindSeries(value: Boolean): Self = StObject.set(x, "displayBehindSeries", value.asInstanceOf[js.Any])
    
    inline def setDisplayBehindSeriesUndefined: Self = StObject.set(x, "displayBehindSeries", js.undefined)
    
    inline def setExtendAxis(value: Boolean): Self = StObject.set(x, "extendAxis", value.asInstanceOf[js.Any])
    
    inline def setExtendAxisUndefined: Self = StObject.set(x, "extendAxis", js.undefined)
    
    inline def setLabel(value: dxPolarChartValueAxisConstantLinesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: Double | js.Date | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
