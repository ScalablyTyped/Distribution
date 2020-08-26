package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermission
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountPermissionsCollection extends js.Object {
  // Gets one account permission by ID.
  def get(profileId: String, id: String): AccountPermission = js.native
  // Retrieves the list of account permissions.
  def list(profileId: String): AccountPermissionsListResponse = js.native
}

object AccountPermissionsCollection {
  @scala.inline
  def apply(get: (String, String) => AccountPermission, list: String => AccountPermissionsListResponse): AccountPermissionsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountPermissionsCollection]
  }
  @scala.inline
  implicit class AccountPermissionsCollectionOps[Self <: AccountPermissionsCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => AccountPermission): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => AccountPermissionsListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

