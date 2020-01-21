package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostUserInfosList extends js.Object {
  /**
    * The list of Posts with User information for the post, for this Blog.
    */
  var items: js.UndefOr[js.Array[SchemaPostUserInfo]] = js.native
  /**
    * The kind of this entity. Always blogger#postList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaPostUserInfosList {
  @scala.inline
  def apply(items: js.Array[SchemaPostUserInfo] = null, kind: String = null, nextPageToken: String = null): SchemaPostUserInfosList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPostUserInfosList]
  }
}

