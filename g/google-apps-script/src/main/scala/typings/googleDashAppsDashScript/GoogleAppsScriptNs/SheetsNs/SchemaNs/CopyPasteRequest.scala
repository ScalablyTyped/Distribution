package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

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
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (pasteOrientation != null) __obj.updateDynamic("pasteOrientation")(pasteOrientation)
    if (pasteType != null) __obj.updateDynamic("pasteType")(pasteType)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CopyPasteRequest]
  }
}

