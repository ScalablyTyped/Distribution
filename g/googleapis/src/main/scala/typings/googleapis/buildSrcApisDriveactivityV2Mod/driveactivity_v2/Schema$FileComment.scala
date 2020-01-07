package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment on a file.
  */
@js.native
trait Schema$FileComment extends js.Object {
  /**
    * The comment in the discussion thread. This identifier is an opaque string
    * compatible with the Drive API; see
    * https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyCommentId: js.UndefOr[String] = js.native
  /**
    * The discussion thread to which the comment was added. This identifier is
    * an opaque string compatible with the Drive API and references the first
    * comment in a discussion; see
    * https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyDiscussionId: js.UndefOr[String] = js.native
  /**
    * The link to the discussion thread containing this comment, for example,
    * &quot;https://docs.google.com/DOCUMENT_ID/edit?disco=THREAD_ID&quot;.
    */
  var linkToDiscussion: js.UndefOr[String] = js.native
  /**
    * The Drive item containing this comment.
    */
  var parent: js.UndefOr[Schema$DriveItem] = js.native
}

object Schema$FileComment {
  @scala.inline
  def apply(
    legacyCommentId: String = null,
    legacyDiscussionId: String = null,
    linkToDiscussion: String = null,
    parent: Schema$DriveItem = null
  ): Schema$FileComment = {
    val __obj = js.Dynamic.literal()
    if (legacyCommentId != null) __obj.updateDynamic("legacyCommentId")(legacyCommentId.asInstanceOf[js.Any])
    if (legacyDiscussionId != null) __obj.updateDynamic("legacyDiscussionId")(legacyDiscussionId.asInstanceOf[js.Any])
    if (linkToDiscussion != null) __obj.updateDynamic("linkToDiscussion")(linkToDiscussion.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileComment]
  }
}

