package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksScopedList extends js.Object {
  /** [Output Only] List of disks contained in this scope. */
  var disks: js.UndefOr[js.Array[Disk]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of disks when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object DisksScopedList {
  @scala.inline
  def apply(disks: js.Array[Disk] = null, warning: gapiDotClientDotComputeLib.Anon_Code = null): DisksScopedList = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[DisksScopedList]
  }
}

