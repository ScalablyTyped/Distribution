package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubaccountsResource extends js.Object {
  /** Gets one subaccount by ID. */
  def get(request: Fields): Request[Subaccount]
  /** Inserts a new subaccount. */
  def insert(request: Key): Request[Subaccount]
  /** Gets a list of subaccounts, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[SubaccountsListResponse]
  /** Updates an existing subaccount. This method supports patch semantics. */
  def patch(request: Fields): Request[Subaccount]
  /** Updates an existing subaccount. */
  def update(request: Key): Request[Subaccount]
}

object SubaccountsResource {
  @scala.inline
  def apply(
    get: Fields => Request[Subaccount],
    insert: Key => Request[Subaccount],
    list: Oauthtoken => Request[SubaccountsListResponse],
    patch: Fields => Request[Subaccount],
    update: Key => Request[Subaccount]
  ): SubaccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SubaccountsResource]
  }
}

