package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `ListRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The Roles defined on this resource. */
  var roles: js.UndefOr[js.Array[Role]] = js.native
}

object ListRolesResponse {
  @scala.inline
  def apply(): ListRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRolesResponse]
  }
  @scala.inline
  implicit class ListRolesResponseOps[Self <: ListRolesResponse] (val x: Self) extends AnyVal {
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
    def setRolesVarargs(value: Role*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[Role]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
  }
  
}

