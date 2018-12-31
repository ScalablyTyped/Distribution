package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageList extends js.Object {
  /** Etag of the response. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The list of Pages for a Blog. */
  var items: js.UndefOr[js.Array[Page]] = js.undefined
  /** The kind of this entity. Always blogger#pageList */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

