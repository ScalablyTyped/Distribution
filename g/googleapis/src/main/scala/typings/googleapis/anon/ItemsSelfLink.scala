package typings.googleapis.anon

import typings.googleapis.bloggerV3Mod.bloggerV3.SchemaComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsSelfLink extends js.Object {
  var items: js.UndefOr[js.Array[SchemaComment]] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[String] = js.native
}

object ItemsSelfLink {
  @scala.inline
  def apply(items: js.Array[SchemaComment] = null, selfLink: String = null, totalItems: String = null): ItemsSelfLink = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSelfLink]
  }
}

