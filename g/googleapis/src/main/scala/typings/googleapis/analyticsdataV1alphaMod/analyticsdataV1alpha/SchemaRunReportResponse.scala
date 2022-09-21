package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunReportResponse extends StObject {
  
  /**
    * Describes dimension columns. The number of DimensionHeaders and ordering of DimensionHeaders matches the dimensions present in rows.
    */
  var dimensionHeaders: js.UndefOr[js.Array[SchemaDimensionHeader]] = js.undefined
  
  /**
    * If requested, the maximum values of metrics.
    */
  var maximums: js.UndefOr[js.Array[SchemaRow]] = js.undefined
  
  /**
    * Metadata for the report.
    */
  var metadata: js.UndefOr[SchemaResponseMetaData] = js.undefined
  
  /**
    * Describes metric columns. The number of MetricHeaders and ordering of MetricHeaders matches the metrics present in rows.
    */
  var metricHeaders: js.UndefOr[js.Array[SchemaMetricHeader]] = js.undefined
  
  /**
    * If requested, the minimum values of metrics.
    */
  var minimums: js.UndefOr[js.Array[SchemaRow]] = js.undefined
  
  /**
    * This Analytics Property's quota state including this request.
    */
  var propertyQuota: js.UndefOr[SchemaPropertyQuota] = js.undefined
  
  /**
    * The total number of rows in the query result, regardless of the number of rows returned in the response. For example if a query returns 175 rows and includes limit = 50 in the API request, the response will contain row_count = 175 but only 50 rows. To learn more about this pagination parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var rowCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rows of dimension value combinations and metric values in the report.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.undefined
  
  /**
    * If requested, the totaled values of metrics.
    */
  var totals: js.UndefOr[js.Array[SchemaRow]] = js.undefined
}
object SchemaRunReportResponse {
  
  inline def apply(): SchemaRunReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunReportResponse]
  }
  
  extension [Self <: SchemaRunReportResponse](x: Self) {
    
    inline def setDimensionHeaders(value: js.Array[SchemaDimensionHeader]): Self = StObject.set(x, "dimensionHeaders", value.asInstanceOf[js.Any])
    
    inline def setDimensionHeadersUndefined: Self = StObject.set(x, "dimensionHeaders", js.undefined)
    
    inline def setDimensionHeadersVarargs(value: SchemaDimensionHeader*): Self = StObject.set(x, "dimensionHeaders", js.Array(value*))
    
    inline def setMaximums(value: js.Array[SchemaRow]): Self = StObject.set(x, "maximums", value.asInstanceOf[js.Any])
    
    inline def setMaximumsUndefined: Self = StObject.set(x, "maximums", js.undefined)
    
    inline def setMaximumsVarargs(value: SchemaRow*): Self = StObject.set(x, "maximums", js.Array(value*))
    
    inline def setMetadata(value: SchemaResponseMetaData): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetricHeaders(value: js.Array[SchemaMetricHeader]): Self = StObject.set(x, "metricHeaders", value.asInstanceOf[js.Any])
    
    inline def setMetricHeadersUndefined: Self = StObject.set(x, "metricHeaders", js.undefined)
    
    inline def setMetricHeadersVarargs(value: SchemaMetricHeader*): Self = StObject.set(x, "metricHeaders", js.Array(value*))
    
    inline def setMinimums(value: js.Array[SchemaRow]): Self = StObject.set(x, "minimums", value.asInstanceOf[js.Any])
    
    inline def setMinimumsUndefined: Self = StObject.set(x, "minimums", js.undefined)
    
    inline def setMinimumsVarargs(value: SchemaRow*): Self = StObject.set(x, "minimums", js.Array(value*))
    
    inline def setPropertyQuota(value: SchemaPropertyQuota): Self = StObject.set(x, "propertyQuota", value.asInstanceOf[js.Any])
    
    inline def setPropertyQuotaUndefined: Self = StObject.set(x, "propertyQuota", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountNull: Self = StObject.set(x, "rowCount", null)
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRows(value: js.Array[SchemaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaRow*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setTotals(value: js.Array[SchemaRow]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    inline def setTotalsVarargs(value: SchemaRow*): Self = StObject.set(x, "totals", js.Array(value*))
  }
}
