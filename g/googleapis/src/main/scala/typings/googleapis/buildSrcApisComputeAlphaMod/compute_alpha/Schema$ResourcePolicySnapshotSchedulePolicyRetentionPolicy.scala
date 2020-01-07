package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policy for retention of scheduled snapshots.
  */
@js.native
trait Schema$ResourcePolicySnapshotSchedulePolicyRetentionPolicy extends js.Object {
  /**
    * Maximum age of the snapshot that is allowed to be kept.
    */
  var maxRetentionDays: js.UndefOr[Double] = js.native
  /**
    * Specifies the behavior to apply to existing, scheduled snapshots
    * snapshots if the policy is changed.
    */
  var onPolicySwitch: js.UndefOr[String] = js.native
  /**
    * Specifies the behavior to apply to scheduled snapshots when the source
    * disk is deleted.
    */
  var onSourceDiskDelete: js.UndefOr[String] = js.native
}

object Schema$ResourcePolicySnapshotSchedulePolicyRetentionPolicy {
  @scala.inline
  def apply(
    maxRetentionDays: Int | Double = null,
    onPolicySwitch: String = null,
    onSourceDiskDelete: String = null
  ): Schema$ResourcePolicySnapshotSchedulePolicyRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    if (maxRetentionDays != null) __obj.updateDynamic("maxRetentionDays")(maxRetentionDays.asInstanceOf[js.Any])
    if (onPolicySwitch != null) __obj.updateDynamic("onPolicySwitch")(onPolicySwitch.asInstanceOf[js.Any])
    if (onSourceDiskDelete != null) __obj.updateDynamic("onSourceDiskDelete")(onSourceDiskDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicySnapshotSchedulePolicyRetentionPolicy]
  }
}

