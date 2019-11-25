package typings.gapiDotClientDotYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiDotClientDotYoutubeanalytics.Anon_ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultTable extends js.Object {
  /**
    * This value specifies information about the data returned in the rows fields. Each item in the columnHeaders list identifies a field returned in the
    * rows value, which contains a list of comma-delimited data. The columnHeaders list will begin with the dimensions specified in the API request, which
    * will be followed by the metrics specified in the API request. The order of both dimensions and metrics will match the ordering in the API request. For
    * example, if the API request contains the parameters dimensions=ageGroup,gender&metrics=viewerPercentage, the API response will return columns in this
    * order: ageGroup,gender,viewerPercentage.
    */
  var columnHeaders: js.UndefOr[js.Array[Anon_ColumnType]] = js.undefined
  /** This value specifies the type of data included in the API response. For the query method, the kind property value will be youtubeAnalytics#resultTable. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The list contains all rows of the result table. Each item in the list is an array that contains comma-delimited data corresponding to a single row of
    * data. The order of the comma-delimited data fields will match the order of the columns listed in the columnHeaders field. If no data is available for
    * the given query, the rows element will be omitted from the response. The response for a query with the day dimension will not contain rows for the most
    * recent days.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object ResultTable {
  @scala.inline
  def apply(
    columnHeaders: js.Array[Anon_ColumnType] = null,
    kind: String = null,
    rows: js.Array[js.Array[_]] = null
  ): ResultTable = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultTable]
  }
}

