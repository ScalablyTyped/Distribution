package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element of text that is dynamically replaced with content that can change over time, such as a
  * slide number.
  */
trait AutoText extends js.Object {
  def getAutoTextType(): AutoTextType
  def getIndex(): Integer
  def getRange(): TextRange
}

object AutoText {
  @scala.inline
  def apply(getAutoTextType: () => AutoTextType, getIndex: () => Integer, getRange: () => TextRange): AutoText = {
    val __obj = js.Dynamic.literal(getAutoTextType = js.Any.fromFunction0(getAutoTextType), getIndex = js.Any.fromFunction0(getIndex), getRange = js.Any.fromFunction0(getRange))
    __obj.asInstanceOf[AutoText]
  }
}

