package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostPerUserInfo extends js.Object {
  /** ID of the Blog that the post resource belongs to. */
  var blogId: js.UndefOr[java.lang.String] = js.undefined
  /** True if the user has Author level access to the post. */
  var hasEditAccess: js.UndefOr[scala.Boolean] = js.undefined
  /** The kind of this entity. Always blogger#postPerUserInfo */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the Post resource. */
  var postId: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the User. */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object PostPerUserInfo {
  @scala.inline
  def apply(
    blogId: java.lang.String = null,
    hasEditAccess: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    postId: java.lang.String = null,
    userId: java.lang.String = null
  ): PostPerUserInfo = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId)
    if (!js.isUndefined(hasEditAccess)) __obj.updateDynamic("hasEditAccess")(hasEditAccess)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (postId != null) __obj.updateDynamic("postId")(postId)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[PostPerUserInfo]
  }
}

