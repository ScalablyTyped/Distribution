package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesScopedList extends js.Object {
  /** [Output Only] List of instances contained in this scope. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of instances when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object InstancesScopedList {
  @scala.inline
  def apply(instances: js.Array[Instance] = null, warning: gapiDotClientDotComputeLib.Anon_Code = null): InstancesScopedList = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[InstancesScopedList]
  }
}

