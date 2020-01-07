package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderPromotionItem extends js.Object {
  var lineItemId: js.UndefOr[String] = js.native
  var productId: js.UndefOr[String] = js.native
  /**
    * The quantity of the associated product.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object Schema$OrderPromotionItem {
  @scala.inline
  def apply(lineItemId: String = null, productId: String = null, quantity: Int | Double = null): Schema$OrderPromotionItem = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderPromotionItem]
  }
}

