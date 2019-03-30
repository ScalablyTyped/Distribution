package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanCondition extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[ConditionValue]] = js.undefined
}

object BooleanCondition {
  @scala.inline
  def apply(`type`: java.lang.String = null, values: js.Array[ConditionValue] = null): BooleanCondition = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[BooleanCondition]
  }
}

