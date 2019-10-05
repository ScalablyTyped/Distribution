package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsScopedList extends js.Object {
  /** [Output Only] The list of instance groups that are contained in this scope. */
  var instanceGroups: js.UndefOr[js.Array[InstanceGroup]] = js.undefined
  /** [Output Only] An informational warning that replaces the list of instance groups when the list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object InstanceGroupsScopedList {
  @scala.inline
  def apply(instanceGroups: js.Array[InstanceGroup] = null, warning: Anon_Code = null): InstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    if (instanceGroups != null) __obj.updateDynamic("instanceGroups")(instanceGroups)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[InstanceGroupsScopedList]
  }
}

