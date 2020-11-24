package typings.flowjs.mod

import typings.flowjs.flowjsBooleans.`false`
import typings.flowjs.flowjsNumbers.`0`
import typings.flowjs.flowjsNumbers.`1`
import typings.flowjs.flowjsNumbers.`2`
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowChunk extends js.Object {
  
  def abort(): Unit = js.native
  
  var chunkSize: Double = js.native
  
  var endByte: Double = js.native
  
  var fileObj: FlowFile = js.native
  
  var flowObj: Flow = js.native
  
  def getParams(): FlowChunkParams = js.native
  
  var loaded: Double = js.native
  
  def message(): Unit = js.native
  
  var offset: Double = js.native
  
  var pendingRetry: `false` = js.native
  
  var preprocessState: `0` | `1` | `2` = js.native
  
  def progress(): Unit = js.native
  
  var readState: `0` | `1` | `2` = js.native
  
  var retries: Double = js.native
  
  def send(): Unit = js.native
  
  def sizeUploaded(): Double = js.native
  
  var startByte: Double = js.native
  
  def status(): Unit = js.native
  
  def test(): Unit = js.native
  
  var tested: Boolean = js.native
  
  var total: Double = js.native
  
  var xhr: XMLHttpRequest = js.native
}
object FlowChunk {
  
  @scala.inline
  def apply(
    abort: () => Unit,
    chunkSize: Double,
    endByte: Double,
    fileObj: FlowFile,
    flowObj: Flow,
    getParams: () => FlowChunkParams,
    loaded: Double,
    message: () => Unit,
    offset: Double,
    pendingRetry: `false`,
    preprocessState: `0` | `1` | `2`,
    progress: () => Unit,
    readState: `0` | `1` | `2`,
    retries: Double,
    send: () => Unit,
    sizeUploaded: () => Double,
    startByte: Double,
    status: () => Unit,
    test: () => Unit,
    tested: Boolean,
    total: Double,
    xhr: XMLHttpRequest
  ): FlowChunk = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), chunkSize = chunkSize.asInstanceOf[js.Any], endByte = endByte.asInstanceOf[js.Any], fileObj = fileObj.asInstanceOf[js.Any], flowObj = flowObj.asInstanceOf[js.Any], getParams = js.Any.fromFunction0(getParams), loaded = loaded.asInstanceOf[js.Any], message = js.Any.fromFunction0(message), offset = offset.asInstanceOf[js.Any], pendingRetry = pendingRetry.asInstanceOf[js.Any], preprocessState = preprocessState.asInstanceOf[js.Any], progress = js.Any.fromFunction0(progress), readState = readState.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], send = js.Any.fromFunction0(send), sizeUploaded = js.Any.fromFunction0(sizeUploaded), startByte = startByte.asInstanceOf[js.Any], status = js.Any.fromFunction0(status), test = js.Any.fromFunction0(test), tested = tested.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChunk]
  }
  
  @scala.inline
  implicit class FlowChunkOps[Self <: FlowChunk] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndByte(value: Double): Self = this.set("endByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileObj(value: FlowFile): Self = this.set("fileObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowObj(value: Flow): Self = this.set("flowObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetParams(value: () => FlowChunkParams): Self = this.set("getParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: () => Unit): Self = this.set("message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingRetry(value: `false`): Self = this.set("pendingRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreprocessState(value: `0` | `1` | `2`): Self = this.set("preprocessState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: () => Unit): Self = this.set("progress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadState(value: `0` | `1` | `2`): Self = this.set("readState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: () => Unit): Self = this.set("send", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSizeUploaded(value: () => Double): Self = this.set("sizeUploaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartByte(value: Double): Self = this.set("startByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: () => Unit): Self = this.set("status", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTest(value: () => Unit): Self = this.set("test", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTested(value: Boolean): Self = this.set("tested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = this.set("xhr", value.asInstanceOf[js.Any])
  }
}
