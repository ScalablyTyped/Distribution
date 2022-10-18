package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingNumberPropertyBase
  extends StObject
     with MappingDocValuesPropertyBase {
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var time_series_metric: js.UndefOr[MappingTimeSeriesMetricType] = js.undefined
}
object MappingNumberPropertyBase {
  
  inline def apply(): MappingNumberPropertyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingNumberPropertyBase]
  }
  
  extension [Self <: MappingNumberPropertyBase](x: Self) {
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setTime_series_metric(value: MappingTimeSeriesMetricType): Self = StObject.set(x, "time_series_metric", value.asInstanceOf[js.Any])
    
    inline def setTime_series_metricUndefined: Self = StObject.set(x, "time_series_metric", js.undefined)
  }
}
