package typings.gapiDotClientDotAnalytics.gapiNs.clientNs

import typings.gapiDotClientDotAnalytics.gapiDotClientDotAnalyticsStrings.analytics
import typings.gapiDotClientDotAnalytics.gapiDotClientDotAnalyticsStrings.v3
import typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs.DataResource
import typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs.ManagementResource
import typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs.MetadataResource
import typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs.ProvisioningResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val data: DataResource = js.native
  val management: ManagementResource = js.native
  val metadata: MetadataResource = js.native
  val provisioning: ProvisioningResource = js.native
  /** Load Google Analytics API v3 */
  def load(name: analytics, version: v3): js.Thenable[Unit] = js.native
  def load(name: analytics, version: v3, callback: js.Function0[_]): Unit = js.native
}

