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

object BlogList {
  @scala.inline
  def apply(
    blogUserInfos: js.Array[BlogUserInfo] = null,
    items: js.Array[Blog] = null,
    kind: java.lang.String = null
  ): BlogList = {
    val __obj = js.Dynamic.literal()
    if (blogUserInfos != null) __obj.updateDynamic("blogUserInfos")(blogUserInfos)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[BlogList]
  }
}

