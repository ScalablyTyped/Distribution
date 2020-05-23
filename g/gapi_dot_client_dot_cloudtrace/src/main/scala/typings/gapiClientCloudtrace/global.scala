package typings.gapiClientCloudtrace

import typings.gapiClientCloudtrace.gapi.client.cloudtrace.ProjectsResource
import typings.gapiClientCloudtrace.gapiClientCloudtraceStrings.cloudtrace
import typings.gapiClientCloudtrace.gapiClientCloudtraceStrings.v2
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
      /** Load Stackdriver Trace API v2 */
      def load(name: cloudtrace, version: v2): js.Thenable[Unit] = js.native
      def load(name: cloudtrace, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

