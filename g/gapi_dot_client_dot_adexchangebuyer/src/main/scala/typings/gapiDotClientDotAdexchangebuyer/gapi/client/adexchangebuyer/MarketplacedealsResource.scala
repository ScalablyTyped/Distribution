package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKey
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: Anon_AltFieldsKey): Request[DeleteOrderDealsResponse]
  /** Add new deals for the specified proposal */
  def insert(request: Anon_AltFieldsKey): Request[AddOrderDealsResponse]
  /** List all the deals for a given proposal */
  def list(request: Anon_AltFieldsKeyOauthtoken): Request[GetOrderDealsResponse]
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: Anon_AltFieldsKey): Request[EditAllOrderDealsResponse]
}

object MarketplacedealsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKey => Request[DeleteOrderDealsResponse],
    insert: Anon_AltFieldsKey => Request[AddOrderDealsResponse],
    list: Anon_AltFieldsKeyOauthtoken => Request[GetOrderDealsResponse],
    update: Anon_AltFieldsKey => Request[EditAllOrderDealsResponse]
  ): MarketplacedealsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MarketplacedealsResource]
  }
}

