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

object PageList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Page] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): PageList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[PageList]
  }
}

