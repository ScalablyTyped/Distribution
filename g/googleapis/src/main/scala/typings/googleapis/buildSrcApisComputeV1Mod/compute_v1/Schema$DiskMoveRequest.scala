package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DiskMoveRequest extends js.Object {
  /**
    * The URL of the destination zone to move the disk. This can be a full or
    * partial URL. For example, the following are all valid URLs to a zone:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone  -
    * projects/project/zones/zone  - zones/zone
    */
  var destinationZone: js.UndefOr[String] = js.native
  /**
    * The URL of the target disk to move. This can be a full or partial URL.
    * For example, the following are all valid URLs to a disk:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
    * - projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
    */
  var targetDisk: js.UndefOr[String] = js.native
}

object Schema$DiskMoveRequest {
  @scala.inline
  def apply(destinationZone: String = null, targetDisk: String = null): Schema$DiskMoveRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationZone != null) __obj.updateDynamic("destinationZone")(destinationZone.asInstanceOf[js.Any])
    if (targetDisk != null) __obj.updateDynamic("targetDisk")(targetDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiskMoveRequest]
  }
}

