package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesScopedList extends js.Object {
  /** [Output Only] List of instances contained in this scope. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of instances when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.undefined
}

object InstancesScopedList {
  @scala.inline
  def apply(instances: js.Array[Instance] = null, warning: AnonCode = null): InstancesScopedList = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesScopedList]
  }
}

