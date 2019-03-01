package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceLabel extends js.Object {
  /** The accountId of the party that created the label. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The creation time (in ms since epoch) for the label. */
  var createTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the party that created the label. */
  var deprecatedMarketplaceDealParty: js.UndefOr[MarketplaceDealParty] = js.undefined
  /** The label to use. */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object MarketplaceLabel {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    createTimeMs: java.lang.String = null,
    deprecatedMarketplaceDealParty: MarketplaceDealParty = null,
    label: java.lang.String = null
  ): MarketplaceLabel = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (createTimeMs != null) __obj.updateDynamic("createTimeMs")(createTimeMs)
    if (deprecatedMarketplaceDealParty != null) __obj.updateDynamic("deprecatedMarketplaceDealParty")(deprecatedMarketplaceDealParty)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[MarketplaceLabel]
  }
}

