package typings.gapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientReseller.anon.CustomerAuthToken
import typings.gapiClientReseller.anon.CustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: CustomerId): Request[Customer]
  /** Order a new customer's account. */
  def insert(request: CustomerAuthToken): Request[Customer]
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: CustomerId): Request[Customer]
  /** Update a customer account's settings. */
  def update(request: CustomerId): Request[Customer]
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
}

