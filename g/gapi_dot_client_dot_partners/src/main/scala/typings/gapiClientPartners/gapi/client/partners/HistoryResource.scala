package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonEntireCompany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the Historical Offers for the current user (or user's entire company) */
  def list(request: AnonEntireCompany): Request_[ListOffersHistoryResponse]
}

object HistoryResource {
  @scala.inline
  def apply(list: AnonEntireCompany => Request_[ListOffersHistoryResponse]): HistoryResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[HistoryResource]
  }
}

