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
    applyListPreset: js.Function1[ListPreset, ListStyle],
    getGlyph: js.Function0[java.lang.String],
    getList: js.Function0[List],
    getNestingLevel: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    isInList: js.Function0[scala.Boolean],
    removeFromList: js.Function0[ListStyle]
  ): ListStyle = {
    val __obj = js.Dynamic.literal(applyListPreset = applyListPreset, getGlyph = getGlyph, getList = getList, getNestingLevel = getNestingLevel, isInList = isInList, removeFromList = removeFromList)
  
    __obj.asInstanceOf[ListStyle]
  }
}

