package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudtrace.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracesResource extends js.Object {
  var spans: SpansResource = js.native
  /**
    * Sends new spans to Stackdriver Trace or updates existing traces. If the
    * name of a trace that you send matches that of an existing trace, new spans
    * are added to the existing trace. Attempt to update existing spans results
    * undefined behavior. If the name does not match, a new trace is created
    * with given set of spans.
    */
  def batchWrite(request: Accesstoken): Request[js.Object] = js.native
}

object TracesResource {
  @scala.inline
  def apply(batchWrite: Accesstoken => Request[js.Object], spans: SpansResource): TracesResource = {
    val __obj = js.Dynamic.literal(batchWrite = js.Any.fromFunction1(batchWrite), spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracesResource]
  }
  @scala.inline
  implicit class TracesResourceOps[Self <: TracesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchWrite(value: Accesstoken => Request[js.Object]): Self = this.set("batchWrite", js.Any.fromFunction1(value))
    @scala.inline
    def setSpans(value: SpansResource): Self = this.set("spans", value.asInstanceOf[js.Any])
  }
  
}

