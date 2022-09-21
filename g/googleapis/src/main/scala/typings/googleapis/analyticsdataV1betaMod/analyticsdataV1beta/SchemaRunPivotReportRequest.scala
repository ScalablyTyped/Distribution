package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunPivotReportRequest extends StObject {
  
  /**
    * Cohort group associated with this request. If there is a cohort group in the request the 'cohort' dimension must be present.
    */
  var cohortSpec: js.UndefOr[SchemaCohortSpec] = js.undefined
  
  /**
    * A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the report uses the property's default currency.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date range to retrieve event data for the report. If multiple date ranges are specified, event data from each date range is used in the report. A special dimension with field name "dateRange" can be included in a Pivot's field names; if included, the report compares between date ranges. In a cohort request, this `dateRanges` must be unspecified.
    */
  var dateRanges: js.UndefOr[js.Array[SchemaDateRange]] = js.undefined
  
  /**
    * The filter clause of dimensions. Dimensions must be requested to be used in this filter. Metrics cannot be used in this filter.
    */
  var dimensionFilter: js.UndefOr[SchemaFilterExpression] = js.undefined
  
  /**
    * The dimensions requested. All defined dimensions must be used by one of the following: dimension_expression, dimension_filter, pivots, order_bys.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * If false or unspecified, each row with all metrics equal to 0 will not be returned. If true, these rows will be returned if they are not separately removed by a filter.
    */
  var keepEmptyRows: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause. Metrics must be requested to be used in this filter. Dimensions cannot be used in this filter.
    */
  var metricFilter: js.UndefOr[SchemaFilterExpression] = js.undefined
  
  /**
    * The metrics requested, at least one metric needs to be specified. All defined metrics must be used by one of the following: metric_expression, metric_filter, order_bys.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * Describes the visual format of the report's dimensions in columns or rows. The union of the fieldNames (dimension names) in all pivots must be a subset of dimension names defined in Dimensions. No two pivots can share a dimension. A dimension is only visible if it appears in a pivot.
    */
  var pivots: js.UndefOr[js.Array[SchemaPivot]] = js.undefined
  
  /**
    * A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path and not the body. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a batch request, this property should either be unspecified or consistent with the batch-level property. Example: properties/1234
    */
  var property: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Toggles whether to return the current state of this Analytics Property's quota. Quota is returned in [PropertyQuota](#PropertyQuota).
    */
  var returnPropertyQuota: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRunPivotReportRequest {
  
  inline def apply(): SchemaRunPivotReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPivotReportRequest]
  }
  
  extension [Self <: SchemaRunPivotReportRequest](x: Self) {
    
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
    
    inline def setKeepEmptyRows(value: Boolean): Self = StObject.set(x, "keepEmptyRows", value.asInstanceOf[js.Any])
    
    inline def setKeepEmptyRowsNull: Self = StObject.set(x, "keepEmptyRows", null)
    
    inline def setKeepEmptyRowsUndefined: Self = StObject.set(x, "keepEmptyRows", js.undefined)
    
    inline def setMetricFilter(value: SchemaFilterExpression): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setPivots(value: js.Array[SchemaPivot]): Self = StObject.set(x, "pivots", value.asInstanceOf[js.Any])
    
    inline def setPivotsUndefined: Self = StObject.set(x, "pivots", js.undefined)
    
    inline def setPivotsVarargs(value: SchemaPivot*): Self = StObject.set(x, "pivots", js.Array(value*))
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyNull: Self = StObject.set(x, "property", null)
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setReturnPropertyQuota(value: Boolean): Self = StObject.set(x, "returnPropertyQuota", value.asInstanceOf[js.Any])
    
    inline def setReturnPropertyQuotaNull: Self = StObject.set(x, "returnPropertyQuota", null)
    
    inline def setReturnPropertyQuotaUndefined: Self = StObject.set(x, "returnPropertyQuota", js.undefined)
  }
}
