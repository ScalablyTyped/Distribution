package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceLabel extends js.Object {
  /** The accountId of the party that created the label. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The creation time (in ms since epoch) for the label. */
  var createTimeMs: js.UndefOr[String] = js.undefined
  /** Information about the party that created the label. */
  var deprecatedMarketplaceDealParty: js.UndefOr[MarketplaceDealParty] = js.undefined
  /** The label to use. */
  var label: js.UndefOr[String] = js.undefined
}

object MarketplaceLabel {
  @scala.inline
  def apply(
    accountId: String = null,
    createTimeMs: String = null,
    deprecatedMarketplaceDealParty: MarketplaceDealParty = null,
    label: String = null
  ): MarketplaceLabel = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (createTimeMs != null) __obj.updateDynamic("createTimeMs")(createTimeMs.asInstanceOf[js.Any])
    if (deprecatedMarketplaceDealParty != null) __obj.updateDynamic("deprecatedMarketplaceDealParty")(deprecatedMarketplaceDealParty.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketplaceLabel]
  }
}

