package typings.gapiDotClientDotBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogPerUserInfo extends js.Object {
  /** ID of the Blog resource */
  var blogId: js.UndefOr[String] = js.undefined
  /** True if the user has Admin level access to the blog. */
  var hasAdminAccess: js.UndefOr[Boolean] = js.undefined
  /** The kind of this entity. Always blogger#blogPerUserInfo */
  var kind: js.UndefOr[String] = js.undefined
  /** The Photo Album Key for the user when adding photos to the blog */
  var photosAlbumKey: js.UndefOr[String] = js.undefined
  /** Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER). */
  var role: js.UndefOr[String] = js.undefined
  /** ID of the User */
  var userId: js.UndefOr[String] = js.undefined
}

object BlogPerUserInfo {
  @scala.inline
  def apply(
    blogId: String = null,
    hasAdminAccess: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    photosAlbumKey: String = null,
    role: String = null,
    userId: String = null
  ): BlogPerUserInfo = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAdminAccess)) __obj.updateDynamic("hasAdminAccess")(hasAdminAccess.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (photosAlbumKey != null) __obj.updateDynamic("photosAlbumKey")(photosAlbumKey.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlogPerUserInfo]
  }
}

