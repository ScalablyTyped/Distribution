package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAlt
import typings.gapiClientAdexchangebuyer.AnonAltConfirmUnsafeAccountChange
import typings.gapiClientAdexchangebuyer.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: AnonAlt): Request_[Account]
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: AnonAltFields): Request_[AccountsList]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: AnonAltConfirmUnsafeAccountChange): Request_[Account]
  /** Updates an existing account. */
  def update(request: AnonAltConfirmUnsafeAccountChange): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[Account],
    list: AnonAltFields => Request_[AccountsList],
    patch: AnonAltConfirmUnsafeAccountChange => Request_[Account],
    update: AnonAltConfirmUnsafeAccountChange => Request_[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

