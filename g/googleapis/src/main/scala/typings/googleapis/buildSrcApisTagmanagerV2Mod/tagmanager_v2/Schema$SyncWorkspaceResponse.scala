package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response after synchronizing the workspace to the latest container
  * version.
  */
@js.native
trait Schema$SyncWorkspaceResponse extends js.Object {
  /**
    * The merge conflict after sync. If this field is not empty, the sync is
    * still treated as successful. But a version cannot be created until all
    * conflicts are resolved.
    */
  var mergeConflict: js.UndefOr[js.Array[Schema$MergeConflict]] = js.native
  /**
    * Indicates whether synchronization caused a merge conflict or sync error.
    */
  var syncStatus: js.UndefOr[Schema$SyncStatus] = js.native
}

object Schema$SyncWorkspaceResponse {
  @scala.inline
  def apply(mergeConflict: js.Array[Schema$MergeConflict] = null, syncStatus: Schema$SyncStatus = null): Schema$SyncWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    if (mergeConflict != null) __obj.updateDynamic("mergeConflict")(mergeConflict.asInstanceOf[js.Any])
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SyncWorkspaceResponse]
  }
}

