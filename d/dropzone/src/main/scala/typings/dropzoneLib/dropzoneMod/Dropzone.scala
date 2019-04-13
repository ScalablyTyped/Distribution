package typings
package dropzoneLib.dropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropzone extends js.Object {
  var defaultOptions: DropzoneOptions = js.native
  var files: js.Array[DropzoneFile] = js.native
  def accept(
    file: DropzoneFile,
    done: js.Function1[/* error */ js.UndefOr[java.lang.String | stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def addFile(file: DropzoneFile): scala.Unit = js.native
  def cancelUpload(file: DropzoneFile): scala.Unit = js.native
  def createThumbnail(file: DropzoneFile): js.Any = js.native
  def createThumbnail(file: DropzoneFile, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: scala.Double): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: scala.Double, height: scala.Double): js.Any = js.native
  def createThumbnail(file: DropzoneFile, width: scala.Double, height: scala.Double, resizeMethod: java.lang.String): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: scala.Double,
    height: scala.Double,
    resizeMethod: java.lang.String,
    fixOrientation: scala.Boolean
  ): js.Any = js.native
  def createThumbnail(
    file: DropzoneFile,
    width: scala.Double,
    height: scala.Double,
    resizeMethod: java.lang.String,
    fixOrientation: scala.Boolean,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Any = js.native
  def createThumbnailFromUrl(file: DropzoneFile, url: java.lang.String): js.Any = js.native
  def createThumbnailFromUrl(
    file: DropzoneFile,
    url: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Any = js.native
  def createThumbnailFromUrl(
    file: DropzoneFile,
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    resizeMethod: js.UndefOr[java.lang.String],
    fixOrientation: js.UndefOr[scala.Boolean],
    callback: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]],
    crossOrigin: js.UndefOr[java.lang.String]
  ): js.Any = js.native
  def destroy(): Dropzone = js.native
  def disable(): scala.Unit = js.native
  def emit(eventName: java.lang.String, args: js.Any*): Dropzone = js.native
  @JSName("emit")
  def emit_addedfile(eventName: dropzoneLib.dropzoneLibStrings.addedfile, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_addedfiles(eventName: dropzoneLib.dropzoneLibStrings.addedfiles, files: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_canceled(eventName: dropzoneLib.dropzoneLibStrings.canceled, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_canceledmultiple(eventName: dropzoneLib.dropzoneLibStrings.canceledmultiple, file: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_complete(eventName: dropzoneLib.dropzoneLibStrings.complete, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_completemultiple(eventName: dropzoneLib.dropzoneLibStrings.completemultiple, file: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_dragend(eventName: dropzoneLib.dropzoneLibStrings.dragend, e: stdLib.DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_dragenter(eventName: dropzoneLib.dropzoneLibStrings.dragenter, e: stdLib.DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_dragleave(eventName: dropzoneLib.dropzoneLibStrings.dragleave, e: stdLib.DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_dragover(eventName: dropzoneLib.dropzoneLibStrings.dragover, e: stdLib.DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_dragstart(eventName: dropzoneLib.dropzoneLibStrings.dragstart, e: stdLib.DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_drop(eventName: dropzoneLib.dropzoneLibStrings.drop, e: stdLib.DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_error(eventName: dropzoneLib.dropzoneLibStrings.error, file: DropzoneFile, message: java.lang.String): Dropzone = js.native
  @JSName("emit")
  def emit_error(eventName: dropzoneLib.dropzoneLibStrings.error, file: DropzoneFile, message: stdLib.Error): Dropzone = js.native
  @JSName("emit")
  def emit_errormultiple(
    eventName: dropzoneLib.dropzoneLibStrings.errormultiple,
    files: js.Array[DropzoneFile],
    message: java.lang.String
  ): Dropzone = js.native
  @JSName("emit")
  def emit_errormultiple(
    eventName: dropzoneLib.dropzoneLibStrings.errormultiple,
    files: js.Array[DropzoneFile],
    message: stdLib.Error
  ): Dropzone = js.native
  @JSName("emit")
  def emit_maxfilesexceeded(eventName: dropzoneLib.dropzoneLibStrings.maxfilesexceeded, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_maxfilesreached(eventName: dropzoneLib.dropzoneLibStrings.maxfilesreached, files: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_paste(eventName: dropzoneLib.dropzoneLibStrings.paste, e: stdLib.DragEvent): Dropzone = js.native
  @JSName("emit")
  def emit_processing(eventName: dropzoneLib.dropzoneLibStrings.processing, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_processingmultiple(eventName: dropzoneLib.dropzoneLibStrings.processingmultiple, files: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_queuecomplete(eventName: dropzoneLib.dropzoneLibStrings.queuecomplete): Dropzone = js.native
  @JSName("emit")
  def emit_removedfile(eventName: dropzoneLib.dropzoneLibStrings.removedfile, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_reset(eventName: dropzoneLib.dropzoneLibStrings.reset): Dropzone = js.native
  @JSName("emit")
  def emit_sending(
    eventName: dropzoneLib.dropzoneLibStrings.sending,
    file: DropzoneFile,
    xhr: stdLib.XMLHttpRequest,
    formData: stdLib.FormData
  ): Dropzone = js.native
  @JSName("emit")
  def emit_sendingmultiple(
    eventName: dropzoneLib.dropzoneLibStrings.sendingmultiple,
    files: js.Array[DropzoneFile],
    xhr: stdLib.XMLHttpRequest,
    formData: stdLib.FormData
  ): Dropzone = js.native
  @JSName("emit")
  def emit_success(eventName: dropzoneLib.dropzoneLibStrings.success, file: DropzoneFile): Dropzone = js.native
  @JSName("emit")
  def emit_successmultiple(eventName: dropzoneLib.dropzoneLibStrings.successmultiple, files: js.Array[DropzoneFile]): Dropzone = js.native
  @JSName("emit")
  def emit_thumbnail(eventName: dropzoneLib.dropzoneLibStrings.thumbnail, file: DropzoneFile, dataUrl: java.lang.String): Dropzone = js.native
  @JSName("emit")
  def emit_totaluploadprogress(
    eventName: dropzoneLib.dropzoneLibStrings.totaluploadprogress,
    totalProgress: scala.Double,
    totalBytes: scala.Double,
    totalBytesSent: scala.Double
  ): Dropzone = js.native
  @JSName("emit")
  def emit_uploadprogress(
    eventName: dropzoneLib.dropzoneLibStrings.uploadprogress,
    file: DropzoneFile,
    progress: scala.Double,
    bytesSent: scala.Double
  ): Dropzone = js.native
  def enable(): scala.Unit = js.native
  def enqueueFile(file: DropzoneFile): scala.Unit = js.native
  def enqueueFiles(file: js.Array[DropzoneFile]): scala.Unit = js.native
  def getAcceptedFiles(): js.Array[DropzoneFile] = js.native
  def getActiveFiles(): js.Array[DropzoneFile] = js.native
  def getAddedFiles(): js.Array[DropzoneFile] = js.native
  def getFilesWithStatus(status: java.lang.String): js.Array[DropzoneFile] = js.native
  def getQueuedFiles(): js.Array[DropzoneFile] = js.native
  def getRejectedFiles(): js.Array[DropzoneFile] = js.native
  def getUploadingFiles(): js.Array[DropzoneFile] = js.native
  def off(): Dropzone = js.native
  def off(eventName: java.lang.String): Dropzone = js.native
  def off(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Dropzone = js.native
  def on(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Dropzone = js.native
  @JSName("on")
  def on_addedfile(
    eventName: dropzoneLib.dropzoneLibStrings.addedfile,
    callback: js.Function1[/* file */ DropzoneFile, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_addedfiles(
    eventName: dropzoneLib.dropzoneLibStrings.addedfiles,
    callback: js.Function1[/* files */ js.Array[DropzoneFile], _]
  ): Dropzone = js.native
  @JSName("on")
  def on_canceled(
    eventName: dropzoneLib.dropzoneLibStrings.canceled,
    callback: js.Function1[/* file */ DropzoneFile, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_canceledmultiple(
    eventName: dropzoneLib.dropzoneLibStrings.canceledmultiple,
    callback: js.Function1[/* file */ js.Array[DropzoneFile], _]
  ): Dropzone = js.native
  @JSName("on")
  def on_complete(
    eventName: dropzoneLib.dropzoneLibStrings.complete,
    callback: js.Function1[/* file */ DropzoneFile, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_completemultiple(
    eventName: dropzoneLib.dropzoneLibStrings.completemultiple,
    callback: js.Function1[/* file */ js.Array[DropzoneFile], _]
  ): Dropzone = js.native
  @JSName("on")
  def on_dragend(
    eventName: dropzoneLib.dropzoneLibStrings.dragend,
    callback: js.Function1[/* e */ stdLib.DragEvent, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_dragenter(
    eventName: dropzoneLib.dropzoneLibStrings.dragenter,
    callback: js.Function1[/* e */ stdLib.DragEvent, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_dragleave(
    eventName: dropzoneLib.dropzoneLibStrings.dragleave,
    callback: js.Function1[/* e */ stdLib.DragEvent, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_dragover(
    eventName: dropzoneLib.dropzoneLibStrings.dragover,
    callback: js.Function1[/* e */ stdLib.DragEvent, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_dragstart(
    eventName: dropzoneLib.dropzoneLibStrings.dragstart,
    callback: js.Function1[/* e */ stdLib.DragEvent, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_drop(
    eventName: dropzoneLib.dropzoneLibStrings.drop,
    callback: js.Function1[/* e */ stdLib.DragEvent, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_error(
    eventName: dropzoneLib.dropzoneLibStrings.error,
    callback: js.Function2[/* file */ DropzoneFile, /* message */ java.lang.String | stdLib.Error, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_errormultiple(
    eventName: dropzoneLib.dropzoneLibStrings.errormultiple,
    callback: js.Function2[/* files */ js.Array[DropzoneFile], /* message */ java.lang.String | stdLib.Error, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_maxfilesexceeded(
    eventName: dropzoneLib.dropzoneLibStrings.maxfilesexceeded,
    callback: js.Function1[/* file */ DropzoneFile, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_maxfilesreached(
    eventName: dropzoneLib.dropzoneLibStrings.maxfilesreached,
    callback: js.Function1[/* files */ js.Array[DropzoneFile], _]
  ): Dropzone = js.native
  @JSName("on")
  def on_paste(
    eventName: dropzoneLib.dropzoneLibStrings.paste,
    callback: js.Function1[/* e */ stdLib.DragEvent, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_processing(
    eventName: dropzoneLib.dropzoneLibStrings.processing,
    callback: js.Function1[/* file */ DropzoneFile, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_processingmultiple(
    eventName: dropzoneLib.dropzoneLibStrings.processingmultiple,
    callback: js.Function1[/* files */ js.Array[DropzoneFile], _]
  ): Dropzone = js.native
  @JSName("on")
  def on_queuecomplete(eventName: dropzoneLib.dropzoneLibStrings.queuecomplete): Dropzone = js.native
  @JSName("on")
  def on_removedfile(
    eventName: dropzoneLib.dropzoneLibStrings.removedfile,
    callback: js.Function1[/* file */ DropzoneFile, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_reset(eventName: dropzoneLib.dropzoneLibStrings.reset): Dropzone = js.native
  @JSName("on")
  def on_sending(
    eventName: dropzoneLib.dropzoneLibStrings.sending,
    callback: js.Function3[
      /* file */ DropzoneFile, 
      /* xhr */ stdLib.XMLHttpRequest, 
      /* formData */ stdLib.FormData, 
      _
    ]
  ): Dropzone = js.native
  @JSName("on")
  def on_sendingmultiple(
    eventName: dropzoneLib.dropzoneLibStrings.sendingmultiple,
    callback: js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* xhr */ stdLib.XMLHttpRequest, 
      /* formData */ stdLib.FormData, 
      _
    ]
  ): Dropzone = js.native
  @JSName("on")
  def on_success(
    eventName: dropzoneLib.dropzoneLibStrings.success,
    callback: js.Function1[/* file */ DropzoneFile, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_successmultiple(
    eventName: dropzoneLib.dropzoneLibStrings.successmultiple,
    callback: js.Function1[/* files */ js.Array[DropzoneFile], _]
  ): Dropzone = js.native
  @JSName("on")
  def on_thumbnail(
    eventName: dropzoneLib.dropzoneLibStrings.thumbnail,
    callback: js.Function2[/* file */ DropzoneFile, /* dataUrl */ java.lang.String, _]
  ): Dropzone = js.native
  @JSName("on")
  def on_totaluploadprogress(
    eventName: dropzoneLib.dropzoneLibStrings.totaluploadprogress,
    callback: js.Function3[
      /* totalProgress */ scala.Double, 
      /* totalBytes */ scala.Double, 
      /* totalBytesSent */ scala.Double, 
      _
    ]
  ): Dropzone = js.native
  @JSName("on")
  def on_uploadprogress(
    eventName: dropzoneLib.dropzoneLibStrings.uploadprogress,
    callback: js.Function3[/* file */ DropzoneFile, /* progress */ scala.Double, /* bytesSent */ scala.Double, _]
  ): Dropzone = js.native
  def processFile(file: DropzoneFile): scala.Unit = js.native
  def processFiles(files: js.Array[DropzoneFile]): scala.Unit = js.native
  def processQueue(): scala.Unit = js.native
  def removeAllFiles(): scala.Unit = js.native
  def removeAllFiles(cancelIfNecessary: scala.Boolean): scala.Unit = js.native
  def removeFile(file: DropzoneFile): scala.Unit = js.native
  def resizeImage(file: DropzoneFile): scala.Unit = js.native
  def resizeImage(file: DropzoneFile, width: scala.Double): scala.Unit = js.native
  def resizeImage(file: DropzoneFile, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def resizeImage(file: DropzoneFile, width: scala.Double, height: scala.Double, resizeMethod: java.lang.String): scala.Unit = js.native
  def resizeImage(
    file: DropzoneFile,
    width: scala.Double,
    height: scala.Double,
    resizeMethod: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def uploadFile(file: DropzoneFile): scala.Unit = js.native
  def uploadFiles(files: js.Array[DropzoneFile]): scala.Unit = js.native
}

