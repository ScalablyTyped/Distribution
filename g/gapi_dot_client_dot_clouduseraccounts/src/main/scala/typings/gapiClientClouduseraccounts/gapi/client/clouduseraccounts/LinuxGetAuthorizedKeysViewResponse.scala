package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxGetAuthorizedKeysViewResponse extends js.Object {
  /** [Output Only] A list of authorized public keys for a user. */
  var resource: js.UndefOr[AuthorizedKeysView] = js.native
}

object LinuxGetAuthorizedKeysViewResponse {
  @scala.inline
  def apply(): LinuxGetAuthorizedKeysViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxGetAuthorizedKeysViewResponse]
  }
  @scala.inline
  implicit class LinuxGetAuthorizedKeysViewResponseOps[Self <: LinuxGetAuthorizedKeysViewResponse] (val x: Self) extends AnyVal {
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
    def setResource(value: AuthorizedKeysView): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

