package typings.gapiDotClientDotPartners.gapi.client.partners

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffersResource extends js.Object {
  var history: HistoryResource
  /** Lists the Offers available for the current user */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListOffersResponse]
}

object OffersResource {
  @scala.inline
  def apply(
    history: HistoryResource,
    list: Anon_AccesstokenAltBearertokenCallbackFields => Request[ListOffersResponse]
  ): OffersResource = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OffersResource]
  }
}

