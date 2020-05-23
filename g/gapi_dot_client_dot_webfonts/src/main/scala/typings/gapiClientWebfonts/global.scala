package typings.gapiClientWebfonts

import org.scalablytyped.runtime.TopLevel
import typings.gapiClientWebfonts.gapi.client.webfonts.WebfontsResource
import typings.gapiClientWebfonts.gapiClientWebfontsStrings.v1
import typings.gapiClientWebfonts.gapiClientWebfontsStrings.webfonts
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
      /** Load Google Fonts Developer API v1 */
      def load(name: webfonts, version: v1): js.Thenable[Unit] = js.native
      def load(name: webfonts, version: v1, callback: js.Function0[_]): Unit = js.native
      @js.native
      object webfonts extends TopLevel[WebfontsResource]
      
    }
    
  }
  
}

