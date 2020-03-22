package typings.gapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientVault.AnonAccesstoken
import typings.gapiClientVault.AnonAlt
import typings.gapiClientVault.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldsResource extends js.Object {
  var accounts: AccountsResource
  /** Creates a hold in the given matter. */
  def create(request: AnonAlt): Request_[Hold]
  /** Removes a hold by ID. This will release any HeldAccounts on this Hold. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a hold by ID. */
  def get(request: AnonAccesstoken): Request_[Hold]
  /**
    * Lists holds within a matter. An empty page token in ListHoldsResponse
    * denotes no more holds to list.
    */
  def list(request: AnonBearertoken): Request_[ListHoldsResponse]
  /**
    * Updates the OU and/or query parameters of a hold. You cannot add accounts
    * to a hold that covers an OU, nor can you add OUs to a hold that covers
    * individual accounts. Accounts listed in the hold will be ignored.
    */
  def update(request: AnonAccesstoken): Request_[Hold]
}

object HoldsResource {
  @scala.inline
  def apply(
    accounts: AccountsResource,
    create: AnonAlt => Request_[Hold],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[Hold],
    list: AnonBearertoken => Request_[ListHoldsResponse],
    update: AnonAccesstoken => Request_[Hold]
  ): HoldsResource = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HoldsResource]
  }
}

