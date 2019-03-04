package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffersResource extends js.Object {
  var history: HistoryResource
  /** Lists the Offers available for the current user */
  def list(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListOffersResponse]
}

object OffersResource {
  @scala.inline
  def apply(
    history: HistoryResource,
    list: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListOffersResponse]
    ]
  ): OffersResource = {
    val __obj = js.Dynamic.literal(history = history, list = list)
  
    __obj.asInstanceOf[OffersResource]
  }
}

