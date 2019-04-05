package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CutPasteRequest extends js.Object {
  var destination: js.UndefOr[GridCoordinate] = js.undefined
  var pasteType: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[GridRange] = js.undefined
}

object CutPasteRequest {
  @scala.inline
  def apply(destination: GridCoordinate = null, pasteType: java.lang.String = null, source: GridRange = null): CutPasteRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (pasteType != null) __obj.updateDynamic("pasteType")(pasteType)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CutPasteRequest]
  }
}

