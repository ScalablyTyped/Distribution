package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwimlaneSettingsUnassignedGroup extends js.Object {
  /** To enable or disable unassigned category change with swim lane key values.
    * @Default {true}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** To set the user defined values which are need to categorized as unassigned category swim lane groups.
    * @Default {[null,undefined,]}
    */
  var keys: js.UndefOr[js.Array[_]] = js.undefined
}

object SwimlaneSettingsUnassignedGroup {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, keys: js.Array[_] = null): SwimlaneSettingsUnassignedGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwimlaneSettingsUnassignedGroup]
  }
}

