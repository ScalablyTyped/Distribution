package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonCreativeStatusId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /**
    * List all details associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each detail.
    */
  def list(request: AnonCreativeStatusId): Request_[ListCreativeStatusBreakdownByDetailResponse]
}

object DetailsResource {
  @scala.inline
  def apply(list: AnonCreativeStatusId => Request_[ListCreativeStatusBreakdownByDetailResponse]): DetailsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DetailsResource]
  }
}

