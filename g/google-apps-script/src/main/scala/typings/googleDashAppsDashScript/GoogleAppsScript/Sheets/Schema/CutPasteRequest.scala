package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CutPasteRequest extends js.Object {
  var destination: js.UndefOr[GridCoordinate] = js.undefined
  var pasteType: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[GridRange] = js.undefined
}

object CutPasteRequest {
  @scala.inline
  def apply(destination: GridCoordinate = null, pasteType: String = null, source: GridRange = null): CutPasteRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (pasteType != null) __obj.updateDynamic("pasteType")(pasteType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CutPasteRequest]
  }
}

