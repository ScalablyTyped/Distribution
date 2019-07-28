package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionValue extends js.Object {
  var relativeDate: js.UndefOr[String] = js.undefined
  var userEnteredValue: js.UndefOr[String] = js.undefined
}

object ConditionValue {
  @scala.inline
  def apply(relativeDate: String = null, userEnteredValue: String = null): ConditionValue = {
    val __obj = js.Dynamic.literal()
    if (relativeDate != null) __obj.updateDynamic("relativeDate")(relativeDate)
    if (userEnteredValue != null) __obj.updateDynamic("userEnteredValue")(userEnteredValue)
    __obj.asInstanceOf[ConditionValue]
  }
}

