package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var containers: ContainersResource = js.native
  var user_permissions: UserPermissionsResource = js.native
  /** Gets a GTM Account. */
  def get(request: Fields): Request[Account] = js.native
  /** Lists all GTM Accounts that a user has access to. */
  def list(request: QuotaUser): Request[ListAccountsResponse] = js.native
  /** Updates a GTM Account. */
  def update(request: Fingerprint): Request[Account] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    containers: ContainersResource,
    get: Fields => Request[Account],
    list: QuotaUser => Request[ListAccountsResponse],
    update: Fingerprint => Request[Account],
    user_permissions: UserPermissionsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), user_permissions = user_permissions.asInstanceOf[js.Any])
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
    def setContainers(value: ContainersResource): Self = this.set("containers", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Fields => Request[Account]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: QuotaUser => Request[ListAccountsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fingerprint => Request[Account]): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUser_permissions(value: UserPermissionsResource): Self = this.set("user_permissions", value.asInstanceOf[js.Any])
  }
  
}

