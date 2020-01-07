package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the config of disk options for a group of VM instances.
  */
@js.native
trait Schema$DiskConfig extends js.Object {
  /**
    * Optional. Size in GB of the boot disk (default is 500GB).
    */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  /**
    * Optional. Type of the boot disk (default is &quot;pd-standard&quot;).
    * Valid values: &quot;pd-ssd&quot; (Persistent Disk Solid State Drive) or
    * &quot;pd-standard&quot; (Persistent Disk Hard Disk Drive).
    */
  var bootDiskType: js.UndefOr[String] = js.native
  /**
    * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs
    * are not attached, the boot disk is used to store runtime logs and HDFS
    * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one
    * or more SSDs are attached, this runtime bulk data is spread across them,
    * and the boot disk contains only basic config and installed binaries.
    */
  var numLocalSsds: js.UndefOr[Double] = js.native
}

object Schema$DiskConfig {
  @scala.inline
  def apply(
    bootDiskSizeGb: Int | Double = null,
    bootDiskType: String = null,
    numLocalSsds: Int | Double = null
  ): Schema$DiskConfig = {
    val __obj = js.Dynamic.literal()
    if (bootDiskSizeGb != null) __obj.updateDynamic("bootDiskSizeGb")(bootDiskSizeGb.asInstanceOf[js.Any])
    if (bootDiskType != null) __obj.updateDynamic("bootDiskType")(bootDiskType.asInstanceOf[js.Any])
    if (numLocalSsds != null) __obj.updateDynamic("numLocalSsds")(numLocalSsds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiskConfig]
  }
}

