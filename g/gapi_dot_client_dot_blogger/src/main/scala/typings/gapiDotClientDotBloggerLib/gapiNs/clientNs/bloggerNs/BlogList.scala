package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BlogList extends js.Object {
  /** Admin level list of blog per-user information */
  var blogUserInfos: js.UndefOr[js.Array[BlogUserInfo]] = js.undefined
  /** The list of Blogs this user has Authorship or Admin rights over. */
  var items: js.UndefOr[js.Array[Blog]] = js.undefined
  /** The kind of this entity. Always blogger#blogList */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

