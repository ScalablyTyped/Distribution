package typings.googleapis.bloggerV2Mod.bloggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPageList extends js.Object {
  /**
    * The list of Pages for a Blog.
    */
  var items: js.UndefOr[js.Array[SchemaPage]] = js.native
  /**
    * The kind of this entity. Always blogger#pageList
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPageList {
  @scala.inline
  def apply(items: js.Array[SchemaPage] = null, kind: String = null): SchemaPageList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageList]
  }
}

