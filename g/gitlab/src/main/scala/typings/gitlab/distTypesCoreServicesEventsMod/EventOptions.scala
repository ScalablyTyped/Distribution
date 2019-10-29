package typings.gitlab.distTypesCoreServicesEventsMod

import typings.gitlab.gitlabStrings.closed
import typings.gitlab.gitlabStrings.commented
import typings.gitlab.gitlabStrings.created
import typings.gitlab.gitlabStrings.destroyed
import typings.gitlab.gitlabStrings.expired
import typings.gitlab.gitlabStrings.issue
import typings.gitlab.gitlabStrings.joined
import typings.gitlab.gitlabStrings.left
import typings.gitlab.gitlabStrings.merge_request
import typings.gitlab.gitlabStrings.merged
import typings.gitlab.gitlabStrings.milestone
import typings.gitlab.gitlabStrings.note
import typings.gitlab.gitlabStrings.project
import typings.gitlab.gitlabStrings.pushed
import typings.gitlab.gitlabStrings.reopened
import typings.gitlab.gitlabStrings.snippet
import typings.gitlab.gitlabStrings.updated
import typings.gitlab.gitlabStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  var action: js.UndefOr[
    created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
  ] = js.undefined
  var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(
    action: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired = null,
    targetType: issue | milestone | merge_request | note | project | snippet | user = null
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptions]
  }
}

