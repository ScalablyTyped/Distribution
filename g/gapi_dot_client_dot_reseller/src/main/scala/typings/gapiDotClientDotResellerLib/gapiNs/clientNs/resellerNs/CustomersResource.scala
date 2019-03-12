package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: gapiDotClientDotResellerLib.Anon_AltCustomerId): gapiDotClientLib.gapiNs.clientNs.Request[Customer]
  /** Order a new customer's account. */
  def insert(request: gapiDotClientDotResellerLib.Anon_AltCustomerAuthToken): gapiDotClientLib.gapiNs.clientNs.Request[Customer]
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: gapiDotClientDotResellerLib.Anon_AltCustomerId): gapiDotClientLib.gapiNs.clientNs.Request[Customer]
  /** Update a customer account's settings. */
  def update(request: gapiDotClientDotResellerLib.Anon_AltCustomerId): gapiDotClientLib.gapiNs.clientNs.Request[Customer]
}

object CustomersResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotResellerLib.Anon_AltCustomerId => gapiDotClientLib.gapiNs.clientNs.Request[Customer],
    insert: gapiDotClientDotResellerLib.Anon_AltCustomerAuthToken => gapiDotClientLib.gapiNs.clientNs.Request[Customer],
    patch: gapiDotClientDotResellerLib.Anon_AltCustomerId => gapiDotClientLib.gapiNs.clientNs.Request[Customer],
    update: gapiDotClientDotResellerLib.Anon_AltCustomerId => gapiDotClientLib.gapiNs.clientNs.Request[Customer]
  ): CustomersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomersResource]
  }
}

