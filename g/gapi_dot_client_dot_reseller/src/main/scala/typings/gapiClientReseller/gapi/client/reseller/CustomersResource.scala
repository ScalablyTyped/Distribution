package typings.gapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientReseller.AnonCustomerAuthToken
import typings.gapiClientReseller.AnonCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: AnonCustomerId): Request_[Customer]
  /** Order a new customer's account. */
  def insert(request: AnonCustomerAuthToken): Request_[Customer]
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: AnonCustomerId): Request_[Customer]
  /** Update a customer account's settings. */
  def update(request: AnonCustomerId): Request_[Customer]
}

object CustomersResource {
  @scala.inline
  def apply(
    get: AnonCustomerId => Request_[Customer],
    insert: AnonCustomerAuthToken => Request_[Customer],
    patch: AnonCustomerId => Request_[Customer],
    update: AnonCustomerId => Request_[Customer]
  ): CustomersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomersResource]
  }
}

