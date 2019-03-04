package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoText extends js.Object {
  def getAutoTextType(): AutoTextType
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRange(): TextRange
}

object AutoText {
  @scala.inline
  def apply(
    getAutoTextType: js.Function0[AutoTextType],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getRange: js.Function0[TextRange]
  ): AutoText = {
    val __obj = js.Dynamic.literal(getAutoTextType = getAutoTextType, getIndex = getIndex, getRange = getRange)
  
    __obj.asInstanceOf[AutoText]
  }
}

