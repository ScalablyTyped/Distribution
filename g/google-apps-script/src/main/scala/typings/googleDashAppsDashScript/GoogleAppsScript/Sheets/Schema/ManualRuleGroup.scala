package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

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
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualRuleGroup]
  }
}

