package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataDiskAssignment extends js.Object {
  /**
    * Mounted data disks. The order is important a data disk's 0-based index in
    * this list defines which persistent directory the disk is mounted to, for
    * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
    * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
    */
  var dataDisks: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * VM instance name the data disks mounted to, for example
    * "myproject-1014-104817-4c2-harness-0".
    */
  var vmInstance: js.UndefOr[String] = js.undefined
}

object DataDiskAssignment {
  @scala.inline
  def apply(dataDisks: js.Array[String] = null, vmInstance: String = null): DataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    if (dataDisks != null) __obj.updateDynamic("dataDisks")(dataDisks.asInstanceOf[js.Any])
    if (vmInstance != null) __obj.updateDynamic("vmInstance")(vmInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDiskAssignment]
  }
}

