package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedInstanceOverrideDiskOverride extends js.Object {
  /**
    * The name of the device on the VM
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If
    * not specified, the default is to attach the disk in READ_WRITE mode.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The disk that is/will be mounted
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaManagedInstanceOverrideDiskOverride {
  @scala.inline
  def apply(): SchemaManagedInstanceOverrideDiskOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceOverrideDiskOverride]
  }
  @scala.inline
  implicit class SchemaManagedInstanceOverrideDiskOverrideOps[Self <: SchemaManagedInstanceOverrideDiskOverride] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
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

