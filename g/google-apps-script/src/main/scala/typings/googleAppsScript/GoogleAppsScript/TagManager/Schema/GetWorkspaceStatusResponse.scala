package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkspaceStatusResponse extends js.Object {
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.native
  var workspaceChange: js.UndefOr[js.Array[Entity]] = js.native
}

object GetWorkspaceStatusResponse {
  @scala.inline
  def apply(): GetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkspaceStatusResponse]
  }
  @scala.inline
  implicit class GetWorkspaceStatusResponseOps[Self <: GetWorkspaceStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMergeConflictVarargs(value: MergeConflict*): Self = this.set("mergeConflict", js.Array(value :_*))
    @scala.inline
    def setMergeConflict(value: js.Array[MergeConflict]): Self = this.set("mergeConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeConflict: Self = this.set("mergeConflict", js.undefined)
    @scala.inline
    def setWorkspaceChangeVarargs(value: Entity*): Self = this.set("workspaceChange", js.Array(value :_*))
    @scala.inline
    def setWorkspaceChange(value: js.Array[Entity]): Self = this.set("workspaceChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceChange: Self = this.set("workspaceChange", js.undefined)
  }
  
}

