package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMachineTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of machine types contained in this scope.
    */
  var machineTypes: js.UndefOr[js.Array[SchemaMachineType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the machine
    * types list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaMachineTypesScopedList {
  @scala.inline
  def apply(machineTypes: js.Array[SchemaMachineType] = null, warning: AnonCode = null): SchemaMachineTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (machineTypes != null) __obj.updateDynamic("machineTypes")(machineTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMachineTypesScopedList]
  }
}

