package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Regional inventory resource. contains the regional name and all attributes
  * which are overridden for the specified region.
  */
@js.native
trait Schema$RegionalInventory extends js.Object {
  /**
    * The availability of the product.
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for
    * submitting any attribute of the feed specification in its generic form.
    */
  var customAttributes: js.UndefOr[js.Array[Schema$CustomAttribute]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#regionalInventory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The price of the product.
    */
  var price: js.UndefOr[Schema$Price] = js.native
  /**
    * The ID (name) of the region.
    */
  var regionId: js.UndefOr[String] = js.native
  /**
    * The sale price of the product. Mandatory if sale_price_effective_date is
    * defined.
    */
  var salePrice: js.UndefOr[Schema$Price] = js.native
  /**
    * A date range represented by a pair of ISO 8601 dates separated by a
    * space, comma, or slash. Both dates might be specified as &#39;null&#39;
    * if undecided.
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
}

object Schema$RegionalInventory {
  @scala.inline
  def apply(
    availability: String = null,
    customAttributes: js.Array[Schema$CustomAttribute] = null,
    kind: String = null,
    price: Schema$Price = null,
    regionId: String = null,
    salePrice: Schema$Price = null,
    salePriceEffectiveDate: String = null
  ): Schema$RegionalInventory = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (regionId != null) __obj.updateDynamic("regionId")(regionId.asInstanceOf[js.Any])
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice.asInstanceOf[js.Any])
    if (salePriceEffectiveDate != null) __obj.updateDynamic("salePriceEffectiveDate")(salePriceEffectiveDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionalInventory]
  }
}

