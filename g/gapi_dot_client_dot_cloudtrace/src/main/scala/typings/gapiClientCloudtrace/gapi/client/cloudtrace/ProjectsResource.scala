package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var traces: TracesResource
}

object ProjectsResource {
  @scala.inline
  def apply(traces: TracesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(traces = traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
}

