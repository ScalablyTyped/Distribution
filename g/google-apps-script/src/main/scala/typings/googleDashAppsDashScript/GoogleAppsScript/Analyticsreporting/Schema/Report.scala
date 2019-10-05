package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  var columnHeader: js.UndefOr[ColumnHeader] = js.undefined
  var data: js.UndefOr[ReportData] = js.undefined
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

