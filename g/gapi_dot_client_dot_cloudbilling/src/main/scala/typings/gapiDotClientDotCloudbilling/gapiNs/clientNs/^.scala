package typings.gapiDotClientDotCloudbilling.gapiNs.clientNs

import typings.gapiDotClientDotCloudbilling.gapiDotClientDotCloudbillingStrings.cloudbilling
import typings.gapiDotClientDotCloudbilling.gapiDotClientDotCloudbillingStrings.v1
import typings.gapiDotClientDotCloudbilling.gapiNs.clientNs.cloudbillingNs.BillingAccountsResource
import typings.gapiDotClientDotCloudbilling.gapiNs.clientNs.cloudbillingNs.ProjectsResource
import typings.gapiDotClientDotCloudbilling.gapiNs.clientNs.cloudbillingNs.ServicesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val billingAccounts: BillingAccountsResource = js.native
  val projects: ProjectsResource = js.native
  val services: ServicesResource = js.native
  /** Load Google Cloud Billing API v1 */
  def load(name: cloudbilling, version: v1): js.Thenable[Unit] = js.native
  def load(name: cloudbilling, version: v1, callback: js.Function0[_]): Unit = js.native
}

