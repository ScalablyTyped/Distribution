package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper around an Element with a possible start and end offset. These offsets allow a
  * range of characters within a Text
  * element to be represented in search results, document selections, and named ranges.
  */
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

