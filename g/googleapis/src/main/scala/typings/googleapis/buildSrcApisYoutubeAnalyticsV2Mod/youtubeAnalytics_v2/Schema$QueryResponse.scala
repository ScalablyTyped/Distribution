package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for TargetedQueriesService.Query.
  */
@js.native
trait Schema$QueryResponse extends js.Object {
  /**
    * This value specifies information about the data returned in the `rows`
    * fields. Each item in the `columnHeaders` list identifies a field returned
    * in the `rows` value, which contains a list of comma-delimited data. The
    * `columnHeaders` list will begin with the dimensions specified in the API
    * request, which will be followed by the metrics specified in the API
    * request. The order of both dimensions and metrics will match the ordering
    * in the API request. For example, if the API request contains the
    * parameters `dimensions=ageGroup,gender&amp;metrics=viewerPercentage`, the
    * API response will return columns in this order: `ageGroup`, `gender`,
    * `viewerPercentage`.
    */
  var columnHeaders: js.UndefOr[js.Array[Schema$ResultTableColumnHeader]] = js.native
  /**
    * When set, indicates that the operation failed.
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * This value specifies the type of data included in the API response. For
    * the query method, the kind property value will be
    * `youtubeAnalytics#resultTable`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list contains all rows of the result table. Each item in the list is
    * an array that contains comma-delimited data corresponding to a single row
    * of data. The order of the comma-delimited data fields will match the
    * order of the columns listed in the `columnHeaders` field.  If no data is
    * available for the given query, the `rows` element will be omitted from
    * the response.  The response for a query with the `day` dimension will not
    * contain rows for the most recent days.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object Schema$QueryResponse {
  @scala.inline
  def apply(
    columnHeaders: js.Array[Schema$ResultTableColumnHeader] = null,
    errors: Schema$Errors = null,
    kind: String = null,
    rows: js.Array[js.Array[_]] = null
  ): Schema$QueryResponse = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryResponse]
  }
}

