package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskTypesScopedList extends js.Object {
  /** [Output Only] List of disk types contained in this scope. */
  var diskTypes: js.UndefOr[js.Array[DiskType]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of disk types when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object DiskTypesScopedList {
  @scala.inline
  def apply(diskTypes: js.Array[DiskType] = null, warning: gapiDotClientDotComputeLib.Anon_Code = null): DiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (diskTypes != null) __obj.updateDynamic("diskTypes")(diskTypes)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[DiskTypesScopedList]
  }
}

