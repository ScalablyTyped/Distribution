package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val billingAccounts: gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs.BillingAccountsResource = js.native
  val projects: gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs.ProjectsResource = js.native
  val services: gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs.ServicesResource = js.native
  /** Load Google Cloud Billing API v1 */
  def load(
    name: gapiDotClientDotCloudbillingLib.gapiDotClientDotCloudbillingLibStrings.cloudbilling,
    version: gapiDotClientDotCloudbillingLib.gapiDotClientDotCloudbillingLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotCloudbillingLib.gapiDotClientDotCloudbillingLibStrings.cloudbilling,
    version: gapiDotClientDotCloudbillingLib.gapiDotClientDotCloudbillingLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

