package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIds
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubaccountsResource extends js.Object {
  /** Gets one subaccount by ID. */
  def get(request: Anon_AltFields): Request[Subaccount]
  /** Inserts a new subaccount. */
  def insert(request: Anon_AltFieldsKey): Request[Subaccount]
  /** Gets a list of subaccounts, possibly filtered. This method supports paging. */
  def list(request: Anon_AltFieldsIds): Request[SubaccountsListResponse]
  /** Updates an existing subaccount. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Subaccount]
  /** Updates an existing subaccount. */
  def update(request: Anon_AltFieldsKey): Request[Subaccount]
}

object SubaccountsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[Subaccount],
    insert: Anon_AltFieldsKey => Request[Subaccount],
    list: Anon_AltFieldsIds => Request[SubaccountsListResponse],
    patch: Anon_AltFields => Request[Subaccount],
    update: Anon_AltFieldsKey => Request[Subaccount]
  ): SubaccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SubaccountsResource]
  }
}

