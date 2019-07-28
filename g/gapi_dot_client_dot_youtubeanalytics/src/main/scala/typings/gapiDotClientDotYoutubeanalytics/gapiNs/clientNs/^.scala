package typings.gapiDotClientDotYoutubeanalytics.gapiNs.clientNs

import typings.gapiDotClientDotYoutubeanalytics.gapiDotClientDotYoutubeanalyticsStrings.v1
import typings.gapiDotClientDotYoutubeanalytics.gapiDotClientDotYoutubeanalyticsStrings.youtubeanalytics
import typings.gapiDotClientDotYoutubeanalytics.gapiNs.clientNs.youtubeanalyticsNs.GroupItemsResource
import typings.gapiDotClientDotYoutubeanalytics.gapiNs.clientNs.youtubeanalyticsNs.GroupsResource
import typings.gapiDotClientDotYoutubeanalytics.gapiNs.clientNs.youtubeanalyticsNs.ReportsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val groupItems: GroupItemsResource = js.native
  val groups: GroupsResource = js.native
  val reports: ReportsResource = js.native
  /** Load YouTube Analytics API v1 */
  def load(name: youtubeanalytics, version: v1): js.Thenable[Unit] = js.native
  def load(name: youtubeanalytics, version: v1, callback: js.Function0[_]): Unit = js.native
}

