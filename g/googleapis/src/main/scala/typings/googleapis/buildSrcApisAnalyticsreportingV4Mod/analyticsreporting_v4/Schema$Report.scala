package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The data response corresponding to the request.
  */
@js.native
trait Schema$Report extends js.Object {
  /**
    * The column headers.
    */
  var columnHeader: js.UndefOr[Schema$ColumnHeader] = js.native
  /**
    * Response data.
    */
  var data: js.UndefOr[Schema$ReportData] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Report {
  @scala.inline
  def apply(
    columnHeader: Schema$ColumnHeader = null,
    data: Schema$ReportData = null,
    nextPageToken: String = null
  ): Schema$Report = {
    val __obj = js.Dynamic.literal()
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Report]
  }
}

