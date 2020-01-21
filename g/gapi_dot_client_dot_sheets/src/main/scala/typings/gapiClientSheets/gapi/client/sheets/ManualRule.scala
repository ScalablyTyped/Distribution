package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualRule extends js.Object {
  /**
    * The list of group names and the corresponding items from the source data
    * that map to each group name.
    */
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

