package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disk extends js.Object {
  /**
    * Disk storage type, as defined by Google Compute Engine.  This
    * must be a disk type appropriate to the project and zone in which
    * the workers will run.  If unknown or unspecified, the service
    * will attempt to choose a reasonable default.
    *
    * For example, the standard persistent disk type is a resource name
    * typically ending in "pd-standard".  If SSD persistent disks are
    * available, the resource name typically ends with "pd-ssd".  The
    * actual valid values are defined the Google Compute Engine API,
    * not by the Cloud Dataflow API; consult the Google Compute Engine
    * documentation for more information about determining the set of
    * available disk types for a particular project and zone.
    *
    * Google Compute Engine Disk types are local to a particular
    * project in a particular zone, and so the resource name will
    * typically look something like this:
    *
    * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
    */
  var diskType: js.UndefOr[String] = js.native
  /** Directory in a VM where disk is mounted. */
  var mountPoint: js.UndefOr[String] = js.native
  /**
    * Size of disk in GB.  If zero or unspecified, the service will
    * attempt to choose a reasonable default.
    */
  var sizeGb: js.UndefOr[Double] = js.native
}

object Disk {
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  @scala.inline
  implicit class DiskOps[Self <: Disk] (val x: Self) extends AnyVal {
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
    def setDiskType(value: String): Self = this.set("diskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskType: Self = this.set("diskType", js.undefined)
    @scala.inline
    def setMountPoint(value: String): Self = this.set("mountPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountPoint: Self = this.set("mountPoint", js.undefined)
    @scala.inline
    def setSizeGb(value: Double): Self = this.set("sizeGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeGb: Self = this.set("sizeGb", js.undefined)
  }
  
}

