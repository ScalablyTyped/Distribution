package typings.devtoolsProtocol.mod.Protocol.Tracing

import typings.devtoolsProtocol.devtoolsProtocolStrings.ReportEvents
import typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartRequest extends js.Object {
  
  /**
    * If set, the agent will issue bufferUsage events at this interval, specified in milliseconds
    */
  var bufferUsageReportingInterval: js.UndefOr[Double] = js.native
  
  /**
    * Category/tag filter
    */
  var categories: js.UndefOr[String] = js.native
  
  /**
    * Tracing options
    */
  var options: js.UndefOr[String] = js.native
  
  /**
    * Compression format to use. This only applies when using `ReturnAsStream`
    * transfer mode (defaults to `none`)
    */
  var streamCompression: js.UndefOr[StreamCompression] = js.native
  
  /**
    * Trace data format to use. This only applies when using `ReturnAsStream`
    * transfer mode (defaults to `json`).
    */
  var streamFormat: js.UndefOr[StreamFormat] = js.native
  
  var traceConfig: js.UndefOr[TraceConfig] = js.native
  
  /**
    * Whether to report trace events as series of dataCollected events or to save trace to a
    * stream (defaults to `ReportEvents`). (StartRequestTransferMode enum)
    */
  var transferMode: js.UndefOr[ReportEvents | ReturnAsStream] = js.native
}
object StartRequest {
  
  @scala.inline
  def apply(): StartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRequest]
  }
  
  @scala.inline
  implicit class StartRequestOps[Self <: StartRequest] (val x: Self) extends AnyVal {
    
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
    def setBufferUsageReportingInterval(value: Double): Self = this.set("bufferUsageReportingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferUsageReportingInterval: Self = this.set("bufferUsageReportingInterval", js.undefined)
    
    @scala.inline
    def setCategories(value: String): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setStreamCompression(value: StreamCompression): Self = this.set("streamCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamCompression: Self = this.set("streamCompression", js.undefined)
    
    @scala.inline
    def setStreamFormat(value: StreamFormat): Self = this.set("streamFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamFormat: Self = this.set("streamFormat", js.undefined)
    
    @scala.inline
    def setTraceConfig(value: TraceConfig): Self = this.set("traceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceConfig: Self = this.set("traceConfig", js.undefined)
    
    @scala.inline
    def setTransferMode(value: ReportEvents | ReturnAsStream): Self = this.set("transferMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferMode: Self = this.set("transferMode", js.undefined)
  }
}
