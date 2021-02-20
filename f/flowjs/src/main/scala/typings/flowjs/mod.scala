package typings.flowjs

import typings.flowjs.flowjsBooleans.`false`
import typings.flowjs.flowjsNumbers.`0`
import typings.flowjs.flowjsNumbers.`1`
import typings.flowjs.flowjsNumbers.`2`
import typings.flowjs.flowjsStrings.catchAll
import typings.flowjs.flowjsStrings.complete
import typings.flowjs.flowjsStrings.error
import typings.flowjs.flowjsStrings.fileAdded
import typings.flowjs.flowjsStrings.fileError
import typings.flowjs.flowjsStrings.fileProgress
import typings.flowjs.flowjsStrings.fileRemoved
import typings.flowjs.flowjsStrings.fileRetry
import typings.flowjs.flowjsStrings.fileSuccess
import typings.flowjs.flowjsStrings.filesAdded
import typings.flowjs.flowjsStrings.filesSubmitted
import typings.flowjs.flowjsStrings.progress
import typings.flowjs.flowjsStrings.uploadStart
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type CatchAllCallbackArguments = js.Array[Event]
  
  type CompleteCallbackArguments = js.Array[js.Any]
  
  type ErrorCallbackArguments = js.Tuple3[String, FlowFile, FlowChunk]
  
  /* Rewritten from type alias, can be one of: 
    - typings.flowjs.flowjsStrings.fileSuccess
    - typings.flowjs.flowjsStrings.fileProgress
    - typings.flowjs.flowjsStrings.fileAdded
    - typings.flowjs.flowjsStrings.filesAdded
    - typings.flowjs.flowjsStrings.filesSubmitted
    - typings.flowjs.flowjsStrings.fileRemoved
    - typings.flowjs.flowjsStrings.fileRetry
    - typings.flowjs.flowjsStrings.fileError
    - typings.flowjs.flowjsStrings.uploadStart
    - typings.flowjs.flowjsStrings.complete
    - typings.flowjs.flowjsStrings.progress
    - typings.flowjs.flowjsStrings.error
    - typings.flowjs.flowjsStrings.catchAll
  */
  trait EventName extends StObject
  
  type FileAddedCallbackArguments = js.Tuple2[FlowFile, Event]
  
  type FileErrorCallbackArguments = js.Tuple3[FlowFile, String, FlowChunk]
  
  type FileProgressCallbackArguments = js.Tuple2[FlowFile, FlowChunk]
  
  type FileRemovedCallbackArguments = js.Array[FlowFile]
  
  type FileRetryCallbackArguments = js.Tuple2[FlowFile, FlowChunk]
  
  type FileSuccessCallbackArguments = js.Tuple3[FlowFile, String, FlowChunk]
  
  type FilesAddedCallbackArguments = js.Tuple2[js.Array[FlowFile], Event]
  
  type FilesSubmittedCallbackArguments = js.Tuple2[js.Array[FlowFile], Event]
  
  @js.native
  trait Flow extends StObject {
    
    def addFile(file: File): Unit = js.native
    
    def assignBrowse(domNodes: js.Array[HTMLElement]): Unit = js.native
    def assignBrowse(
      domNodes: js.Array[HTMLElement],
      isDirectory: js.UndefOr[scala.Nothing],
      singleFile: js.UndefOr[scala.Nothing],
      attributes: js.Object
    ): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: js.UndefOr[scala.Nothing], singleFile: Boolean): Unit = js.native
    def assignBrowse(
      domNodes: js.Array[HTMLElement],
      isDirectory: js.UndefOr[scala.Nothing],
      singleFile: Boolean,
      attributes: js.Object
    ): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean): Unit = js.native
    def assignBrowse(
      domNodes: js.Array[HTMLElement],
      isDirectory: Boolean,
      singleFile: js.UndefOr[scala.Nothing],
      attributes: js.Object
    ): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean, singleFile: Boolean): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean, singleFile: Boolean, attributes: js.Object): Unit = js.native
    
    def assignDrop(node: js.Array[HTMLElement]): Unit = js.native
    def assignDrop(node: HTMLElement): Unit = js.native
    
    def cancel(): Unit = js.native
    
    var files: js.Array[FlowFile] = js.native
    
    def getFromUniqueIdentifier(uniqueIdentifier: String): FlowFile = js.native
    
    def getSize(): Double = js.native
    
    def isUploading(): Boolean = js.native
    
    def off(): Unit = js.native
    def off(event: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def off(event: EventName): Unit = js.native
    def off(event: EventName, callback: js.Function0[Unit]): Unit = js.native
    
    @JSName("on")
    def on_catchAll(event: catchAll, callback: js.Function1[/* args */ CatchAllCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_complete(event: complete, callback: js.Function1[/* args */ CompleteCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, callback: js.Function1[/* args */ ErrorCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileAdded(event: fileAdded, callback: js.Function1[/* args */ FileAddedCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileError(event: fileError, callback: js.Function1[/* args */ FileErrorCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileProgress(event: fileProgress, callback: js.Function1[/* args */ FileProgressCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileRemoved(event: fileRemoved, callback: js.Function1[/* args */ FileRemovedCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileRetry(event: fileRetry, callback: js.Function1[/* args */ FileRetryCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileSuccess(event: fileSuccess, callback: js.Function1[/* args */ FileSuccessCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_filesAdded(event: filesAdded, callback: js.Function1[/* args */ FilesAddedCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_filesSubmitted(event: filesSubmitted, callback: js.Function1[/* args */ FilesSubmittedCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_progress(event: progress, callback: js.Function1[/* args */ ProgressCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_uploadStart(event: uploadStart, callback: js.Function1[/* args */ UploadStartCallbackArguments, Unit]): Unit = js.native
    
    var opts: FlowOptions = js.native
    
    def pause(): Unit = js.native
    
    def progress(): Double = js.native
    
    def removeFile(file: FlowFile): Unit = js.native
    
    def resume(): Unit = js.native
    
    def sizeUploaded(): Double = js.native
    
    var support: Boolean = js.native
    
    var supportDirectory: Boolean = js.native
    
    def timeRemaining(): Double = js.native
    
    def unAssignDrop(node: js.Array[HTMLElement]): Unit = js.native
    def unAssignDrop(node: HTMLElement): Unit = js.native
    
    def upload(): Unit = js.native
  }
  
  @js.native
  trait FlowChunk extends StObject {
    
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
    implicit class FlowChunkMutableBuilder[Self <: FlowChunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndByte(value: Double): Self = StObject.set(x, "endByte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileObj(value: FlowFile): Self = StObject.set(x, "fileObj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowObj(value: Flow): Self = StObject.set(x, "flowObj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetParams(value: () => FlowChunkParams): Self = StObject.set(x, "getParams", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: () => Unit): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingRetry(value: `false`): Self = StObject.set(x, "pendingRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreprocessState(value: `0` | `1` | `2`): Self = StObject.set(x, "preprocessState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: () => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadState(value: `0` | `1` | `2`): Self = StObject.set(x, "readState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend(value: () => Unit): Self = StObject.set(x, "send", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSizeUploaded(value: () => Double): Self = StObject.set(x, "sizeUploaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartByte(value: Double): Self = StObject.set(x, "startByte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: () => Unit): Self = StObject.set(x, "status", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTest(value: () => Unit): Self = StObject.set(x, "test", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTested(value: Boolean): Self = StObject.set(x, "tested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FlowChunkParams extends StObject {
    
    var flowChunkNumber: Double = js.native
    
    var flowChunkSize: Double = js.native
    
    var flowCurrentChunkSize: Double = js.native
    
    var flowFilename: String = js.native
    
    var flowIdentifier: js.Any = js.native
    
    var flowRelativePath: String = js.native
    
    var flowTotalChunks: Double = js.native
    
    var flowTotalSize: Double = js.native
  }
  object FlowChunkParams {
    
    @scala.inline
    def apply(
      flowChunkNumber: Double,
      flowChunkSize: Double,
      flowCurrentChunkSize: Double,
      flowFilename: String,
      flowIdentifier: js.Any,
      flowRelativePath: String,
      flowTotalChunks: Double,
      flowTotalSize: Double
    ): FlowChunkParams = {
      val __obj = js.Dynamic.literal(flowChunkNumber = flowChunkNumber.asInstanceOf[js.Any], flowChunkSize = flowChunkSize.asInstanceOf[js.Any], flowCurrentChunkSize = flowCurrentChunkSize.asInstanceOf[js.Any], flowFilename = flowFilename.asInstanceOf[js.Any], flowIdentifier = flowIdentifier.asInstanceOf[js.Any], flowRelativePath = flowRelativePath.asInstanceOf[js.Any], flowTotalChunks = flowTotalChunks.asInstanceOf[js.Any], flowTotalSize = flowTotalSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowChunkParams]
    }
    
    @scala.inline
    implicit class FlowChunkParamsMutableBuilder[Self <: FlowChunkParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlowChunkNumber(value: Double): Self = StObject.set(x, "flowChunkNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowChunkSize(value: Double): Self = StObject.set(x, "flowChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowCurrentChunkSize(value: Double): Self = StObject.set(x, "flowCurrentChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowFilename(value: String): Self = StObject.set(x, "flowFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowIdentifier(value: js.Any): Self = StObject.set(x, "flowIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowRelativePath(value: String): Self = StObject.set(x, "flowRelativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowTotalChunks(value: Double): Self = StObject.set(x, "flowTotalChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowTotalSize(value: Double): Self = StObject.set(x, "flowTotalSize", value.asInstanceOf[js.Any])
    }
  }
  
  type FlowEvent = CompleteCallbackArguments | UploadStartCallbackArguments | ProgressCallbackArguments | FileSuccessCallbackArguments | FilesSubmittedCallbackArguments | FileAddedCallbackArguments | FileRetryCallbackArguments | ErrorCallbackArguments | FileRemovedCallbackArguments | FileProgressCallbackArguments | FileErrorCallbackArguments | FilesAddedCallbackArguments | CatchAllCallbackArguments
  
  type FlowEventFromEventName[T /* <: EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: flowjs.flowjs.FlowEventMap[T] */ js.Any
  
  @js.native
  trait FlowEventMap extends StObject {
    
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
    implicit class FlowEventMapMutableBuilder[Self <: FlowEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatchAll(value: CatchAllCallbackArguments): Self = StObject.set(x, "catchAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatchAllVarargs(value: Event*): Self = StObject.set(x, "catchAll", js.Array(value :_*))
      
      @scala.inline
      def setComplete(value: CompleteCallbackArguments): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteVarargs(value: js.Any*): Self = StObject.set(x, "complete", js.Array(value :_*))
      
      @scala.inline
      def setError(value: ErrorCallbackArguments): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileAdded(value: FileAddedCallbackArguments): Self = StObject.set(x, "fileAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileError(value: FileErrorCallbackArguments): Self = StObject.set(x, "fileError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileProgress(value: FileProgressCallbackArguments): Self = StObject.set(x, "fileProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileRemoved(value: FileRemovedCallbackArguments): Self = StObject.set(x, "fileRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileRemovedVarargs(value: FlowFile*): Self = StObject.set(x, "fileRemoved", js.Array(value :_*))
      
      @scala.inline
      def setFileRetry(value: FileRetryCallbackArguments): Self = StObject.set(x, "fileRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSuccess(value: FileSuccessCallbackArguments): Self = StObject.set(x, "fileSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesAdded(value: FilesAddedCallbackArguments): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesSubmitted(value: FilesSubmittedCallbackArguments): Self = StObject.set(x, "filesSubmitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: ProgressCallbackArguments): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressVarargs(value: js.Any*): Self = StObject.set(x, "progress", js.Array(value :_*))
      
      @scala.inline
      def setUploadStart(value: UploadStartCallbackArguments): Self = StObject.set(x, "uploadStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadStartVarargs(value: js.Any*): Self = StObject.set(x, "uploadStart", js.Array(value :_*))
    }
  }
  
  type FlowEventTypeFromFlowEvent[T /* <: FlowEvent */] = js.Any
  
  @js.native
  trait FlowFile extends StObject {
    
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
    implicit class FlowFileMutableBuilder[Self <: FlowFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAverageSpeed(value: Double): Self = StObject.set(x, "averageSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrap(value: () => Unit): Self = StObject.set(x, "bootstrap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setChunks(value: js.Array[FlowChunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksVarargs(value: FlowChunk*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      @scala.inline
      def setCurrentSpeed(value: Double): Self = StObject.set(x, "currentSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowObj(value: Flow): Self = StObject.set(x, "flowObj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetExtension(value: () => String): Self = StObject.set(x, "getExtension", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsComplete(value: () => Boolean): Self = StObject.set(x, "isComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUploading(value: () => Boolean): Self = StObject.set(x, "isUploading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: () => Double): Self = StObject.set(x, "progress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUploaded(value: () => Double): Self = StObject.set(x, "sizeUploaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimeRemaining(value: () => Double): Self = StObject.set(x, "timeRemaining", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUniqueIdentifier(value: String): Self = StObject.set(x, "uniqueIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FlowOptions extends StObject {
    
    var allowDuplicateUploads: js.UndefOr[Boolean] = js.native
    
    var chunkRetryInterval: js.UndefOr[Double] = js.native
    
    var chunkSize: js.UndefOr[Double] = js.native
    
    var fileParameterName: js.UndefOr[String] = js.native
    
    var forceChunkSize: js.UndefOr[Boolean] = js.native
    
    var generateUniqueIdentifier: js.UndefOr[js.Function1[/* file */ FlowFile, _]] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var initFileFn: js.UndefOr[js.Function2[/* file */ FlowFile, /* chunk */ FlowChunk, Unit]] = js.native
    
    var maxChunkRetries: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var permanentErrors: js.UndefOr[js.Array[String]] = js.native
    
    var preprocess: js.UndefOr[js.Function1[/* chunk */ FlowChunk, Unit]] = js.native
    
    var prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.native
    
    var progressCallbacksInterval: js.UndefOr[Double] = js.native
    
    var query: js.UndefOr[js.Object] = js.native
    
    var readFileFn: js.UndefOr[
        js.Function5[
          /* file */ FlowFile, 
          /* startByte */ Double, 
          /* endByte */ Double, 
          /* fileType */ String, 
          /* chunk */ FlowChunk, 
          Unit
        ]
      ] = js.native
    
    var simultaneousUploads: js.UndefOr[Double] = js.native
    
    var singleFile: js.UndefOr[Boolean] = js.native
    
    var speedSmoothingFactor: js.UndefOr[Double] = js.native
    
    var successStatuses: js.UndefOr[js.Array[String]] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var testChunks: js.UndefOr[Boolean] = js.native
    
    var testMethod: js.UndefOr[String] = js.native
    
    var uploadMethod: js.UndefOr[String] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object FlowOptions {
    
    @scala.inline
    def apply(): FlowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowOptions]
    }
    
    @scala.inline
    implicit class FlowOptionsMutableBuilder[Self <: FlowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDuplicateUploads(value: Boolean): Self = StObject.set(x, "allowDuplicateUploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDuplicateUploadsUndefined: Self = StObject.set(x, "allowDuplicateUploads", js.undefined)
      
      @scala.inline
      def setChunkRetryInterval(value: Double): Self = StObject.set(x, "chunkRetryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkRetryIntervalUndefined: Self = StObject.set(x, "chunkRetryInterval", js.undefined)
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setFileParameterName(value: String): Self = StObject.set(x, "fileParameterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileParameterNameUndefined: Self = StObject.set(x, "fileParameterName", js.undefined)
      
      @scala.inline
      def setForceChunkSize(value: Boolean): Self = StObject.set(x, "forceChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceChunkSizeUndefined: Self = StObject.set(x, "forceChunkSize", js.undefined)
      
      @scala.inline
      def setGenerateUniqueIdentifier(value: /* file */ FlowFile => _): Self = StObject.set(x, "generateUniqueIdentifier", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateUniqueIdentifierUndefined: Self = StObject.set(x, "generateUniqueIdentifier", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setInitFileFn(value: (/* file */ FlowFile, /* chunk */ FlowChunk) => Unit): Self = StObject.set(x, "initFileFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInitFileFnUndefined: Self = StObject.set(x, "initFileFn", js.undefined)
      
      @scala.inline
      def setMaxChunkRetries(value: Double): Self = StObject.set(x, "maxChunkRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxChunkRetriesUndefined: Self = StObject.set(x, "maxChunkRetries", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPermanentErrors(value: js.Array[String]): Self = StObject.set(x, "permanentErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermanentErrorsUndefined: Self = StObject.set(x, "permanentErrors", js.undefined)
      
      @scala.inline
      def setPermanentErrorsVarargs(value: String*): Self = StObject.set(x, "permanentErrors", js.Array(value :_*))
      
      @scala.inline
      def setPreprocess(value: /* chunk */ FlowChunk => Unit): Self = StObject.set(x, "preprocess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
      
      @scala.inline
      def setPrioritizeFirstAndLastChunk(value: Boolean): Self = StObject.set(x, "prioritizeFirstAndLastChunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrioritizeFirstAndLastChunkUndefined: Self = StObject.set(x, "prioritizeFirstAndLastChunk", js.undefined)
      
      @scala.inline
      def setProgressCallbacksInterval(value: Double): Self = StObject.set(x, "progressCallbacksInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressCallbacksIntervalUndefined: Self = StObject.set(x, "progressCallbacksInterval", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setReadFileFn(
        value: (/* file */ FlowFile, /* startByte */ Double, /* endByte */ Double, /* fileType */ String, /* chunk */ FlowChunk) => Unit
      ): Self = StObject.set(x, "readFileFn", js.Any.fromFunction5(value))
      
      @scala.inline
      def setReadFileFnUndefined: Self = StObject.set(x, "readFileFn", js.undefined)
      
      @scala.inline
      def setSimultaneousUploads(value: Double): Self = StObject.set(x, "simultaneousUploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimultaneousUploadsUndefined: Self = StObject.set(x, "simultaneousUploads", js.undefined)
      
      @scala.inline
      def setSingleFile(value: Boolean): Self = StObject.set(x, "singleFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleFileUndefined: Self = StObject.set(x, "singleFile", js.undefined)
      
      @scala.inline
      def setSpeedSmoothingFactor(value: Double): Self = StObject.set(x, "speedSmoothingFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedSmoothingFactorUndefined: Self = StObject.set(x, "speedSmoothingFactor", js.undefined)
      
      @scala.inline
      def setSuccessStatuses(value: js.Array[String]): Self = StObject.set(x, "successStatuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessStatusesUndefined: Self = StObject.set(x, "successStatuses", js.undefined)
      
      @scala.inline
      def setSuccessStatusesVarargs(value: String*): Self = StObject.set(x, "successStatuses", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTestChunks(value: Boolean): Self = StObject.set(x, "testChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestChunksUndefined: Self = StObject.set(x, "testChunks", js.undefined)
      
      @scala.inline
      def setTestMethod(value: String): Self = StObject.set(x, "testMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestMethodUndefined: Self = StObject.set(x, "testMethod", js.undefined)
      
      @scala.inline
      def setUploadMethod(value: String): Self = StObject.set(x, "uploadMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadMethodUndefined: Self = StObject.set(x, "uploadMethod", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type ProgressCallbackArguments = js.Array[js.Any]
  
  type UploadStartCallbackArguments = js.Array[js.Any]
}
