package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStatefulPolicyPreservedStateDiskDevice extends js.Object {
  /**
    * These stateful disks will never be deleted during autohealing, update or
    * VM instance recreate operations. This flag is used to configure if the
    * disk should be deleted after it is no longer used by the group, e.g. when
    * the given instance or the whole group is deleted. Note: disks attached in
    * READ_ONLY mode cannot be auto-deleted.
    */
  var autoDelete: js.UndefOr[String] = js.native
}

object SchemaStatefulPolicyPreservedStateDiskDevice {
  @scala.inline
  def apply(): SchemaStatefulPolicyPreservedStateDiskDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedStateDiskDevice]
  }
  @scala.inline
  implicit class SchemaStatefulPolicyPreservedStateDiskDeviceOps[Self <: SchemaStatefulPolicyPreservedStateDiskDevice] (val x: Self) extends AnyVal {
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
    def setAutoDelete(value: String): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
  }
  
}

