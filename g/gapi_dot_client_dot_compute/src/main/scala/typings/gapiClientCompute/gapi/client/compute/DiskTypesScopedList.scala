package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskTypesScopedList extends js.Object {
  /** [Output Only] List of disk types contained in this scope. */
  var diskTypes: js.UndefOr[js.Array[DiskType]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of disk types when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}

object DiskTypesScopedList {
  @scala.inline
  def apply(diskTypes: js.Array[DiskType] = null, warning: Code = null): DiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (diskTypes != null) __obj.updateDynamic("diskTypes")(diskTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskTypesScopedList]
  }
}

