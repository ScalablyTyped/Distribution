package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiClientDoubleclicksearch.anon.AdGroupId
import typings.gapiClientDoubleclicksearch.anon.ChangedAttributesSinceTimestamp
import typings.gapiClientDoubleclicksearch.anon.Column
import typings.gapiClientDoubleclicksearch.anon.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportRequest extends js.Object {
  /**
    * The columns to include in the report. This includes both DoubleClick Search columns and saved columns. For DoubleClick Search columns, only the
    * columnName parameter is required. For saved columns only the savedColumnName parameter is required. Both columnName and savedColumnName cannot be set
    * in the same stanza.
    */
  var columns: js.UndefOr[js.Array[ReportApiColumnSpec]] = js.native
  /** Format that the report should be returned in. Currently csv or tsv is supported. */
  var downloadFormat: js.UndefOr[String] = js.native
  /** A list of filters to be applied to the report. */
  var filters: js.UndefOr[js.Array[Column]] = js.native
  /** Determines if removed entities should be included in the report. Defaults to false. Deprecated, please use includeRemovedEntities instead. */
  var includeDeletedEntities: js.UndefOr[Boolean] = js.native
  /** Determines if removed entities should be included in the report. Defaults to false. */
  var includeRemovedEntities: js.UndefOr[Boolean] = js.native
  /**
    * Asynchronous report only. The maximum number of rows per report file. A large report is split into many files based on this field. Acceptable values
    * are 1000000 to 100000000, inclusive.
    */
  var maxRowsPerFile: js.UndefOr[Double] = js.native
  /** Synchronous report only. A list of columns and directions defining sorting to be performed on the report rows. */
  var orderBy: js.UndefOr[js.Array[SortOrder]] = js.native
  /**
    * The reportScope is a set of IDs that are used to determine which subset of entities will be returned in the report. The full lineage of IDs from the
    * lowest scoped level desired up through agency is required.
    */
  var reportScope: js.UndefOr[AdGroupId] = js.native
  /**
    * Determines the type of rows that are returned in the report. For example, if you specify reportType: keyword, each row in the report will contain data
    * about a keyword. See the Types of Reports reference for the columns that are available for each type.
    */
  var reportType: js.UndefOr[String] = js.native
  /**
    * Synchronous report only. The maxinum number of rows to return; additional rows are dropped. Acceptable values are 0 to 10000, inclusive. Defaults to
    * 10000.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /** Synchronous report only. Zero-based index of the first row to return. Acceptable values are 0 to 50000, inclusive. Defaults to 0. */
  var startRow: js.UndefOr[Double] = js.native
  /**
    * Specifies the currency in which monetary will be returned. Possible values are: usd, agency (valid if the report is scoped to agency or lower),
    * advertiser (valid if the report is scoped to &#42; advertiser or lower), or account (valid if the report is scoped to engine account or lower).
    */
  var statisticsCurrency: js.UndefOr[String] = js.native
  /** If metrics are requested in a report, this argument will be used to restrict the metrics to a specific time range. */
  var timeRange: js.UndefOr[ChangedAttributesSinceTimestamp] = js.native
  /** If true, the report would only be created if all the requested stat data are sourced from a single timezone. Defaults to false. */
  var verifySingleTimeZone: js.UndefOr[Boolean] = js.native
}

object ReportRequest {
  @scala.inline
  def apply(): ReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRequest]
  }
  @scala.inline
  implicit class ReportRequestOps[Self <: ReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: ReportApiColumnSpec*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ReportApiColumnSpec]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDownloadFormat(value: String): Self = this.set("downloadFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadFormat: Self = this.set("downloadFormat", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Column*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[Column]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setIncludeDeletedEntities(value: Boolean): Self = this.set("includeDeletedEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDeletedEntities: Self = this.set("includeDeletedEntities", js.undefined)
    @scala.inline
    def setIncludeRemovedEntities(value: Boolean): Self = this.set("includeRemovedEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRemovedEntities: Self = this.set("includeRemovedEntities", js.undefined)
    @scala.inline
    def setMaxRowsPerFile(value: Double): Self = this.set("maxRowsPerFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRowsPerFile: Self = this.set("maxRowsPerFile", js.undefined)
    @scala.inline
    def setOrderByVarargs(value: SortOrder*): Self = this.set("orderBy", js.Array(value :_*))
    @scala.inline
    def setOrderBy(value: js.Array[SortOrder]): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setReportScope(value: AdGroupId): Self = this.set("reportScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportScope: Self = this.set("reportScope", js.undefined)
    @scala.inline
    def setReportType(value: String): Self = this.set("reportType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportType: Self = this.set("reportType", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
    @scala.inline
    def setStatisticsCurrency(value: String): Self = this.set("statisticsCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatisticsCurrency: Self = this.set("statisticsCurrency", js.undefined)
    @scala.inline
    def setTimeRange(value: ChangedAttributesSinceTimestamp): Self = this.set("timeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeRange: Self = this.set("timeRange", js.undefined)
    @scala.inline
    def setVerifySingleTimeZone(value: Boolean): Self = this.set("verifySingleTimeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifySingleTimeZone: Self = this.set("verifySingleTimeZone", js.undefined)
  }
  
}

