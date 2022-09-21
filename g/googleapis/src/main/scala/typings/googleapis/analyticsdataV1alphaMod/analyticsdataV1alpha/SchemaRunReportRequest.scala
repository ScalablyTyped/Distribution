package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunReportRequest extends StObject {
  
  /**
    * Cohort group associated with this request. If there is a cohort group in the request the 'cohort' dimension must be present.
    */
  var cohortSpec: js.UndefOr[SchemaCohortSpec] = js.undefined
  
  /**
    * A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the report uses the entity's default currency.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date ranges of data to read. If multiple date ranges are requested, each response row will contain a zero based date range index. If two date ranges overlap, the event data for the overlapping days is included in the response rows for both date ranges. In a cohort request, this `dateRanges` must be unspecified.
    */
  var dateRanges: js.UndefOr[js.Array[SchemaDateRange]] = js.undefined
  
  /**
    * The filter clause of dimensions. Dimensions must be requested to be used in this filter. Metrics cannot be used in this filter.
    */
  var dimensionFilter: js.UndefOr[SchemaFilterExpression] = js.undefined
  
  /**
    * The dimensions requested and displayed.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * A property whose events are tracked. Within a batch request, this entity should either be unspecified or consistent with the batch-level entity.
    */
  var entity: js.UndefOr[SchemaEntity] = js.undefined
  
  /**
    * If false or unspecified, each row with all metrics equal to 0 will not be returned. If true, these rows will be returned if they are not separately removed by a filter.
    */
  var keepEmptyRows: js.UndefOr[Boolean | Null] = js.undefined
  
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
    * The row count of the start row. The first row is counted as row 0.
    */
  var offset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies how rows are ordered in the response.
    */
  var orderBys: js.UndefOr[js.Array[SchemaOrderBy]] = js.undefined
  
  /**
    * Toggles whether to return the current state of this Analytics Property's quota. Quota is returned in [PropertyQuota](#PropertyQuota).
    */
  var returnPropertyQuota: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRunReportRequest {
  
  inline def apply(): SchemaRunReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunReportRequest]
  }
  
  extension [Self <: SchemaRunReportRequest](x: Self) {
    
    inline def setCohortSpec(value: SchemaCohortSpec): Self = StObject.set(x, "cohortSpec", value.asInstanceOf[js.Any])
    
    inline def setCohortSpecUndefined: Self = StObject.set(x, "cohortSpec", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDateRanges(value: js.Array[SchemaDateRange]): Self = StObject.set(x, "dateRanges", value.asInstanceOf[js.Any])
    
    inline def setDateRangesUndefined: Self = StObject.set(x, "dateRanges", js.undefined)
    
    inline def setDateRangesVarargs(value: SchemaDateRange*): Self = StObject.set(x, "dateRanges", js.Array(value*))
    
    inline def setDimensionFilter(value: SchemaFilterExpression): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    inline def setDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setEntity(value: SchemaEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setKeepEmptyRows(value: Boolean): Self = StObject.set(x, "keepEmptyRows", value.asInstanceOf[js.Any])
    
    inline def setKeepEmptyRowsNull: Self = StObject.set(x, "keepEmptyRows", null)
    
    inline def setKeepEmptyRowsUndefined: Self = StObject.set(x, "keepEmptyRows", js.undefined)
    
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
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBys(value: js.Array[SchemaOrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    inline def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    inline def setOrderBysVarargs(value: SchemaOrderBy*): Self = StObject.set(x, "orderBys", js.Array(value*))
    
    inline def setReturnPropertyQuota(value: Boolean): Self = StObject.set(x, "returnPropertyQuota", value.asInstanceOf[js.Any])
    
    inline def setReturnPropertyQuotaNull: Self = StObject.set(x, "returnPropertyQuota", null)
    
    inline def setReturnPropertyQuotaUndefined: Self = StObject.set(x, "returnPropertyQuota", js.undefined)
  }
}
