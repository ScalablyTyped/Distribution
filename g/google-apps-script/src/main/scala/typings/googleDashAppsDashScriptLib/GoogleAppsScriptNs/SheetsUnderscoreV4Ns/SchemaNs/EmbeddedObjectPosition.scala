package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedObjectPosition extends js.Object {
  var newSheet: js.UndefOr[scala.Boolean] = js.undefined
  var overlayPosition: js.UndefOr[OverlayPosition] = js.undefined
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object EmbeddedObjectPosition {
  @scala.inline
  def apply(
    newSheet: js.UndefOr[scala.Boolean] = js.undefined,
    overlayPosition: OverlayPosition = null,
    sheetId: scala.Int | scala.Double = null
  ): EmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newSheet)) __obj.updateDynamic("newSheet")(newSheet)
    if (overlayPosition != null) __obj.updateDynamic("overlayPosition")(overlayPosition)
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedObjectPosition]
  }
}

