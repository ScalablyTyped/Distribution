package typings.gapiDotClientDotBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogList extends js.Object {
  /** Admin level list of blog per-user information */
  var blogUserInfos: js.UndefOr[js.Array[BlogUserInfo]] = js.undefined
  /** The list of Blogs this user has Authorship or Admin rights over. */
  var items: js.UndefOr[js.Array[Blog]] = js.undefined
  /** The kind of this entity. Always blogger#blogList */
  var kind: js.UndefOr[String] = js.undefined
}

object BlogList {
  @scala.inline
  def apply(blogUserInfos: js.Array[BlogUserInfo] = null, items: js.Array[Blog] = null, kind: String = null): BlogList = {
    val __obj = js.Dynamic.literal()
    if (blogUserInfos != null) __obj.updateDynamic("blogUserInfos")(blogUserInfos.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlogList]
  }
}

