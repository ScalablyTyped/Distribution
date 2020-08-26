package typings.gapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request
import typings.gapiClientVault.anon.Accesstoken
import typings.gapiClientVault.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  /**
    * Adds a HeldAccount to a hold. Accounts can only be added to a hold that
    * has no held_org_unit set. Attempting to add an account to an OU-based
    * hold will result in an error.
    */
  def create(request: Accesstoken): Request[HeldAccount] = js.native
  /**
    * Removes a HeldAccount from a hold. If this request leaves the hold with
    * no held accounts, the hold will not apply to any accounts.
    */
  def delete(request: AccountId): Request[js.Object] = js.native
  /**
    * Lists HeldAccounts for a hold. This will only list individually specified
    * held accounts. If the hold is on an OU, then use
    * <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>
    * to enumerate its members.
    */
  def list(request: Accesstoken): Request[ListHeldAccountsResponse] = js.native
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
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Accesstoken => Request[HeldAccount]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: AccountId => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Accesstoken => Request[ListHeldAccountsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

