package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarrierRate extends js.Object {
  /** Carrier service, such as "UPS" or "Fedex". The list of supported carriers can be retrieved via the getSupportedCarriers method. Required. */
  var carrierName: js.UndefOr[String] = js.undefined
  /**
    * Carrier service, such as "ground" or "2 days". The list of supported services for a carrier can be retrieved via the getSupportedCarriers method.
    * Required.
    */
  var carrierService: js.UndefOr[String] = js.undefined
  /**
    * Additive shipping rate modifier. Can be negative. For example { "value": "1", "currency" : "USD" } adds $1 to the rate, { "value": "-3", "currency" :
    * "USD" } removes $3 from the rate. Optional.
    */
  var flatAdjustment: js.UndefOr[Price] = js.undefined
  /** Name of the carrier rate. Must be unique per rate group. Required. */
  var name: js.UndefOr[String] = js.undefined
  /** Shipping origin for this carrier rate. Required. */
  var originPostalCode: js.UndefOr[String] = js.undefined
  /**
    * Multiplicative shipping rate modifier as a number in decimal notation. Can be negative. For example "5.4" increases the rate by 5.4%, "-3" decreases
    * the rate by 3%. Optional.
    */
  var percentageAdjustment: js.UndefOr[String] = js.undefined
}

object CarrierRate {
  @scala.inline
  def apply(
    carrierName: String = null,
    carrierService: String = null,
    flatAdjustment: Price = null,
    name: String = null,
    originPostalCode: String = null,
    percentageAdjustment: String = null
  ): CarrierRate = {
    val __obj = js.Dynamic.literal()
    if (carrierName != null) __obj.updateDynamic("carrierName")(carrierName.asInstanceOf[js.Any])
    if (carrierService != null) __obj.updateDynamic("carrierService")(carrierService.asInstanceOf[js.Any])
    if (flatAdjustment != null) __obj.updateDynamic("flatAdjustment")(flatAdjustment.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originPostalCode != null) __obj.updateDynamic("originPostalCode")(originPostalCode.asInstanceOf[js.Any])
    if (percentageAdjustment != null) __obj.updateDynamic("percentageAdjustment")(percentageAdjustment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarrierRate]
  }
}

