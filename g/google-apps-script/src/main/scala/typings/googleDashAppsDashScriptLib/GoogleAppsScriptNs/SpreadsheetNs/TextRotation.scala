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
    getDegrees: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    isVertical: () => scala.Boolean
  ): TextRotation = {
    val __obj = js.Dynamic.literal(getDegrees = js.Any.fromFunction0(getDegrees), isVertical = js.Any.fromFunction0(isVertical))
  
    __obj.asInstanceOf[TextRotation]
  }
}

