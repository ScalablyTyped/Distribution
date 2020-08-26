package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Bearertoken
import typings.gapiClientPartners.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeadsResource extends js.Object {
  /** Creates an advertiser lead for the given company ID. */
  def create(request: Bearertoken): Request[CreateLeadResponse] = js.native
  /**
    * Lists advertiser leads for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: Callback): Request[ListLeadsResponse] = js.native
}

object LeadsResource {
  @scala.inline
  def apply(create: Bearertoken => Request[CreateLeadResponse], list: Callback => Request[ListLeadsResponse]): LeadsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LeadsResource]
  }
  @scala.inline
  implicit class LeadsResourceOps[Self <: LeadsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Bearertoken => Request[CreateLeadResponse]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListLeadsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

