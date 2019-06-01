package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanCondition extends js.Object {
  def getBackground(): java.lang.String
  def getBold(): scala.Boolean
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[_]
  def getFontColor(): java.lang.String
  def getItalic(): scala.Boolean
  def getStrikethrough(): scala.Boolean
  def getUnderline(): scala.Boolean
}

object BooleanCondition {
  @scala.inline
  def apply(
    getBackground: () => java.lang.String,
    getBold: () => scala.Boolean,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getFontColor: () => java.lang.String,
    getItalic: () => scala.Boolean,
    getStrikethrough: () => scala.Boolean,
    getUnderline: () => scala.Boolean
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal(getBackground = js.Any.fromFunction0(getBackground), getBold = js.Any.fromFunction0(getBold), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getFontColor = js.Any.fromFunction0(getFontColor), getItalic = js.Any.fromFunction0(getItalic), getStrikethrough = js.Any.fromFunction0(getStrikethrough), getUnderline = js.Any.fromFunction0(getUnderline))
  
    __obj.asInstanceOf[BooleanCondition]
  }
}

