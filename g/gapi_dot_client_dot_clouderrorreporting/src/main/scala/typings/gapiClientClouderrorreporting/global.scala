package typings.gapiClientClouderrorreporting

import typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting.ProjectsResource
import typings.gapiClientClouderrorreporting.gapiClientClouderrorreportingStrings.clouderrorreporting
import typings.gapiClientClouderrorreporting.gapiClientClouderrorreportingStrings.v1beta1
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
      /** Load Stackdriver Error Reporting API v1beta1 */
      def load(name: clouderrorreporting, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: clouderrorreporting, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

