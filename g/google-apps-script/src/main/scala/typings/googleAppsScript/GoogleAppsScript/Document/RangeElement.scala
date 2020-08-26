package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper around an Element with a possible start and end offset. These offsets allow a
  * range of characters within a Text
  * element to be represented in search results, document selections, and named ranges.
  */
@js.native
trait RangeElement extends js.Object {
  def getElement(): Element = js.native
  def getEndOffsetInclusive(): Integer = js.native
  def getStartOffset(): Integer = js.native
  def isPartial(): Boolean = js.native
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
  @scala.inline
  implicit class RangeElementOps[Self <: RangeElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetElement(value: () => Element): Self = this.set("getElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEndOffsetInclusive(value: () => Integer): Self = this.set("getEndOffsetInclusive", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStartOffset(value: () => Integer): Self = this.set("getStartOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPartial(value: () => Boolean): Self = this.set("isPartial", js.Any.fromFunction0(value))
  }
  
}

