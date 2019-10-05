package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineTypesScopedList extends js.Object {
  /** [Output Only] List of machine types contained in this scope. */
  var machineTypes: js.UndefOr[js.Array[MachineType]] = js.undefined
  /** [Output Only] An informational warning that appears when the machine types list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object MachineTypesScopedList {
  @scala.inline
  def apply(machineTypes: js.Array[MachineType] = null, warning: Anon_Code = null): MachineTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (machineTypes != null) __obj.updateDynamic("machineTypes")(machineTypes)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[MachineTypesScopedList]
  }
}

