package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRotation extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object TextRotation {
  @scala.inline
  def apply(angle: js.UndefOr[Double] = js.undefined, vertical: js.UndefOr[Boolean] = js.undefined): TextRotation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRotation]
  }
}

