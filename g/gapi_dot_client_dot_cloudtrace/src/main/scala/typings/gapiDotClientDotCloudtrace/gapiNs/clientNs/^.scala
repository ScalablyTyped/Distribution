package typings.gapiDotClientDotCloudtrace.gapiNs.clientNs

import typings.gapiDotClientDotCloudtrace.gapiDotClientDotCloudtraceStrings.cloudtrace
import typings.gapiDotClientDotCloudtrace.gapiDotClientDotCloudtraceStrings.v2
import typings.gapiDotClientDotCloudtrace.gapiNs.clientNs.cloudtraceNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Stackdriver Trace API v2 */
  def load(name: cloudtrace, version: v2): js.Thenable[Unit] = js.native
  def load(name: cloudtrace, version: v2, callback: js.Function0[_]): Unit = js.native
}

