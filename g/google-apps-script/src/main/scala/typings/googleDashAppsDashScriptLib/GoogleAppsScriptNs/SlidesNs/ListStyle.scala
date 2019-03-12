package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStyle extends js.Object {
  def applyListPreset(listPreset: ListPreset): ListStyle
  def getGlyph(): java.lang.String
  def getList(): List
  def getNestingLevel(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isInList(): scala.Boolean
  def removeFromList(): ListStyle
}

object ListStyle {
  @scala.inline
  def apply(
    applyListPreset: ListPreset => ListStyle,
    getGlyph: () => java.lang.String,
    getList: () => List,
    getNestingLevel: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    isInList: () => scala.Boolean,
    removeFromList: () => ListStyle
  ): ListStyle = {
    val __obj = js.Dynamic.literal(applyListPreset = js.Any.fromFunction1(applyListPreset), getGlyph = js.Any.fromFunction0(getGlyph), getList = js.Any.fromFunction0(getList), getNestingLevel = js.Any.fromFunction0(getNestingLevel), isInList = js.Any.fromFunction0(isInList), removeFromList = js.Any.fromFunction0(removeFromList))
  
    __obj.asInstanceOf[ListStyle]
  }
}

