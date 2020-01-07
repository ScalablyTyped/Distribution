package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$MachineTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of machine types contained in this scope.
    */
  var machineTypes: js.UndefOr[js.Array[Schema$MachineType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the machine
    * types list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$MachineTypesScopedList {
  @scala.inline
  def apply(machineTypes: js.Array[Schema$MachineType] = null, warning: Anon_Code = null): Schema$MachineTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (machineTypes != null) __obj.updateDynamic("machineTypes")(machineTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MachineTypesScopedList]
  }
}

