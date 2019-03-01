package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var traces: TracesResource
}

object ProjectsResource {
  @scala.inline
  def apply(traces: TracesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("traces")(traces)
    __obj.asInstanceOf[ProjectsResource]
  }
}

