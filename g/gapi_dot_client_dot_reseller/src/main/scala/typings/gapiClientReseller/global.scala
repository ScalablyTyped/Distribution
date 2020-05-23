package typings.gapiClientReseller

import typings.gapiClientReseller.gapi.client.reseller.CustomersResource
import typings.gapiClientReseller.gapi.client.reseller.ResellernotifyResource
import typings.gapiClientReseller.gapi.client.reseller.SubscriptionsResource
import typings.gapiClientReseller.gapiClientResellerStrings.reseller
import typings.gapiClientReseller.gapiClientResellerStrings.v1
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
      val customers: CustomersResource = js.native
      val resellernotify: ResellernotifyResource = js.native
      val subscriptions: SubscriptionsResource = js.native
      /** Load Enterprise Apps Reseller API v1 */
      def load(name: reseller, version: v1): js.Thenable[Unit] = js.native
      def load(name: reseller, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

