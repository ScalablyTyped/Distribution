package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualRuleGroup extends js.Object {
  /**
    * The group name, which must be a string. Each group in a given
    * ManualRule must have a unique group name.
    */
  var groupName: js.UndefOr[ExtendedValue] = js.undefined
  /**
    * The items in the source data that should be placed into this group. Each
    * item may be a string, number, or boolean. Items may appear in at most one
    * group within a given ManualRule. Items that do not appear in any
    * group will appear on their own.
    */
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

