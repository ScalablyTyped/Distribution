package typings.gapiClientAnalytics

import typings.gapiClientAnalytics.gapi.client.analytics.DataResource
import typings.gapiClientAnalytics.gapi.client.analytics.ManagementResource
import typings.gapiClientAnalytics.gapi.client.analytics.MetadataResource
import typings.gapiClientAnalytics.gapi.client.analytics.ProvisioningResource
import typings.gapiClientAnalytics.gapiClientAnalyticsStrings.analytics
import typings.gapiClientAnalytics.gapiClientAnalyticsStrings.v3
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
      val data: DataResource = js.native
      val management: ManagementResource = js.native
      val metadata: MetadataResource = js.native
      val provisioning: ProvisioningResource = js.native
      /** Load Google Analytics API v3 */
      def load(name: analytics, version: v3): js.Thenable[Unit] = js.native
      def load(name: analytics, version: v3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

