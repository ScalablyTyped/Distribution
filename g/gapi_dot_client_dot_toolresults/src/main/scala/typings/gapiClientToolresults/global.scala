package typings.gapiClientToolresults

import typings.gapiClientToolresults.gapi.client.toolresults.ProjectsResource
import typings.gapiClientToolresults.gapiClientToolresultsStrings.toolresults
import typings.gapiClientToolresults.gapiClientToolresultsStrings.v1beta3
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
      val projects: ProjectsResource = js.native
      /** Load Cloud Tool Results API v1beta3 */
      def load(name: toolresults, version: v1beta3): js.Thenable[Unit] = js.native
      def load(name: toolresults, version: v1beta3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

