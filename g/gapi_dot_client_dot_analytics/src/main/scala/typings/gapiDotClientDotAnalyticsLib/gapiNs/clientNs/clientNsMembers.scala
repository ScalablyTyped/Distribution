package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val data: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.DataResource = js.native
  val management: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.ManagementResource = js.native
  val metadata: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.MetadataResource = js.native
  val provisioning: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.ProvisioningResource = js.native
  /** Load Google Analytics API v3 */
  def load(
    name: gapiDotClientDotAnalyticsLib.gapiDotClientDotAnalyticsLibStrings.analytics,
    version: gapiDotClientDotAnalyticsLib.gapiDotClientDotAnalyticsLibStrings.v3
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotAnalyticsLib.gapiDotClientDotAnalyticsLibStrings.analytics,
    version: gapiDotClientDotAnalyticsLib.gapiDotClientDotAnalyticsLibStrings.v3,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

