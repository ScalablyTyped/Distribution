package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsInstance): gapiDotClientLib.gapiNs.clientNs.Request[LinuxGetAuthorizedKeysViewResponse]
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[LinuxGetLinuxAccountViewsResponse]
}

object LinuxResource {
  @scala.inline
  def apply(
    getAuthorizedKeysView: js.Function1[
      gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsInstance, 
      gapiDotClientLib.gapiNs.clientNs.Request[LinuxGetAuthorizedKeysViewResponse]
    ],
    getLinuxAccountViews: js.Function1[
      gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[LinuxGetLinuxAccountViewsResponse]
    ]
  ): LinuxResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAuthorizedKeysView")(getAuthorizedKeysView)
    __obj.updateDynamic("getLinuxAccountViews")(getLinuxAccountViews)
    __obj.asInstanceOf[LinuxResource]
  }
}

