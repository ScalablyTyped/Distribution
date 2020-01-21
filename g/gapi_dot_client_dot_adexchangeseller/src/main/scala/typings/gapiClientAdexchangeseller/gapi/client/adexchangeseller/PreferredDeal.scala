package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferredDeal extends js.Object {
  /** The name of the advertiser this deal is for. */
  var advertiserName: js.UndefOr[String] = js.undefined
  /** The name of the buyer network this deal is for. */
  var buyerNetworkName: js.UndefOr[String] = js.undefined
  /** The currency code that applies to the fixed_cpm value. If not set then assumed to be USD. */
  var currencyCode: js.UndefOr[String] = js.undefined
  /** Time when this deal stops being active in seconds since the epoch (GMT). If not set then this deal is valid until manually disabled by the publisher. */
  var endTime: js.UndefOr[String] = js.undefined
  /**
    * The fixed price for this preferred deal. In cpm micros of currency according to currencyCode. If set, then this preferred deal is eligible for the
    * fixed price tier of buying (highest priority, pay exactly the configured fixed price).
    */
  var fixedCpm: js.UndefOr[String] = js.undefined
  /** Unique identifier of this preferred deal. */
  var id: js.UndefOr[String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#preferredDeal. */
  var kind: js.UndefOr[String] = js.undefined
  /** Time when this deal becomes active in seconds since the epoch (GMT). If not set then this deal is active immediately upon creation. */
  var startTime: js.UndefOr[String] = js.undefined
}

object PreferredDeal {
  @scala.inline
  def apply(
    advertiserName: String = null,
    buyerNetworkName: String = null,
    currencyCode: String = null,
    endTime: String = null,
    fixedCpm: String = null,
    id: String = null,
    kind: String = null,
    startTime: String = null
  ): PreferredDeal = {
    val __obj = js.Dynamic.literal()
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName.asInstanceOf[js.Any])
    if (buyerNetworkName != null) __obj.updateDynamic("buyerNetworkName")(buyerNetworkName.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fixedCpm != null) __obj.updateDynamic("fixedCpm")(fixedCpm.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredDeal]
  }
}

