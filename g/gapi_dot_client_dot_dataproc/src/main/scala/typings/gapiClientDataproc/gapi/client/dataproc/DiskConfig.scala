package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskConfig extends js.Object {
  /** Optional. Size in GB of the boot disk (default is 500GB). */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  /**
    * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and HDFS
    * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and
    * the boot disk contains only basic config and installed binaries.
    */
  var numLocalSsds: js.UndefOr[Double] = js.native
}

object DiskConfig {
  @scala.inline
  def apply(): DiskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskConfig]
  }
  @scala.inline
  implicit class DiskConfigOps[Self <: DiskConfig] (val x: Self) extends AnyVal {
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
    def setBootDiskSizeGb(value: Double): Self = this.set("bootDiskSizeGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootDiskSizeGb: Self = this.set("bootDiskSizeGb", js.undefined)
    @scala.inline
    def setNumLocalSsds(value: Double): Self = this.set("numLocalSsds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumLocalSsds: Self = this.set("numLocalSsds", js.undefined)
  }
  
}

