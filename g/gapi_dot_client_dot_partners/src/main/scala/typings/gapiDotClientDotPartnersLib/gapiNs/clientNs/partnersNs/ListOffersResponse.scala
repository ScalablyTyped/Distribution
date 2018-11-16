package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListOffersResponse extends js.Object {
  /** Available Offers to be distributed. */
  var availableOffers: js.UndefOr[js.Array[AvailableOffer]] = js.undefined
  /** Reason why no Offers are available. */
  var noOfferReason: js.UndefOr[java.lang.String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

