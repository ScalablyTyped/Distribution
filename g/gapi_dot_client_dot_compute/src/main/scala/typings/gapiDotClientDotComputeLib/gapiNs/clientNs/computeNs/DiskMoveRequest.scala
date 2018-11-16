package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DiskMoveRequest extends js.Object {
  /**
               * The URL of the destination zone to move the disk. This can be a full or partial URL. For example, the following are all valid URLs to a zone:
               * - https://www.googleapis.com/compute/v1/projects/project/zones/zone
               * - projects/project/zones/zone
               * - zones/zone
               */
  var destinationZone: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The URL of the target disk to move. This can be a full or partial URL. For example, the following are all valid URLs to a disk:
               * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
               * - projects/project/zones/zone/disks/disk
               * - zones/zone/disks/disk
               */
  var targetDisk: js.UndefOr[java.lang.String] = js.undefined
}

