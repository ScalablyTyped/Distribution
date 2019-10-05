package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStyle extends js.Object {
  def applyListPreset(listPreset: ListPreset): ListStyle
  def getGlyph(): String
  def getList(): List
  def getNestingLevel(): Integer
  def isInList(): Boolean
  def removeFromList(): ListStyle
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
}

