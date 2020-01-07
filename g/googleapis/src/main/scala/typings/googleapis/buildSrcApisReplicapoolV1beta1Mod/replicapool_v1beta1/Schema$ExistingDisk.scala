package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pre-existing persistent disk that will be attached to every Replica in
  * the Pool in READ_ONLY mode.
  */
@js.native
trait Schema$ExistingDisk extends js.Object {
  /**
    * How the disk will be attached to the Replica.
    */
  var attachment: js.UndefOr[Schema$DiskAttachment] = js.native
  /**
    * The name of the Persistent Disk resource. The Persistent Disk resource
    * must be in the same zone as the Pool.
    */
  var source: js.UndefOr[String] = js.native
}

object Schema$ExistingDisk {
  @scala.inline
  def apply(attachment: Schema$DiskAttachment = null, source: String = null): Schema$ExistingDisk = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExistingDisk]
  }
}

