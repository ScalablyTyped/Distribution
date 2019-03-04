package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanCondition extends js.Object {
  def getBackground(): java.lang.String
  def getBold(): scala.Boolean
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[js.Object]
  def getFontColor(): java.lang.String
  def getItalic(): scala.Boolean
  def getStrikethrough(): scala.Boolean
  def getUnderline(): scala.Boolean
}

object BooleanCondition {
  @scala.inline
  def apply(
    getBackground: js.Function0[java.lang.String],
    getBold: js.Function0[scala.Boolean],
    getCriteriaType: js.Function0[BooleanCriteria],
    getCriteriaValues: js.Function0[js.Array[js.Object]],
    getFontColor: js.Function0[java.lang.String],
    getItalic: js.Function0[scala.Boolean],
    getStrikethrough: js.Function0[scala.Boolean],
    getUnderline: js.Function0[scala.Boolean]
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal(getBackground = getBackground, getBold = getBold, getCriteriaType = getCriteriaType, getCriteriaValues = getCriteriaValues, getFontColor = getFontColor, getItalic = getItalic, getStrikethrough = getStrikethrough, getUnderline = getUnderline)
  
    __obj.asInstanceOf[BooleanCondition]
  }
}

