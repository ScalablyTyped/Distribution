package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SearchAnalyticsQueryRequest extends js.Object {
  /**
    * [Optional; Default is &quot;auto&quot;] How data is aggregated. If
    * aggregated by property, all data for the same property is aggregated; if
    * aggregated by page, all data is aggregated by canonical URI. If you
    * filter or group by page, choose AUTO; otherwise you can aggregate either
    * by property or by page, depending on how you want your data calculated;
    * see  the help documentation to learn how data is calculated differently
    * by site versus by page.  Note: If you group or filter by page, you cannot
    * aggregate by property.  If you specify any value other than AUTO, the
    * aggregation type in the result will match the requested type, or if you
    * request an invalid type, you will get an error. The API will never change
    * your aggregation type if the requested type is invalid.
    */
  var aggregationType: js.UndefOr[String] = js.native
  /**
    * [Optional] Zero or more filters to apply to the dimension grouping
    * values; for example, &#39;query contains &quot;buy&quot;&#39; to see only
    * data where the query string contains the substring &quot;buy&quot; (not
    * case-sensitive). You can filter by a dimension without grouping by it.
    */
  var dimensionFilterGroups: js.UndefOr[js.Array[Schema$ApiDimensionFilterGroup]] = js.native
  /**
    * [Optional] Zero or more dimensions to group results by. Dimensions are
    * the group-by values in the Search Analytics page. Dimensions are combined
    * to create a unique row key for each row. Results are grouped in the order
    * that you supply these dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Required] End date of the requested date range, in YYYY-MM-DD format, in
    * PST (UTC - 8:00). Must be greater than or equal to the start date. This
    * value is included in the range.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * [Optional; Default is 1000] The maximum number of rows to return. Must be
    * a number from 1 to 5,000 (inclusive).
    */
  var rowLimit: js.UndefOr[Double] = js.native
  /**
    * [Optional; Default is &quot;web&quot;] The search type to filter for.
    */
  var searchType: js.UndefOr[String] = js.native
  /**
    * [Required] Start date of the requested date range, in YYYY-MM-DD format,
    * in PST time (UTC - 8:00). Must be less than or equal to the end date.
    * This value is included in the range.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * [Optional; Default is 0] Zero-based index of the first row in the
    * response. Must be a non-negative number.
    */
  var startRow: js.UndefOr[Double] = js.native
}

object Schema$SearchAnalyticsQueryRequest {
  @scala.inline
  def apply(
    aggregationType: String = null,
    dimensionFilterGroups: js.Array[Schema$ApiDimensionFilterGroup] = null,
    dimensions: js.Array[String] = null,
    endDate: String = null,
    rowLimit: Int | Double = null,
    searchType: String = null,
    startDate: String = null,
    startRow: Int | Double = null
  ): Schema$SearchAnalyticsQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (aggregationType != null) __obj.updateDynamic("aggregationType")(aggregationType.asInstanceOf[js.Any])
    if (dimensionFilterGroups != null) __obj.updateDynamic("dimensionFilterGroups")(dimensionFilterGroups.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (rowLimit != null) __obj.updateDynamic("rowLimit")(rowLimit.asInstanceOf[js.Any])
    if (searchType != null) __obj.updateDynamic("searchType")(searchType.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchAnalyticsQueryRequest]
  }
}

