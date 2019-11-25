package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptIns extends js.Object {
  /**
    * An opt-in about receiving email from Partners marketing teams. Includes
    * member-only events and special promotional offers for Google products.
    */
  var marketComm: js.UndefOr[Boolean] = js.undefined
  /**
    * An opt-in about receiving email with customized AdWords campaign management
    * tips.
    */
  var performanceSuggestions: js.UndefOr[Boolean] = js.undefined
  /** An opt-in to allow recieivng phone calls about their Partners account. */
  var phoneContact: js.UndefOr[Boolean] = js.undefined
  /** An opt-in to receive special promotional gifts and material in the mail. */
  var physicalMail: js.UndefOr[Boolean] = js.undefined
  /** An opt-in about receiving email regarding new features and products. */
  var specialOffers: js.UndefOr[Boolean] = js.undefined
}

object OptIns {
  @scala.inline
  def apply(
    marketComm: js.UndefOr[Boolean] = js.undefined,
    performanceSuggestions: js.UndefOr[Boolean] = js.undefined,
    phoneContact: js.UndefOr[Boolean] = js.undefined,
    physicalMail: js.UndefOr[Boolean] = js.undefined,
    specialOffers: js.UndefOr[Boolean] = js.undefined
  ): OptIns = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(marketComm)) __obj.updateDynamic("marketComm")(marketComm.asInstanceOf[js.Any])
    if (!js.isUndefined(performanceSuggestions)) __obj.updateDynamic("performanceSuggestions")(performanceSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(phoneContact)) __obj.updateDynamic("phoneContact")(phoneContact.asInstanceOf[js.Any])
    if (!js.isUndefined(physicalMail)) __obj.updateDynamic("physicalMail")(physicalMail.asInstanceOf[js.Any])
    if (!js.isUndefined(specialOffers)) __obj.updateDynamic("specialOffers")(specialOffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptIns]
  }
}

