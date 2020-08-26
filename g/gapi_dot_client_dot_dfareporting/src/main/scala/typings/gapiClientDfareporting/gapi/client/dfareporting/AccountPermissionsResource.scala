package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountPermissionsResource extends js.Object {
  /** Gets one account permission by ID. */
  def get(request: Fields): Request[AccountPermission] = js.native
  /** Retrieves the list of account permissions. */
  def list(request: Key): Request[AccountPermissionsListResponse] = js.native
}

object AccountPermissionsResource {
  @scala.inline
  def apply(get: Fields => Request[AccountPermission], list: Key => Request[AccountPermissionsListResponse]): AccountPermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountPermissionsResource]
  }
  @scala.inline
  implicit class AccountPermissionsResourceOps[Self <: AccountPermissionsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[AccountPermission]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[AccountPermissionsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

