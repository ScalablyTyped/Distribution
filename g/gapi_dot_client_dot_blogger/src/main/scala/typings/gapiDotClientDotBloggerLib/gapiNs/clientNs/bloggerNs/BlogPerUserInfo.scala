package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BlogPerUserInfo extends js.Object {
  /** ID of the Blog resource */
  var blogId: js.UndefOr[java.lang.String] = js.undefined
  /** True if the user has Admin level access to the blog. */
  var hasAdminAccess: js.UndefOr[scala.Boolean] = js.undefined
  /** The kind of this entity. Always blogger#blogPerUserInfo */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The Photo Album Key for the user when adding photos to the blog */
  var photosAlbumKey: js.UndefOr[java.lang.String] = js.undefined
  /** Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER). */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the User */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

