package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BlogUserInfo extends js.Object {
  /**
    * The Blog resource.
    */
  var blog: js.UndefOr[Schema$Blog] = js.native
  /**
    * Information about a User for the Blog.
    */
  var blog_user_info: js.UndefOr[Schema$BlogPerUserInfo] = js.native
  /**
    * The kind of this entity. Always blogger#blogUserInfo
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$BlogUserInfo {
  @scala.inline
  def apply(blog: Schema$Blog = null, blog_user_info: Schema$BlogPerUserInfo = null, kind: String = null): Schema$BlogUserInfo = {
    val __obj = js.Dynamic.literal()
    if (blog != null) __obj.updateDynamic("blog")(blog.asInstanceOf[js.Any])
    if (blog_user_info != null) __obj.updateDynamic("blog_user_info")(blog_user_info.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BlogUserInfo]
  }
}

