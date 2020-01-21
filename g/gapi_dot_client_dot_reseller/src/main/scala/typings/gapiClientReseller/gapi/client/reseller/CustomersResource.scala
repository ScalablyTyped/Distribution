package typings.gapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientReseller.AnonAltCustomerAuthToken
import typings.gapiClientReseller.AnonAltCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: AnonAltCustomerId): Request_[Customer]
  /** Order a new customer's account. */
  def insert(request: AnonAltCustomerAuthToken): Request_[Customer]
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: AnonAltCustomerId): Request_[Customer]
  /** Update a customer account's settings. */
  def update(request: AnonAltCustomerId): Request_[Customer]
}

object CustomersResource {
  @scala.inline
  def apply(
    get: AnonAltCustomerId => Request_[Customer],
    insert: AnonAltCustomerAuthToken => Request_[Customer],
    patch: AnonAltCustomerId => Request_[Customer],
    update: AnonAltCustomerId => Request_[Customer]
  ): CustomersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomersResource]
  }
}

