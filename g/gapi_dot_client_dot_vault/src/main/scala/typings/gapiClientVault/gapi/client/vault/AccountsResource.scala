package typings.gapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientVault.AnonAccesstoken
import typings.gapiClientVault.AnonAccesstokenAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /**
    * Adds a HeldAccount to a hold. Accounts can only be added to a hold that
    * has no held_org_unit set. Attempting to add an account to an OU-based
    * hold will result in an error.
    */
  def create(request: AnonAccesstoken): Request_[HeldAccount]
  /**
    * Removes a HeldAccount from a hold. If this request leaves the hold with
    * no held accounts, the hold will not apply to any accounts.
    */
  def delete(request: AnonAccesstokenAccountId): Request_[js.Object]
  /**
    * Lists HeldAccounts for a hold. This will only list individually specified
    * held accounts. If the hold is on an OU, then use
    * <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>
    * to enumerate its members.
    */
  def list(request: AnonAccesstoken): Request_[ListHeldAccountsResponse]
}

object AccountsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[HeldAccount],
    delete: AnonAccesstokenAccountId => Request_[js.Object],
    list: AnonAccesstoken => Request_[ListHeldAccountsResponse]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

