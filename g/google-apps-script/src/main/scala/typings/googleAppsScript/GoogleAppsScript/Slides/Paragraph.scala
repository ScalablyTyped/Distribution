package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A segment of text terminated by a newline character.
  */
@js.native
trait Paragraph extends js.Object {
  def getIndex(): Integer = js.native
  def getRange(): TextRange = js.native
}

object Paragraph {
  @scala.inline
  def apply(getIndex: () => Integer, getRange: () => TextRange): Paragraph = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getRange = js.Any.fromFunction0(getRange))
    __obj.asInstanceOf[Paragraph]
  }
  @scala.inline
  implicit class ParagraphOps[Self <: Paragraph] (val x: Self) extends AnyVal {
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
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRange(value: () => TextRange): Self = this.set("getRange", js.Any.fromFunction0(value))
  }
  
}

