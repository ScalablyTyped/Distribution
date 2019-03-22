package typings
package gitlabLib.distEs5ServicesMergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMergeRequestOptions extends js.Object {
  var allow_collaboration: js.UndefOr[scala.Boolean] = js.undefined
  var allow_maintainer_to_push: js.UndefOr[scala.Boolean] = js.undefined
  var assignee_id: js.UndefOr[scala.Double] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var discussion_locked: js.UndefOr[scala.Boolean] = js.undefined
  var labels: js.UndefOr[java.lang.String] = js.undefined
  var milestone_id: js.UndefOr[scala.Double] = js.undefined
  var remove_source_branch: js.UndefOr[scala.Boolean] = js.undefined
  var squash: js.UndefOr[scala.Boolean] = js.undefined
  var state_event: js.UndefOr[java.lang.String] = js.undefined
  var target_branch: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateMergeRequestOptions {
  @scala.inline
  def apply(
    allow_collaboration: js.UndefOr[scala.Boolean] = js.undefined,
    allow_maintainer_to_push: js.UndefOr[scala.Boolean] = js.undefined,
    assignee_id: scala.Int | scala.Double = null,
    description: java.lang.String = null,
    discussion_locked: js.UndefOr[scala.Boolean] = js.undefined,
    labels: java.lang.String = null,
    milestone_id: scala.Int | scala.Double = null,
    remove_source_branch: js.UndefOr[scala.Boolean] = js.undefined,
    squash: js.UndefOr[scala.Boolean] = js.undefined,
    state_event: java.lang.String = null,
    target_branch: scala.Int | scala.Double = null,
    title: java.lang.String = null
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

