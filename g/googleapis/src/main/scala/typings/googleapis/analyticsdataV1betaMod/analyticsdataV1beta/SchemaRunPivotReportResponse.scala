package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunPivotReportResponse extends StObject {
  
  /**
    * Aggregation of metric values. Can be totals, minimums, or maximums. The returned aggregations are controlled by the metric_aggregations in the pivot. The type of aggregation returned in each row is shown by the dimension_values which are set to "RESERVED_".
    */
  var aggregates: js.UndefOr[js.Array[SchemaRow]] = js.undefined
  
  /**
    * Describes dimension columns. The number of DimensionHeaders and ordering of DimensionHeaders matches the dimensions present in rows.
    */
  var dimensionHeaders: js.UndefOr[js.Array[SchemaDimensionHeader]] = js.undefined
  
  /**
    * Identifies what kind of resource this message is. This `kind` is always the fixed string "analyticsData#runPivotReport". Useful to distinguish between response types in JSON.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata for the report.
    */
  var metadata: js.UndefOr[SchemaResponseMetaData] = js.undefined
  
  /**
    * Describes metric columns. The number of MetricHeaders and ordering of MetricHeaders matches the metrics present in rows.
    */
  var metricHeaders: js.UndefOr[js.Array[SchemaMetricHeader]] = js.undefined
  
  /**
    * Summarizes the columns and rows created by a pivot. Each pivot in the request produces one header in the response. If we have a request like this: "pivots": [{ "fieldNames": ["country", "city"] \}, { "fieldNames": "eventName" \}] We will have the following `pivotHeaders` in the response: "pivotHeaders" : [{ "dimensionHeaders": [{ "dimensionValues": [ { "value": "United Kingdom" \}, { "value": "London" \} ] \}, { "dimensionValues": [ { "value": "Japan" \}, { "value": "Osaka" \} ] \}] \}, { "dimensionHeaders": [{ "dimensionValues": [{ "value": "session_start" \}] \}, { "dimensionValues": [{ "value": "scroll" \}] \}] \}]
    */
  var pivotHeaders: js.UndefOr[js.Array[SchemaPivotHeader]] = js.undefined
  
  /**
    * This Analytics Property's quota state including this request.
    */
  var propertyQuota: js.UndefOr[SchemaPropertyQuota] = js.undefined
  
  /**
    * Rows of dimension value combinations and metric values in the report.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.undefined
}
object SchemaRunPivotReportResponse {
  
  inline def apply(): SchemaRunPivotReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPivotReportResponse]
  }
  
  extension [Self <: SchemaRunPivotReportResponse](x: Self) {
    
    inline def setAggregates(value: js.Array[SchemaRow]): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    inline def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    inline def setAggregatesVarargs(value: SchemaRow*): Self = StObject.set(x, "aggregates", js.Array(value*))
    
    inline def setDimensionHeaders(value: js.Array[SchemaDimensionHeader]): Self = StObject.set(x, "dimensionHeaders", value.asInstanceOf[js.Any])
    
    inline def setDimensionHeadersUndefined: Self = StObject.set(x, "dimensionHeaders", js.undefined)
    
    inline def setDimensionHeadersVarargs(value: SchemaDimensionHeader*): Self = StObject.set(x, "dimensionHeaders", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaResponseMetaData): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetricHeaders(value: js.Array[SchemaMetricHeader]): Self = StObject.set(x, "metricHeaders", value.asInstanceOf[js.Any])
    
    inline def setMetricHeadersUndefined: Self = StObject.set(x, "metricHeaders", js.undefined)
    
    inline def setMetricHeadersVarargs(value: SchemaMetricHeader*): Self = StObject.set(x, "metricHeaders", js.Array(value*))
    
    inline def setPivotHeaders(value: js.Array[SchemaPivotHeader]): Self = StObject.set(x, "pivotHeaders", value.asInstanceOf[js.Any])
    
    inline def setPivotHeadersUndefined: Self = StObject.set(x, "pivotHeaders", js.undefined)
    
    inline def setPivotHeadersVarargs(value: SchemaPivotHeader*): Self = StObject.set(x, "pivotHeaders", js.Array(value*))
    
    inline def setPropertyQuota(value: SchemaPropertyQuota): Self = StObject.set(x, "propertyQuota", value.asInstanceOf[js.Any])
    
    inline def setPropertyQuotaUndefined: Self = StObject.set(x, "propertyQuota", js.undefined)
    
    inline def setRows(value: js.Array[SchemaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
