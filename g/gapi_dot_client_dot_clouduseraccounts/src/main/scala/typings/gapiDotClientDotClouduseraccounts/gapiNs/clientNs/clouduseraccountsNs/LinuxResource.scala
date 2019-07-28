package typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsFilter
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: Anon_AltFieldsInstance): Request[LinuxGetAuthorizedKeysViewResponse]
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: Anon_AltFieldsFilter): Request[LinuxGetLinuxAccountViewsResponse]
}

object LinuxResource {
  @scala.inline
  def apply(
    getAuthorizedKeysView: Anon_AltFieldsInstance => Request[LinuxGetAuthorizedKeysViewResponse],
    getLinuxAccountViews: Anon_AltFieldsFilter => Request[LinuxGetLinuxAccountViewsResponse]
  ): LinuxResource = {
    val __obj = js.Dynamic.literal(getAuthorizedKeysView = js.Any.fromFunction1(getAuthorizedKeysView), getLinuxAccountViews = js.Any.fromFunction1(getLinuxAccountViews))
  
    __obj.asInstanceOf[LinuxResource]
  }
}

