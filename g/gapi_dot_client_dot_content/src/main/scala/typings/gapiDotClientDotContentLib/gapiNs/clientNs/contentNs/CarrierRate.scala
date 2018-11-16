package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CarrierRate extends js.Object {
  /** Carrier service, such as "UPS" or "Fedex". The list of supported carriers can be retrieved via the getSupportedCarriers method. Required. */
  var carrierName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Carrier service, such as "ground" or "2 days". The list of supported services for a carrier can be retrieved via the getSupportedCarriers method.
               * Required.
               */
  var carrierService: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Additive shipping rate modifier. Can be negative. For example { "value": "1", "currency" : "USD" } adds $1 to the rate, { "value": "-3", "currency" :
               * "USD" } removes $3 from the rate. Optional.
               */
  var flatAdjustment: js.UndefOr[Price] = js.undefined
  /** Name of the carrier rate. Must be unique per rate group. Required. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Shipping origin for this carrier rate. Required. */
  var originPostalCode: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Multiplicative shipping rate modifier as a number in decimal notation. Can be negative. For example "5.4" increases the rate by 5.4%, "-3" decreases
               * the rate by 3%. Optional.
               */
  var percentageAdjustment: js.UndefOr[java.lang.String] = js.undefined
}

