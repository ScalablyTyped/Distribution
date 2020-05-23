package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouduseraccounts.anon.Filter
import typings.gapiClientClouduseraccounts.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: Instance): Request[LinuxGetAuthorizedKeysViewResponse]
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: Filter): Request[LinuxGetLinuxAccountViewsResponse]
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
}

