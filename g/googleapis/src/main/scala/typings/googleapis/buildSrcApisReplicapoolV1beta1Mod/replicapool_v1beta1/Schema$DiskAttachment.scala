package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how to attach a disk to a Replica.
  */
@js.native
trait Schema$DiskAttachment extends js.Object {
  /**
    * The device name of this disk.
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * A zero-based index to assign to this disk, where 0 is reserved for the
    * boot disk. If not specified, this is assigned by the server.
    */
  var index: js.UndefOr[Double] = js.native
}

object Schema$DiskAttachment {
  @scala.inline
  def apply(deviceName: String = null, index: Int | Double = null): Schema$DiskAttachment = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiskAttachment]
  }
}

