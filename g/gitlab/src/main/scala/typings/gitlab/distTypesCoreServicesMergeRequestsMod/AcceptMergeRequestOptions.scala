package typings.gitlab.distTypesCoreServicesMergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptMergeRequestOptions extends js.Object {
  var merge_commit_message: js.UndefOr[String] = js.undefined
  var merge_when_pipeline_succeeds: js.UndefOr[Boolean] = js.undefined
  var sha: js.UndefOr[String] = js.undefined
  var should_remove_source_branch: js.UndefOr[Boolean] = js.undefined
  var squash: js.UndefOr[Boolean] = js.undefined
  var squash_commit_message: js.UndefOr[String] = js.undefined
}

object AcceptMergeRequestOptions {
  @scala.inline
  def apply(
    merge_commit_message: String = null,
    merge_when_pipeline_succeeds: js.UndefOr[Boolean] = js.undefined,
    sha: String = null,
    should_remove_source_branch: js.UndefOr[Boolean] = js.undefined,
    squash: js.UndefOr[Boolean] = js.undefined,
    squash_commit_message: String = null
  ): AcceptMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (merge_commit_message != null) __obj.updateDynamic("merge_commit_message")(merge_commit_message.asInstanceOf[js.Any])
    if (!js.isUndefined(merge_when_pipeline_succeeds)) __obj.updateDynamic("merge_when_pipeline_succeeds")(merge_when_pipeline_succeeds.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    if (!js.isUndefined(should_remove_source_branch)) __obj.updateDynamic("should_remove_source_branch")(should_remove_source_branch.asInstanceOf[js.Any])
    if (!js.isUndefined(squash)) __obj.updateDynamic("squash")(squash.asInstanceOf[js.Any])
    if (squash_commit_message != null) __obj.updateDynamic("squash_commit_message")(squash_commit_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptMergeRequestOptions]
  }
}

