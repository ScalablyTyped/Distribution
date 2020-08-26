package typings.gitlab.mergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptMergeRequestOptions extends js.Object {
  var merge_commit_message: js.UndefOr[String] = js.native
  var merge_when_pipeline_succeeds: js.UndefOr[Boolean] = js.native
  var sha: js.UndefOr[String] = js.native
  var should_remove_source_branch: js.UndefOr[Boolean] = js.native
  var squash: js.UndefOr[Boolean] = js.native
  var squash_commit_message: js.UndefOr[String] = js.native
}

object AcceptMergeRequestOptions {
  @scala.inline
  def apply(): AcceptMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptMergeRequestOptions]
  }
  @scala.inline
  implicit class AcceptMergeRequestOptionsOps[Self <: AcceptMergeRequestOptions] (val x: Self) extends AnyVal {
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
    def setMerge_commit_message(value: String): Self = this.set("merge_commit_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerge_commit_message: Self = this.set("merge_commit_message", js.undefined)
    @scala.inline
    def setMerge_when_pipeline_succeeds(value: Boolean): Self = this.set("merge_when_pipeline_succeeds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerge_when_pipeline_succeeds: Self = this.set("merge_when_pipeline_succeeds", js.undefined)
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha: Self = this.set("sha", js.undefined)
    @scala.inline
    def setShould_remove_source_branch(value: Boolean): Self = this.set("should_remove_source_branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShould_remove_source_branch: Self = this.set("should_remove_source_branch", js.undefined)
    @scala.inline
    def setSquash(value: Boolean): Self = this.set("squash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquash: Self = this.set("squash", js.undefined)
    @scala.inline
    def setSquash_commit_message(value: String): Self = this.set("squash_commit_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquash_commit_message: Self = this.set("squash_commit_message", js.undefined)
  }
  
}

