package typings.gapiClientYoutubeanalytics

import typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupItemsResource
import typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupsResource
import typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics.ReportsResource
import typings.gapiClientYoutubeanalytics.gapiClientYoutubeanalyticsStrings.v1
import typings.gapiClientYoutubeanalytics.gapiClientYoutubeanalyticsStrings.youtubeanalytics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val groupItems: GroupItemsResource = js.native
      val groups: GroupsResource = js.native
      val reports: ReportsResource = js.native
      /** Load YouTube Analytics API v1 */
      def load(name: youtubeanalytics, version: v1): js.Thenable[Unit] = js.native
      def load(name: youtubeanalytics, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

