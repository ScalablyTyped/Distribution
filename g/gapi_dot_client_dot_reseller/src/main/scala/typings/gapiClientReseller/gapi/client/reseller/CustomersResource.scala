package typings.gapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientReseller.anon.CustomerAuthToken
import typings.gapiClientReseller.anon.CustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: CustomerId): Request[Customer] = js.native
  /** Order a new customer's account. */
  def insert(request: CustomerAuthToken): Request[Customer] = js.native
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: CustomerId): Request[Customer] = js.native
  /** Update a customer account's settings. */
  def update(request: CustomerId): Request[Customer] = js.native
}

object CustomersResource {
  @scala.inline
  def apply(
    get: CustomerId => Request[Customer],
    insert: CustomerAuthToken => Request[Customer],
    patch: CustomerId => Request[Customer],
    update: CustomerId => Request[Customer]
  ): CustomersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomersResource]
  }
  @scala.inline
  implicit class CustomersResourceOps[Self <: CustomersResource] (val x: Self) extends AnyVal {
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
    def setGet(value: CustomerId => Request[Customer]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: CustomerAuthToken => Request[Customer]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: CustomerId => Request[Customer]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: CustomerId => Request[Customer]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

