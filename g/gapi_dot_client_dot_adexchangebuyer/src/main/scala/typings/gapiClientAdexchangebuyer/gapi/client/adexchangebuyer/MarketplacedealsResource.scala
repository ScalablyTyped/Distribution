package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.Oauthtoken
import typings.gapiClientAdexchangebuyer.anon.PqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: Oauthtoken): Request[DeleteOrderDealsResponse]
  /** Add new deals for the specified proposal */
  def insert(request: Oauthtoken): Request[AddOrderDealsResponse]
  /** List all the deals for a given proposal */
  def list(request: PqlQuery): Request[GetOrderDealsResponse]
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: Oauthtoken): Request[EditAllOrderDealsResponse]
}

object MarketplacedealsResource {
  @scala.inline
  def apply(
    delete: Oauthtoken => Request[DeleteOrderDealsResponse],
    insert: Oauthtoken => Request[AddOrderDealsResponse],
    list: PqlQuery => Request[GetOrderDealsResponse],
    update: Oauthtoken => Request[EditAllOrderDealsResponse]
  ): MarketplacedealsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MarketplacedealsResource]
  }
}

