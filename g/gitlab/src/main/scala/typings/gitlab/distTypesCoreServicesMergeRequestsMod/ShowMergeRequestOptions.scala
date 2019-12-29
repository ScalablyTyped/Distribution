package typings.gitlab.distTypesCoreServicesMergeRequestsMod

import typings.gitlab.gitlabBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowMergeRequestOptions extends js.Object {
  var include_diverged_commits_count: js.UndefOr[`true`] = js.undefined
  var include_rebase_in_progress: js.UndefOr[Boolean] = js.undefined
  var render_html: js.UndefOr[Boolean] = js.undefined
}

object ShowMergeRequestOptions {
  @scala.inline
  def apply(
    include_diverged_commits_count: `true` = null,
    include_rebase_in_progress: js.UndefOr[Boolean] = js.undefined,
    render_html: js.UndefOr[Boolean] = js.undefined
  ): ShowMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (include_diverged_commits_count != null) __obj.updateDynamic("include_diverged_commits_count")(include_diverged_commits_count.asInstanceOf[js.Any])
    if (!js.isUndefined(include_rebase_in_progress)) __obj.updateDynamic("include_rebase_in_progress")(include_rebase_in_progress.asInstanceOf[js.Any])
    if (!js.isUndefined(render_html)) __obj.updateDynamic("render_html")(render_html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMergeRequestOptions]
  }
}

