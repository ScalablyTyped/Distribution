package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.googleapis.Anon_BidProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration data for an Ad Exchange buyer account.
  */
@js.native
trait Schema$Account extends js.Object {
  /**
    * When this is false, bid requests that include a deal ID for a private
    * auction or preferred deal are always sent to your bidder. When true, all
    * active pretargeting configs will be applied to private auctions and
    * preferred deals. Programmatic Guaranteed deals (when enabled) are always
    * sent to your bidder.
    */
  var applyPretargetingToNonGuaranteedDeals: js.UndefOr[Boolean] = js.native
  /**
    * Your bidder locations that have distinct URLs.
    */
  var bidderLocation: js.UndefOr[js.Array[Anon_BidProtocol]] = js.native
  /**
    * The nid parameter value used in cookie match requests. Please contact
    * your technical account manager if you need to change this.
    */
  var cookieMatchingNid: js.UndefOr[String] = js.native
  /**
    * The base URL used in cookie match requests.
    */
  var cookieMatchingUrl: js.UndefOr[String] = js.native
  /**
    * Account id.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum number of active creatives that an account can have, where a
    * creative is active if it was inserted or bid with in the last 30 days.
    * Please contact your technical account manager if you need to change this.
    */
  var maximumActiveCreatives: js.UndefOr[Double] = js.native
  /**
    * The sum of all bidderLocation.maximumQps values cannot exceed this.
    * Please contact your technical account manager if you need to change this.
    */
  var maximumTotalQps: js.UndefOr[Double] = js.native
  /**
    * The number of creatives that this account inserted or bid with in the
    * last 30 days.
    */
  var numberActiveCreatives: js.UndefOr[Double] = js.native
}

object Schema$Account {
  @scala.inline
  def apply(
    applyPretargetingToNonGuaranteedDeals: js.UndefOr[Boolean] = js.undefined,
    bidderLocation: js.Array[Anon_BidProtocol] = null,
    cookieMatchingNid: String = null,
    cookieMatchingUrl: String = null,
    id: Int | Double = null,
    kind: String = null,
    maximumActiveCreatives: Int | Double = null,
    maximumTotalQps: Int | Double = null,
    numberActiveCreatives: Int | Double = null
  ): Schema$Account = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyPretargetingToNonGuaranteedDeals)) __obj.updateDynamic("applyPretargetingToNonGuaranteedDeals")(applyPretargetingToNonGuaranteedDeals.asInstanceOf[js.Any])
    if (bidderLocation != null) __obj.updateDynamic("bidderLocation")(bidderLocation.asInstanceOf[js.Any])
    if (cookieMatchingNid != null) __obj.updateDynamic("cookieMatchingNid")(cookieMatchingNid.asInstanceOf[js.Any])
    if (cookieMatchingUrl != null) __obj.updateDynamic("cookieMatchingUrl")(cookieMatchingUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maximumActiveCreatives != null) __obj.updateDynamic("maximumActiveCreatives")(maximumActiveCreatives.asInstanceOf[js.Any])
    if (maximumTotalQps != null) __obj.updateDynamic("maximumTotalQps")(maximumTotalQps.asInstanceOf[js.Any])
    if (numberActiveCreatives != null) __obj.updateDynamic("numberActiveCreatives")(numberActiveCreatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Account]
  }
}

