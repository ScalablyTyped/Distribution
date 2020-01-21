package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsIds
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubaccountsResource extends js.Object {
  /** Gets one subaccount by ID. */
  def get(request: AnonAltFields): Request_[Subaccount]
  /** Inserts a new subaccount. */
  def insert(request: AnonAltFieldsKey): Request_[Subaccount]
  /** Gets a list of subaccounts, possibly filtered. This method supports paging. */
  def list(request: AnonAltFieldsIds): Request_[SubaccountsListResponse]
  /** Updates an existing subaccount. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[Subaccount]
  /** Updates an existing subaccount. */
  def update(request: AnonAltFieldsKey): Request_[Subaccount]
}

object SubaccountsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[Subaccount],
    insert: AnonAltFieldsKey => Request_[Subaccount],
    list: AnonAltFieldsIds => Request_[SubaccountsListResponse],
    patch: AnonAltFields => Request_[Subaccount],
    update: AnonAltFieldsKey => Request_[Subaccount]
  ): SubaccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SubaccountsResource]
  }
}

