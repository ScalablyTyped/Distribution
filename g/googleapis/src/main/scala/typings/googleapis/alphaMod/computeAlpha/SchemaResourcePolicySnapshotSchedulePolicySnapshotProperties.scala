package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specified snapshot properties for scheduled snapshots created by this
  * policy.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties extends js.Object {
  /**
    * Indication to perform a ?guest aware? snapshot.
    */
  var guestFlush: js.UndefOr[Boolean] = js.native
  /**
    * Labels to apply to scheduled snapshots. These can be later modified by
    * the setLabels method. Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * GCS bucket storage location of the auto snapshot (regional or
    * multi-regional).
    */
  var storageLocations: js.UndefOr[js.Array[String]] = js.native
}

object SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties {
  @scala.inline
  def apply(
    guestFlush: js.UndefOr[Boolean] = js.undefined,
    labels: StringDictionary[String] = null,
    storageLocations: js.Array[String] = null
  ): SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(guestFlush)) __obj.updateDynamic("guestFlush")(guestFlush.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (storageLocations != null) __obj.updateDynamic("storageLocations")(storageLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties]
  }
}

