package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CommentList extends js.Object {
  /**
    * Etag of the response.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The List of Comments for a Post.
    */
  var items: js.UndefOr[js.Array[Schema$Comment]] = js.native
  /**
    * The kind of this entry. Always blogger#commentList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the previous page, if one exists.
    */
  var prevPageToken: js.UndefOr[String] = js.native
}

object Schema$CommentList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Comment] = null,
    kind: String = null,
    nextPageToken: String = null,
    prevPageToken: String = null
  ): Schema$CommentList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommentList]
  }
}

