package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** Your bidder locations that have distinct URLs. */
  var bidderLocation: js.UndefOr[js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_BidProtocol]] = js.undefined
  /** The nid parameter value used in cookie match requests. Please contact your technical account manager if you need to change this. */
  var cookieMatchingNid: js.UndefOr[java.lang.String] = js.undefined
  /** The base URL used in cookie match requests. */
  var cookieMatchingUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Account id. */
  var id: js.UndefOr[scala.Double] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of active creatives that an account can have, where a creative is active if it was inserted or bid with in the last 30 days. Please
    * contact your technical account manager if you need to change this.
    */
  var maximumActiveCreatives: js.UndefOr[scala.Double] = js.undefined
  /** The sum of all bidderLocation.maximumQps values cannot exceed this. Please contact your technical account manager if you need to change this. */
  var maximumTotalQps: js.UndefOr[scala.Double] = js.undefined
  /** The number of creatives that this account inserted or bid with in the last 30 days. */
  var numberActiveCreatives: js.UndefOr[scala.Double] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    bidderLocation: js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_BidProtocol] = null,
    cookieMatchingNid: java.lang.String = null,
    cookieMatchingUrl: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    maximumActiveCreatives: scala.Int | scala.Double = null,
    maximumTotalQps: scala.Int | scala.Double = null,
    numberActiveCreatives: scala.Int | scala.Double = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (bidderLocation != null) __obj.updateDynamic("bidderLocation")(bidderLocation)
    if (cookieMatchingNid != null) __obj.updateDynamic("cookieMatchingNid")(cookieMatchingNid)
    if (cookieMatchingUrl != null) __obj.updateDynamic("cookieMatchingUrl")(cookieMatchingUrl)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maximumActiveCreatives != null) __obj.updateDynamic("maximumActiveCreatives")(maximumActiveCreatives.asInstanceOf[js.Any])
    if (maximumTotalQps != null) __obj.updateDynamic("maximumTotalQps")(maximumTotalQps.asInstanceOf[js.Any])
    if (numberActiveCreatives != null) __obj.updateDynamic("numberActiveCreatives")(numberActiveCreatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

