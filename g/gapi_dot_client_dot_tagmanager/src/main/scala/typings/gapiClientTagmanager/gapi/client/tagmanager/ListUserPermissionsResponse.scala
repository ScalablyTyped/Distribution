package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserPermissionsResponse extends js.Object {
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** All GTM UserPermissions of a GTM Account. */
  var userPermission: js.UndefOr[js.Array[UserPermission]] = js.native
}

object ListUserPermissionsResponse {
  @scala.inline
  def apply(): ListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPermissionsResponse]
  }
  @scala.inline
  implicit class ListUserPermissionsResponseOps[Self <: ListUserPermissionsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setUserPermissionVarargs(value: UserPermission*): Self = this.set("userPermission", js.Array(value :_*))
    @scala.inline
    def setUserPermission(value: js.Array[UserPermission]): Self = this.set("userPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPermission: Self = this.set("userPermission", js.undefined)
  }
  
}

