package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.chartPointObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  var point: js.UndefOr[chartPointObject] = js.undefined
  
  var value: js.UndefOr[typings.std.Date | Double | String] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object Point {
  
  inline def apply(): Point = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Point]
  }
  
  extension [Self <: Point](x: Self) {
    
    inline def setPoint(value: chartPointObject): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setValue(value: typings.std.Date | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
