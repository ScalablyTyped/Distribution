package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.Alt
import typings.gapiClientAdexchangebuyer.anon.ConfirmUnsafeAccountChange
import typings.gapiClientAdexchangebuyer.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: Alt): Request[Account]
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: Fields): Request[AccountsList]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: ConfirmUnsafeAccountChange): Request[Account]
  /** Updates an existing account. */
  def update(request: ConfirmUnsafeAccountChange): Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: Alt => Request[Account],
    list: Fields => Request[AccountsList],
    patch: ConfirmUnsafeAccountChange => Request[Account],
    update: ConfirmUnsafeAccountChange => Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountsResource]
  }
}

