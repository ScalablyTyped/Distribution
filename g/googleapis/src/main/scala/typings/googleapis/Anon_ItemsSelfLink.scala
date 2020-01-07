package typings.googleapis

import typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Schema$Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ItemsSelfLink extends js.Object {
  var items: js.UndefOr[js.Array[Schema$Comment]] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[String] = js.native
}

object Anon_ItemsSelfLink {
  @scala.inline
  def apply(items: js.Array[Schema$Comment] = null, selfLink: String = null, totalItems: String = null): Anon_ItemsSelfLink = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemsSelfLink]
  }
}

