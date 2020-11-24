package typings.dropzone.mod

import typings.dropzone.dropzoneStrings.`use-credentials`
import typings.dropzone.dropzoneStrings.addedfile
import typings.dropzone.dropzoneStrings.addedfiles
import typings.dropzone.dropzoneStrings.anonymous
import typings.dropzone.dropzoneStrings.canceled
import typings.dropzone.dropzoneStrings.canceledmultiple
import typings.dropzone.dropzoneStrings.complete
import typings.dropzone.dropzoneStrings.completemultiple
import typings.dropzone.dropzoneStrings.dragend
import typings.dropzone.dropzoneStrings.dragenter
import typings.dropzone.dropzoneStrings.dragleave
import typings.dropzone.dropzoneStrings.dragover
import typings.dropzone.dropzoneStrings.dragstart
import typings.dropzone.dropzoneStrings.drop
import typings.dropzone.dropzoneStrings.error
import typings.dropzone.dropzoneStrings.errormultiple
import typings.dropzone.dropzoneStrings.maxfilesexceeded
import typings.dropzone.dropzoneStrings.maxfilesreached
import typings.dropzone.dropzoneStrings.paste
import typings.dropzone.dropzoneStrings.processing
import typings.dropzone.dropzoneStrings.processingmultiple
import typings.dropzone.dropzoneStrings.queuecomplete
import typings.dropzone.dropzoneStrings.removedfile
import typings.dropzone.dropzoneStrings.reset
import typings.dropzone.dropzoneStrings.sending
import typings.dropzone.dropzoneStrings.sendingmultiple
import typings.dropzone.dropzoneStrings.success
import typings.dropzone.dropzoneStrings.successmultiple
import typings.dropzone.dropzoneStrings.thumbnail
import typings.dropzone.dropzoneStrings.totaluploadprogress
import typings.dropzone.dropzoneStrings.uploadprogress
import typings.dropzone.mod.global.HTMLElement
import typings.std.DragEvent
import typings.std.Error
import typings.std.FormData
import typings.std.HTMLInputElement
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dropzone extends js.Object {
  
  def accept(file: DropzoneFile, done: js.Function1[/* error */ js.UndefOr[String | Error], Unit]): Unit = js.native
  
  def addFile(file: DropzoneFile): Unit = js.native
  
  def cancelUpload(file: DropzoneFile): Unit = js.native
  
  def createThumbnail(file: DropzoneFile): js.Any = js.native
  def createThumbnail(file: DropzoneFile, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: Boolean
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: Boolean,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String,
    fixOrientation: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String,
    fixOrientation: Boolean
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String,
    fixOrientation: Boolean,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: js.UndefOr[scala.Nothing], height: Double): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: Boolean
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: Boolean,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: js.UndefOr[scala.Nothing], height: Double, resizeMethod: String): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    resizeMethod: String,
    fixOrientation: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    resizeMethod: String,
    fixOrientation: Boolean
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    resizeMethod: String,
    fixOrientation: Boolean,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: Double): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: Boolean
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: Boolean,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: Double, height: js.UndefOr[scala.Nothing], resizeMethod: String): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String,
    fixOrientation: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String,
    fixOrientation: Boolean
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String,
    fixOrientation: Boolean,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: Double, height: Double): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: Double,
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: Double,
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: Boolean
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: Double,
    resizeMethod: js.UndefOr[scala.Nothing],
    fixOrientation: Boolean,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: Double, height: Double, resizeMethod: String): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: Double,
    resizeMethod: String,
    fixOrientation: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: Double, height: Double, resizeMethod: String, fixOrientation: Boolean): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: Double,
    height: Double,
    resizeMethod: String,
    fixOrientation: Boolean,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Any = js.native
  
  def createThumbnailFromUrl(file: DropzoneFile, url: String): js.Any = js.native
  def createThumbnailFromUrl(file: DropzoneFile, url: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def createThumbnailFromUrl(
    file: DropzoneFile,
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    resizeMethod: js.UndefOr[String],
    fixOrientation: js.UndefOr[Boolean],
    callback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]],
    crossOrigin: js.UndefOr[String]
  ): js.Any = js.native
  
  var defaultOptions: DropzoneOptions = js.native
  
  def destroy(): Dropzone = js.native
  
  def disable(): Unit = js.native
  
  def displayExistingFile(mockFile: DropzoneMockFile, imageUrl: String): js.Any = js.native
  def displayExistingFile(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.UndefOr[scala.Nothing],
    crossOrigin: js.UndefOr[scala.Nothing],
    resizeThumbnail: Boolean
  ): js.Any = js.native
  def displayExistingFile(mockFile: DropzoneMockFile, imageUrl: String, callback: js.Function0[Unit]): js.Any = js.native
  def displayExistingFile(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.Function0[Unit],
    crossOrigin: js.UndefOr[scala.Nothing],
    resizeThumbnail: Boolean
  ): js.Any = js.native
  @JSName("displayExistingFile")
  def displayExistingFile_anonymous(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.UndefOr[scala.Nothing],
    crossOrigin: anonymous
  ): js.Any = js.native
  @JSName("displayExistingFile")
  def displayExistingFile_anonymous(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.UndefOr[scala.Nothing],
    crossOrigin: anonymous,
    resizeThumbnail: Boolean
  ): js.Any = js.native
  @JSName("displayExistingFile")
  def displayExistingFile_anonymous(mockFile: DropzoneMockFile, imageUrl: String, callback: js.Function0[Unit], crossOrigin: anonymous): js.Any = js.native
  @JSName("displayExistingFile")
  def displayExistingFile_anonymous(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.Function0[Unit],
    crossOrigin: anonymous,
    resizeThumbnail: Boolean
  ): js.Any = js.native
  @JSName("displayExistingFile")
  def displayExistingFile_usecredentials(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.UndefOr[scala.Nothing],
    crossOrigin: `use-credentials`
  ): js.Any = js.native
  @JSName("displayExistingFile")
  def displayExistingFile_usecredentials(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.UndefOr[scala.Nothing],
    crossOrigin: `use-credentials`,
    resizeThumbnail: Boolean
  ): js.Any = js.native
  @JSName("displayExistingFile")
  def displayExistingFile_usecredentials(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.Function0[Unit],
    crossOrigin: `use-credentials`
  ): js.Any = js.native
  @JSName("displayExistingFile")
  def displayExistingFile_usecredentials(
    mockFile: DropzoneMockFile,
    imageUrl: String,
    callback: js.Function0[Unit],
    crossOrigin: `use-credentials`,
    resizeThumbnail: Boolean
  ): js.Any = js.native
  
  var element: HTMLElement = js.native
  
  def emit(eventName: String, args: js.Any*): Dropzone = js.native
  @JSName("emit")
  def emit_addedfile(eventName: addedfile, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_addedfiles(eventName: addedfiles, files: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_canceled(eventName: canceled, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_canceledmultiple(eventName: canceledmultiple, file: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_complete(eventName: complete, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_completemultiple(eventName: completemultiple, file: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_dragend(eventName: dragend, e: DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_dragenter(eventName: dragenter, e: DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_dragleave(eventName: dragleave, e: DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_dragover(eventName: dragover, e: DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_dragstart(eventName: dragstart, e: DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_drop(eventName: drop, e: DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_error(eventName: error, file: DropzoneFile, message: String): Dropzone = js.native
  @JSName("emit")
  def emit_error(eventName: error, file: DropzoneFile, message: Error): Dropzone = js.native
  @JSName("emit")
  def emit_errormultiple(eventName: errormultiple, files: js.Array[DropzoneFile], message: String): Dropzone = js.native
  @JSName("emit")
  def emit_errormultiple(eventName: errormultiple, files: js.Array[DropzoneFile], message: Error): Dropzone = js.native
  @JSName("emit")
  def emit_maxfilesexceeded(eventName: maxfilesexceeded, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_maxfilesreached(eventName: maxfilesreached, files: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_paste(eventName: paste, e: DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_processing(eventName: processing, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_processingmultiple(eventName: processingmultiple, files: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_queuecomplete(eventName: queuecomplete): Dropzone = js.native
  @JSName("emit")
  def emit_removedfile(eventName: removedfile, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_reset(eventName: reset): Dropzone = js.native
  @JSName("emit")
  def emit_sending(eventName: sending, file: DropzoneFile, xhr: XMLHttpRequest, formData: FormData): Dropzone = js.native
  @JSName("emit")
  def emit_sendingmultiple(eventName: sendingmultiple, files: js.Array[DropzoneFile], xhr: XMLHttpRequest, formData: FormData): Dropzone = js.native
  @JSName("emit")
  def emit_success(eventName: success, file: DropzoneFile, response: String): Dropzone = js.native
  @JSName("emit")
  def emit_success(eventName: success, file: DropzoneFile, response: js.Object): Dropzone = js.native
  @JSName("emit")
  def emit_successmultiple(eventName: successmultiple, files: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_thumbnail(eventName: thumbnail, file: DropzoneFile, dataUrl: String): Dropzone = js.native
  @JSName("emit")
  def emit_totaluploadprogress(eventName: totaluploadprogress, totalProgress: Double, totalBytes: Double, totalBytesSent: Double): Dropzone = js.native
  @JSName("emit")
  def emit_uploadprogress(eventName: uploadprogress, file: DropzoneFile, progress: Double, bytesSent: Double): Dropzone = js.native
  
  def enable(): Unit = js.native
  
  def enqueueFile(file: DropzoneFile): Unit = js.native
  
  def enqueueFiles(file: js.Array[DropzoneFile]): Unit = js.native
  
  var files: js.Array[DropzoneFile] = js.native
  
  def getAcceptedFiles(): js.Array[DropzoneFile] = js.native
  
  def getActiveFiles(): js.Array[DropzoneFile] = js.native
  
  def getAddedFiles(): js.Array[DropzoneFile] = js.native
  
  def getFilesWithStatus(status: String): js.Array[DropzoneFile] = js.native
  
  def getQueuedFiles(): js.Array[DropzoneFile] = js.native
  
  def getRejectedFiles(): js.Array[DropzoneFile] = js.native
  
  def getUploadingFiles(): js.Array[DropzoneFile] = js.native
  
  var hiddenFileInput: js.UndefOr[HTMLInputElement] = js.native
  
  var listeners: js.Array[DropzoneListener] = js.native
  
  def off(): Dropzone = js.native
  def off(eventName: String): Dropzone = js.native
  def off(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Dropzone = js.native
  
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Dropzone = js.native
  @JSName("on")
  def on_addedfile(eventName: addedfile, callback: js.Function1[/* file */ DropzoneFile, _]): Dropzone = js.native
  @JSName("on")
  def on_addedfiles(eventName: addedfiles, callback: js.Function1[/* files */ js.Array[DropzoneFile], _]): Dropzone = js.native
  @JSName("on")
  def on_canceled(eventName: canceled, callback: js.Function1[/* file */ DropzoneFile, _]): Dropzone = js.native
  @JSName("on")
  def on_canceledmultiple(eventName: canceledmultiple, callback: js.Function1[/* file */ js.Array[DropzoneFile], _]): Dropzone = js.native
  @JSName("on")
  def on_complete(eventName: complete, callback: js.Function1[/* file */ DropzoneFile, _]): Dropzone = js.native
  @JSName("on")
  def on_completemultiple(eventName: completemultiple, callback: js.Function1[/* file */ js.Array[DropzoneFile], _]): Dropzone = js.native
  @JSName("on")
  def on_dragend(eventName: dragend, callback: js.Function1[/* e */ DragEvent, _]): Dropzone = js.native
  @JSName("on")
  def on_dragenter(eventName: dragenter, callback: js.Function1[/* e */ DragEvent, _]): Dropzone = js.native
  @JSName("on")
  def on_dragleave(eventName: dragleave, callback: js.Function1[/* e */ DragEvent, _]): Dropzone = js.native
  @JSName("on")
  def on_dragover(eventName: dragover, callback: js.Function1[/* e */ DragEvent, _]): Dropzone = js.native
  @JSName("on")
  def on_dragstart(eventName: dragstart, callback: js.Function1[/* e */ DragEvent, _]): Dropzone = js.native
  @JSName("on")
  def on_drop(eventName: drop, callback: js.Function1[/* e */ DragEvent, _]): Dropzone = js.native
  @JSName("on")
  def on_error(eventName: error, callback: js.Function2[/* file */ DropzoneFile, /* message */ String | Error, _]): Dropzone = js.native
  @JSName("on")
  def on_errormultiple(
    eventName: errormultiple,
    callback: js.Function2[/* files */ js.Array[DropzoneFile], /* message */ String | Error, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_maxfilesexceeded(eventName: maxfilesexceeded, callback: js.Function1[/* file */ DropzoneFile, _]): Dropzone = js.native
  @JSName("on")
  def on_maxfilesreached(eventName: maxfilesreached, callback: js.Function1[/* files */ js.Array[DropzoneFile], _]): Dropzone = js.native
  @JSName("on")
  def on_paste(eventName: paste, callback: js.Function1[/* e */ DragEvent, _]): Dropzone = js.native
  @JSName("on")
  def on_processing(eventName: processing, callback: js.Function1[/* file */ DropzoneFile, _]): Dropzone = js.native
  @JSName("on")
  def on_processingmultiple(eventName: processingmultiple, callback: js.Function1[/* files */ js.Array[DropzoneFile], _]): Dropzone = js.native
  @JSName("on")
  def on_queuecomplete(eventName: queuecomplete): Dropzone = js.native
  @JSName("on")
  def on_removedfile(eventName: removedfile, callback: js.Function1[/* file */ DropzoneFile, _]): Dropzone = js.native
  @JSName("on")
  def on_reset(eventName: reset): Dropzone = js.native
  @JSName("on")
  def on_sending(
    eventName: sending,
    callback: js.Function3[/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_sendingmultiple(
    eventName: sendingmultiple,
    callback: js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* xhr */ XMLHttpRequest, 
      /* formData */ FormData, 
      _
    ]
  ): Dropzone = js.native
  @JSName("on")
  def on_success(
    eventName: success,
    callback: js.Function2[/* file */ DropzoneFile, /* response */ js.Object | String, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_successmultiple(eventName: successmultiple, callback: js.Function1[/* files */ js.Array[DropzoneFile], _]): Dropzone = js.native
  @JSName("on")
  def on_thumbnail(eventName: thumbnail, callback: js.Function2[/* file */ DropzoneFile, /* dataUrl */ String, _]): Dropzone = js.native
  @JSName("on")
  def on_totaluploadprogress(
    eventName: totaluploadprogress,
    callback: js.Function3[/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_uploadprogress(
    eventName: uploadprogress,
    callback: js.Function3[/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double, _]
  ): Dropzone = js.native
  
  var options: DropzoneOptions = js.native
  
  var previewsContainer: HTMLElement = js.native
  
  def processFile(file: DropzoneFile): Unit = js.native
  
  def processFiles(files: js.Array[DropzoneFile]): Unit = js.native
  
  def processQueue(): Unit = js.native
  
  def removeAllFiles(): Unit = js.native
  def removeAllFiles(cancelIfNecessary: Boolean): Unit = js.native
  
  def removeFile(file: DropzoneFile): Unit = js.native
  
  def resizeImage(file: DropzoneFile): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String
  ): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def resizeImage(file: DropzoneFile, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    resizeMethod: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def resizeImage(file: DropzoneFile, width: js.UndefOr[scala.Nothing], height: Double, resizeMethod: String): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    resizeMethod: String,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def resizeImage(file: DropzoneFile, width: Double): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    resizeMethod: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def resizeImage(file: DropzoneFile, width: Double, height: js.UndefOr[scala.Nothing], resizeMethod: String): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    resizeMethod: String,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def resizeImage(file: DropzoneFile, width: Double, height: Double): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: Double,
    height: Double,
    resizeMethod: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def resizeImage(file: DropzoneFile, width: Double, height: Double, resizeMethod: String): Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: Double,
    height: Double,
    resizeMethod: String,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  
  def uploadFile(file: DropzoneFile): Unit = js.native
  
  def uploadFiles(files: js.Array[DropzoneFile]): Unit = js.native
  
  var version: String = js.native
}
