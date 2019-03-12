package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

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
  def batchWrite(request: gapiDotClientDotCloudtraceLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
}

object TracesResource {
  @scala.inline
  def apply(
    batchWrite: gapiDotClientDotCloudtraceLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    spans: SpansResource
  ): TracesResource = {
    val __obj = js.Dynamic.literal(batchWrite = js.Any.fromFunction1(batchWrite), spans = spans)
  
    __obj.asInstanceOf[TracesResource]
  }
}

