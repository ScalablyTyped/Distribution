package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBlogPerUserInfo extends js.Object {
  /**
    * ID of the Blog resource
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * True if the user has Admin level access to the blog.
    */
  var hasAdminAccess: js.UndefOr[Boolean] = js.native
  /**
    * The kind of this entity. Always blogger#blogPerUserInfo
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The Photo Album Key for the user when adding photos to the blog
    */
  var photosAlbumKey: js.UndefOr[String] = js.native
  /**
    * Access permissions that the user has for the blog (ADMIN, AUTHOR, or
    * READER).
    */
  var role: js.UndefOr[String] = js.native
  /**
    * ID of the User
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaBlogPerUserInfo {
  @scala.inline
  def apply(
    blogId: String = null,
    hasAdminAccess: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    photosAlbumKey: String = null,
    role: String = null,
    userId: String = null
  ): SchemaBlogPerUserInfo = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAdminAccess)) __obj.updateDynamic("hasAdminAccess")(hasAdminAccess.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (photosAlbumKey != null) __obj.updateDynamic("photosAlbumKey")(photosAlbumKey.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBlogPerUserInfo]
  }
}

