package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: Fields): Request[Account]
  /** Retrieves the list of accounts, possibly filtered. This method supports paging. */
  def list(request: MaxResults): Request[AccountsListResponse]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: Fields): Request[Account]
  /** Updates an existing account. */
  def update(request: Key): Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: Fields => Request[Account],
    list: MaxResults => Request[AccountsListResponse],
    patch: Fields => Request[Account],
    update: Key => Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountsResource]
  }
}

