package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkspaceStatusResponse extends js.Object {
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
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

