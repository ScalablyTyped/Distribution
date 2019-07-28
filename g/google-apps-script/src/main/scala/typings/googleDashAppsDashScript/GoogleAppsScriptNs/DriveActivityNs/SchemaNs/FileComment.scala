package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

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
    if (legacyCommentId != null) __obj.updateDynamic("legacyCommentId")(legacyCommentId)
    if (legacyDiscussionId != null) __obj.updateDynamic("legacyDiscussionId")(legacyDiscussionId)
    if (linkToDiscussion != null) __obj.updateDynamic("linkToDiscussion")(linkToDiscussion)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[FileComment]
  }
}

