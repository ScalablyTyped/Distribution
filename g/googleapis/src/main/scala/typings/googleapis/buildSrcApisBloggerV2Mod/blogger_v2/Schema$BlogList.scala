package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BlogList extends js.Object {
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
  def apply(items: js.Array[Schema$Blog] = null, kind: String = null): Schema$BlogList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BlogList]
  }
}

