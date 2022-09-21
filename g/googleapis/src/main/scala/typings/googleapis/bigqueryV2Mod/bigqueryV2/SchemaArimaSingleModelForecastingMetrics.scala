package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArimaSingleModelForecastingMetrics extends StObject {
  
  /**
    * Arima fitting metrics.
    */
  var arimaFittingMetrics: js.UndefOr[SchemaArimaFittingMetrics] = js.undefined
  
  /**
    * Is arima model fitted with drift or not. It is always false when d is not 1.
    */
  var hasDrift: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, holiday_effect is a part of time series decomposition result.
    */
  var hasHolidayEffect: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, spikes_and_dips is a part of time series decomposition result.
    */
  var hasSpikesAndDips: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, step_changes is a part of time series decomposition result.
    */
  var hasStepChanges: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Non-seasonal order.
    */
  var nonSeasonalOrder: js.UndefOr[SchemaArimaOrder] = js.undefined
  
  /**
    * Seasonal periods. Repeated because multiple periods are supported for one time series.
    */
  var seasonalPeriods: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The time_series_id value for this time series. It will be one of the unique values from the time_series_id_column specified during ARIMA model training. Only present when time_series_id_column training option was used.
    */
  var timeSeriesId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tuple of time_series_ids identifying this time series. It will be one of the unique tuples of values present in the time_series_id_columns specified during ARIMA model training. Only present when time_series_id_columns training option was used and the order of values here are same as the order of time_series_id_columns.
    */
  var timeSeriesIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaArimaSingleModelForecastingMetrics {
  
  inline def apply(): SchemaArimaSingleModelForecastingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArimaSingleModelForecastingMetrics]
  }
  
  extension [Self <: SchemaArimaSingleModelForecastingMetrics](x: Self) {
    
    inline def setArimaFittingMetrics(value: SchemaArimaFittingMetrics): Self = StObject.set(x, "arimaFittingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaFittingMetricsUndefined: Self = StObject.set(x, "arimaFittingMetrics", js.undefined)
    
    inline def setHasDrift(value: Boolean): Self = StObject.set(x, "hasDrift", value.asInstanceOf[js.Any])
    
    inline def setHasDriftNull: Self = StObject.set(x, "hasDrift", null)
    
    inline def setHasDriftUndefined: Self = StObject.set(x, "hasDrift", js.undefined)
    
    inline def setHasHolidayEffect(value: Boolean): Self = StObject.set(x, "hasHolidayEffect", value.asInstanceOf[js.Any])
    
    inline def setHasHolidayEffectNull: Self = StObject.set(x, "hasHolidayEffect", null)
    
    inline def setHasHolidayEffectUndefined: Self = StObject.set(x, "hasHolidayEffect", js.undefined)
    
    inline def setHasSpikesAndDips(value: Boolean): Self = StObject.set(x, "hasSpikesAndDips", value.asInstanceOf[js.Any])
    
    inline def setHasSpikesAndDipsNull: Self = StObject.set(x, "hasSpikesAndDips", null)
    
    inline def setHasSpikesAndDipsUndefined: Self = StObject.set(x, "hasSpikesAndDips", js.undefined)
    
    inline def setHasStepChanges(value: Boolean): Self = StObject.set(x, "hasStepChanges", value.asInstanceOf[js.Any])
    
    inline def setHasStepChangesNull: Self = StObject.set(x, "hasStepChanges", null)
    
    inline def setHasStepChangesUndefined: Self = StObject.set(x, "hasStepChanges", js.undefined)
    
    inline def setNonSeasonalOrder(value: SchemaArimaOrder): Self = StObject.set(x, "nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    inline def setNonSeasonalOrderUndefined: Self = StObject.set(x, "nonSeasonalOrder", js.undefined)
    
    inline def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    inline def setSeasonalPeriodsNull: Self = StObject.set(x, "seasonalPeriods", null)
    
    inline def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    inline def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value*))
    
    inline def setTimeSeriesId(value: String): Self = StObject.set(x, "timeSeriesId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdNull: Self = StObject.set(x, "timeSeriesId", null)
    
    inline def setTimeSeriesIdUndefined: Self = StObject.set(x, "timeSeriesId", js.undefined)
    
    inline def setTimeSeriesIds(value: js.Array[String]): Self = StObject.set(x, "timeSeriesIds", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdsNull: Self = StObject.set(x, "timeSeriesIds", null)
    
    inline def setTimeSeriesIdsUndefined: Self = StObject.set(x, "timeSeriesIds", js.undefined)
    
    inline def setTimeSeriesIdsVarargs(value: String*): Self = StObject.set(x, "timeSeriesIds", js.Array(value*))
  }
}
