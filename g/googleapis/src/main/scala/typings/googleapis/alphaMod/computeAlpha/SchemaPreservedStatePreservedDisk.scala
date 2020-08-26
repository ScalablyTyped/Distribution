package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPreservedStatePreservedDisk extends js.Object {
  /**
    * These stateful disks will never be deleted during autohealing, update,
    * instance recreate operations. This flag is used to configure if the disk
    * should be deleted after it is no longer used by the group, e.g. when the
    * given instance or the whole MIG is deleted. Note: disks attached in
    * READ_ONLY mode cannot be auto-deleted.
    */
  var autoDelete: js.UndefOr[String] = js.native
  /**
    * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If
    * not specified, the default is to attach the disk in READ_WRITE mode.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The URL of the disk resource that is stateful and should be attached to
    * the VM instance.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaPreservedStatePreservedDisk {
  @scala.inline
  def apply(): SchemaPreservedStatePreservedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreservedStatePreservedDisk]
  }
  @scala.inline
  implicit class SchemaPreservedStatePreservedDiskOps[Self <: SchemaPreservedStatePreservedDisk] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

