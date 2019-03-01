package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalFormatRule extends js.Object {
  def copy(): ConditionalFormatRuleBuilder
  def getBooleanCondition(): BooleanCondition
  def getGradientCondition(): GradientCondition
  def getRanges(): js.Array[Range]
}

object ConditionalFormatRule {
  @scala.inline
  def apply(
    copy: js.Function0[ConditionalFormatRuleBuilder],
    getBooleanCondition: js.Function0[BooleanCondition],
    getGradientCondition: js.Function0[GradientCondition],
    getRanges: js.Function0[js.Array[Range]]
  ): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("getBooleanCondition")(getBooleanCondition)
    __obj.updateDynamic("getGradientCondition")(getGradientCondition)
    __obj.updateDynamic("getRanges")(getRanges)
    __obj.asInstanceOf[ConditionalFormatRule]
  }
}

