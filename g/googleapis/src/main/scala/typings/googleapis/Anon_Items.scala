package typings.googleapis

import typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Schema$Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Items extends js.Object {
  var items: js.UndefOr[js.Array[Schema$Post]] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[Double] = js.native
}

object Anon_Items {
  @scala.inline
  def apply(items: js.Array[Schema$Post] = null, selfLink: String = null, totalItems: Int | Double = null): Anon_Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Items]
  }
}

