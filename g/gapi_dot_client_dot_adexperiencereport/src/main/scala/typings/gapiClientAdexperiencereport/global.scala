package typings.gapiClientAdexperiencereport

import typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport.SitesResource
import typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport.ViolatingSitesResource
import typings.gapiClientAdexperiencereport.gapiClientAdexperiencereportStrings.adexperiencereport
import typings.gapiClientAdexperiencereport.gapiClientAdexperiencereportStrings.v1
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
      val sites: SitesResource = js.native
      val violatingSites: ViolatingSitesResource = js.native
      /** Load Google Ad Experience Report API v1 */
      def load(name: adexperiencereport, version: v1): js.Thenable[Unit] = js.native
      def load(name: adexperiencereport, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

