package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph extends js.Object {
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRange(): TextRange
}

object Paragraph {
  @scala.inline
  def apply(
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getRange: js.Function0[TextRange]
  ): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getRange")(getRange)
    __obj.asInstanceOf[Paragraph]
  }
}

