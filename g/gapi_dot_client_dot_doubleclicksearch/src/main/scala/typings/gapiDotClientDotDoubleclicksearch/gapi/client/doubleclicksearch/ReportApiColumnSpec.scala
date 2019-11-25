package typings.gapiDotClientDotDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportApiColumnSpec extends js.Object {
  /** Name of a DoubleClick Search column to include in the report. */
  var columnName: js.UndefOr[String] = js.undefined
  /**
    * Segments a report by a custom dimension. The report must be scoped to an advertiser or lower, and the custom dimension must already be set up in
    * DoubleClick Search. The custom dimension name, which appears in DoubleClick Search, is case sensitive.
    * If used in a conversion report, returns the value of the specified custom dimension for the given conversion, if set. This column does not segment the
    * conversion report.
    */
  var customDimensionName: js.UndefOr[String] = js.undefined
  /**
    * Name of a custom metric to include in the report. The report must be scoped to an advertiser or lower, and the custom metric must already be set up in
    * DoubleClick Search. The custom metric name, which appears in DoubleClick Search, is case sensitive.
    */
  var customMetricName: js.UndefOr[String] = js.undefined
  /**
    * Inclusive day in YYYY-MM-DD format. When provided, this overrides the overall time range of the report for this column only. Must be provided together
    * with startDate.
    */
  var endDate: js.UndefOr[String] = js.undefined
  /** Synchronous report only. Set to true to group by this column. Defaults to false. */
  var groupByColumn: js.UndefOr[Boolean] = js.undefined
  /**
    * Text used to identify this column in the report output; defaults to columnName or savedColumnName when not specified. This can be used to prevent
    * collisions between DoubleClick Search columns and saved columns with the same name.
    */
  var headerText: js.UndefOr[String] = js.undefined
  /** The platform that is used to provide data for the custom dimension. Acceptable values are "floodlight". */
  var platformSource: js.UndefOr[String] = js.undefined
  /**
    * Returns metrics only for a specific type of product activity. Accepted values are:
    * - "sold": returns metrics only for products that were sold
    * - "advertised": returns metrics only for products that were advertised in a Shopping campaign, and that might or might not have been sold
    */
  var productReportPerspective: js.UndefOr[String] = js.undefined
  /**
    * Name of a saved column to include in the report. The report must be scoped at advertiser or lower, and this saved column must already be created in the
    * DoubleClick Search UI.
    */
  var savedColumnName: js.UndefOr[String] = js.undefined
  /**
    * Inclusive date in YYYY-MM-DD format. When provided, this overrides the overall time range of the report for this column only. Must be provided together
    * with endDate.
    */
  var startDate: js.UndefOr[String] = js.undefined
}

object ReportApiColumnSpec {
  @scala.inline
  def apply(
    columnName: String = null,
    customDimensionName: String = null,
    customMetricName: String = null,
    endDate: String = null,
    groupByColumn: js.UndefOr[Boolean] = js.undefined,
    headerText: String = null,
    platformSource: String = null,
    productReportPerspective: String = null,
    savedColumnName: String = null,
    startDate: String = null
  ): ReportApiColumnSpec = {
    val __obj = js.Dynamic.literal()
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (customDimensionName != null) __obj.updateDynamic("customDimensionName")(customDimensionName.asInstanceOf[js.Any])
    if (customMetricName != null) __obj.updateDynamic("customMetricName")(customMetricName.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByColumn)) __obj.updateDynamic("groupByColumn")(groupByColumn.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (platformSource != null) __obj.updateDynamic("platformSource")(platformSource.asInstanceOf[js.Any])
    if (productReportPerspective != null) __obj.updateDynamic("productReportPerspective")(productReportPerspective.asInstanceOf[js.Any])
    if (savedColumnName != null) __obj.updateDynamic("savedColumnName")(savedColumnName.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportApiColumnSpec]
  }
}

