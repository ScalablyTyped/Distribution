package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BlogList extends js.Object {
  /**
    * Admin level list of blog per-user information
    */
  var blogUserInfos: js.UndefOr[js.Array[Schema$BlogUserInfo]] = js.native
  /**
    * The list of Blogs this user has Authorship or Admin rights over.
    */
  var items: js.UndefOr[js.Array[Schema$Blog]] = js.native
  /**
    * The kind of this entity. Always blogger#blogList
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$BlogList {
  @scala.inline
  def apply(
    blogUserInfos: js.Array[Schema$BlogUserInfo] = null,
    items: js.Array[Schema$Blog] = null,
    kind: String = null
  ): Schema$BlogList = {
    val __obj = js.Dynamic.literal()
    if (blogUserInfos != null) __obj.updateDynamic("blogUserInfos")(blogUserInfos.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BlogList]
  }
}

