package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.PieChartSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameField extends StObject {
  
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ js.Any, PieChartSeries]] = js.undefined
  
  var nameField: js.UndefOr[String] = js.undefined
}
object NameField {
  
  inline def apply(): NameField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameField]
  }
  
  extension [Self <: NameField](x: Self) {
    
    inline def setCustomizeSeries(value: /* seriesName */ js.Any => PieChartSeries): Self = StObject.set(x, "customizeSeries", js.Any.fromFunction1(value))
    
    inline def setCustomizeSeriesUndefined: Self = StObject.set(x, "customizeSeries", js.undefined)
    
    inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
  }
}
