package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrintInstance): gapiDotClientLib.gapiNs.clientNs.Request[LinuxGetAuthorizedKeysViewResponse]
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[LinuxGetLinuxAccountViewsResponse]
}

