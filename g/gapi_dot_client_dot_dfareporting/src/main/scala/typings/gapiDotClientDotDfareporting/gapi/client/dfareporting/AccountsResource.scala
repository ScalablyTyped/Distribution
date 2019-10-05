package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_ActiveAltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: Anon_AltFields): Request[Account]
  /** Retrieves the list of accounts, possibly filtered. This method supports paging. */
  def list(request: Anon_ActiveAltFields): Request[AccountsListResponse]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Account]
  /** Updates an existing account. */
  def update(request: Anon_AltFieldsKey): Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[Account],
    list: Anon_ActiveAltFields => Request[AccountsListResponse],
    patch: Anon_AltFields => Request[Account],
    update: Anon_AltFieldsKey => Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

