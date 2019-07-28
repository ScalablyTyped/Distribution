package typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostUserInfo extends js.Object {
  /** The kind of this entity. Always blogger#postUserInfo */
  var kind: js.UndefOr[String] = js.undefined
  /** The Post resource. */
  var post: js.UndefOr[Post] = js.undefined
  /** Information about a User for the Post. */
  var post_user_info: js.UndefOr[PostPerUserInfo] = js.undefined
}

object PostUserInfo {
  @scala.inline
  def apply(kind: String = null, post: Post = null, post_user_info: PostPerUserInfo = null): PostUserInfo = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (post != null) __obj.updateDynamic("post")(post)
    if (post_user_info != null) __obj.updateDynamic("post_user_info")(post_user_info)
    __obj.asInstanceOf[PostUserInfo]
  }
}

