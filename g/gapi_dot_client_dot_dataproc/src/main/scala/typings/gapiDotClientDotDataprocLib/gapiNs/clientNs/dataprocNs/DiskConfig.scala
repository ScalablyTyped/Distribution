package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskConfig extends js.Object {
  /** Optional. Size in GB of the boot disk (default is 500GB). */
  var bootDiskSizeGb: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and HDFS
    * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and
    * the boot disk contains only basic config and installed binaries.
    */
  var numLocalSsds: js.UndefOr[scala.Double] = js.undefined
}

object DiskConfig {
  @scala.inline
  def apply(bootDiskSizeGb: scala.Int | scala.Double = null, numLocalSsds: scala.Int | scala.Double = null): DiskConfig = {
    val __obj = js.Dynamic.literal()
    if (bootDiskSizeGb != null) __obj.updateDynamic("bootDiskSizeGb")(bootDiskSizeGb.asInstanceOf[js.Any])
    if (numLocalSsds != null) __obj.updateDynamic("numLocalSsds")(numLocalSsds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskConfig]
  }
}

