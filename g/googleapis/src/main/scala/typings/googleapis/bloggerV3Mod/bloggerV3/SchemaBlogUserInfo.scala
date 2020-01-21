package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBlogUserInfo extends js.Object {
  /**
    * The Blog resource.
    */
  var blog: js.UndefOr[SchemaBlog] = js.native
  /**
    * Information about a User for the Blog.
    */
  var blog_user_info: js.UndefOr[SchemaBlogPerUserInfo] = js.native
  /**
    * The kind of this entity. Always blogger#blogUserInfo
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBlogUserInfo {
  @scala.inline
  def apply(blog: SchemaBlog = null, blog_user_info: SchemaBlogPerUserInfo = null, kind: String = null): SchemaBlogUserInfo = {
    val __obj = js.Dynamic.literal()
    if (blog != null) __obj.updateDynamic("blog")(blog.asInstanceOf[js.Any])
    if (blog_user_info != null) __obj.updateDynamic("blog_user_info")(blog_user_info.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBlogUserInfo]
  }
}

