package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRotation extends js.Object {
  def getDegrees(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isVertical(): scala.Boolean
}

object TextRotation {
  @scala.inline
  def apply(
    getDegrees: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    isVertical: js.Function0[scala.Boolean]
  ): TextRotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDegrees")(getDegrees)
    __obj.updateDynamic("isVertical")(isVertical)
    __obj.asInstanceOf[TextRotation]
  }
}

