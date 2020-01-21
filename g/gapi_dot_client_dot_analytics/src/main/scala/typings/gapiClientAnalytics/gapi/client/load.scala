package typings.gapiClientAnalytics.gapi.client

import typings.gapiClientAnalytics.gapiClientAnalyticsStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Google Analytics API v3 */
  def apply(name: typings.gapiClientAnalytics.gapiClientAnalyticsStrings.analytics, version: v3): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientAnalytics.gapiClientAnalyticsStrings.analytics,
    version: v3,
    callback: js.Function0[_]
  ): Unit = js.native
}

