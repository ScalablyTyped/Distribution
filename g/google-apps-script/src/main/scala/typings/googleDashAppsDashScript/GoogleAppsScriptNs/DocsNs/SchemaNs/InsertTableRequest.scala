package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTableRequest extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
}

object InsertTableRequest {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    endOfSegmentLocation: EndOfSegmentLocation = null,
    location: Location = null,
    rows: Int | Double = null
  ): InsertTableRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (endOfSegmentLocation != null) __obj.updateDynamic("endOfSegmentLocation")(endOfSegmentLocation)
    if (location != null) __obj.updateDynamic("location")(location)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTableRequest]
  }
}

