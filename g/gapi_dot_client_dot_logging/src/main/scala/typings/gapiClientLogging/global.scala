package typings.gapiClientLogging

import typings.gapiClientLogging.gapi.client.logging.BillingAccountsResource
import typings.gapiClientLogging.gapi.client.logging.EntriesResource
import typings.gapiClientLogging.gapi.client.logging.FoldersResource
import typings.gapiClientLogging.gapi.client.logging.MonitoredResourceDescriptorsResource
import typings.gapiClientLogging.gapi.client.logging.OrganizationsResource
import typings.gapiClientLogging.gapi.client.logging.ProjectsResource
import typings.gapiClientLogging.gapiClientLoggingStrings.logging
import typings.gapiClientLogging.gapiClientLoggingStrings.v2
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
      val billingAccounts: BillingAccountsResource = js.native
      val entries: EntriesResource = js.native
      val folders: FoldersResource = js.native
      val monitoredResourceDescriptors: MonitoredResourceDescriptorsResource = js.native
      val organizations: OrganizationsResource = js.native
      val projects: ProjectsResource = js.native
      /** Load Stackdriver Logging API v2 */
      def load(name: logging, version: v2): js.Thenable[Unit] = js.native
      def load(name: logging, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

