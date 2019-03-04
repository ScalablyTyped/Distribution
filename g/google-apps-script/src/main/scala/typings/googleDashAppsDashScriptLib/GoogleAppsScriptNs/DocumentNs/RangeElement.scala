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
    getElement: js.Function0[Element],
    getEndOffsetInclusive: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getStartOffset: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    isPartial: js.Function0[scala.Boolean]
  ): RangeElement = {
    val __obj = js.Dynamic.literal(getElement = getElement, getEndOffsetInclusive = getEndOffsetInclusive, getStartOffset = getStartOffset, isPartial = isPartial)
  
    __obj.asInstanceOf[RangeElement]
  }
}

