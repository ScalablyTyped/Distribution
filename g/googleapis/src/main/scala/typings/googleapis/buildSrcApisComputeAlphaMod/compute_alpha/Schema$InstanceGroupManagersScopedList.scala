package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupManagersScopedList extends js.Object {
  /**
    * [Output Only] The list of managed instance groups that are contained in
    * the specified project and zone.
    */
  var instanceGroupManagers: js.UndefOr[js.Array[Schema$InstanceGroupManager]] = js.native
  /**
    * [Output Only] The warning that replaces the list of managed instance
    * groups when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$InstanceGroupManagersScopedList {
  @scala.inline
  def apply(instanceGroupManagers: js.Array[Schema$InstanceGroupManager] = null, warning: Anon_Code = null): Schema$InstanceGroupManagersScopedList = {
    val __obj = js.Dynamic.literal()
    if (instanceGroupManagers != null) __obj.updateDynamic("instanceGroupManagers")(instanceGroupManagers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagersScopedList]
  }
}

