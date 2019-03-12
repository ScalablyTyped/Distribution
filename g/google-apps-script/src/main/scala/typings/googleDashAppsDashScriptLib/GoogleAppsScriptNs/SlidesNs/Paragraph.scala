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
  def apply(getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, getRange: () => TextRange): Paragraph = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getRange = js.Any.fromFunction0(getRange))
  
    __obj.asInstanceOf[Paragraph]
  }
}

