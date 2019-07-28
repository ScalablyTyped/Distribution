package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeElement extends js.Object {
  def getElement(): Element
  def getEndOffsetInclusive(): Integer
  def getStartOffset(): Integer
  def isPartial(): Boolean
}

object RangeElement {
  @scala.inline
  def apply(
    getElement: () => Element,
    getEndOffsetInclusive: () => Integer,
    getStartOffset: () => Integer,
    isPartial: () => Boolean
  ): RangeElement = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getEndOffsetInclusive = js.Any.fromFunction0(getEndOffsetInclusive), getStartOffset = js.Any.fromFunction0(getStartOffset), isPartial = js.Any.fromFunction0(isPartial))
  
    __obj.asInstanceOf[RangeElement]
  }
}

