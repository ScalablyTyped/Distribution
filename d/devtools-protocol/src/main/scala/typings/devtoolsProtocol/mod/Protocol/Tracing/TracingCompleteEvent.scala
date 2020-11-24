package typings.devtoolsProtocol.mod.Protocol.Tracing

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracingCompleteEvent extends js.Object {
  
  /**
    * Indicates whether some trace data is known to have been lost, e.g. because the trace ring
    * buffer wrapped around.
    */
  var dataLossOccurred: Boolean = js.native
  
  /**
    * A handle of the stream that holds resulting trace data.
    */
  var stream: js.UndefOr[StreamHandle] = js.native
  
  /**
    * Compression format of returned stream.
    */
  var streamCompression: js.UndefOr[StreamCompression] = js.native
  
  /**
    * Trace data format of returned stream.
    */
  var traceFormat: js.UndefOr[StreamFormat] = js.native
}
object TracingCompleteEvent {
  
  @scala.inline
  def apply(dataLossOccurred: Boolean): TracingCompleteEvent = {
    val __obj = js.Dynamic.literal(dataLossOccurred = dataLossOccurred.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingCompleteEvent]
  }
  
  @scala.inline
  implicit class TracingCompleteEventOps[Self <: TracingCompleteEvent] (val x: Self) extends AnyVal {
    
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
    def setDataLossOccurred(value: Boolean): Self = this.set("dataLossOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: StreamHandle): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setStreamCompression(value: StreamCompression): Self = this.set("streamCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamCompression: Self = this.set("streamCompression", js.undefined)
    
    @scala.inline
    def setTraceFormat(value: StreamFormat): Self = this.set("traceFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceFormat: Self = this.set("traceFormat", js.undefined)
  }
}
