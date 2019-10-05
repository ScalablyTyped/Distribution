package typings.gapiDotClientDotVault.gapi.client.vault

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotVault.Anon_Accesstoken
import typings.gapiDotClientDotVault.Anon_AccesstokenAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /**
    * Adds a HeldAccount to a hold. Accounts can only be added to a hold that
    * has no held_org_unit set. Attempting to add an account to an OU-based
    * hold will result in an error.
    */
  def create(request: Anon_Accesstoken): Request[HeldAccount]
  /**
    * Removes a HeldAccount from a hold. If this request leaves the hold with
    * no held accounts, the hold will not apply to any accounts.
    */
  def delete(request: Anon_AccesstokenAccountId): Request[js.Object]
  /**
    * Lists HeldAccounts for a hold. This will only list individually specified
    * held accounts. If the hold is on an OU, then use
    * <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>
    * to enumerate its members.
    */
  def list(request: Anon_Accesstoken): Request[ListHeldAccountsResponse]
}

object AccountsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[HeldAccount],
    delete: Anon_AccesstokenAccountId => Request[js.Object],
    list: Anon_Accesstoken => Request[ListHeldAccountsResponse]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

