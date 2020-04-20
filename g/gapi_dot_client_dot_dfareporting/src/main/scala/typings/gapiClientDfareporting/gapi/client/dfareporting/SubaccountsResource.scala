package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubaccountsResource extends js.Object {
  /** Gets one subaccount by ID. */
  def get(request: AnonFields): Request_[Subaccount]
  /** Inserts a new subaccount. */
  def insert(request: AnonKey): Request_[Subaccount]
  /** Gets a list of subaccounts, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[SubaccountsListResponse]
  /** Updates an existing subaccount. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Subaccount]
  /** Updates an existing subaccount. */
  def update(request: AnonKey): Request_[Subaccount]
}

object SubaccountsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Subaccount],
    insert: AnonKey => Request_[Subaccount],
    list: AnonOauthtoken => Request_[SubaccountsListResponse],
    patch: AnonFields => Request_[Subaccount],
    update: AnonKey => Request_[Subaccount]
  ): SubaccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SubaccountsResource]
  }
}

