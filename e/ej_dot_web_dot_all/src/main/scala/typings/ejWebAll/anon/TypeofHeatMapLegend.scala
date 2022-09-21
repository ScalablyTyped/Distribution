package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.HeatMapLegend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHeatMapLegend extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: HeatMapLegend
}
object TypeofHeatMapLegend {
  
  inline def apply(Locale: Any, fn: HeatMapLegend): TypeofHeatMapLegend = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHeatMapLegend]
  }
  
  extension [Self <: TypeofHeatMapLegend](x: Self) {
    
    inline def setFn(value: HeatMapLegend): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
