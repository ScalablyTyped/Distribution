package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a disk on a VM.
  */
@js.native
trait Schema$DiskStatus extends js.Object {
  /**
    * Free disk space.
    */
  var freeSpaceBytes: js.UndefOr[String] = js.native
  /**
    * Total disk space.
    */
  var totalSpaceBytes: js.UndefOr[String] = js.native
}

object Schema$DiskStatus {
  @scala.inline
  def apply(freeSpaceBytes: String = null, totalSpaceBytes: String = null): Schema$DiskStatus = {
    val __obj = js.Dynamic.literal()
    if (freeSpaceBytes != null) __obj.updateDynamic("freeSpaceBytes")(freeSpaceBytes.asInstanceOf[js.Any])
    if (totalSpaceBytes != null) __obj.updateDynamic("totalSpaceBytes")(totalSpaceBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiskStatus]
  }
}

