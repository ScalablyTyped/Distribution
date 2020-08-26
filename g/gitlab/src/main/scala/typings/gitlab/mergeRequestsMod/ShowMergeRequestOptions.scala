package typings.gitlab.mergeRequestsMod

import typings.gitlab.gitlabBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowMergeRequestOptions extends js.Object {
  var include_diverged_commits_count: js.UndefOr[`true`] = js.native
  var include_rebase_in_progress: js.UndefOr[Boolean] = js.native
  var render_html: js.UndefOr[Boolean] = js.native
}

object ShowMergeRequestOptions {
  @scala.inline
  def apply(): ShowMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMergeRequestOptions]
  }
  @scala.inline
  implicit class ShowMergeRequestOptionsOps[Self <: ShowMergeRequestOptions] (val x: Self) extends AnyVal {
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
    def setInclude_diverged_commits_count(value: `true`): Self = this.set("include_diverged_commits_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_diverged_commits_count: Self = this.set("include_diverged_commits_count", js.undefined)
    @scala.inline
    def setInclude_rebase_in_progress(value: Boolean): Self = this.set("include_rebase_in_progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_rebase_in_progress: Self = this.set("include_rebase_in_progress", js.undefined)
    @scala.inline
    def setRender_html(value: Boolean): Self = this.set("render_html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender_html: Self = this.set("render_html", js.undefined)
  }
  
}

