package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /** Additional URLs of images of the item. */
  var additionalImageLinks: js.UndefOr[js.Array[String]] = js.undefined
  /** Additional categories of the item (formatted as in products feed specification). */
  var additionalProductTypes: js.UndefOr[js.Array[String]] = js.undefined
  /** Set to true if the item is targeted towards adults. */
  var adult: js.UndefOr[Boolean] = js.undefined
  /** Used to group items in an arbitrary way. Only for CPA%, discouraged otherwise. */
  var adwordsGrouping: js.UndefOr[String] = js.undefined
  /** Similar to adwords_grouping, but only works on CPC. */
  var adwordsLabels: js.UndefOr[js.Array[String]] = js.undefined
  /** Allows advertisers to override the item URL when the product is shown within the context of Product Ads. */
  var adwordsRedirect: js.UndefOr[String] = js.undefined
  /** Target age group of the item. */
  var ageGroup: js.UndefOr[String] = js.undefined
  /** Specifies the intended aspects for the product. */
  var aspects: js.UndefOr[js.Array[ProductAspect]] = js.undefined
  /** Availability status of the item. */
  var availability: js.UndefOr[String] = js.undefined
  /** The day a pre-ordered product becomes available for delivery, in ISO 8601 format. */
  var availabilityDate: js.UndefOr[String] = js.undefined
  /** Brand of the item. */
  var brand: js.UndefOr[String] = js.undefined
  /** The item's channel (online or local). */
  var channel: js.UndefOr[String] = js.undefined
  /** Color of the item. */
  var color: js.UndefOr[String] = js.undefined
  /** Condition or state of the item. */
  var condition: js.UndefOr[String] = js.undefined
  /** The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[String] = js.undefined
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for submitting any attribute of the feed specification in its generic form (e.g.,
    * { "name": "size type", "type": "text", "value": "regular" }). This is useful for submitting attributes not explicitly exposed by the API.
    */
  var customAttributes: js.UndefOr[js.Array[ProductCustomAttribute]] = js.undefined
  /** A list of custom (merchant-provided) custom attribute groups. */
  var customGroups: js.UndefOr[js.Array[ProductCustomGroup]] = js.undefined
  /** Custom label 0 for custom grouping of items in a Shopping campaign. */
  var customLabel0: js.UndefOr[String] = js.undefined
  /** Custom label 1 for custom grouping of items in a Shopping campaign. */
  var customLabel1: js.UndefOr[String] = js.undefined
  /** Custom label 2 for custom grouping of items in a Shopping campaign. */
  var customLabel2: js.UndefOr[String] = js.undefined
  /** Custom label 3 for custom grouping of items in a Shopping campaign. */
  var customLabel3: js.UndefOr[String] = js.undefined
  /** Custom label 4 for custom grouping of items in a Shopping campaign. */
  var customLabel4: js.UndefOr[String] = js.undefined
  /** Description of the item. */
  var description: js.UndefOr[String] = js.undefined
  /** Specifies the intended destinations for the product. */
  var destinations: js.UndefOr[js.Array[ProductDestination]] = js.undefined
  /** An identifier for an item for dynamic remarketing campaigns. */
  var displayAdsId: js.UndefOr[String] = js.undefined
  /** URL directly to your item's landing page for dynamic remarketing campaigns. */
  var displayAdsLink: js.UndefOr[String] = js.undefined
  /** Advertiser-specified recommendations. */
  var displayAdsSimilarIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Title of an item for dynamic remarketing campaigns. */
  var displayAdsTitle: js.UndefOr[String] = js.undefined
  /** Offer margin for dynamic remarketing campaigns. */
  var displayAdsValue: js.UndefOr[Double] = js.undefined
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var energyEfficiencyClass: js.UndefOr[String] = js.undefined
  /**
    * Date on which the item should expire, as specified upon insertion, in ISO 8601 format. The actual expiration date in Google Shopping is exposed in
    * productstatuses as googleExpirationDate and might be earlier if expirationDate is too far in the future.
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  /** Target gender of the item. */
  var gender: js.UndefOr[String] = js.undefined
  /** Google's category of the item (see Google product taxonomy). */
  var googleProductCategory: js.UndefOr[String] = js.undefined
  /** Global Trade Item Number (GTIN) of the item. */
  var gtin: js.UndefOr[String] = js.undefined
  /** The REST id of the product. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * False when the item does not have unique product identifiers appropriate to its category, such as GTIN, MPN, and brand. Required according to the
    * Unique Product Identifier Rules for all target countries except for Canada.
    */
  var identifierExists: js.UndefOr[Boolean] = js.undefined
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.undefined
  /** Number and amount of installments to pay for an item. Brazil only. */
  var installment: js.UndefOr[Installment] = js.undefined
  /** Whether the item is a merchant-defined bundle. A bundle is a custom grouping of different products sold by a merchant for a single price. */
  var isBundle: js.UndefOr[Boolean] = js.undefined
  /** Shared identifier for all variants of the same product. */
  var itemGroupId: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#product". */
  var kind: js.UndefOr[String] = js.undefined
  /** URL directly linking to your item's page on your website. */
  var link: js.UndefOr[String] = js.undefined
  /** Loyalty points that users receive after purchasing the item. Japan only. */
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.undefined
  /** The material of which the item is made. */
  var material: js.UndefOr[String] = js.undefined
  /** Maximal product handling time (in business days). */
  var maxHandlingTime: js.UndefOr[String] = js.undefined
  /** Minimal product handling time (in business days). */
  var minHandlingTime: js.UndefOr[String] = js.undefined
  /** Link to a mobile-optimized version of the landing page. */
  var mobileLink: js.UndefOr[String] = js.undefined
  /** Manufacturer Part Number (MPN) of the item. */
  var mpn: js.UndefOr[String] = js.undefined
  /** The number of identical products in a merchant-defined multipack. */
  var multipack: js.UndefOr[String] = js.undefined
  /**
    * An identifier of the item. Leading and trailing whitespaces are stripped and multiple whitespaces are replaced by a single whitespace upon submission.
    * Only valid unicode characters are accepted. See the products feed specification for details.
    */
  var offerId: js.UndefOr[String] = js.undefined
  /** Whether an item is available for purchase only online. */
  var onlineOnly: js.UndefOr[Boolean] = js.undefined
  /** The item's pattern (e.g. polka dots). */
  var pattern: js.UndefOr[String] = js.undefined
  /** Price of the item. */
  var price: js.UndefOr[Price] = js.undefined
  /** Your category of the item (formatted as in products feed specification). */
  var productType: js.UndefOr[String] = js.undefined
  /** The unique ID of a promotion. */
  var promotionIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Advertised sale price of the item. */
  var salePrice: js.UndefOr[Price] = js.undefined
  /** Date range during which the item is on sale (see products feed specification). */
  var salePriceEffectiveDate: js.UndefOr[String] = js.undefined
  /** The quantity of the product that is reserved for sell-on-google ads. */
  var sellOnGoogleQuantity: js.UndefOr[String] = js.undefined
  /** Shipping rules. */
  var shipping: js.UndefOr[js.Array[ProductShipping]] = js.undefined
  /** Height of the item for shipping. */
  var shippingHeight: js.UndefOr[ProductShippingDimension] = js.undefined
  /** The shipping label of the product, used to group product in account-level shipping rules. */
  var shippingLabel: js.UndefOr[String] = js.undefined
  /** Length of the item for shipping. */
  var shippingLength: js.UndefOr[ProductShippingDimension] = js.undefined
  /** Weight of the item for shipping. */
  var shippingWeight: js.UndefOr[ProductShippingWeight] = js.undefined
  /** Width of the item for shipping. */
  var shippingWidth: js.UndefOr[ProductShippingDimension] = js.undefined
  /** System in which the size is specified. Recommended for apparel items. */
  var sizeSystem: js.UndefOr[String] = js.undefined
  /** The cut of the item. Recommended for apparel items. */
  var sizeType: js.UndefOr[String] = js.undefined
  /** Size of the item. */
  var sizes: js.UndefOr[js.Array[String]] = js.undefined
  /** The CLDR territory code for the item. */
  var targetCountry: js.UndefOr[String] = js.undefined
  /** Tax information. */
  var taxes: js.UndefOr[js.Array[ProductTax]] = js.undefined
  /** Title of the item. */
  var title: js.UndefOr[String] = js.undefined
  /** The preference of the denominator of the unit price. */
  var unitPricingBaseMeasure: js.UndefOr[ProductUnitPricingBaseMeasure] = js.undefined
  /** The measure and dimension of an item. */
  var unitPricingMeasure: js.UndefOr[ProductUnitPricingMeasure] = js.undefined
  /** The read-only list of intended destinations which passed validation. */
  var validatedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  /** Read-only warnings. */
  var warnings: js.UndefOr[js.Array[Error]] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    additionalImageLinks: js.Array[String] = null,
    additionalProductTypes: js.Array[String] = null,
    adult: js.UndefOr[Boolean] = js.undefined,
    adwordsGrouping: String = null,
    adwordsLabels: js.Array[String] = null,
    adwordsRedirect: String = null,
    ageGroup: String = null,
    aspects: js.Array[ProductAspect] = null,
    availability: String = null,
    availabilityDate: String = null,
    brand: String = null,
    channel: String = null,
    color: String = null,
    condition: String = null,
    contentLanguage: String = null,
    customAttributes: js.Array[ProductCustomAttribute] = null,
    customGroups: js.Array[ProductCustomGroup] = null,
    customLabel0: String = null,
    customLabel1: String = null,
    customLabel2: String = null,
    customLabel3: String = null,
    customLabel4: String = null,
    description: String = null,
    destinations: js.Array[ProductDestination] = null,
    displayAdsId: String = null,
    displayAdsLink: String = null,
    displayAdsSimilarIds: js.Array[String] = null,
    displayAdsTitle: String = null,
    displayAdsValue: js.UndefOr[Double] = js.undefined,
    energyEfficiencyClass: String = null,
    expirationDate: String = null,
    gender: String = null,
    googleProductCategory: String = null,
    gtin: String = null,
    id: String = null,
    identifierExists: js.UndefOr[Boolean] = js.undefined,
    imageLink: String = null,
    installment: Installment = null,
    isBundle: js.UndefOr[Boolean] = js.undefined,
    itemGroupId: String = null,
    kind: String = null,
    link: String = null,
    loyaltyPoints: LoyaltyPoints = null,
    material: String = null,
    maxHandlingTime: String = null,
    minHandlingTime: String = null,
    mobileLink: String = null,
    mpn: String = null,
    multipack: String = null,
    offerId: String = null,
    onlineOnly: js.UndefOr[Boolean] = js.undefined,
    pattern: String = null,
    price: Price = null,
    productType: String = null,
    promotionIds: js.Array[String] = null,
    salePrice: Price = null,
    salePriceEffectiveDate: String = null,
    sellOnGoogleQuantity: String = null,
    shipping: js.Array[ProductShipping] = null,
    shippingHeight: ProductShippingDimension = null,
    shippingLabel: String = null,
    shippingLength: ProductShippingDimension = null,
    shippingWeight: ProductShippingWeight = null,
    shippingWidth: ProductShippingDimension = null,
    sizeSystem: String = null,
    sizeType: String = null,
    sizes: js.Array[String] = null,
    targetCountry: String = null,
    taxes: js.Array[ProductTax] = null,
    title: String = null,
    unitPricingBaseMeasure: ProductUnitPricingBaseMeasure = null,
    unitPricingMeasure: ProductUnitPricingMeasure = null,
    validatedDestinations: js.Array[String] = null,
    warnings: js.Array[Error] = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (additionalImageLinks != null) __obj.updateDynamic("additionalImageLinks")(additionalImageLinks.asInstanceOf[js.Any])
    if (additionalProductTypes != null) __obj.updateDynamic("additionalProductTypes")(additionalProductTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(adult)) __obj.updateDynamic("adult")(adult.get.asInstanceOf[js.Any])
    if (adwordsGrouping != null) __obj.updateDynamic("adwordsGrouping")(adwordsGrouping.asInstanceOf[js.Any])
    if (adwordsLabels != null) __obj.updateDynamic("adwordsLabels")(adwordsLabels.asInstanceOf[js.Any])
    if (adwordsRedirect != null) __obj.updateDynamic("adwordsRedirect")(adwordsRedirect.asInstanceOf[js.Any])
    if (ageGroup != null) __obj.updateDynamic("ageGroup")(ageGroup.asInstanceOf[js.Any])
    if (aspects != null) __obj.updateDynamic("aspects")(aspects.asInstanceOf[js.Any])
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (availabilityDate != null) __obj.updateDynamic("availabilityDate")(availabilityDate.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (customGroups != null) __obj.updateDynamic("customGroups")(customGroups.asInstanceOf[js.Any])
    if (customLabel0 != null) __obj.updateDynamic("customLabel0")(customLabel0.asInstanceOf[js.Any])
    if (customLabel1 != null) __obj.updateDynamic("customLabel1")(customLabel1.asInstanceOf[js.Any])
    if (customLabel2 != null) __obj.updateDynamic("customLabel2")(customLabel2.asInstanceOf[js.Any])
    if (customLabel3 != null) __obj.updateDynamic("customLabel3")(customLabel3.asInstanceOf[js.Any])
    if (customLabel4 != null) __obj.updateDynamic("customLabel4")(customLabel4.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (displayAdsId != null) __obj.updateDynamic("displayAdsId")(displayAdsId.asInstanceOf[js.Any])
    if (displayAdsLink != null) __obj.updateDynamic("displayAdsLink")(displayAdsLink.asInstanceOf[js.Any])
    if (displayAdsSimilarIds != null) __obj.updateDynamic("displayAdsSimilarIds")(displayAdsSimilarIds.asInstanceOf[js.Any])
    if (displayAdsTitle != null) __obj.updateDynamic("displayAdsTitle")(displayAdsTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAdsValue)) __obj.updateDynamic("displayAdsValue")(displayAdsValue.get.asInstanceOf[js.Any])
    if (energyEfficiencyClass != null) __obj.updateDynamic("energyEfficiencyClass")(energyEfficiencyClass.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (googleProductCategory != null) __obj.updateDynamic("googleProductCategory")(googleProductCategory.asInstanceOf[js.Any])
    if (gtin != null) __obj.updateDynamic("gtin")(gtin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(identifierExists)) __obj.updateDynamic("identifierExists")(identifierExists.get.asInstanceOf[js.Any])
    if (imageLink != null) __obj.updateDynamic("imageLink")(imageLink.asInstanceOf[js.Any])
    if (installment != null) __obj.updateDynamic("installment")(installment.asInstanceOf[js.Any])
    if (!js.isUndefined(isBundle)) __obj.updateDynamic("isBundle")(isBundle.get.asInstanceOf[js.Any])
    if (itemGroupId != null) __obj.updateDynamic("itemGroupId")(itemGroupId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (loyaltyPoints != null) __obj.updateDynamic("loyaltyPoints")(loyaltyPoints.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (maxHandlingTime != null) __obj.updateDynamic("maxHandlingTime")(maxHandlingTime.asInstanceOf[js.Any])
    if (minHandlingTime != null) __obj.updateDynamic("minHandlingTime")(minHandlingTime.asInstanceOf[js.Any])
    if (mobileLink != null) __obj.updateDynamic("mobileLink")(mobileLink.asInstanceOf[js.Any])
    if (mpn != null) __obj.updateDynamic("mpn")(mpn.asInstanceOf[js.Any])
    if (multipack != null) __obj.updateDynamic("multipack")(multipack.asInstanceOf[js.Any])
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (!js.isUndefined(onlineOnly)) __obj.updateDynamic("onlineOnly")(onlineOnly.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (productType != null) __obj.updateDynamic("productType")(productType.asInstanceOf[js.Any])
    if (promotionIds != null) __obj.updateDynamic("promotionIds")(promotionIds.asInstanceOf[js.Any])
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice.asInstanceOf[js.Any])
    if (salePriceEffectiveDate != null) __obj.updateDynamic("salePriceEffectiveDate")(salePriceEffectiveDate.asInstanceOf[js.Any])
    if (sellOnGoogleQuantity != null) __obj.updateDynamic("sellOnGoogleQuantity")(sellOnGoogleQuantity.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (shippingHeight != null) __obj.updateDynamic("shippingHeight")(shippingHeight.asInstanceOf[js.Any])
    if (shippingLabel != null) __obj.updateDynamic("shippingLabel")(shippingLabel.asInstanceOf[js.Any])
    if (shippingLength != null) __obj.updateDynamic("shippingLength")(shippingLength.asInstanceOf[js.Any])
    if (shippingWeight != null) __obj.updateDynamic("shippingWeight")(shippingWeight.asInstanceOf[js.Any])
    if (shippingWidth != null) __obj.updateDynamic("shippingWidth")(shippingWidth.asInstanceOf[js.Any])
    if (sizeSystem != null) __obj.updateDynamic("sizeSystem")(sizeSystem.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry.asInstanceOf[js.Any])
    if (taxes != null) __obj.updateDynamic("taxes")(taxes.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unitPricingBaseMeasure != null) __obj.updateDynamic("unitPricingBaseMeasure")(unitPricingBaseMeasure.asInstanceOf[js.Any])
    if (unitPricingMeasure != null) __obj.updateDynamic("unitPricingMeasure")(unitPricingMeasure.asInstanceOf[js.Any])
    if (validatedDestinations != null) __obj.updateDynamic("validatedDestinations")(validatedDestinations.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

