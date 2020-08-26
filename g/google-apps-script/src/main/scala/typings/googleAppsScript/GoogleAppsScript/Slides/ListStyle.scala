package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list styling for a range of text.
  */
@js.native
trait ListStyle extends js.Object {
  def applyListPreset(listPreset: ListPreset): ListStyle = js.native
  def getGlyph(): String = js.native
  def getList(): List = js.native
  def getNestingLevel(): Integer = js.native
  def isInList(): Boolean = js.native
  def removeFromList(): ListStyle = js.native
}

object ListStyle {
  @scala.inline
  def apply(
    applyListPreset: ListPreset => ListStyle,
    getGlyph: () => String,
    getList: () => List,
    getNestingLevel: () => Integer,
    isInList: () => Boolean,
    removeFromList: () => ListStyle
  ): ListStyle = {
    val __obj = js.Dynamic.literal(applyListPreset = js.Any.fromFunction1(applyListPreset), getGlyph = js.Any.fromFunction0(getGlyph), getList = js.Any.fromFunction0(getList), getNestingLevel = js.Any.fromFunction0(getNestingLevel), isInList = js.Any.fromFunction0(isInList), removeFromList = js.Any.fromFunction0(removeFromList))
    __obj.asInstanceOf[ListStyle]
  }
  @scala.inline
  implicit class ListStyleOps[Self <: ListStyle] (val x: Self) extends AnyVal {
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
    def setApplyListPreset(value: ListPreset => ListStyle): Self = this.set("applyListPreset", js.Any.fromFunction1(value))
    @scala.inline
    def setGetGlyph(value: () => String): Self = this.set("getGlyph", js.Any.fromFunction0(value))
    @scala.inline
    def setGetList(value: () => List): Self = this.set("getList", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNestingLevel(value: () => Integer): Self = this.set("getNestingLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInList(value: () => Boolean): Self = this.set("isInList", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveFromList(value: () => ListStyle): Self = this.set("removeFromList", js.Any.fromFunction0(value))
  }
  
}

