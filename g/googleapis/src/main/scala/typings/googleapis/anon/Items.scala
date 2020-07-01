package typings.googleapis.anon

import typings.googleapis.bloggerV3Mod.bloggerV3.SchemaPost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Items extends js.Object {
  var items: js.UndefOr[js.Array[SchemaPost]] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[Double] = js.native
}

object Items {
  @scala.inline
  def apply(
    items: js.Array[SchemaPost] = null,
    selfLink: String = null,
    totalItems: js.UndefOr[Double] = js.undefined
  ): Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

