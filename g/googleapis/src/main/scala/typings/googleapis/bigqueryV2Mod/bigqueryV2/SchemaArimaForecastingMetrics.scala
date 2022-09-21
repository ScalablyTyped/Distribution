package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArimaForecastingMetrics extends StObject {
  
  /**
    * Arima model fitting metrics.
    */
  var arimaFittingMetrics: js.UndefOr[js.Array[SchemaArimaFittingMetrics]] = js.undefined
  
  /**
    * Repeated as there can be many metric sets (one for each model) in auto-arima and the large-scale case.
    */
  var arimaSingleModelForecastingMetrics: js.UndefOr[js.Array[SchemaArimaSingleModelForecastingMetrics]] = js.undefined
  
  /**
    * Whether Arima model fitted with drift or not. It is always false when d is not 1.
    */
  var hasDrift: js.UndefOr[js.Array[Boolean] | Null] = js.undefined
  
  /**
    * Non-seasonal order.
    */
  var nonSeasonalOrder: js.UndefOr[js.Array[SchemaArimaOrder]] = js.undefined
  
  /**
    * Seasonal periods. Repeated because multiple periods are supported for one time series.
    */
  var seasonalPeriods: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Id to differentiate different time series for the large-scale case.
    */
  var timeSeriesId: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaArimaForecastingMetrics {
  
  inline def apply(): SchemaArimaForecastingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArimaForecastingMetrics]
  }
  
  extension [Self <: SchemaArimaForecastingMetrics](x: Self) {
    
    inline def setArimaFittingMetrics(value: js.Array[SchemaArimaFittingMetrics]): Self = StObject.set(x, "arimaFittingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaFittingMetricsUndefined: Self = StObject.set(x, "arimaFittingMetrics", js.undefined)
    
    inline def setArimaFittingMetricsVarargs(value: SchemaArimaFittingMetrics*): Self = StObject.set(x, "arimaFittingMetrics", js.Array(value*))
    
    inline def setArimaSingleModelForecastingMetrics(value: js.Array[SchemaArimaSingleModelForecastingMetrics]): Self = StObject.set(x, "arimaSingleModelForecastingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaSingleModelForecastingMetricsUndefined: Self = StObject.set(x, "arimaSingleModelForecastingMetrics", js.undefined)
    
    inline def setArimaSingleModelForecastingMetricsVarargs(value: SchemaArimaSingleModelForecastingMetrics*): Self = StObject.set(x, "arimaSingleModelForecastingMetrics", js.Array(value*))
    
    inline def setHasDrift(value: js.Array[Boolean]): Self = StObject.set(x, "hasDrift", value.asInstanceOf[js.Any])
    
    inline def setHasDriftNull: Self = StObject.set(x, "hasDrift", null)
    
    inline def setHasDriftUndefined: Self = StObject.set(x, "hasDrift", js.undefined)
    
    inline def setHasDriftVarargs(value: Boolean*): Self = StObject.set(x, "hasDrift", js.Array(value*))
    
    inline def setNonSeasonalOrder(value: js.Array[SchemaArimaOrder]): Self = StObject.set(x, "nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    inline def setNonSeasonalOrderUndefined: Self = StObject.set(x, "nonSeasonalOrder", js.undefined)
    
    inline def setNonSeasonalOrderVarargs(value: SchemaArimaOrder*): Self = StObject.set(x, "nonSeasonalOrder", js.Array(value*))
    
    inline def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    inline def setSeasonalPeriodsNull: Self = StObject.set(x, "seasonalPeriods", null)
    
    inline def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    inline def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value*))
    
    inline def setTimeSeriesId(value: js.Array[String]): Self = StObject.set(x, "timeSeriesId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdNull: Self = StObject.set(x, "timeSeriesId", null)
    
    inline def setTimeSeriesIdUndefined: Self = StObject.set(x, "timeSeriesId", js.undefined)
    
    inline def setTimeSeriesIdVarargs(value: String*): Self = StObject.set(x, "timeSeriesId", js.Array(value*))
  }
}
