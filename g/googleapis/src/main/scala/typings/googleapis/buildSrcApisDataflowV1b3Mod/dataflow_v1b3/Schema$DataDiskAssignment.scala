package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data disk assignment for a given VM instance.
  */
@js.native
trait Schema$DataDiskAssignment extends js.Object {
  /**
    * Mounted data disks. The order is important a data disk&#39;s 0-based
    * index in this list defines which persistent directory the disk is mounted
    * to, for example the list of {
    * &quot;myproject-1014-104817-4c2-harness-0-disk-0&quot; }, {
    * &quot;myproject-1014-104817-4c2-harness-0-disk-1&quot; }.
    */
  var dataDisks: js.UndefOr[js.Array[String]] = js.native
  /**
    * VM instance name the data disks mounted to, for example
    * &quot;myproject-1014-104817-4c2-harness-0&quot;.
    */
  var vmInstance: js.UndefOr[String] = js.native
}

object Schema$DataDiskAssignment {
  @scala.inline
  def apply(dataDisks: js.Array[String] = null, vmInstance: String = null): Schema$DataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    if (dataDisks != null) __obj.updateDynamic("dataDisks")(dataDisks.asInstanceOf[js.Any])
    if (vmInstance != null) __obj.updateDynamic("vmInstance")(vmInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DataDiskAssignment]
  }
}

