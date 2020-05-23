package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManagersScopedList extends js.Object {
  /** [Output Only] The list of managed instance groups that are contained in the specified project and zone. */
  var instanceGroupManagers: js.UndefOr[js.Array[InstanceGroupManager]] = js.undefined
  /** [Output Only] The warning that replaces the list of managed instance groups when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}

object InstanceGroupManagersScopedList {
  @scala.inline
  def apply(instanceGroupManagers: js.Array[InstanceGroupManager] = null, warning: Code = null): InstanceGroupManagersScopedList = {
    val __obj = js.Dynamic.literal()
    if (instanceGroupManagers != null) __obj.updateDynamic("instanceGroupManagers")(instanceGroupManagers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupManagersScopedList]
  }
}

