package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Machine resources for a version.
  */
@js.native
trait SchemaResources extends js.Object {
  /**
    * Number of CPU cores needed.
    */
  var cpu: js.UndefOr[Double] = js.native
  /**
    * Disk size (GB) needed.
    */
  var diskGb: js.UndefOr[Double] = js.native
  /**
    * Memory (GB) needed.
    */
  var memoryGb: js.UndefOr[Double] = js.native
  /**
    * User specified volumes.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
}

object SchemaResources {
  @scala.inline
  def apply(): SchemaResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResources]
  }
  @scala.inline
  implicit class SchemaResourcesOps[Self <: SchemaResources] (val x: Self) extends AnyVal {
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
    def setCpu(value: Double): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    @scala.inline
    def setDiskGb(value: Double): Self = this.set("diskGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskGb: Self = this.set("diskGb", js.undefined)
    @scala.inline
    def setMemoryGb(value: Double): Self = this.set("memoryGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryGb: Self = this.set("memoryGb", js.undefined)
    @scala.inline
    def setVolumesVarargs(value: SchemaVolume*): Self = this.set("volumes", js.Array(value :_*))
    @scala.inline
    def setVolumes(value: js.Array[SchemaVolume]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
  
}

