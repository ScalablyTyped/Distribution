package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /** Additional URLs of images of the item. */
  var additionalImageLinks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Additional categories of the item (formatted as in products feed specification). */
  var additionalProductTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Set to true if the item is targeted towards adults. */
  var adult: js.UndefOr[scala.Boolean] = js.undefined
  /** Used to group items in an arbitrary way. Only for CPA%, discouraged otherwise. */
  var adwordsGrouping: js.UndefOr[java.lang.String] = js.undefined
  /** Similar to adwords_grouping, but only works on CPC. */
  var adwordsLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Allows advertisers to override the item URL when the product is shown within the context of Product Ads. */
  var adwordsRedirect: js.UndefOr[java.lang.String] = js.undefined
  /** Target age group of the item. */
  var ageGroup: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the intended aspects for the product. */
  var aspects: js.UndefOr[js.Array[ProductAspect]] = js.undefined
  /** Availability status of the item. */
  var availability: js.UndefOr[java.lang.String] = js.undefined
  /** The day a pre-ordered product becomes available for delivery, in ISO 8601 format. */
  var availabilityDate: js.UndefOr[java.lang.String] = js.undefined
  /** Brand of the item. */
  var brand: js.UndefOr[java.lang.String] = js.undefined
  /** The item's channel (online or local). */
  var channel: js.UndefOr[java.lang.String] = js.undefined
  /** Color of the item. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Condition or state of the item. */
  var condition: js.UndefOr[java.lang.String] = js.undefined
  /** The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for submitting any attribute of the feed specification in its generic form (e.g.,
    * { "name": "size type", "type": "text", "value": "regular" }). This is useful for submitting attributes not explicitly exposed by the API.
    */
  var customAttributes: js.UndefOr[js.Array[ProductCustomAttribute]] = js.undefined
  /** A list of custom (merchant-provided) custom attribute groups. */
  var customGroups: js.UndefOr[js.Array[ProductCustomGroup]] = js.undefined
  /** Custom label 0 for custom grouping of items in a Shopping campaign. */
  var customLabel0: js.UndefOr[java.lang.String] = js.undefined
  /** Custom label 1 for custom grouping of items in a Shopping campaign. */
  var customLabel1: js.UndefOr[java.lang.String] = js.undefined
  /** Custom label 2 for custom grouping of items in a Shopping campaign. */
  var customLabel2: js.UndefOr[java.lang.String] = js.undefined
  /** Custom label 3 for custom grouping of items in a Shopping campaign. */
  var customLabel3: js.UndefOr[java.lang.String] = js.undefined
  /** Custom label 4 for custom grouping of items in a Shopping campaign. */
  var customLabel4: js.UndefOr[java.lang.String] = js.undefined
  /** Description of the item. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the intended destinations for the product. */
  var destinations: js.UndefOr[js.Array[ProductDestination]] = js.undefined
  /** An identifier for an item for dynamic remarketing campaigns. */
  var displayAdsId: js.UndefOr[java.lang.String] = js.undefined
  /** URL directly to your item's landing page for dynamic remarketing campaigns. */
  var displayAdsLink: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser-specified recommendations. */
  var displayAdsSimilarIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Title of an item for dynamic remarketing campaigns. */
  var displayAdsTitle: js.UndefOr[java.lang.String] = js.undefined
  /** Offer margin for dynamic remarketing campaigns. */
  var displayAdsValue: js.UndefOr[scala.Double] = js.undefined
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var energyEfficiencyClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Date on which the item should expire, as specified upon insertion, in ISO 8601 format. The actual expiration date in Google Shopping is exposed in
    * productstatuses as googleExpirationDate and might be earlier if expirationDate is too far in the future.
    */
  var expirationDate: js.UndefOr[java.lang.String] = js.undefined
  /** Target gender of the item. */
  var gender: js.UndefOr[java.lang.String] = js.undefined
  /** Google's category of the item (see Google product taxonomy). */
  var googleProductCategory: js.UndefOr[java.lang.String] = js.undefined
  /** Global Trade Item Number (GTIN) of the item. */
  var gtin: js.UndefOr[java.lang.String] = js.undefined
  /** The REST id of the product. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * False when the item does not have unique product identifiers appropriate to its category, such as GTIN, MPN, and brand. Required according to the
    * Unique Product Identifier Rules for all target countries except for Canada.
    */
  var identifierExists: js.UndefOr[scala.Boolean] = js.undefined
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[java.lang.String] = js.undefined
  /** Number and amount of installments to pay for an item. Brazil only. */
  var installment: js.UndefOr[Installment] = js.undefined
  /** Whether the item is a merchant-defined bundle. A bundle is a custom grouping of different products sold by a merchant for a single price. */
  var isBundle: js.UndefOr[scala.Boolean] = js.undefined
  /** Shared identifier for all variants of the same product. */
  var itemGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#product". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** URL directly linking to your item's page on your website. */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /** Loyalty points that users receive after purchasing the item. Japan only. */
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.undefined
  /** The material of which the item is made. */
  var material: js.UndefOr[java.lang.String] = js.undefined
  /** Maximal product handling time (in business days). */
  var maxHandlingTime: js.UndefOr[java.lang.String] = js.undefined
  /** Minimal product handling time (in business days). */
  var minHandlingTime: js.UndefOr[java.lang.String] = js.undefined
  /** Link to a mobile-optimized version of the landing page. */
  var mobileLink: js.UndefOr[java.lang.String] = js.undefined
  /** Manufacturer Part Number (MPN) of the item. */
  var mpn: js.UndefOr[java.lang.String] = js.undefined
  /** The number of identical products in a merchant-defined multipack. */
  var multipack: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An identifier of the item. Leading and trailing whitespaces are stripped and multiple whitespaces are replaced by a single whitespace upon submission.
    * Only valid unicode characters are accepted. See the products feed specification for details.
    */
  var offerId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether an item is available for purchase only online. */
  var onlineOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** The item's pattern (e.g. polka dots). */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /** Price of the item. */
  var price: js.UndefOr[Price] = js.undefined
  /** Your category of the item (formatted as in products feed specification). */
  var productType: js.UndefOr[java.lang.String] = js.undefined
  /** The unique ID of a promotion. */
  var promotionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Advertised sale price of the item. */
  var salePrice: js.UndefOr[Price] = js.undefined
  /** Date range during which the item is on sale (see products feed specification). */
  var salePriceEffectiveDate: js.UndefOr[java.lang.String] = js.undefined
  /** The quantity of the product that is reserved for sell-on-google ads. */
  var sellOnGoogleQuantity: js.UndefOr[java.lang.String] = js.undefined
  /** Shipping rules. */
  var shipping: js.UndefOr[js.Array[ProductShipping]] = js.undefined
  /** Height of the item for shipping. */
  var shippingHeight: js.UndefOr[ProductShippingDimension] = js.undefined
  /** The shipping label of the product, used to group product in account-level shipping rules. */
  var shippingLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Length of the item for shipping. */
  var shippingLength: js.UndefOr[ProductShippingDimension] = js.undefined
  /** Weight of the item for shipping. */
  var shippingWeight: js.UndefOr[ProductShippingWeight] = js.undefined
  /** Width of the item for shipping. */
  var shippingWidth: js.UndefOr[ProductShippingDimension] = js.undefined
  /** System in which the size is specified. Recommended for apparel items. */
  var sizeSystem: js.UndefOr[java.lang.String] = js.undefined
  /** The cut of the item. Recommended for apparel items. */
  var sizeType: js.UndefOr[java.lang.String] = js.undefined
  /** Size of the item. */
  var sizes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The CLDR territory code for the item. */
  var targetCountry: js.UndefOr[java.lang.String] = js.undefined
  /** Tax information. */
  var taxes: js.UndefOr[js.Array[ProductTax]] = js.undefined
  /** Title of the item. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The preference of the denominator of the unit price. */
  var unitPricingBaseMeasure: js.UndefOr[ProductUnitPricingBaseMeasure] = js.undefined
  /** The measure and dimension of an item. */
  var unitPricingMeasure: js.UndefOr[ProductUnitPricingMeasure] = js.undefined
  /** The read-only list of intended destinations which passed validation. */
  var validatedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Read-only warnings. */
  var warnings: js.UndefOr[js.Array[Error]] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    additionalImageLinks: js.Array[java.lang.String] = null,
    additionalProductTypes: js.Array[java.lang.String] = null,
    adult: js.UndefOr[scala.Boolean] = js.undefined,
    adwordsGrouping: java.lang.String = null,
    adwordsLabels: js.Array[java.lang.String] = null,
    adwordsRedirect: java.lang.String = null,
    ageGroup: java.lang.String = null,
    aspects: js.Array[ProductAspect] = null,
    availability: java.lang.String = null,
    availabilityDate: java.lang.String = null,
    brand: java.lang.String = null,
    channel: java.lang.String = null,
    color: java.lang.String = null,
    condition: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    customAttributes: js.Array[ProductCustomAttribute] = null,
    customGroups: js.Array[ProductCustomGroup] = null,
    customLabel0: java.lang.String = null,
    customLabel1: java.lang.String = null,
    customLabel2: java.lang.String = null,
    customLabel3: java.lang.String = null,
    customLabel4: java.lang.String = null,
    description: java.lang.String = null,
    destinations: js.Array[ProductDestination] = null,
    displayAdsId: java.lang.String = null,
    displayAdsLink: java.lang.String = null,
    displayAdsSimilarIds: js.Array[java.lang.String] = null,
    displayAdsTitle: java.lang.String = null,
    displayAdsValue: scala.Int | scala.Double = null,
    energyEfficiencyClass: java.lang.String = null,
    expirationDate: java.lang.String = null,
    gender: java.lang.String = null,
    googleProductCategory: java.lang.String = null,
    gtin: java.lang.String = null,
    id: java.lang.String = null,
    identifierExists: js.UndefOr[scala.Boolean] = js.undefined,
    imageLink: java.lang.String = null,
    installment: Installment = null,
    isBundle: js.UndefOr[scala.Boolean] = js.undefined,
    itemGroupId: java.lang.String = null,
    kind: java.lang.String = null,
    link: java.lang.String = null,
    loyaltyPoints: LoyaltyPoints = null,
    material: java.lang.String = null,
    maxHandlingTime: java.lang.String = null,
    minHandlingTime: java.lang.String = null,
    mobileLink: java.lang.String = null,
    mpn: java.lang.String = null,
    multipack: java.lang.String = null,
    offerId: java.lang.String = null,
    onlineOnly: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: java.lang.String = null,
    price: Price = null,
    productType: java.lang.String = null,
    promotionIds: js.Array[java.lang.String] = null,
    salePrice: Price = null,
    salePriceEffectiveDate: java.lang.String = null,
    sellOnGoogleQuantity: java.lang.String = null,
    shipping: js.Array[ProductShipping] = null,
    shippingHeight: ProductShippingDimension = null,
    shippingLabel: java.lang.String = null,
    shippingLength: ProductShippingDimension = null,
    shippingWeight: ProductShippingWeight = null,
    shippingWidth: ProductShippingDimension = null,
    sizeSystem: java.lang.String = null,
    sizeType: java.lang.String = null,
    sizes: js.Array[java.lang.String] = null,
    targetCountry: java.lang.String = null,
    taxes: js.Array[ProductTax] = null,
    title: java.lang.String = null,
    unitPricingBaseMeasure: ProductUnitPricingBaseMeasure = null,
    unitPricingMeasure: ProductUnitPricingMeasure = null,
    validatedDestinations: js.Array[java.lang.String] = null,
    warnings: js.Array[Error] = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (additionalImageLinks != null) __obj.updateDynamic("additionalImageLinks")(additionalImageLinks)
    if (additionalProductTypes != null) __obj.updateDynamic("additionalProductTypes")(additionalProductTypes)
    if (!js.isUndefined(adult)) __obj.updateDynamic("adult")(adult)
    if (adwordsGrouping != null) __obj.updateDynamic("adwordsGrouping")(adwordsGrouping)
    if (adwordsLabels != null) __obj.updateDynamic("adwordsLabels")(adwordsLabels)
    if (adwordsRedirect != null) __obj.updateDynamic("adwordsRedirect")(adwordsRedirect)
    if (ageGroup != null) __obj.updateDynamic("ageGroup")(ageGroup)
    if (aspects != null) __obj.updateDynamic("aspects")(aspects)
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (availabilityDate != null) __obj.updateDynamic("availabilityDate")(availabilityDate)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (color != null) __obj.updateDynamic("color")(color)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes)
    if (customGroups != null) __obj.updateDynamic("customGroups")(customGroups)
    if (customLabel0 != null) __obj.updateDynamic("customLabel0")(customLabel0)
    if (customLabel1 != null) __obj.updateDynamic("customLabel1")(customLabel1)
    if (customLabel2 != null) __obj.updateDynamic("customLabel2")(customLabel2)
    if (customLabel3 != null) __obj.updateDynamic("customLabel3")(customLabel3)
    if (customLabel4 != null) __obj.updateDynamic("customLabel4")(customLabel4)
    if (description != null) __obj.updateDynamic("description")(description)
    if (destinations != null) __obj.updateDynamic("destinations")(destinations)
    if (displayAdsId != null) __obj.updateDynamic("displayAdsId")(displayAdsId)
    if (displayAdsLink != null) __obj.updateDynamic("displayAdsLink")(displayAdsLink)
    if (displayAdsSimilarIds != null) __obj.updateDynamic("displayAdsSimilarIds")(displayAdsSimilarIds)
    if (displayAdsTitle != null) __obj.updateDynamic("displayAdsTitle")(displayAdsTitle)
    if (displayAdsValue != null) __obj.updateDynamic("displayAdsValue")(displayAdsValue.asInstanceOf[js.Any])
    if (energyEfficiencyClass != null) __obj.updateDynamic("energyEfficiencyClass")(energyEfficiencyClass)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (googleProductCategory != null) __obj.updateDynamic("googleProductCategory")(googleProductCategory)
    if (gtin != null) __obj.updateDynamic("gtin")(gtin)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(identifierExists)) __obj.updateDynamic("identifierExists")(identifierExists)
    if (imageLink != null) __obj.updateDynamic("imageLink")(imageLink)
    if (installment != null) __obj.updateDynamic("installment")(installment)
    if (!js.isUndefined(isBundle)) __obj.updateDynamic("isBundle")(isBundle)
    if (itemGroupId != null) __obj.updateDynamic("itemGroupId")(itemGroupId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (link != null) __obj.updateDynamic("link")(link)
    if (loyaltyPoints != null) __obj.updateDynamic("loyaltyPoints")(loyaltyPoints)
    if (material != null) __obj.updateDynamic("material")(material)
    if (maxHandlingTime != null) __obj.updateDynamic("maxHandlingTime")(maxHandlingTime)
    if (minHandlingTime != null) __obj.updateDynamic("minHandlingTime")(minHandlingTime)
    if (mobileLink != null) __obj.updateDynamic("mobileLink")(mobileLink)
    if (mpn != null) __obj.updateDynamic("mpn")(mpn)
    if (multipack != null) __obj.updateDynamic("multipack")(multipack)
    if (offerId != null) __obj.updateDynamic("offerId")(offerId)
    if (!js.isUndefined(onlineOnly)) __obj.updateDynamic("onlineOnly")(onlineOnly)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (price != null) __obj.updateDynamic("price")(price)
    if (productType != null) __obj.updateDynamic("productType")(productType)
    if (promotionIds != null) __obj.updateDynamic("promotionIds")(promotionIds)
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice)
    if (salePriceEffectiveDate != null) __obj.updateDynamic("salePriceEffectiveDate")(salePriceEffectiveDate)
    if (sellOnGoogleQuantity != null) __obj.updateDynamic("sellOnGoogleQuantity")(sellOnGoogleQuantity)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (shippingHeight != null) __obj.updateDynamic("shippingHeight")(shippingHeight)
    if (shippingLabel != null) __obj.updateDynamic("shippingLabel")(shippingLabel)
    if (shippingLength != null) __obj.updateDynamic("shippingLength")(shippingLength)
    if (shippingWeight != null) __obj.updateDynamic("shippingWeight")(shippingWeight)
    if (shippingWidth != null) __obj.updateDynamic("shippingWidth")(shippingWidth)
    if (sizeSystem != null) __obj.updateDynamic("sizeSystem")(sizeSystem)
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry)
    if (taxes != null) __obj.updateDynamic("taxes")(taxes)
    if (title != null) __obj.updateDynamic("title")(title)
    if (unitPricingBaseMeasure != null) __obj.updateDynamic("unitPricingBaseMeasure")(unitPricingBaseMeasure)
    if (unitPricingMeasure != null) __obj.updateDynamic("unitPricingMeasure")(unitPricingMeasure)
    if (validatedDestinations != null) __obj.updateDynamic("validatedDestinations")(validatedDestinations)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Product]
  }
}

