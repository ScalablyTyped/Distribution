package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the Historical Offers for the current user (or user's entire company) */
  def list(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackEntireCompany): gapiDotClientLib.gapiNs.clientNs.Request[ListOffersHistoryResponse]
}

object HistoryResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackEntireCompany, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListOffersHistoryResponse]
    ]
  ): HistoryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[HistoryResource]
  }
}

