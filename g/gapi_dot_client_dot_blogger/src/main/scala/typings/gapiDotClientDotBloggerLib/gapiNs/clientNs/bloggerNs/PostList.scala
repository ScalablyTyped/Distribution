package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PostList extends js.Object {
  /** Etag of the response. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The list of Posts for this Blog. */
  var items: js.UndefOr[js.Array[Post]] = js.undefined
  /** The kind of this entity. Always blogger#postList */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

