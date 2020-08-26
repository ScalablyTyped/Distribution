package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.Oauthtoken
import typings.gapiClientAdexchangebuyer.anon.PqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: Oauthtoken): Request[DeleteOrderDealsResponse] = js.native
  /** Add new deals for the specified proposal */
  def insert(request: Oauthtoken): Request[AddOrderDealsResponse] = js.native
  /** List all the deals for a given proposal */
  def list(request: PqlQuery): Request[GetOrderDealsResponse] = js.native
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: Oauthtoken): Request[EditAllOrderDealsResponse] = js.native
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
  @scala.inline
  implicit class MarketplacedealsResourceOps[Self <: MarketplacedealsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Oauthtoken => Request[DeleteOrderDealsResponse]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Oauthtoken => Request[AddOrderDealsResponse]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PqlQuery => Request[GetOrderDealsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[EditAllOrderDealsResponse]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

