package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

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
    columns: js.UndefOr[Double] = js.undefined,
    endOfSegmentLocation: EndOfSegmentLocation = null,
    location: Location = null,
    rows: js.UndefOr[Double] = js.undefined
  ): InsertTableRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (endOfSegmentLocation != null) __obj.updateDynamic("endOfSegmentLocation")(endOfSegmentLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTableRequest]
  }
}

