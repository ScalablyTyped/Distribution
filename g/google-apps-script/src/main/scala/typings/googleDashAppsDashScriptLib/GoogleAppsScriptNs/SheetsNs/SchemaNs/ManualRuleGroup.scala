package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualRuleGroup extends js.Object {
  var groupName: js.UndefOr[ExtendedValue] = js.undefined
  var items: js.UndefOr[js.Array[ExtendedValue]] = js.undefined
}

object ManualRuleGroup {
  @scala.inline
  def apply(groupName: ExtendedValue = null, items: js.Array[ExtendedValue] = null): ManualRuleGroup = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ManualRuleGroup]
  }
}

