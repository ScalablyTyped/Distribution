package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: AnonFields): Request_[Account]
  /** Retrieves the list of accounts, possibly filtered. This method supports paging. */
  def list(request: AnonMaxResults): Request_[AccountsListResponse]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Account]
  /** Updates an existing account. */
  def update(request: AnonKey): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Account],
    list: AnonMaxResults => Request_[AccountsListResponse],
    patch: AnonFields => Request_[Account],
    update: AnonKey => Request_[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

