package typings.flowjs.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowEventMap extends js.Object {
  
  var catchAll: CatchAllCallbackArguments = js.native
  
  var complete: CompleteCallbackArguments = js.native
  
  var error: ErrorCallbackArguments = js.native
  
  var fileAdded: FileAddedCallbackArguments = js.native
  
  var fileError: FileErrorCallbackArguments = js.native
  
  var fileProgress: FileProgressCallbackArguments = js.native
  
  var fileRemoved: FileRemovedCallbackArguments = js.native
  
  var fileRetry: FileRetryCallbackArguments = js.native
  
  var fileSuccess: FileSuccessCallbackArguments = js.native
  
  var filesAdded: FilesAddedCallbackArguments = js.native
  
  var filesSubmitted: FilesSubmittedCallbackArguments = js.native
  
  var progress: ProgressCallbackArguments = js.native
  
  var uploadStart: UploadStartCallbackArguments = js.native
}
object FlowEventMap {
  
  @scala.inline
  def apply(
    catchAll: CatchAllCallbackArguments,
    complete: CompleteCallbackArguments,
    error: ErrorCallbackArguments,
    fileAdded: FileAddedCallbackArguments,
    fileError: FileErrorCallbackArguments,
    fileProgress: FileProgressCallbackArguments,
    fileRemoved: FileRemovedCallbackArguments,
    fileRetry: FileRetryCallbackArguments,
    fileSuccess: FileSuccessCallbackArguments,
    filesAdded: FilesAddedCallbackArguments,
    filesSubmitted: FilesSubmittedCallbackArguments,
    progress: ProgressCallbackArguments,
    uploadStart: UploadStartCallbackArguments
  ): FlowEventMap = {
    val __obj = js.Dynamic.literal(catchAll = catchAll.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fileAdded = fileAdded.asInstanceOf[js.Any], fileError = fileError.asInstanceOf[js.Any], fileProgress = fileProgress.asInstanceOf[js.Any], fileRemoved = fileRemoved.asInstanceOf[js.Any], fileRetry = fileRetry.asInstanceOf[js.Any], fileSuccess = fileSuccess.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesSubmitted = filesSubmitted.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], uploadStart = uploadStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEventMap]
  }
  
  @scala.inline
  implicit class FlowEventMapOps[Self <: FlowEventMap] (val x: Self) extends AnyVal {
    
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
    def setCatchAllVarargs(value: Event*): Self = this.set("catchAll", js.Array(value :_*))
    
    @scala.inline
    def setCatchAll(value: CatchAllCallbackArguments): Self = this.set("catchAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteVarargs(value: js.Any*): Self = this.set("complete", js.Array(value :_*))
    
    @scala.inline
    def setComplete(value: CompleteCallbackArguments): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorCallbackArguments): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileAdded(value: FileAddedCallbackArguments): Self = this.set("fileAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileError(value: FileErrorCallbackArguments): Self = this.set("fileError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileProgress(value: FileProgressCallbackArguments): Self = this.set("fileProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileRemovedVarargs(value: FlowFile*): Self = this.set("fileRemoved", js.Array(value :_*))
    
    @scala.inline
    def setFileRemoved(value: FileRemovedCallbackArguments): Self = this.set("fileRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileRetry(value: FileRetryCallbackArguments): Self = this.set("fileRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSuccess(value: FileSuccessCallbackArguments): Self = this.set("fileSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesAdded(value: FilesAddedCallbackArguments): Self = this.set("filesAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesSubmitted(value: FilesSubmittedCallbackArguments): Self = this.set("filesSubmitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressVarargs(value: js.Any*): Self = this.set("progress", js.Array(value :_*))
    
    @scala.inline
    def setProgress(value: ProgressCallbackArguments): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStartVarargs(value: js.Any*): Self = this.set("uploadStart", js.Array(value :_*))
    
    @scala.inline
    def setUploadStart(value: UploadStartCallbackArguments): Self = this.set("uploadStart", value.asInstanceOf[js.Any])
  }
}
