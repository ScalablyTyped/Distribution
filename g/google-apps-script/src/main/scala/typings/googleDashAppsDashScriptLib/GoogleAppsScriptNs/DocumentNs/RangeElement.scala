package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeElement extends js.Object {
  def getElement(): Element
  def getEndOffsetInclusive(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getStartOffset(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isPartial(): scala.Boolean
}

object RangeElement {
  @scala.inline
  def apply(
    getElement: () => Element,
    getEndOffsetInclusive: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getStartOffset: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    isPartial: () => scala.Boolean
  ): RangeElement = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getEndOffsetInclusive = js.Any.fromFunction0(getEndOffsetInclusive), getStartOffset = js.Any.fromFunction0(getStartOffset), isPartial = js.Any.fromFunction0(isPartial))
  
    __obj.asInstanceOf[RangeElement]
  }
}

