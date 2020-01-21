package typings.googleapis

import typings.googleapis.bloggerV3Mod.bloggerV3.SchemaPost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItems extends js.Object {
  var items: js.UndefOr[js.Array[SchemaPost]] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[Double] = js.native
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[SchemaPost] = null, selfLink: String = null, totalItems: Int | Double = null): AnonItems = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

