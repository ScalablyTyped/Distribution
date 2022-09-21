package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunRealtimeReportRequest extends StObject {
  
  /**
    * The filter clause of dimensions. Dimensions must be requested to be used in this filter. Metrics cannot be used in this filter.
    */
  var dimensionFilter: js.UndefOr[SchemaFilterExpression] = js.undefined
  
  /**
    * The dimensions requested and displayed.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * The number of rows to return. If the `limit` parameter is unspecified, 10,000 rows are returned. The API returns a maximum of 100,000 rows per request, no matter how many you ask for.
    */
  var limit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Aggregation of metrics. Aggregated metric values will be shown in rows where the dimension_values are set to "RESERVED_(MetricAggregation)".
    */
  var metricAggregations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause. Metrics must be requested to be used in this filter. Dimensions cannot be used in this filter.
    */
  var metricFilter: js.UndefOr[SchemaFilterExpression] = js.undefined
  
  /**
    * The metrics requested and displayed.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * Specifies how rows are ordered in the response.
    */
  var orderBys: js.UndefOr[js.Array[SchemaOrderBy]] = js.undefined
  
  /**
    * Toggles whether to return the current state of this Analytics Property's Realtime quota. Quota is returned in [PropertyQuota](#PropertyQuota).
    */
  var returnPropertyQuota: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRunRealtimeReportRequest {
  
  inline def apply(): SchemaRunRealtimeReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunRealtimeReportRequest]
  }
  
  extension [Self <: SchemaRunRealtimeReportRequest](x: Self) {
    
    inline def setDimensionFilter(value: SchemaFilterExpression): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    inline def setDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMetricAggregations(value: js.Array[String]): Self = StObject.set(x, "metricAggregations", value.asInstanceOf[js.Any])
    
    inline def setMetricAggregationsNull: Self = StObject.set(x, "metricAggregations", null)
    
    inline def setMetricAggregationsUndefined: Self = StObject.set(x, "metricAggregations", js.undefined)
    
    inline def setMetricAggregationsVarargs(value: String*): Self = StObject.set(x, "metricAggregations", js.Array(value*))
    
    inline def setMetricFilter(value: SchemaFilterExpression): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setOrderBys(value: js.Array[SchemaOrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    inline def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    inline def setOrderBysVarargs(value: SchemaOrderBy*): Self = StObject.set(x, "orderBys", js.Array(value*))
    
    inline def setReturnPropertyQuota(value: Boolean): Self = StObject.set(x, "returnPropertyQuota", value.asInstanceOf[js.Any])
    
    inline def setReturnPropertyQuotaNull: Self = StObject.set(x, "returnPropertyQuota", null)
    
    inline def setReturnPropertyQuotaUndefined: Self = StObject.set(x, "returnPropertyQuota", js.undefined)
  }
}
