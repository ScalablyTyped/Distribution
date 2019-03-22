package typings
package gitlabLib.distLatestServicesMergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptMergeRequestOptions extends js.Object {
  var merge_commit_message: js.UndefOr[java.lang.String] = js.undefined
  var merge_when_pipeline_succeeds: js.UndefOr[scala.Boolean] = js.undefined
  var sha: js.UndefOr[java.lang.String] = js.undefined
  var should_remove_source_branch: js.UndefOr[scala.Boolean] = js.undefined
  var squash: js.UndefOr[scala.Boolean] = js.undefined
  var squash_commit_message: js.UndefOr[java.lang.String] = js.undefined
}

object AcceptMergeRequestOptions {
  @scala.inline
  def apply(
    merge_commit_message: java.lang.String = null,
    merge_when_pipeline_succeeds: js.UndefOr[scala.Boolean] = js.undefined,
    sha: java.lang.String = null,
    should_remove_source_branch: js.UndefOr[scala.Boolean] = js.undefined,
    squash: js.UndefOr[scala.Boolean] = js.undefined,
    squash_commit_message: java.lang.String = null
  ): AcceptMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (merge_commit_message != null) __obj.updateDynamic("merge_commit_message")(merge_commit_message)
    if (!js.isUndefined(merge_when_pipeline_succeeds)) __obj.updateDynamic("merge_when_pipeline_succeeds")(merge_when_pipeline_succeeds)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    if (!js.isUndefined(should_remove_source_branch)) __obj.updateDynamic("should_remove_source_branch")(should_remove_source_branch)
    if (!js.isUndefined(squash)) __obj.updateDynamic("squash")(squash)
    if (squash_commit_message != null) __obj.updateDynamic("squash_commit_message")(squash_commit_message)
    __obj.asInstanceOf[AcceptMergeRequestOptions]
  }
}

