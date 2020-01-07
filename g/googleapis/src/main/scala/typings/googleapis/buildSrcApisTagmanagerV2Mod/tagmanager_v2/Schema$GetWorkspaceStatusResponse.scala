package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The changes that have occurred in the workspace since the base container
  * version.
  */
@js.native
trait Schema$GetWorkspaceStatusResponse extends js.Object {
  /**
    * The merge conflict after sync.
    */
  var mergeConflict: js.UndefOr[js.Array[Schema$MergeConflict]] = js.native
  /**
    * Entities that have been changed in the workspace.
    */
  var workspaceChange: js.UndefOr[js.Array[Schema$Entity]] = js.native
}

object Schema$GetWorkspaceStatusResponse {
  @scala.inline
  def apply(
    mergeConflict: js.Array[Schema$MergeConflict] = null,
    workspaceChange: js.Array[Schema$Entity] = null
  ): Schema$GetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (mergeConflict != null) __obj.updateDynamic("mergeConflict")(mergeConflict.asInstanceOf[js.Any])
    if (workspaceChange != null) __obj.updateDynamic("workspaceChange")(workspaceChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetWorkspaceStatusResponse]
  }
}

