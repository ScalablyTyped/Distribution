package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteDataRequest extends js.Object {
  var coordinate: js.UndefOr[GridCoordinate] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PasteDataRequest {
  @scala.inline
  def apply(
    coordinate: GridCoordinate = null,
    data: String = null,
    delimiter: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): PasteDataRequest = {
    val __obj = js.Dynamic.literal()
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate)
    if (data != null) __obj.updateDynamic("data")(data)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PasteDataRequest]
  }
}

