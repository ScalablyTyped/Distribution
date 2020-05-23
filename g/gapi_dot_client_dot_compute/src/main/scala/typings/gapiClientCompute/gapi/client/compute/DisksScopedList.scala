package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksScopedList extends js.Object {
  /** [Output Only] List of disks contained in this scope. */
  var disks: js.UndefOr[js.Array[Disk]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of disks when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}

object DisksScopedList {
  @scala.inline
  def apply(disks: js.Array[Disk] = null, warning: Code = null): DisksScopedList = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisksScopedList]
  }
}

