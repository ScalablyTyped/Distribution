package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileComment extends js.Object {
  var legacyCommentId: js.UndefOr[String] = js.undefined
  var legacyDiscussionId: js.UndefOr[String] = js.undefined
  var linkToDiscussion: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[DriveItem] = js.undefined
}

object FileComment {
  @scala.inline
  def apply(
    legacyCommentId: String = null,
    legacyDiscussionId: String = null,
    linkToDiscussion: String = null,
    parent: DriveItem = null
  ): FileComment = {
    val __obj = js.Dynamic.literal()
    if (legacyCommentId != null) __obj.updateDynamic("legacyCommentId")(legacyCommentId.asInstanceOf[js.Any])
    if (legacyDiscussionId != null) __obj.updateDynamic("legacyDiscussionId")(legacyDiscussionId.asInstanceOf[js.Any])
    if (linkToDiscussion != null) __obj.updateDynamic("linkToDiscussion")(linkToDiscussion.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileComment]
  }
}

