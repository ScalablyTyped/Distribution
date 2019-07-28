package typings.gapiDotClientDotAnalyticsreporting.gapiNs.clientNs

import typings.gapiDotClientDotAnalyticsreporting.gapiDotClientDotAnalyticsreportingStrings.analyticsreporting
import typings.gapiDotClientDotAnalyticsreporting.gapiDotClientDotAnalyticsreportingStrings.v4
import typings.gapiDotClientDotAnalyticsreporting.gapiNs.clientNs.analyticsreportingNs.ReportsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val reports: ReportsResource = js.native
  /** Load Google Analytics Reporting API v4 */
  def load(name: analyticsreporting, version: v4): js.Thenable[Unit] = js.native
  def load(name: analyticsreporting, version: v4, callback: js.Function0[_]): Unit = js.native
}

