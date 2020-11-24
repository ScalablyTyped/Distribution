package typings.flowjs.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowFile extends js.Object {
  
  var averageSpeed: Double = js.native
  
  def bootstrap(): Unit = js.native
  
  def cancel(): Unit = js.native
  
  var chunks: js.Array[FlowChunk] = js.native
  
  var currentSpeed: Double = js.native
  
  var error: Boolean = js.native
  
  var file: File = js.native
  
  var flowObj: Flow = js.native
  
  def getExtension(): String = js.native
  
  def getType(): String = js.native
  
  def isComplete(): Boolean = js.native
  
  def isUploading(): Boolean = js.native
  
  var name: String = js.native
  
  def pause(): Unit = js.native
  
  var paused: Boolean = js.native
  
  def progress(): Double = js.native
  
  var relativePath: String = js.native
  
  def resume(): Unit = js.native
  
  def retry(): Unit = js.native
  
  var size: Double = js.native
  
  def sizeUploaded(): Double = js.native
  
  def timeRemaining(): Double = js.native
  
  var uniqueIdentifier: String = js.native
}
object FlowFile {
  
  @scala.inline
  def apply(
    averageSpeed: Double,
    bootstrap: () => Unit,
    cancel: () => Unit,
    chunks: js.Array[FlowChunk],
    currentSpeed: Double,
    error: Boolean,
    file: File,
    flowObj: Flow,
    getExtension: () => String,
    getType: () => String,
    isComplete: () => Boolean,
    isUploading: () => Boolean,
    name: String,
    pause: () => Unit,
    paused: Boolean,
    progress: () => Double,
    relativePath: String,
    resume: () => Unit,
    retry: () => Unit,
    size: Double,
    sizeUploaded: () => Double,
    timeRemaining: () => Double,
    uniqueIdentifier: String
  ): FlowFile = {
    val __obj = js.Dynamic.literal(averageSpeed = averageSpeed.asInstanceOf[js.Any], bootstrap = js.Any.fromFunction0(bootstrap), cancel = js.Any.fromFunction0(cancel), chunks = chunks.asInstanceOf[js.Any], currentSpeed = currentSpeed.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], flowObj = flowObj.asInstanceOf[js.Any], getExtension = js.Any.fromFunction0(getExtension), getType = js.Any.fromFunction0(getType), isComplete = js.Any.fromFunction0(isComplete), isUploading = js.Any.fromFunction0(isUploading), name = name.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], progress = js.Any.fromFunction0(progress), relativePath = relativePath.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), retry = js.Any.fromFunction0(retry), size = size.asInstanceOf[js.Any], sizeUploaded = js.Any.fromFunction0(sizeUploaded), timeRemaining = js.Any.fromFunction0(timeRemaining), uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowFile]
  }
  
  @scala.inline
  implicit class FlowFileOps[Self <: FlowFile] (val x: Self) extends AnyVal {
    
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
    def setAverageSpeed(value: Double): Self = this.set("averageSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrap(value: () => Unit): Self = this.set("bootstrap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChunksVarargs(value: FlowChunk*): Self = this.set("chunks", js.Array(value :_*))
    
    @scala.inline
    def setChunks(value: js.Array[FlowChunk]): Self = this.set("chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSpeed(value: Double): Self = this.set("currentSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowObj(value: Flow): Self = this.set("flowObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExtension(value: () => String): Self = this.set("getExtension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsComplete(value: () => Boolean): Self = this.set("isComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUploading(value: () => Boolean): Self = this.set("isUploading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: () => Double): Self = this.set("progress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetry(value: () => Unit): Self = this.set("retry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUploaded(value: () => Double): Self = this.set("sizeUploaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimeRemaining(value: () => Double): Self = this.set("timeRemaining", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUniqueIdentifier(value: String): Self = this.set("uniqueIdentifier", value.asInstanceOf[js.Any])
  }
}
