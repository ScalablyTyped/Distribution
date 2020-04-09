package typings.firebase.mod.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var affiliation: js.UndefOr[String] = js.undefined
  /** @deprecated Use item_brand instead. */
  var brand: js.UndefOr[String] = js.undefined
  /** @deprecated Use item_category instead. */
  var category: js.UndefOr[String] = js.undefined
  var coupon: js.UndefOr[String] = js.undefined
  var creative_name: js.UndefOr[String] = js.undefined
  var creative_slot: js.UndefOr[String] = js.undefined
  var discount: js.UndefOr[Currency] = js.undefined
  /** @deprecated Use item_id instead. */
  var id: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var item_brand: js.UndefOr[String] = js.undefined
  var item_category: js.UndefOr[String] = js.undefined
  var item_category2: js.UndefOr[String] = js.undefined
  var item_category3: js.UndefOr[String] = js.undefined
  var item_category4: js.UndefOr[String] = js.undefined
  var item_category5: js.UndefOr[String] = js.undefined
  var item_id: js.UndefOr[String] = js.undefined
  var item_list_id: js.UndefOr[String] = js.undefined
  var item_list_name: js.UndefOr[String] = js.undefined
  var item_name: js.UndefOr[String] = js.undefined
  var item_variant: js.UndefOr[String] = js.undefined
  var location_id: js.UndefOr[String] = js.undefined
  /** @deprecated Use item_name instead. */
  var name: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Currency] = js.undefined
  var promotion_id: js.UndefOr[String] = js.undefined
  var promotion_name: js.UndefOr[String] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    affiliation: String = null,
    brand: String = null,
    category: String = null,
    coupon: String = null,
    creative_name: String = null,
    creative_slot: String = null,
    discount: Currency = null,
    id: String = null,
    index: Int | Double = null,
    item_brand: String = null,
    item_category: String = null,
    item_category2: String = null,
    item_category3: String = null,
    item_category4: String = null,
    item_category5: String = null,
    item_id: String = null,
    item_list_id: String = null,
    item_list_name: String = null,
    item_name: String = null,
    item_variant: String = null,
    location_id: String = null,
    name: String = null,
    price: Currency = null,
    promotion_id: String = null,
    promotion_name: String = null,
    quantity: Int | Double = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (creative_name != null) __obj.updateDynamic("creative_name")(creative_name.asInstanceOf[js.Any])
    if (creative_slot != null) __obj.updateDynamic("creative_slot")(creative_slot.asInstanceOf[js.Any])
    if (discount != null) __obj.updateDynamic("discount")(discount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (item_brand != null) __obj.updateDynamic("item_brand")(item_brand.asInstanceOf[js.Any])
    if (item_category != null) __obj.updateDynamic("item_category")(item_category.asInstanceOf[js.Any])
    if (item_category2 != null) __obj.updateDynamic("item_category2")(item_category2.asInstanceOf[js.Any])
    if (item_category3 != null) __obj.updateDynamic("item_category3")(item_category3.asInstanceOf[js.Any])
    if (item_category4 != null) __obj.updateDynamic("item_category4")(item_category4.asInstanceOf[js.Any])
    if (item_category5 != null) __obj.updateDynamic("item_category5")(item_category5.asInstanceOf[js.Any])
    if (item_id != null) __obj.updateDynamic("item_id")(item_id.asInstanceOf[js.Any])
    if (item_list_id != null) __obj.updateDynamic("item_list_id")(item_list_id.asInstanceOf[js.Any])
    if (item_list_name != null) __obj.updateDynamic("item_list_name")(item_list_name.asInstanceOf[js.Any])
    if (item_name != null) __obj.updateDynamic("item_name")(item_name.asInstanceOf[js.Any])
    if (item_variant != null) __obj.updateDynamic("item_variant")(item_variant.asInstanceOf[js.Any])
    if (location_id != null) __obj.updateDynamic("location_id")(location_id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (promotion_id != null) __obj.updateDynamic("promotion_id")(promotion_id.asInstanceOf[js.Any])
    if (promotion_name != null) __obj.updateDynamic("promotion_name")(promotion_name.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

