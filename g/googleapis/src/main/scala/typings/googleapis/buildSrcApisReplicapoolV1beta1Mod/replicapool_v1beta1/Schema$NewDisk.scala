package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Persistent Disk resource that will be created and attached to each
  * Replica in the Pool. Each Replica will have a unique persistent disk that
  * is created and attached to that Replica in READ_WRITE mode.
  */
@js.native
trait Schema$NewDisk extends js.Object {
  /**
    * How the disk will be attached to the Replica.
    */
  var attachment: js.UndefOr[Schema$DiskAttachment] = js.native
  /**
    * If true, then this disk will be deleted when the instance is deleted. The
    * default value is true.
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  /**
    * If true, indicates that this is the root persistent disk.
    */
  var boot: js.UndefOr[Boolean] = js.native
  /**
    * Create the new disk using these parameters. The name of the disk will be
    * &lt;instance_name&gt;-&lt;four_random_charactersgt;.
    */
  var initializeParams: js.UndefOr[Schema$NewDiskInitializeParams] = js.native
}

object Schema$NewDisk {
  @scala.inline
  def apply(
    attachment: Schema$DiskAttachment = null,
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    boot: js.UndefOr[Boolean] = js.undefined,
    initializeParams: Schema$NewDiskInitializeParams = null
  ): Schema$NewDisk = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(boot)) __obj.updateDynamic("boot")(boot.asInstanceOf[js.Any])
    if (initializeParams != null) __obj.updateDynamic("initializeParams")(initializeParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NewDisk]
  }
}

