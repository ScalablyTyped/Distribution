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

