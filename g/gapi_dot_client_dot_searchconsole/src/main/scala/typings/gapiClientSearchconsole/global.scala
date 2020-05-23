package typings.gapiClientSearchconsole

import typings.gapiClientSearchconsole.gapi.client.searchconsole.UrlTestingToolsResource
import typings.gapiClientSearchconsole.gapiClientSearchconsoleStrings.searchconsole
import typings.gapiClientSearchconsole.gapiClientSearchconsoleStrings.v1
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
      val urlTestingTools: UrlTestingToolsResource = js.native
      /** Load Google Search Console URL Testing Tools API v1 */
      def load(name: searchconsole, version: v1): js.Thenable[Unit] = js.native
      def load(name: searchconsole, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

