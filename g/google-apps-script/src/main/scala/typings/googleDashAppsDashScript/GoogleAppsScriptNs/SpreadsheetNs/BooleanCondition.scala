package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanCondition extends js.Object {
  def getBackground(): String
  def getBold(): Boolean
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[_]
  def getFontColor(): String
  def getItalic(): Boolean
  def getStrikethrough(): Boolean
  def getUnderline(): Boolean
}

object BooleanCondition {
  @scala.inline
  def apply(
    getBackground: () => String,
    getBold: () => Boolean,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getFontColor: () => String,
    getItalic: () => Boolean,
    getStrikethrough: () => Boolean,
    getUnderline: () => Boolean
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal(getBackground = js.Any.fromFunction0(getBackground), getBold = js.Any.fromFunction0(getBold), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getFontColor = js.Any.fromFunction0(getFontColor), getItalic = js.Any.fromFunction0(getItalic), getStrikethrough = js.Any.fromFunction0(getStrikethrough), getUnderline = js.Any.fromFunction0(getUnderline))
  
    __obj.asInstanceOf[BooleanCondition]
  }
}

