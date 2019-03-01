package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversion extends js.Object {
  /** DS ad group ID. */
  var adGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** DS ad ID. */
  var adId: js.UndefOr[java.lang.String] = js.undefined
  /** DS advertiser ID. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** DS agency ID. */
  var agencyId: js.UndefOr[java.lang.String] = js.undefined
  /** Available to advertisers only after contacting DoubleClick Search customer support. */
  var attributionModel: js.UndefOr[java.lang.String] = js.undefined
  /** DS campaign ID. */
  var campaignId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sales channel for the product. Acceptable values are:
    * - "local": a physical store
    * - "online": an online store
    */
  var channel: js.UndefOr[java.lang.String] = js.undefined
  /** DS click ID for the conversion. */
  var clickId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For offline conversions, advertisers provide this ID. Advertisers can specify any ID that is meaningful to them. Each conversion in a request must
    * specify a unique ID, and the combination of ID and timestamp must be unique amongst all conversions within the advertiser.
    * For online conversions, DS copies the dsConversionId or floodlightOrderId into this property depending on the advertiser's Floodlight instructions.
    */
  var conversionId: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the conversion was last modified, in epoch millis UTC. */
  var conversionModifiedTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the conversion took place, in epoch millis UTC. */
  var conversionTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** Available to advertisers only after contacting DoubleClick Search customer support. */
  var countMillis: js.UndefOr[java.lang.String] = js.undefined
  /** DS criterion (keyword) ID. */
  var criterionId: js.UndefOr[java.lang.String] = js.undefined
  /** The currency code for the conversion's revenue. Should be in ISO 4217 alphabetic (3-char) format. */
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
  /** Custom dimensions for the conversion, which can be used to filter data in a report. */
  var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.undefined
  /** Custom metrics for the conversion. */
  var customMetric: js.UndefOr[js.Array[CustomMetric]] = js.undefined
  /** The type of device on which the conversion occurred. */
  var deviceType: js.UndefOr[java.lang.String] = js.undefined
  /** ID that DoubleClick Search generates for each conversion. */
  var dsConversionId: js.UndefOr[java.lang.String] = js.undefined
  /** DS engine account ID. */
  var engineAccountId: js.UndefOr[java.lang.String] = js.undefined
  /** The Floodlight order ID provided by the advertiser for the conversion. */
  var floodlightOrderId: js.UndefOr[java.lang.String] = js.undefined
  /** ID that DS generates and uses to uniquely identify the inventory account that contains the product. */
  var inventoryAccountId: js.UndefOr[java.lang.String] = js.undefined
  /** The country registered for the Merchant Center feed that contains the product. Use an ISO 3166 code to specify a country. */
  var productCountry: js.UndefOr[java.lang.String] = js.undefined
  /** DS product group ID. */
  var productGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** The product ID (SKU). */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /** The language registered for the Merchant Center feed that contains the product. Use an ISO 639 code to specify a language. */
  var productLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The quantity of this conversion, in millis. */
  var quantityMillis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The revenue amount of this TRANSACTION conversion, in micros (value multiplied by 1000000, no decimal). For example, to specify a revenue value of "10"
    * enter "10000000" (10 million) in your request.
    */
  var revenueMicros: js.UndefOr[java.lang.String] = js.undefined
  /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
  var segmentationId: js.UndefOr[java.lang.String] = js.undefined
  /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
  var segmentationName: js.UndefOr[java.lang.String] = js.undefined
  /** The segmentation type of this conversion (for example, FLOODLIGHT). */
  var segmentationType: js.UndefOr[java.lang.String] = js.undefined
  /** The state of the conversion, that is, either ACTIVE or REMOVED. Note: state DELETED is deprecated. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the local store for which the product was advertised. Applicable only when the channel is "local". */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the conversion, that is, either ACTION or TRANSACTION. An ACTION conversion is an action by the user that has no monetarily quantifiable
    * value, while a TRANSACTION conversion is an action that does have a monetarily quantifiable value. Examples are email list signups (ACTION) versus
    * ecommerce purchases (TRANSACTION).
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Conversion {
  @scala.inline
  def apply(
    adGroupId: java.lang.String = null,
    adId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    agencyId: java.lang.String = null,
    attributionModel: java.lang.String = null,
    campaignId: java.lang.String = null,
    channel: java.lang.String = null,
    clickId: java.lang.String = null,
    conversionId: java.lang.String = null,
    conversionModifiedTimestamp: java.lang.String = null,
    conversionTimestamp: java.lang.String = null,
    countMillis: java.lang.String = null,
    criterionId: java.lang.String = null,
    currencyCode: java.lang.String = null,
    customDimension: js.Array[CustomDimension] = null,
    customMetric: js.Array[CustomMetric] = null,
    deviceType: java.lang.String = null,
    dsConversionId: java.lang.String = null,
    engineAccountId: java.lang.String = null,
    floodlightOrderId: java.lang.String = null,
    inventoryAccountId: java.lang.String = null,
    productCountry: java.lang.String = null,
    productGroupId: java.lang.String = null,
    productId: java.lang.String = null,
    productLanguage: java.lang.String = null,
    quantityMillis: java.lang.String = null,
    revenueMicros: java.lang.String = null,
    segmentationId: java.lang.String = null,
    segmentationName: java.lang.String = null,
    segmentationType: java.lang.String = null,
    state: java.lang.String = null,
    storeId: java.lang.String = null,
    `type`: java.lang.String = null
  ): Conversion = {
    val __obj = js.Dynamic.literal()
    if (adGroupId != null) __obj.updateDynamic("adGroupId")(adGroupId)
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId)
    if (attributionModel != null) __obj.updateDynamic("attributionModel")(attributionModel)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (clickId != null) __obj.updateDynamic("clickId")(clickId)
    if (conversionId != null) __obj.updateDynamic("conversionId")(conversionId)
    if (conversionModifiedTimestamp != null) __obj.updateDynamic("conversionModifiedTimestamp")(conversionModifiedTimestamp)
    if (conversionTimestamp != null) __obj.updateDynamic("conversionTimestamp")(conversionTimestamp)
    if (countMillis != null) __obj.updateDynamic("countMillis")(countMillis)
    if (criterionId != null) __obj.updateDynamic("criterionId")(criterionId)
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    if (customDimension != null) __obj.updateDynamic("customDimension")(customDimension)
    if (customMetric != null) __obj.updateDynamic("customMetric")(customMetric)
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType)
    if (dsConversionId != null) __obj.updateDynamic("dsConversionId")(dsConversionId)
    if (engineAccountId != null) __obj.updateDynamic("engineAccountId")(engineAccountId)
    if (floodlightOrderId != null) __obj.updateDynamic("floodlightOrderId")(floodlightOrderId)
    if (inventoryAccountId != null) __obj.updateDynamic("inventoryAccountId")(inventoryAccountId)
    if (productCountry != null) __obj.updateDynamic("productCountry")(productCountry)
    if (productGroupId != null) __obj.updateDynamic("productGroupId")(productGroupId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (productLanguage != null) __obj.updateDynamic("productLanguage")(productLanguage)
    if (quantityMillis != null) __obj.updateDynamic("quantityMillis")(quantityMillis)
    if (revenueMicros != null) __obj.updateDynamic("revenueMicros")(revenueMicros)
    if (segmentationId != null) __obj.updateDynamic("segmentationId")(segmentationId)
    if (segmentationName != null) __obj.updateDynamic("segmentationName")(segmentationName)
    if (segmentationType != null) __obj.updateDynamic("segmentationType")(segmentationType)
    if (state != null) __obj.updateDynamic("state")(state)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Conversion]
  }
}

