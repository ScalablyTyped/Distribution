package typings.gapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request
import typings.gapiClientVault.anon.Accesstoken
import typings.gapiClientVault.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /**
    * Adds a HeldAccount to a hold. Accounts can only be added to a hold that
    * has no held_org_unit set. Attempting to add an account to an OU-based
    * hold will result in an error.
    */
  def create(request: Accesstoken): Request[HeldAccount]
  /**
    * Removes a HeldAccount from a hold. If this request leaves the hold with
    * no held accounts, the hold will not apply to any accounts.
    */
  def delete(request: AccountId): Request[js.Object]
  /**
    * Lists HeldAccounts for a hold. This will only list individually specified
    * held accounts. If the hold is on an OU, then use
    * <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>
    * to enumerate its members.
    */
  def list(request: Accesstoken): Request[ListHeldAccountsResponse]
}

object AccountsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[HeldAccount],
    delete: AccountId => Request[js.Object],
    list: Accesstoken => Request[ListHeldAccountsResponse]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountsResource]
  }
}

