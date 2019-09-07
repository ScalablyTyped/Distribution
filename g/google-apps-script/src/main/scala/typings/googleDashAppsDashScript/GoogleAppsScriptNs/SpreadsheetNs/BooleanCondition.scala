package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanCondition extends js.Object {
  def getBackground(): String | Null
  def getBold(): Boolean | Null
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[_]
  def getFontColor(): String | Null
  def getItalic(): Boolean | Null
  def getStrikethrough(): Boolean | Null
  def getUnderline(): Boolean | Null
}

object BooleanCondition {
  @scala.inline
  def apply(
    getBackground: () => String | Null,
    getBold: () => Boolean | Null,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getFontColor: () => String | Null,
    getItalic: () => Boolean | Null,
    getStrikethrough: () => Boolean | Null,
    getUnderline: () => Boolean | Null
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal(getBackground = js.Any.fromFunction0(getBackground), getBold = js.Any.fromFunction0(getBold), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getFontColor = js.Any.fromFunction0(getFontColor), getItalic = js.Any.fromFunction0(getItalic), getStrikethrough = js.Any.fromFunction0(getStrikethrough), getUnderline = js.Any.fromFunction0(getUnderline))
  
    __obj.asInstanceOf[BooleanCondition]
  }
}

