package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a joined collection of PageElements.
  */
@js.native
trait Schema$Group extends js.Object {
  /**
    * The collection of elements in the group. The minimum size of a group
    * is 2.
    */
  var children: js.UndefOr[js.Array[Schema$PageElement]] = js.native
}

object Schema$Group {
  @scala.inline
  def apply(children: js.Array[Schema$PageElement] = null): Schema$Group = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Group]
  }
}

