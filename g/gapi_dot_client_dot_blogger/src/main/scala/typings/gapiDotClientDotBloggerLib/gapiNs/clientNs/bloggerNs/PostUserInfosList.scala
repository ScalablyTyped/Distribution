package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PostUserInfosList extends js.Object {
  /** The list of Posts with User information for the post, for this Blog. */
  var items: js.UndefOr[js.Array[PostUserInfo]] = js.undefined
  /** The kind of this entity. Always blogger#postList */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

