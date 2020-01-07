package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of comments on a file.
  */
@js.native
trait Schema$CommentList extends js.Object {
  /**
    * The list of comments. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var comments: js.UndefOr[js.Array[Schema$Comment]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#commentList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of comments. This will be absent if the
    * end of the comments list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CommentList {
  @scala.inline
  def apply(comments: js.Array[Schema$Comment] = null, kind: String = null, nextPageToken: String = null): Schema$CommentList = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommentList]
  }
}

