package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingNumberPropertyBase
  extends StObject
     with MappingDocValuesPropertyBase {
  
  var boost: js.UndefOr[double] = js.undefined
  
  var coerce: js.UndefOr[Boolean] = js.undefined
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var on_script_error: js.UndefOr[MappingOnScriptError] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var time_series_dimension: js.UndefOr[Boolean] = js.undefined
  
  var time_series_metric: js.UndefOr[MappingTimeSeriesMetricType] = js.undefined
}
object MappingNumberPropertyBase {
  
  inline def apply(): MappingNumberPropertyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingNumberPropertyBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingNumberPropertyBase] (val x: Self) extends AnyVal {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setOn_script_error(value: MappingOnScriptError): Self = StObject.set(x, "on_script_error", value.asInstanceOf[js.Any])
    
    inline def setOn_script_errorUndefined: Self = StObject.set(x, "on_script_error", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setTime_series_dimension(value: Boolean): Self = StObject.set(x, "time_series_dimension", value.asInstanceOf[js.Any])
    
    inline def setTime_series_dimensionUndefined: Self = StObject.set(x, "time_series_dimension", js.undefined)
    
    inline def setTime_series_metric(value: MappingTimeSeriesMetricType): Self = StObject.set(x, "time_series_metric", value.asInstanceOf[js.Any])
    
    inline def setTime_series_metricUndefined: Self = StObject.set(x, "time_series_metric", js.undefined)
  }
}
