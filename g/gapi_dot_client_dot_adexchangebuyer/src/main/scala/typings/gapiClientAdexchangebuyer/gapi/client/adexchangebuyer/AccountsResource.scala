package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAlt
import typings.gapiClientAdexchangebuyer.AnonConfirmUnsafeAccountChange
import typings.gapiClientAdexchangebuyer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: AnonAlt): Request_[Account]
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: AnonFields): Request_[AccountsList]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: AnonConfirmUnsafeAccountChange): Request_[Account]
  /** Updates an existing account. */
  def update(request: AnonConfirmUnsafeAccountChange): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[Account],
    list: AnonFields => Request_[AccountsList],
    patch: AnonConfirmUnsafeAccountChange => Request_[Account],
    update: AnonConfirmUnsafeAccountChange => Request_[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountsResource]
  }
}

