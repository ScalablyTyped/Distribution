package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedObjectPosition extends js.Object {
  var newSheet: js.UndefOr[Boolean] = js.undefined
  var overlayPosition: js.UndefOr[OverlayPosition] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
}

object EmbeddedObjectPosition {
  @scala.inline
  def apply(
    newSheet: js.UndefOr[Boolean] = js.undefined,
    overlayPosition: OverlayPosition = null,
    sheetId: Int | Double = null
  ): EmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newSheet)) __obj.updateDynamic("newSheet")(newSheet.asInstanceOf[js.Any])
    if (overlayPosition != null) __obj.updateDynamic("overlayPosition")(overlayPosition.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedObjectPosition]
  }
}

