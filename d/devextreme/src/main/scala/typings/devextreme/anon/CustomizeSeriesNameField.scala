package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.PolarChartSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizeSeriesNameField extends StObject {
  
  /**
    * Specifies a callback function that returns a series object with individual series settings.
    */
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ Any, PolarChartSeries]] = js.undefined
  
  /**
    * Specifies a data source field that represents the series name.
    */
  var nameField: js.UndefOr[String] = js.undefined
}
object CustomizeSeriesNameField {
  
  inline def apply(): CustomizeSeriesNameField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeSeriesNameField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomizeSeriesNameField] (val x: Self) extends AnyVal {
    
    inline def setCustomizeSeries(value: /* seriesName */ Any => PolarChartSeries): Self = StObject.set(x, "customizeSeries", js.Any.fromFunction1(value))
    
    inline def setCustomizeSeriesUndefined: Self = StObject.set(x, "customizeSeries", js.undefined)
    
    inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
  }
}
