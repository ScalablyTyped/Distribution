package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsHoltLinearModelSettings extends StObject {
  
  var alpha: js.UndefOr[float] = js.undefined
  
  var beta: js.UndefOr[float] = js.undefined
}
object AggregationsHoltLinearModelSettings {
  
  inline def apply(): AggregationsHoltLinearModelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsHoltLinearModelSettings]
  }
  
  extension [Self <: AggregationsHoltLinearModelSettings](x: Self) {
    
    inline def setAlpha(value: float): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBeta(value: float): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
  }
}
