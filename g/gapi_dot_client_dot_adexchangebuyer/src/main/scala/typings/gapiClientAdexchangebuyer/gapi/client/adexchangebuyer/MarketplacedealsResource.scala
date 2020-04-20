package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonOauthtoken
import typings.gapiClientAdexchangebuyer.AnonPqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: AnonOauthtoken): Request_[DeleteOrderDealsResponse]
  /** Add new deals for the specified proposal */
  def insert(request: AnonOauthtoken): Request_[AddOrderDealsResponse]
  /** List all the deals for a given proposal */
  def list(request: AnonPqlQuery): Request_[GetOrderDealsResponse]
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: AnonOauthtoken): Request_[EditAllOrderDealsResponse]
}

object MarketplacedealsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[DeleteOrderDealsResponse],
    insert: AnonOauthtoken => Request_[AddOrderDealsResponse],
    list: AnonPqlQuery => Request_[GetOrderDealsResponse],
    update: AnonOauthtoken => Request_[EditAllOrderDealsResponse]
  ): MarketplacedealsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MarketplacedealsResource]
  }
}

