package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionValue extends js.Object {
  var relativeDate: js.UndefOr[java.lang.String] = js.undefined
  var userEnteredValue: js.UndefOr[java.lang.String] = js.undefined
}

object ConditionValue {
  @scala.inline
  def apply(relativeDate: java.lang.String = null, userEnteredValue: java.lang.String = null): ConditionValue = {
    val __obj = js.Dynamic.literal()
    if (relativeDate != null) __obj.updateDynamic("relativeDate")(relativeDate)
    if (userEnteredValue != null) __obj.updateDynamic("userEnteredValue")(userEnteredValue)
    __obj.asInstanceOf[ConditionValue]
  }
}

