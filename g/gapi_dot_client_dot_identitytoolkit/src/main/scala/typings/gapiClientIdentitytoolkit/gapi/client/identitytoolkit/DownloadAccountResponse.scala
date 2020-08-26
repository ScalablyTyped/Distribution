package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadAccountResponse extends js.Object {
  /** The fixed string "identitytoolkit#DownloadAccountResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The next page token. To be used in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The user accounts data. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.native
}

object DownloadAccountResponse {
  @scala.inline
  def apply(): DownloadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadAccountResponse]
  }
  @scala.inline
  implicit class DownloadAccountResponseOps[Self <: DownloadAccountResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setUsersVarargs(value: UserInfo*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[UserInfo]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

