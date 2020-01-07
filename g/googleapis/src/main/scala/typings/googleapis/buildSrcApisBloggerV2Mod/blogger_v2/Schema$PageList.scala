package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PageList extends js.Object {
  /**
    * The list of Pages for a Blog.
    */
  var items: js.UndefOr[js.Array[Schema$Page]] = js.native
  /**
    * The kind of this entity. Always blogger#pageList
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$PageList {
  @scala.inline
  def apply(items: js.Array[Schema$Page] = null, kind: String = null): Schema$PageList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PageList]
  }
}

