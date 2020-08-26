package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataDiskAssignment extends js.Object {
  /**
    * Mounted data disks. The order is important a data disk's 0-based index in
    * this list defines which persistent directory the disk is mounted to, for
    * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
    * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
    */
  var dataDisks: js.UndefOr[js.Array[String]] = js.native
  /**
    * VM instance name the data disks mounted to, for example
    * "myproject-1014-104817-4c2-harness-0".
    */
  var vmInstance: js.UndefOr[String] = js.native
}

object DataDiskAssignment {
  @scala.inline
  def apply(): DataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataDiskAssignment]
  }
  @scala.inline
  implicit class DataDiskAssignmentOps[Self <: DataDiskAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataDisksVarargs(value: String*): Self = this.set("dataDisks", js.Array(value :_*))
    @scala.inline
    def setDataDisks(value: js.Array[String]): Self = this.set("dataDisks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDisks: Self = this.set("dataDisks", js.undefined)
    @scala.inline
    def setVmInstance(value: String): Self = this.set("vmInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmInstance: Self = this.set("vmInstance", js.undefined)
  }
  
}

