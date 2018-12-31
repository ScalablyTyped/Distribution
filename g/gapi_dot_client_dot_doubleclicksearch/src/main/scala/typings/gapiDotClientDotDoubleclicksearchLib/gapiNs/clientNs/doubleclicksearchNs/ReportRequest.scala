package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

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
  var downloadFormat: js.UndefOr[java.lang.String] = js.undefined
  /** A list of filters to be applied to the report. */
  var filters: js.UndefOr[js.Array[gapiDotClientDotDoubleclicksearchLib.Anon_Values]] = js.undefined
  /** Determines if removed entities should be included in the report. Defaults to false. Deprecated, please use includeRemovedEntities instead. */
  var includeDeletedEntities: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines if removed entities should be included in the report. Defaults to false. */
  var includeRemovedEntities: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Asynchronous report only. The maximum number of rows per report file. A large report is split into many files based on this field. Acceptable values
    * are 1000000 to 100000000, inclusive.
    */
  var maxRowsPerFile: js.UndefOr[scala.Double] = js.undefined
  /** Synchronous report only. A list of columns and directions defining sorting to be performed on the report rows. */
  var orderBy: js.UndefOr[js.Array[gapiDotClientDotDoubleclicksearchLib.Anon_Column]] = js.undefined
  /**
    * The reportScope is a set of IDs that are used to determine which subset of entities will be returned in the report. The full lineage of IDs from the
    * lowest scoped level desired up through agency is required.
    */
  var reportScope: js.UndefOr[gapiDotClientDotDoubleclicksearchLib.Anon_AdGroupId] = js.undefined
  /**
    * Determines the type of rows that are returned in the report. For example, if you specify reportType: keyword, each row in the report will contain data
    * about a keyword. See the Types of Reports reference for the columns that are available for each type.
    */
  var reportType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Synchronous report only. The maxinum number of rows to return; additional rows are dropped. Acceptable values are 0 to 10000, inclusive. Defaults to
    * 10000.
    */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /** Synchronous report only. Zero-based index of the first row to return. Acceptable values are 0 to 50000, inclusive. Defaults to 0. */
  var startRow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the currency in which monetary will be returned. Possible values are: usd, agency (valid if the report is scoped to agency or lower),
    * advertiser (valid if the report is scoped to &#42; advertiser or lower), or account (valid if the report is scoped to engine account or lower).
    */
  var statisticsCurrency: js.UndefOr[java.lang.String] = js.undefined
  /** If metrics are requested in a report, this argument will be used to restrict the metrics to a specific time range. */
  var timeRange: js.UndefOr[gapiDotClientDotDoubleclicksearchLib.Anon_StartDate] = js.undefined
  /** If true, the report would only be created if all the requested stat data are sourced from a single timezone. Defaults to false. */
  var verifySingleTimeZone: js.UndefOr[scala.Boolean] = js.undefined
}

