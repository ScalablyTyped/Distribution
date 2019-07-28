package typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostUserInfosList extends js.Object {
  /** The list of Posts with User information for the post, for this Blog. */
  var items: js.UndefOr[js.Array[PostUserInfo]] = js.undefined
  /** The kind of this entity. Always blogger#postList */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object PostUserInfosList {
  @scala.inline
  def apply(items: js.Array[PostUserInfo] = null, kind: String = null, nextPageToken: String = null): PostUserInfosList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[PostUserInfosList]
  }
}

