package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkspaceStatusResponse extends js.Object {
  /** The merge conflict after sync. */
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
  /** Entities that have been changed in the workspace. */
  var workspaceChange: js.UndefOr[js.Array[Entity]] = js.undefined
}

object GetWorkspaceStatusResponse {
  @scala.inline
  def apply(mergeConflict: js.Array[MergeConflict] = null, workspaceChange: js.Array[Entity] = null): GetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (mergeConflict != null) __obj.updateDynamic("mergeConflict")(mergeConflict.asInstanceOf[js.Any])
    if (workspaceChange != null) __obj.updateDynamic("workspaceChange")(workspaceChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceStatusResponse]
  }
}

