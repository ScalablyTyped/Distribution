package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostUserInfo extends js.Object {
  /**
    * The kind of this entity. Always blogger#postUserInfo
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The Post resource.
    */
  var post: js.UndefOr[SchemaPost] = js.native
  /**
    * Information about a User for the Post.
    */
  var post_user_info: js.UndefOr[SchemaPostPerUserInfo] = js.native
}

object SchemaPostUserInfo {
  @scala.inline
  def apply(kind: String = null, post: SchemaPost = null, post_user_info: SchemaPostPerUserInfo = null): SchemaPostUserInfo = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (post_user_info != null) __obj.updateDynamic("post_user_info")(post_user_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPostUserInfo]
  }
}

