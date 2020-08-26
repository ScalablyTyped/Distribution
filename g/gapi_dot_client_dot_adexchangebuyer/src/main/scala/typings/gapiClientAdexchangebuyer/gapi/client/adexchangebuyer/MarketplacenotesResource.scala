package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.Oauthtoken
import typings.gapiClientAdexchangebuyer.anon.PqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplacenotesResource extends js.Object {
  /** Add notes to the proposal */
  def insert(request: Oauthtoken): Request[AddOrderNotesResponse] = js.native
  /** Get all the notes associated with a proposal */
  def list(request: PqlQuery): Request[GetOrderNotesResponse] = js.native
}

object MarketplacenotesResource {
  @scala.inline
  def apply(
    insert: Oauthtoken => Request[AddOrderNotesResponse],
    list: PqlQuery => Request[GetOrderNotesResponse]
  ): MarketplacenotesResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MarketplacenotesResource]
  }
  @scala.inline
  implicit class MarketplacenotesResourceOps[Self <: MarketplacenotesResource] (val x: Self) extends AnyVal {
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
    def setInsert(value: Oauthtoken => Request[AddOrderNotesResponse]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PqlQuery => Request[GetOrderNotesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

