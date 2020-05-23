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
    sheetId: js.UndefOr[Double] = js.undefined
  ): EmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newSheet)) __obj.updateDynamic("newSheet")(newSheet.get.asInstanceOf[js.Any])
    if (overlayPosition != null) __obj.updateDynamic("overlayPosition")(overlayPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedObjectPosition]
  }
}

