package typings.gapiClientCloudbilling

import typings.gapiClientCloudbilling.gapi.client.cloudbilling.BillingAccountsResource
import typings.gapiClientCloudbilling.gapi.client.cloudbilling.ProjectsResource
import typings.gapiClientCloudbilling.gapi.client.cloudbilling.ServicesResource
import typings.gapiClientCloudbilling.gapiClientCloudbillingStrings.cloudbilling
import typings.gapiClientCloudbilling.gapiClientCloudbillingStrings.v1
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
      val projects: ProjectsResource = js.native
      val services: ServicesResource = js.native
      /** Load Google Cloud Billing API v1 */
      def load(name: cloudbilling, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudbilling, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

