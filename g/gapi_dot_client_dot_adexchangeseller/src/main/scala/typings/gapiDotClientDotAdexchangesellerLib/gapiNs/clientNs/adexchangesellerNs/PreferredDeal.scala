package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PreferredDeal extends js.Object {
  /** The name of the advertiser this deal is for. */
  var advertiserName: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the buyer network this deal is for. */
  var buyerNetworkName: js.UndefOr[java.lang.String] = js.undefined
  /** The currency code that applies to the fixed_cpm value. If not set then assumed to be USD. */
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
  /** Time when this deal stops being active in seconds since the epoch (GMT). If not set then this deal is valid until manually disabled by the publisher. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The fixed price for this preferred deal. In cpm micros of currency according to currencyCode. If set, then this preferred deal is eligible for the
               * fixed price tier of buying (highest priority, pay exactly the configured fixed price).
               */
  var fixedCpm: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier of this preferred deal. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#preferredDeal. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Time when this deal becomes active in seconds since the epoch (GMT). If not set then this deal is active immediately upon creation. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

