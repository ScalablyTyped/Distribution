package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudtrace.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracesResource extends js.Object {
  var spans: SpansResource
  /**
    * Sends new spans to Stackdriver Trace or updates existing traces. If the
    * name of a trace that you send matches that of an existing trace, new spans
    * are added to the existing trace. Attempt to update existing spans results
    * undefined behavior. If the name does not match, a new trace is created
    * with given set of spans.
    */
  def batchWrite(request: AnonAccesstoken): Request_[js.Object]
}

object TracesResource {
  @scala.inline
  def apply(batchWrite: AnonAccesstoken => Request_[js.Object], spans: SpansResource): TracesResource = {
    val __obj = js.Dynamic.literal(batchWrite = js.Any.fromFunction1(batchWrite), spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracesResource]
  }
}

