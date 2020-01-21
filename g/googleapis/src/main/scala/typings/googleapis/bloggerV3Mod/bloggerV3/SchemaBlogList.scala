package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBlogList extends js.Object {
  /**
    * Admin level list of blog per-user information
    */
  var blogUserInfos: js.UndefOr[js.Array[SchemaBlogUserInfo]] = js.native
  /**
    * The list of Blogs this user has Authorship or Admin rights over.
    */
  var items: js.UndefOr[js.Array[SchemaBlog]] = js.native
  /**
    * The kind of this entity. Always blogger#blogList
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBlogList {
  @scala.inline
  def apply(
    blogUserInfos: js.Array[SchemaBlogUserInfo] = null,
    items: js.Array[SchemaBlog] = null,
    kind: String = null
  ): SchemaBlogList = {
    val __obj = js.Dynamic.literal()
    if (blogUserInfos != null) __obj.updateDynamic("blogUserInfos")(blogUserInfos.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBlogList]
  }
}

