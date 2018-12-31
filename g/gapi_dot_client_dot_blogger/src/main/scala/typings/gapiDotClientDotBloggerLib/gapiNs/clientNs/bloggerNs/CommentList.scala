package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentList extends js.Object {
  /** Etag of the response. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The List of Comments for a Post. */
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  /** The kind of this entry. Always blogger#commentList */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to fetch the previous page, if one exists. */
  var prevPageToken: js.UndefOr[java.lang.String] = js.undefined
}

