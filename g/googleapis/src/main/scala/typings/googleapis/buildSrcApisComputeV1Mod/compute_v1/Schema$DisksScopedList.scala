package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DisksScopedList extends js.Object {
  /**
    * [Output Only] A list of disks contained in this scope.
    */
  var disks: js.UndefOr[js.Array[Schema$Disk]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of disks when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$DisksScopedList {
  @scala.inline
  def apply(disks: js.Array[Schema$Disk] = null, warning: Anon_Code = null): Schema$DisksScopedList = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DisksScopedList]
  }
}

