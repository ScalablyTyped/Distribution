package typings.gitlab.eventsMod

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

@js.native
trait EventOptions extends js.Object {
  var action: js.UndefOr[
    created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
  ] = js.native
  var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.native
}

object EventOptions {
  @scala.inline
  def apply(): EventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventOptions]
  }
  @scala.inline
  implicit class EventOptionsOps[Self <: EventOptions] (val x: Self) extends AnyVal {
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
    def setAction(
      value: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
    ): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setTargetType(value: issue | milestone | merge_request | note | project | snippet | user): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetType: Self = this.set("targetType", js.undefined)
  }
  
}

