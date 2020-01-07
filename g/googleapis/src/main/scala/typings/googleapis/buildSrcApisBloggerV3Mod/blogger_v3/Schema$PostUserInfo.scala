package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PostUserInfo extends js.Object {
  /**
    * The kind of this entity. Always blogger#postUserInfo
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The Post resource.
    */
  var post: js.UndefOr[Schema$Post] = js.native
  /**
    * Information about a User for the Post.
    */
  var post_user_info: js.UndefOr[Schema$PostPerUserInfo] = js.native
}

object Schema$PostUserInfo {
  @scala.inline
  def apply(kind: String = null, post: Schema$Post = null, post_user_info: Schema$PostPerUserInfo = null): Schema$PostUserInfo = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (post_user_info != null) __obj.updateDynamic("post_user_info")(post_user_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PostUserInfo]
  }
}

