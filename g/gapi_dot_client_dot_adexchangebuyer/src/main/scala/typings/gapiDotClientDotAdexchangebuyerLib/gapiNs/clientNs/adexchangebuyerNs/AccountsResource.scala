package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccountsList]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltConfirmUnsafeAccountChange): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** Updates an existing account. */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltConfirmUnsafeAccountChange): gapiDotClientLib.gapiNs.clientNs.Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAdexchangebuyerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Account],
    list: gapiDotClientDotAdexchangebuyerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[AccountsList],
    patch: gapiDotClientDotAdexchangebuyerLib.Anon_AltConfirmUnsafeAccountChange => gapiDotClientLib.gapiNs.clientNs.Request[Account],
    update: gapiDotClientDotAdexchangebuyerLib.Anon_AltConfirmUnsafeAccountChange => gapiDotClientLib.gapiNs.clientNs.Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

