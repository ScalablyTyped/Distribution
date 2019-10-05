package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRotation extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object TextRotation {
  @scala.inline
  def apply(angle: Int | Double = null, vertical: js.UndefOr[Boolean] = js.undefined): TextRotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[TextRotation]
  }
}

