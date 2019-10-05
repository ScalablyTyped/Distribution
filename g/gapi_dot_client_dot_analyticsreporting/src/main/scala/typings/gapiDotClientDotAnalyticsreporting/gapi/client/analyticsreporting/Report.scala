package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  /** The column headers. */
  var columnHeader: js.UndefOr[ColumnHeader] = js.undefined
  /** Response data. */
  var data: js.UndefOr[ReportData] = js.undefined
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Report {
  @scala.inline
  def apply(columnHeader: ColumnHeader = null, data: ReportData = null, nextPageToken: String = null): Report = {
    val __obj = js.Dynamic.literal()
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader)
    if (data != null) __obj.updateDynamic("data")(data)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Report]
  }
}

