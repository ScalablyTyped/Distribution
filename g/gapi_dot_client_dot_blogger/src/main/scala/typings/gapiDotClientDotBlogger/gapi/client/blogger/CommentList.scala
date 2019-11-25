package typings.gapiDotClientDotBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentList extends js.Object {
  /** Etag of the response. */
  var etag: js.UndefOr[String] = js.undefined
  /** The List of Comments for a Post. */
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  /** The kind of this entry. Always blogger#commentList */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Pagination token to fetch the previous page, if one exists. */
  var prevPageToken: js.UndefOr[String] = js.undefined
}

object CommentList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Comment] = null,
    kind: String = null,
    nextPageToken: String = null,
    prevPageToken: String = null
  ): CommentList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentList]
  }
}

