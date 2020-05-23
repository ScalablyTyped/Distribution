package typings.gapiClientPagespeedonline

import typings.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedapiResource
import typings.gapiClientPagespeedonline.gapiClientPagespeedonlineStrings.pagespeedonline
import typings.gapiClientPagespeedonline.gapiClientPagespeedonlineStrings.v2
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
      val pagespeedapi: PagespeedapiResource = js.native
      /** Load PageSpeed Insights API v2 */
      def load(name: pagespeedonline, version: v2): js.Thenable[Unit] = js.native
      def load(name: pagespeedonline, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

