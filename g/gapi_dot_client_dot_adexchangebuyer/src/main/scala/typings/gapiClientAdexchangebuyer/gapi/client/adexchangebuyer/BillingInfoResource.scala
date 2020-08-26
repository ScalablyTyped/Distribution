package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.AccountId
import typings.gapiClientAdexchangebuyer.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingInfoResource extends js.Object {
  /** Returns the billing information for one account specified by account ID. */
  def get(request: AccountId): Request[BillingInfo] = js.native
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(request: Fields): Request[BillingInfoList] = js.native
}

object BillingInfoResource {
  @scala.inline
  def apply(get: AccountId => Request[BillingInfo], list: Fields => Request[BillingInfoList]): BillingInfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BillingInfoResource]
  }
  @scala.inline
  implicit class BillingInfoResourceOps[Self <: BillingInfoResource] (val x: Self) extends AnyVal {
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
    def setGet(value: AccountId => Request[BillingInfo]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[BillingInfoList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

