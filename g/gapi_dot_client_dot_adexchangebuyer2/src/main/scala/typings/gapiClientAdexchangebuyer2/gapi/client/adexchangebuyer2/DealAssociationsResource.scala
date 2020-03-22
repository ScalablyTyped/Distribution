package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonCreativeId
import typings.gapiClientAdexchangebuyer2.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealAssociationsResource extends js.Object {
  /** Associate an existing deal with a creative. */
  def add(request: AnonCreativeId): Request_[js.Object]
  /** List all creative-deal associations. */
  def list(request: AnonKey): Request_[ListDealAssociationsResponse]
  /** Remove the association between a deal and a creative. */
  def remove(request: AnonCreativeId): Request_[js.Object]
}

object DealAssociationsResource {
  @scala.inline
  def apply(
    add: AnonCreativeId => Request_[js.Object],
    list: AnonKey => Request_[ListDealAssociationsResponse],
    remove: AnonCreativeId => Request_[js.Object]
  ): DealAssociationsResource = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[DealAssociationsResource]
  }
}

