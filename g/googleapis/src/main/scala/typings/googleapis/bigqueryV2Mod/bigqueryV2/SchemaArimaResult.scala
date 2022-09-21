package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArimaResult extends StObject {
  
  /**
    * This message is repeated because there are multiple arima models fitted in auto-arima. For non-auto-arima model, its size is one.
    */
  var arimaModelInfo: js.UndefOr[js.Array[SchemaArimaModelInfo]] = js.undefined
  
  /**
    * Seasonal periods. Repeated because multiple periods are supported for one time series.
    */
  var seasonalPeriods: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaArimaResult {
  
  inline def apply(): SchemaArimaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArimaResult]
  }
  
  extension [Self <: SchemaArimaResult](x: Self) {
    
    inline def setArimaModelInfo(value: js.Array[SchemaArimaModelInfo]): Self = StObject.set(x, "arimaModelInfo", value.asInstanceOf[js.Any])
    
    inline def setArimaModelInfoUndefined: Self = StObject.set(x, "arimaModelInfo", js.undefined)
    
    inline def setArimaModelInfoVarargs(value: SchemaArimaModelInfo*): Self = StObject.set(x, "arimaModelInfo", js.Array(value*))
    
    inline def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    inline def setSeasonalPeriodsNull: Self = StObject.set(x, "seasonalPeriods", null)
    
    inline def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    inline def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value*))
  }
}
