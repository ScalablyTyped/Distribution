package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.ChartSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizeSeries extends StObject {
  
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ js.Any, ChartSeries]] = js.undefined
  
  var nameField: js.UndefOr[String] = js.undefined
}
object CustomizeSeries {
  
  inline def apply(): CustomizeSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeSeries]
  }
  
  extension [Self <: CustomizeSeries](x: Self) {
    
    inline def setCustomizeSeries(value: /* seriesName */ js.Any => ChartSeries): Self = StObject.set(x, "customizeSeries", js.Any.fromFunction1(value))
    
    inline def setCustomizeSeriesUndefined: Self = StObject.set(x, "customizeSeries", js.undefined)
    
    inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
  }
}
