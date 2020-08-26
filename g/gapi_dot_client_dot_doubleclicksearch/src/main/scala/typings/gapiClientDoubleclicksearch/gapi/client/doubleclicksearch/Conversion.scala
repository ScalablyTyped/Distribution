package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversion extends js.Object {
  /** DS ad group ID. */
  var adGroupId: js.UndefOr[String] = js.native
  /** DS ad ID. */
  var adId: js.UndefOr[String] = js.native
  /** DS advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.native
  /** DS agency ID. */
  var agencyId: js.UndefOr[String] = js.native
  /** Available to advertisers only after contacting DoubleClick Search customer support. */
  var attributionModel: js.UndefOr[String] = js.native
  /** DS campaign ID. */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Sales channel for the product. Acceptable values are:
    * - "local": a physical store
    * - "online": an online store
    */
  var channel: js.UndefOr[String] = js.native
  /** DS click ID for the conversion. */
  var clickId: js.UndefOr[String] = js.native
  /**
    * For offline conversions, advertisers provide this ID. Advertisers can specify any ID that is meaningful to them. Each conversion in a request must
    * specify a unique ID, and the combination of ID and timestamp must be unique amongst all conversions within the advertiser.
    * For online conversions, DS copies the dsConversionId or floodlightOrderId into this property depending on the advertiser's Floodlight instructions.
    */
  var conversionId: js.UndefOr[String] = js.native
  /** The time at which the conversion was last modified, in epoch millis UTC. */
  var conversionModifiedTimestamp: js.UndefOr[String] = js.native
  /** The time at which the conversion took place, in epoch millis UTC. */
  var conversionTimestamp: js.UndefOr[String] = js.native
  /** Available to advertisers only after contacting DoubleClick Search customer support. */
  var countMillis: js.UndefOr[String] = js.native
  /** DS criterion (keyword) ID. */
  var criterionId: js.UndefOr[String] = js.native
  /** The currency code for the conversion's revenue. Should be in ISO 4217 alphabetic (3-char) format. */
  var currencyCode: js.UndefOr[String] = js.native
  /** Custom dimensions for the conversion, which can be used to filter data in a report. */
  var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.native
  /** Custom metrics for the conversion. */
  var customMetric: js.UndefOr[js.Array[CustomMetric]] = js.native
  /** The type of device on which the conversion occurred. */
  var deviceType: js.UndefOr[String] = js.native
  /** ID that DoubleClick Search generates for each conversion. */
  var dsConversionId: js.UndefOr[String] = js.native
  /** DS engine account ID. */
  var engineAccountId: js.UndefOr[String] = js.native
  /** The Floodlight order ID provided by the advertiser for the conversion. */
  var floodlightOrderId: js.UndefOr[String] = js.native
  /** ID that DS generates and uses to uniquely identify the inventory account that contains the product. */
  var inventoryAccountId: js.UndefOr[String] = js.native
  /** The country registered for the Merchant Center feed that contains the product. Use an ISO 3166 code to specify a country. */
  var productCountry: js.UndefOr[String] = js.native
  /** DS product group ID. */
  var productGroupId: js.UndefOr[String] = js.native
  /** The product ID (SKU). */
  var productId: js.UndefOr[String] = js.native
  /** The language registered for the Merchant Center feed that contains the product. Use an ISO 639 code to specify a language. */
  var productLanguage: js.UndefOr[String] = js.native
  /** The quantity of this conversion, in millis. */
  var quantityMillis: js.UndefOr[String] = js.native
  /**
    * The revenue amount of this TRANSACTION conversion, in micros (value multiplied by 1000000, no decimal). For example, to specify a revenue value of "10"
    * enter "10000000" (10 million) in your request.
    */
  var revenueMicros: js.UndefOr[String] = js.native
  /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
  var segmentationId: js.UndefOr[String] = js.native
  /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
  var segmentationName: js.UndefOr[String] = js.native
  /** The segmentation type of this conversion (for example, FLOODLIGHT). */
  var segmentationType: js.UndefOr[String] = js.native
  /** The state of the conversion, that is, either ACTIVE or REMOVED. Note: state DELETED is deprecated. */
  var state: js.UndefOr[String] = js.native
  /** The ID of the local store for which the product was advertised. Applicable only when the channel is "local". */
  var storeId: js.UndefOr[String] = js.native
  /**
    * The type of the conversion, that is, either ACTION or TRANSACTION. An ACTION conversion is an action by the user that has no monetarily quantifiable
    * value, while a TRANSACTION conversion is an action that does have a monetarily quantifiable value. Examples are email list signups (ACTION) versus
    * ecommerce purchases (TRANSACTION).
    */
  var `type`: js.UndefOr[String] = js.native
}

object Conversion {
  @scala.inline
  def apply(): Conversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversion]
  }
  @scala.inline
  implicit class ConversionOps[Self <: Conversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdGroupId(value: String): Self = this.set("adGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdGroupId: Self = this.set("adGroupId", js.undefined)
    @scala.inline
    def setAdId(value: String): Self = this.set("adId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdId: Self = this.set("adId", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAgencyId(value: String): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgencyId: Self = this.set("agencyId", js.undefined)
    @scala.inline
    def setAttributionModel(value: String): Self = this.set("attributionModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributionModel: Self = this.set("attributionModel", js.undefined)
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setClickId(value: String): Self = this.set("clickId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickId: Self = this.set("clickId", js.undefined)
    @scala.inline
    def setConversionId(value: String): Self = this.set("conversionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionId: Self = this.set("conversionId", js.undefined)
    @scala.inline
    def setConversionModifiedTimestamp(value: String): Self = this.set("conversionModifiedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionModifiedTimestamp: Self = this.set("conversionModifiedTimestamp", js.undefined)
    @scala.inline
    def setConversionTimestamp(value: String): Self = this.set("conversionTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionTimestamp: Self = this.set("conversionTimestamp", js.undefined)
    @scala.inline
    def setCountMillis(value: String): Self = this.set("countMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountMillis: Self = this.set("countMillis", js.undefined)
    @scala.inline
    def setCriterionId(value: String): Self = this.set("criterionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriterionId: Self = this.set("criterionId", js.undefined)
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    @scala.inline
    def setCustomDimensionVarargs(value: CustomDimension*): Self = this.set("customDimension", js.Array(value :_*))
    @scala.inline
    def setCustomDimension(value: js.Array[CustomDimension]): Self = this.set("customDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDimension: Self = this.set("customDimension", js.undefined)
    @scala.inline
    def setCustomMetricVarargs(value: CustomMetric*): Self = this.set("customMetric", js.Array(value :_*))
    @scala.inline
    def setCustomMetric(value: js.Array[CustomMetric]): Self = this.set("customMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMetric: Self = this.set("customMetric", js.undefined)
    @scala.inline
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
    @scala.inline
    def setDsConversionId(value: String): Self = this.set("dsConversionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDsConversionId: Self = this.set("dsConversionId", js.undefined)
    @scala.inline
    def setEngineAccountId(value: String): Self = this.set("engineAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineAccountId: Self = this.set("engineAccountId", js.undefined)
    @scala.inline
    def setFloodlightOrderId(value: String): Self = this.set("floodlightOrderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightOrderId: Self = this.set("floodlightOrderId", js.undefined)
    @scala.inline
    def setInventoryAccountId(value: String): Self = this.set("inventoryAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventoryAccountId: Self = this.set("inventoryAccountId", js.undefined)
    @scala.inline
    def setProductCountry(value: String): Self = this.set("productCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCountry: Self = this.set("productCountry", js.undefined)
    @scala.inline
    def setProductGroupId(value: String): Self = this.set("productGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductGroupId: Self = this.set("productGroupId", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setProductLanguage(value: String): Self = this.set("productLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductLanguage: Self = this.set("productLanguage", js.undefined)
    @scala.inline
    def setQuantityMillis(value: String): Self = this.set("quantityMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantityMillis: Self = this.set("quantityMillis", js.undefined)
    @scala.inline
    def setRevenueMicros(value: String): Self = this.set("revenueMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevenueMicros: Self = this.set("revenueMicros", js.undefined)
    @scala.inline
    def setSegmentationId(value: String): Self = this.set("segmentationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentationId: Self = this.set("segmentationId", js.undefined)
    @scala.inline
    def setSegmentationName(value: String): Self = this.set("segmentationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentationName: Self = this.set("segmentationName", js.undefined)
    @scala.inline
    def setSegmentationType(value: String): Self = this.set("segmentationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentationType: Self = this.set("segmentationType", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

