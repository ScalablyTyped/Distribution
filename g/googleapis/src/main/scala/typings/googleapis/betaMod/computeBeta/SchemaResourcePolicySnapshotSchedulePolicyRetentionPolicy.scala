package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policy for retention of scheduled snapshots.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy extends js.Object {
  /**
    * Maximum age of the snapshot that is allowed to be kept.
    */
  var maxRetentionDays: js.UndefOr[Double] = js.native
  /**
    * Specifies the behavior to apply to scheduled snapshots when the source
    * disk is deleted.
    */
  var onSourceDiskDelete: js.UndefOr[String] = js.native
}

object SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy {
  @scala.inline
  def apply(maxRetentionDays: js.UndefOr[Double] = js.undefined, onSourceDiskDelete: String = null): SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxRetentionDays)) __obj.updateDynamic("maxRetentionDays")(maxRetentionDays.get.asInstanceOf[js.Any])
    if (onSourceDiskDelete != null) __obj.updateDynamic("onSourceDiskDelete")(onSourceDiskDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy]
  }
}

