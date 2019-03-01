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

object PreferredDeal {
  @scala.inline
  def apply(
    advertiserName: java.lang.String = null,
    buyerNetworkName: java.lang.String = null,
    currencyCode: java.lang.String = null,
    endTime: java.lang.String = null,
    fixedCpm: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    startTime: java.lang.String = null
  ): PreferredDeal = {
    val __obj = js.Dynamic.literal()
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName)
    if (buyerNetworkName != null) __obj.updateDynamic("buyerNetworkName")(buyerNetworkName)
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (fixedCpm != null) __obj.updateDynamic("fixedCpm")(fixedCpm)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[PreferredDeal]
  }
}

