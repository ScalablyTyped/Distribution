package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRotation extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object TextRotation {
  @scala.inline
  def apply(angle: scala.Int | scala.Double = null, vertical: js.UndefOr[scala.Boolean] = js.undefined): TextRotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[TextRotation]
  }
}

