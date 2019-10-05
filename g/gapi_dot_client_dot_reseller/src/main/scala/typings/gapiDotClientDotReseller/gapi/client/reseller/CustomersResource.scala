package typings.gapiDotClientDotReseller.gapi.client.reseller

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotReseller.Anon_AltCustomerAuthToken
import typings.gapiDotClientDotReseller.Anon_AltCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: Anon_AltCustomerId): Request[Customer]
  /** Order a new customer's account. */
  def insert(request: Anon_AltCustomerAuthToken): Request[Customer]
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: Anon_AltCustomerId): Request[Customer]
  /** Update a customer account's settings. */
  def update(request: Anon_AltCustomerId): Request[Customer]
}

object CustomersResource {
  @scala.inline
  def apply(
    get: Anon_AltCustomerId => Request[Customer],
    insert: Anon_AltCustomerAuthToken => Request[Customer],
    patch: Anon_AltCustomerId => Request[Customer],
    update: Anon_AltCustomerId => Request[Customer]
  ): CustomersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomersResource]
  }
}

