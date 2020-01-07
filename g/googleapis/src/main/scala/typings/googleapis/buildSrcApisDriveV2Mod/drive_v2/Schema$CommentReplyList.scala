package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of replies to a comment on a file in Google Drive.
  */
@js.native
trait Schema$CommentReplyList extends js.Object {
  /**
    * The list of replies. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[Schema$CommentReply]] = js.native
  /**
    * This is always drive#commentReplyList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link to the next page of replies.
    */
  var nextLink: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of replies. This will be absent if the
    * end of the replies list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$CommentReplyList {
  @scala.inline
  def apply(
    items: js.Array[Schema$CommentReply] = null,
    kind: String = null,
    nextLink: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): Schema$CommentReplyList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommentReplyList]
  }
}

