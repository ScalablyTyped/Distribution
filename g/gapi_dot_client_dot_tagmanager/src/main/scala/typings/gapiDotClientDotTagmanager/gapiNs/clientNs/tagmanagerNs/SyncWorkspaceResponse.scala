package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncWorkspaceResponse extends js.Object {
  /**
    * The merge conflict after sync. If this field is not empty, the sync is still treated as successful. But a version cannot be created until all conflicts
    * are resolved.
    */
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
  /** Indicates whether synchronization caused a merge conflict or sync error. */
  var syncStatus: js.UndefOr[SyncStatus] = js.undefined
}

object SyncWorkspaceResponse {
  @scala.inline
  def apply(mergeConflict: js.Array[MergeConflict] = null, syncStatus: SyncStatus = null): SyncWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    if (mergeConflict != null) __obj.updateDynamic("mergeConflict")(mergeConflict)
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus)
    __obj.asInstanceOf[SyncWorkspaceResponse]
  }
}

