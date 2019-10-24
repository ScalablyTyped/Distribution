package typings.gitlab.distSrcCoreServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMergeRequestOptions extends js.Object {
  var allow_collaboration: js.UndefOr[Boolean] = js.undefined
  var allow_maintainer_to_push: js.UndefOr[Boolean] = js.undefined
  var assignee_id: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[String] = js.undefined
  var milestone_id: js.UndefOr[Double] = js.undefined
  var remove_source_branch: js.UndefOr[Boolean] = js.undefined
  var squash: js.UndefOr[Boolean] = js.undefined
  var target_project_id: js.UndefOr[Double] = js.undefined
}

object CreateMergeRequestOptions {
  @scala.inline
  def apply(
    allow_collaboration: js.UndefOr[Boolean] = js.undefined,
    allow_maintainer_to_push: js.UndefOr[Boolean] = js.undefined,
    assignee_id: Int | Double = null,
    description: String = null,
    labels: String = null,
    milestone_id: Int | Double = null,
    remove_source_branch: js.UndefOr[Boolean] = js.undefined,
    squash: js.UndefOr[Boolean] = js.undefined,
    target_project_id: Int | Double = null
  ): CreateMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_collaboration)) __obj.updateDynamic("allow_collaboration")(allow_collaboration)
    if (!js.isUndefined(allow_maintainer_to_push)) __obj.updateDynamic("allow_maintainer_to_push")(allow_maintainer_to_push)
    if (assignee_id != null) __obj.updateDynamic("assignee_id")(assignee_id.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone_id != null) __obj.updateDynamic("milestone_id")(milestone_id.asInstanceOf[js.Any])
    if (!js.isUndefined(remove_source_branch)) __obj.updateDynamic("remove_source_branch")(remove_source_branch)
    if (!js.isUndefined(squash)) __obj.updateDynamic("squash")(squash)
    if (target_project_id != null) __obj.updateDynamic("target_project_id")(target_project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMergeRequestOptions]
  }
}

