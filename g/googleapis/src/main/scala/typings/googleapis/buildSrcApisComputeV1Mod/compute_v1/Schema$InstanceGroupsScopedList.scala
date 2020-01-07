package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupsScopedList extends js.Object {
  /**
    * [Output Only] The list of instance groups that are contained in this
    * scope.
    */
  var instanceGroups: js.UndefOr[js.Array[Schema$InstanceGroup]] = js.native
  /**
    * [Output Only] An informational warning that replaces the list of instance
    * groups when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$InstanceGroupsScopedList {
  @scala.inline
  def apply(instanceGroups: js.Array[Schema$InstanceGroup] = null, warning: Anon_Code = null): Schema$InstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    if (instanceGroups != null) __obj.updateDynamic("instanceGroups")(instanceGroups.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupsScopedList]
  }
}

