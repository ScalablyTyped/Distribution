package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouduseraccounts.anon.Filter
import typings.gapiClientClouduseraccounts.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: Instance): Request[LinuxGetAuthorizedKeysViewResponse] = js.native
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: Filter): Request[LinuxGetLinuxAccountViewsResponse] = js.native
}

object LinuxResource {
  @scala.inline
  def apply(
    getAuthorizedKeysView: Instance => Request[LinuxGetAuthorizedKeysViewResponse],
    getLinuxAccountViews: Filter => Request[LinuxGetLinuxAccountViewsResponse]
  ): LinuxResource = {
    val __obj = js.Dynamic.literal(getAuthorizedKeysView = js.Any.fromFunction1(getAuthorizedKeysView), getLinuxAccountViews = js.Any.fromFunction1(getLinuxAccountViews))
    __obj.asInstanceOf[LinuxResource]
  }
  @scala.inline
  implicit class LinuxResourceOps[Self <: LinuxResource] (val x: Self) extends AnyVal {
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
    def setGetAuthorizedKeysView(value: Instance => Request[LinuxGetAuthorizedKeysViewResponse]): Self = this.set("getAuthorizedKeysView", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLinuxAccountViews(value: Filter => Request[LinuxGetLinuxAccountViewsResponse]): Self = this.set("getLinuxAccountViews", js.Any.fromFunction1(value))
  }
  
}

