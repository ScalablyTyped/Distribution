package typings.gapiClientMonitoring

import typings.gapiClientMonitoring.gapi.client.monitoring.ProjectsResource
import typings.gapiClientMonitoring.gapiClientMonitoringStrings.monitoring
import typings.gapiClientMonitoring.gapiClientMonitoringStrings.v3
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
      /** Load Stackdriver Monitoring API v3 */
      def load(name: monitoring, version: v3): js.Thenable[Unit] = js.native
      def load(name: monitoring, version: v3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

