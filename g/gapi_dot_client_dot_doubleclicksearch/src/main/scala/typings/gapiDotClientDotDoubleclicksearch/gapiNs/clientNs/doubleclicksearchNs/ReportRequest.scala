package typings.gapiDotClientDotDoubleclicksearch.gapiNs.clientNs.doubleclicksearchNs

import typings.gapiDotClientDotDoubleclicksearch.Anon_AdGroupId
import typings.gapiDotClientDotDoubleclicksearch.Anon_ChangedAttributesSinceTimestamp
import typings.gapiDotClientDotDoubleclicksearch.Anon_Column
import typings.gapiDotClientDotDoubleclicksearch.Anon_ColumnSortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportRequest extends js.Object {
  /**
    * The columns to include in the report. This includes both DoubleClick Search columns and saved columns. For DoubleClick Search columns, only the
    * columnName parameter is required. For saved columns only the savedColumnName parameter is required. Both columnName and savedColumnName cannot be set
    * in the same stanza.
    */
  var columns: js.UndefOr[js.Array[ReportApiColumnSpec]] = js.undefined
  /** Format that the report should be returned in. Currently csv or tsv is supported. */
  var downloadFormat: js.UndefOr[String] = js.undefined
  /** A list of filters to be applied to the report. */
  var filters: js.UndefOr[js.Array[Anon_Column]] = js.undefined
  /** Determines if removed entities should be included in the report. Defaults to false. Deprecated, please use includeRemovedEntities instead. */
  var includeDeletedEntities: js.UndefOr[Boolean] = js.undefined
  /** Determines if removed entities should be included in the report. Defaults to false. */
  var includeRemovedEntities: js.UndefOr[Boolean] = js.undefined
  /**
    * Asynchronous report only. The maximum number of rows per report file. A large report is split into many files based on this field. Acceptable values
    * are 1000000 to 100000000, inclusive.
    */
  var maxRowsPerFile: js.UndefOr[Double] = js.undefined
  /** Synchronous report only. A list of columns and directions defining sorting to be performed on the report rows. */
  var orderBy: js.UndefOr[js.Array[Anon_ColumnSortOrder]] = js.undefined
  /**
    * The reportScope is a set of IDs that are used to determine which subset of entities will be returned in the report. The full lineage of IDs from the
    * lowest scoped level desired up through agency is required.
    */
  var reportScope: js.UndefOr[Anon_AdGroupId] = js.undefined
  /**
    * Determines the type of rows that are returned in the report. For example, if you specify reportType: keyword, each row in the report will contain data
    * about a keyword. See the Types of Reports reference for the columns that are available for each type.
    */
  var reportType: js.UndefOr[String] = js.undefined
  /**
    * Synchronous report only. The maxinum number of rows to return; additional rows are dropped. Acceptable values are 0 to 10000, inclusive. Defaults to
    * 10000.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  /** Synchronous report only. Zero-based index of the first row to return. Acceptable values are 0 to 50000, inclusive. Defaults to 0. */
  var startRow: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the currency in which monetary will be returned. Possible values are: usd, agency (valid if the report is scoped to agency or lower),
    * advertiser (valid if the report is scoped to &#42; advertiser or lower), or account (valid if the report is scoped to engine account or lower).
    */
  var statisticsCurrency: js.UndefOr[String] = js.undefined
  /** If metrics are requested in a report, this argument will be used to restrict the metrics to a specific time range. */
  var timeRange: js.UndefOr[Anon_ChangedAttributesSinceTimestamp] = js.undefined
  /** If true, the report would only be created if all the requested stat data are sourced from a single timezone. Defaults to false. */
  var verifySingleTimeZone: js.UndefOr[Boolean] = js.undefined
}

object ReportRequest {
  @scala.inline
  def apply(
    columns: js.Array[ReportApiColumnSpec] = null,
    downloadFormat: String = null,
    filters: js.Array[Anon_Column] = null,
    includeDeletedEntities: js.UndefOr[Boolean] = js.undefined,
    includeRemovedEntities: js.UndefOr[Boolean] = js.undefined,
    maxRowsPerFile: Int | Double = null,
    orderBy: js.Array[Anon_ColumnSortOrder] = null,
    reportScope: Anon_AdGroupId = null,
    reportType: String = null,
    rowCount: Int | Double = null,
    startRow: Int | Double = null,
    statisticsCurrency: String = null,
    timeRange: Anon_ChangedAttributesSinceTimestamp = null,
    verifySingleTimeZone: js.UndefOr[Boolean] = js.undefined
  ): ReportRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (downloadFormat != null) __obj.updateDynamic("downloadFormat")(downloadFormat)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(includeDeletedEntities)) __obj.updateDynamic("includeDeletedEntities")(includeDeletedEntities)
    if (!js.isUndefined(includeRemovedEntities)) __obj.updateDynamic("includeRemovedEntities")(includeRemovedEntities)
    if (maxRowsPerFile != null) __obj.updateDynamic("maxRowsPerFile")(maxRowsPerFile.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (reportScope != null) __obj.updateDynamic("reportScope")(reportScope)
    if (reportType != null) __obj.updateDynamic("reportType")(reportType)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    if (statisticsCurrency != null) __obj.updateDynamic("statisticsCurrency")(statisticsCurrency)
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange)
    if (!js.isUndefined(verifySingleTimeZone)) __obj.updateDynamic("verifySingleTimeZone")(verifySingleTimeZone)
    __obj.asInstanceOf[ReportRequest]
  }
}

