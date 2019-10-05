package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_Alt
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltConfirmUnsafeAccountChange
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: Anon_Alt): Request[Account]
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: Anon_AltFields): Request[AccountsList]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: Anon_AltConfirmUnsafeAccountChange): Request[Account]
  /** Updates an existing account. */
  def update(request: Anon_AltConfirmUnsafeAccountChange): Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: Anon_Alt => Request[Account],
    list: Anon_AltFields => Request[AccountsList],
    patch: Anon_AltConfirmUnsafeAccountChange => Request[Account],
    update: Anon_AltConfirmUnsafeAccountChange => Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

