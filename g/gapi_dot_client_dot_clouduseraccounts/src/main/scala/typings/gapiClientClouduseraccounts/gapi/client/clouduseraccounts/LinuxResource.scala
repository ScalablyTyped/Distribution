package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouduseraccounts.AnonAltFieldsFilter
import typings.gapiClientClouduseraccounts.AnonAltFieldsInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: AnonAltFieldsInstance): Request_[LinuxGetAuthorizedKeysViewResponse]
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: AnonAltFieldsFilter): Request_[LinuxGetLinuxAccountViewsResponse]
}

object LinuxResource {
  @scala.inline
  def apply(
    getAuthorizedKeysView: AnonAltFieldsInstance => Request_[LinuxGetAuthorizedKeysViewResponse],
    getLinuxAccountViews: AnonAltFieldsFilter => Request_[LinuxGetLinuxAccountViewsResponse]
  ): LinuxResource = {
    val __obj = js.Dynamic.literal(getAuthorizedKeysView = js.Any.fromFunction1(getAuthorizedKeysView), getLinuxAccountViews = js.Any.fromFunction1(getLinuxAccountViews))
  
    __obj.asInstanceOf[LinuxResource]
  }
}

