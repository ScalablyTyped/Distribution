package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOffersResponse extends js.Object {
  /** Available Offers to be distributed. */
  var availableOffers: js.UndefOr[js.Array[AvailableOffer]] = js.undefined
  /** Reason why no Offers are available. */
  var noOfferReason: js.UndefOr[String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

object ListOffersResponse {
  @scala.inline
  def apply(
    availableOffers: js.Array[AvailableOffer] = null,
    noOfferReason: String = null,
    responseMetadata: ResponseMetadata = null
  ): ListOffersResponse = {
    val __obj = js.Dynamic.literal()
    if (availableOffers != null) __obj.updateDynamic("availableOffers")(availableOffers.asInstanceOf[js.Any])
    if (noOfferReason != null) __obj.updateDynamic("noOfferReason")(noOfferReason.asInstanceOf[js.Any])
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOffersResponse]
  }
}

