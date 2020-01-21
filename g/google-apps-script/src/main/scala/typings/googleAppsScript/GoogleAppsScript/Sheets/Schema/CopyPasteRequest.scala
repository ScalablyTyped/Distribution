package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPasteRequest extends js.Object {
  var destination: js.UndefOr[GridRange] = js.undefined
  var pasteOrientation: js.UndefOr[String] = js.undefined
  var pasteType: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[GridRange] = js.undefined
}

object CopyPasteRequest {
  @scala.inline
  def apply(
    destination: GridRange = null,
    pasteOrientation: String = null,
    pasteType: String = null,
    source: GridRange = null
  ): CopyPasteRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (pasteOrientation != null) __obj.updateDynamic("pasteOrientation")(pasteOrientation.asInstanceOf[js.Any])
    if (pasteType != null) __obj.updateDynamic("pasteType")(pasteType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPasteRequest]
  }
}

