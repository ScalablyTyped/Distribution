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

