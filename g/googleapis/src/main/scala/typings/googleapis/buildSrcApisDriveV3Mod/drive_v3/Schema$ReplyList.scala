package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of replies to a comment on a file.
  */
@js.native
trait Schema$ReplyList extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#replyList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of replies. This will be absent if the
    * end of the replies list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of replies. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var replies: js.UndefOr[js.Array[Schema$Reply]] = js.native
}

object Schema$ReplyList {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, replies: js.Array[Schema$Reply] = null): Schema$ReplyList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplyList]
  }
}

