package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncWorkspaceResponse extends js.Object {
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
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

