package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a workspace after synchronization.
  */
@js.native
trait Schema$SyncStatus extends js.Object {
  /**
    * Synchornization operation detected a merge conflict.
    */
  var mergeConflict: js.UndefOr[Boolean] = js.native
  /**
    * An error occurred during the synchronization operation.
    */
  var syncError: js.UndefOr[Boolean] = js.native
}

object Schema$SyncStatus {
  @scala.inline
  def apply(mergeConflict: js.UndefOr[Boolean] = js.undefined, syncError: js.UndefOr[Boolean] = js.undefined): Schema$SyncStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mergeConflict)) __obj.updateDynamic("mergeConflict")(mergeConflict.asInstanceOf[js.Any])
    if (!js.isUndefined(syncError)) __obj.updateDynamic("syncError")(syncError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SyncStatus]
  }
}

