package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val projects: gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs.ProjectsResource = js.native
  /** Load Stackdriver Trace API v2 */
  def load(
    name: gapiDotClientDotCloudtraceLib.gapiDotClientDotCloudtraceLibStrings.cloudtrace,
    version: gapiDotClientDotCloudtraceLib.gapiDotClientDotCloudtraceLibStrings.v2
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotCloudtraceLib.gapiDotClientDotCloudtraceLibStrings.cloudtrace,
    version: gapiDotClientDotCloudtraceLib.gapiDotClientDotCloudtraceLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

