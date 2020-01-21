package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonActiveAltFields
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: AnonAltFields): Request_[Account]
  /** Retrieves the list of accounts, possibly filtered. This method supports paging. */
  def list(request: AnonActiveAltFields): Request_[AccountsListResponse]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[Account]
  /** Updates an existing account. */
  def update(request: AnonAltFieldsKey): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[Account],
    list: AnonActiveAltFields => Request_[AccountsListResponse],
    patch: AnonAltFields => Request_[Account],
    update: AnonAltFieldsKey => Request_[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

