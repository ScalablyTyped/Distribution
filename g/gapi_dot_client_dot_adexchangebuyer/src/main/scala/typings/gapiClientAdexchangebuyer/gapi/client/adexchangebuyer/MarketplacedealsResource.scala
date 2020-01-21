package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKey
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: AnonAltFieldsKey): Request_[DeleteOrderDealsResponse]
  /** Add new deals for the specified proposal */
  def insert(request: AnonAltFieldsKey): Request_[AddOrderDealsResponse]
  /** List all the deals for a given proposal */
  def list(request: AnonAltFieldsKeyOauthtoken): Request_[GetOrderDealsResponse]
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: AnonAltFieldsKey): Request_[EditAllOrderDealsResponse]
}

object MarketplacedealsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKey => Request_[DeleteOrderDealsResponse],
    insert: AnonAltFieldsKey => Request_[AddOrderDealsResponse],
    list: AnonAltFieldsKeyOauthtoken => Request_[GetOrderDealsResponse],
    update: AnonAltFieldsKey => Request_[EditAllOrderDealsResponse]
  ): MarketplacedealsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MarketplacedealsResource]
  }
}

