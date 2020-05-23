package typings.gapiClientResourceviews

import typings.gapiClientResourceviews.gapi.client.resourceviews.ZoneOperationsResource
import typings.gapiClientResourceviews.gapi.client.resourceviews.ZoneViewsResource
import typings.gapiClientResourceviews.gapiClientResourceviewsStrings.resourceviews
import typings.gapiClientResourceviews.gapiClientResourceviewsStrings.v1beta2
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
      val zoneOperations: ZoneOperationsResource = js.native
      val zoneViews: ZoneViewsResource = js.native
      /** Load Google Compute Engine Instance Groups API v1beta2 */
      def load(name: resourceviews, version: v1beta2): js.Thenable[Unit] = js.native
      def load(name: resourceviews, version: v1beta2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

