package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualRule extends js.Object {
  var groups: js.UndefOr[js.Array[ManualRuleGroup]] = js.undefined
}

object ManualRule {
  @scala.inline
  def apply(groups: js.Array[ManualRuleGroup] = null): ManualRule = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualRule]
  }
}

