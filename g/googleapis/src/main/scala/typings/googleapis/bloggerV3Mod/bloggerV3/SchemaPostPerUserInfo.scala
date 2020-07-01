package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostPerUserInfo extends js.Object {
  /**
    * ID of the Blog that the post resource belongs to.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * True if the user has Author level access to the post.
    */
  var hasEditAccess: js.UndefOr[Boolean] = js.native
  /**
    * The kind of this entity. Always blogger#postPerUserInfo
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * ID of the Post resource.
    */
  var postId: js.UndefOr[String] = js.native
  /**
    * ID of the User.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaPostPerUserInfo {
  @scala.inline
  def apply(
    blogId: String = null,
    hasEditAccess: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    postId: String = null,
    userId: String = null
  ): SchemaPostPerUserInfo = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (!js.isUndefined(hasEditAccess)) __obj.updateDynamic("hasEditAccess")(hasEditAccess.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (postId != null) __obj.updateDynamic("postId")(postId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPostPerUserInfo]
  }
}

