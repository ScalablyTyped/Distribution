package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsScopedList extends js.Object {
  /** [Output Only] The list of instance groups that are contained in this scope. */
  var instanceGroups: js.UndefOr[js.Array[InstanceGroup]] = js.undefined
  /** [Output Only] An informational warning that replaces the list of instance groups when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.undefined
}

object InstanceGroupsScopedList {
  @scala.inline
  def apply(instanceGroups: js.Array[InstanceGroup] = null, warning: AnonCode = null): InstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    if (instanceGroups != null) __obj.updateDynamic("instanceGroups")(instanceGroups.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupsScopedList]
  }
}

