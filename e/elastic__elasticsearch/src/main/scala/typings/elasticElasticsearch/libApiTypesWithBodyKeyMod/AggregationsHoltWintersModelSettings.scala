package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsHoltWintersModelSettings extends StObject {
  
  var alpha: js.UndefOr[float] = js.undefined
  
  var beta: js.UndefOr[float] = js.undefined
  
  var gamma: js.UndefOr[float] = js.undefined
  
  var pad: js.UndefOr[Boolean] = js.undefined
  
  var period: js.UndefOr[integer] = js.undefined
  
  var `type`: js.UndefOr[AggregationsHoltWintersType] = js.undefined
}
object AggregationsHoltWintersModelSettings {
  
  inline def apply(): AggregationsHoltWintersModelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsHoltWintersModelSettings]
  }
  
  extension [Self <: AggregationsHoltWintersModelSettings](x: Self) {
    
    inline def setAlpha(value: float): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBeta(value: float): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
    
    inline def setGamma(value: float): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setPad(value: Boolean): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setPeriod(value: integer): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setType(value: AggregationsHoltWintersType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
