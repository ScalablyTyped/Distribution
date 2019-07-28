package typings.gitlab.distServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMergeRequestOptions extends js.Object {
  var allow_collaboration: js.UndefOr[Boolean] = js.undefined
  var allow_maintainer_to_push: js.UndefOr[Boolean] = js.undefined
  var assignee_id: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var discussion_locked: js.UndefOr[Boolean] = js.undefined
  var labels: js.UndefOr[String] = js.undefined
  var milestone_id: js.UndefOr[Double] = js.undefined
  var remove_source_branch: js.UndefOr[Boolean] = js.undefined
  var squash: js.UndefOr[Boolean] = js.undefined
  var state_event: js.UndefOr[String] = js.undefined
  var target_branch: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object UpdateMergeRequestOptions {
  @scala.inline
  def apply(
    allow_collaboration: js.UndefOr[Boolean] = js.undefined,
    allow_maintainer_to_push: js.UndefOr[Boolean] = js.undefined,
    assignee_id: Int | Double = null,
    description: String = null,
    discussion_locked: js.UndefOr[Boolean] = js.undefined,
    labels: String = null,
    milestone_id: Int | Double = null,
    remove_source_branch: js.UndefOr[Boolean] = js.undefined,
    squash: js.UndefOr[Boolean] = js.undefined,
    state_event: String = null,
    target_branch: Int | Double = null,
    title: String = null
  ): UpdateMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_collaboration)) __obj.updateDynamic("allow_collaboration")(allow_collaboration)
    if (!js.isUndefined(allow_maintainer_to_push)) __obj.updateDynamic("allow_maintainer_to_push")(allow_maintainer_to_push)
    if (assignee_id != null) __obj.updateDynamic("assignee_id")(assignee_id.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(discussion_locked)) __obj.updateDynamic("discussion_locked")(discussion_locked)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone_id != null) __obj.updateDynamic("milestone_id")(milestone_id.asInstanceOf[js.Any])
    if (!js.isUndefined(remove_source_branch)) __obj.updateDynamic("remove_source_branch")(remove_source_branch)
    if (!js.isUndefined(squash)) __obj.updateDynamic("squash")(squash)
    if (state_event != null) __obj.updateDynamic("state_event")(state_event)
    if (target_branch != null) __obj.updateDynamic("target_branch")(target_branch.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UpdateMergeRequestOptions]
  }
}

