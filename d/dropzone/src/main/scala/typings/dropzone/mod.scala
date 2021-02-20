package typings.dropzone

import org.scalablytyped.runtime.StringDictionary
import typings.dropzone.dropzoneStrings.`use-credentials`
import typings.dropzone.dropzoneStrings.addedfile
import typings.dropzone.dropzoneStrings.addedfiles
import typings.dropzone.dropzoneStrings.anonymous
import typings.dropzone.dropzoneStrings.canceled
import typings.dropzone.dropzoneStrings.canceledmultiple
import typings.dropzone.dropzoneStrings.complete
import typings.dropzone.dropzoneStrings.completemultiple
import typings.dropzone.dropzoneStrings.contain
import typings.dropzone.dropzoneStrings.crop
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
import typings.std.Blob
import typings.std.DragEvent
import typings.std.Error
import typings.std.Event
import typings.std.File
import typings.std.FormData
import typings.std.HTMLInputElement
import typings.std.RegExp
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dropzone", JSImport.Namespace)
  @js.native
  class ^ protected () extends Dropzone {
    def this(container: String) = this()
    def this(container: HTMLElement) = this()
    def this(container: String, options: DropzoneOptions) = this()
    def this(container: HTMLElement, options: DropzoneOptions) = this()
  }
  @JSImport("dropzone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("dropzone", "ACCEPTED")
  @js.native
  def ACCEPTED: String = js.native
  @scala.inline
  def ACCEPTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCEPTED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "ADDED")
  @js.native
  def ADDED: String = js.native
  @scala.inline
  def ADDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "CANCELED")
  @js.native
  def CANCELED: String = js.native
  @scala.inline
  def CANCELED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "ERROR")
  @js.native
  def ERROR: String = js.native
  @scala.inline
  def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "PROCESSING")
  @js.native
  def PROCESSING: String = js.native
  @scala.inline
  def PROCESSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "QUEUED")
  @js.native
  def QUEUED: String = js.native
  @scala.inline
  def QUEUED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEUED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "SUCCESS")
  @js.native
  def SUCCESS: String = js.native
  @scala.inline
  def SUCCESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "UPLOADING")
  @js.native
  def UPLOADING: String = js.native
  @scala.inline
  def UPLOADING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPLOADING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "autoDiscover")
  @js.native
  def autoDiscover: Boolean = js.native
  @scala.inline
  def autoDiscover_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDiscover")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "blacklistedBrowsers")
  @js.native
  def blacklistedBrowsers: js.Array[RegExp] = js.native
  @scala.inline
  def blacklistedBrowsers_=(x: js.Array[RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blacklistedBrowsers")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "confirm")
  @js.native
  def confirm: js.Function3[
    /* question */ String, 
    /* accepted */ js.Function0[Unit], 
    /* rejected */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ] = js.native
  @scala.inline
  def confirm_=(
    x: js.Function3[
      /* question */ String, 
      /* accepted */ js.Function0[Unit], 
      /* rejected */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirm")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "createElement")
  @js.native
  def createElement(string: String): HTMLElement = js.native
  
  /* static member */
  @JSImport("dropzone", "dataURItoBlob")
  @js.native
  def dataURItoBlob(dataURI: String): Blob = js.native
  
  /* static member */
  @JSImport("dropzone", "discover")
  @js.native
  def discover(): js.Array[Dropzone] = js.native
  
  /* static member */
  @JSImport("dropzone", "elementInside")
  @js.native
  def elementInside(element: HTMLElement, container: HTMLElement): Boolean = js.native
  
  /* static member */
  @JSImport("dropzone", "forElement")
  @js.native
  def forElement(element: String): Dropzone = js.native
  @JSImport("dropzone", "forElement")
  @js.native
  def forElement(element: HTMLElement): Dropzone = js.native
  
  /* static member */
  @JSImport("dropzone", "getElement")
  @js.native
  def getElement(element: String): HTMLElement = js.native
  @JSImport("dropzone", "getElement")
  @js.native
  def getElement(element: String, name: String): HTMLElement = js.native
  @JSImport("dropzone", "getElement")
  @js.native
  def getElement(element: HTMLElement): HTMLElement = js.native
  @JSImport("dropzone", "getElement")
  @js.native
  def getElement(element: HTMLElement, name: String): HTMLElement = js.native
  
  /* static member */
  @JSImport("dropzone", "getElements")
  @js.native
  def getElements(elements: String): js.Array[HTMLElement] = js.native
  @JSImport("dropzone", "getElements")
  @js.native
  def getElements(elements: js.Array[String | HTMLElement]): js.Array[HTMLElement] = js.native
  @JSImport("dropzone", "getElements")
  @js.native
  def getElements(elements: HTMLElement): js.Array[HTMLElement] = js.native
  
  /* static member */
  @JSImport("dropzone", "instances")
  @js.native
  def instances: js.Array[Dropzone] = js.native
  @scala.inline
  def instances_=(x: js.Array[Dropzone]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instances")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "isBrowserSupported")
  @js.native
  def isBrowserSupported(): Boolean = js.native
  
  /* static member */
  @JSImport("dropzone", "isValidFile")
  @js.native
  def isValidFile(file: File, acceptedFiles: String): Boolean = js.native
  
  /* static member */
  @JSImport("dropzone", "optionsForElement")
  @js.native
  def optionsForElement(element: HTMLElement): js.UndefOr[DropzoneOptions] = js.native
  
  /* static member */
  @JSImport("dropzone", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Dropzone extends StObject {
    
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
  
  @js.native
  trait DropzoneDictFileSizeUnits extends StObject {
    
    var b: js.UndefOr[String] = js.native
    
    var gb: js.UndefOr[String] = js.native
    
    var kb: js.UndefOr[String] = js.native
    
    var mb: js.UndefOr[String] = js.native
    
    var tb: js.UndefOr[String] = js.native
  }
  object DropzoneDictFileSizeUnits {
    
    @scala.inline
    def apply(): DropzoneDictFileSizeUnits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneDictFileSizeUnits]
    }
    
    @scala.inline
    implicit class DropzoneDictFileSizeUnitsMutableBuilder[Self <: DropzoneDictFileSizeUnits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      @scala.inline
      def setGb(value: String): Self = StObject.set(x, "gb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGbUndefined: Self = StObject.set(x, "gb", js.undefined)
      
      @scala.inline
      def setKb(value: String): Self = StObject.set(x, "kb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKbUndefined: Self = StObject.set(x, "kb", js.undefined)
      
      @scala.inline
      def setMb(value: String): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      @scala.inline
      def setTb(value: String): Self = StObject.set(x, "tb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTbUndefined: Self = StObject.set(x, "tb", js.undefined)
    }
  }
  
  @js.native
  trait DropzoneFile extends File {
    
    var accepted: Boolean = js.native
    
    var dataURL: js.UndefOr[String] = js.native
    
    var previewElement: HTMLElement = js.native
    
    var previewTemplate: HTMLElement = js.native
    
    var previewsContainer: HTMLElement = js.native
    
    var status: String = js.native
    
    var upload: js.UndefOr[DropzoneFileUpload] = js.native
    
    var xhr: js.UndefOr[XMLHttpRequest] = js.native
  }
  
  @js.native
  trait DropzoneFileUpload extends StObject {
    
    var bytesSent: Double = js.native
    
    var progress: Double = js.native
    
    var total: Double = js.native
    
    var totalChunkCount: js.UndefOr[Double] = js.native
    
    var uuid: String = js.native
  }
  object DropzoneFileUpload {
    
    @scala.inline
    def apply(bytesSent: Double, progress: Double, total: Double, uuid: String): DropzoneFileUpload = {
      val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropzoneFileUpload]
    }
    
    @scala.inline
    implicit class DropzoneFileUploadMutableBuilder[Self <: DropzoneFileUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalChunkCount(value: Double): Self = StObject.set(x, "totalChunkCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalChunkCountUndefined: Self = StObject.set(x, "totalChunkCount", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropzoneListener extends StObject {
    
    var element: HTMLElement = js.native
    
    var events: StringDictionary[js.Function1[/* e */ Event, _]] = js.native
  }
  object DropzoneListener {
    
    @scala.inline
    def apply(element: HTMLElement, events: StringDictionary[js.Function1[/* e */ Event, _]]): DropzoneListener = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropzoneListener]
    }
    
    @scala.inline
    implicit class DropzoneListenerMutableBuilder[Self <: DropzoneListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: StringDictionary[js.Function1[/* e */ Event, _]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropzoneMockFile
    extends /* index */ StringDictionary[js.Any] {
    
    var name: String = js.native
    
    var size: Double = js.native
  }
  object DropzoneMockFile {
    
    @scala.inline
    def apply(name: String, size: Double): DropzoneMockFile = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropzoneMockFile]
    }
    
    @scala.inline
    implicit class DropzoneMockFileMutableBuilder[Self <: DropzoneMockFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropzoneOptions extends StObject {
    
    var accept: js.UndefOr[
        js.Function2[
          /* file */ DropzoneFile, 
          /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit], 
          Unit
        ]
      ] = js.native
    
    var acceptedFiles: js.UndefOr[String] = js.native
    
    var addRemoveLinks: js.UndefOr[Boolean] = js.native
    
    var addedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
    
    var addedfiles: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
    
    var autoProcessQueue: js.UndefOr[Boolean] = js.native
    
    var autoQueue: js.UndefOr[Boolean] = js.native
    
    var canceled: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
    
    var canceledmultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.native
    
    var capture: js.UndefOr[String] = js.native
    
    var chunkSize: js.UndefOr[Double] = js.native
    
    var chunking: js.UndefOr[Boolean] = js.native
    
    var chunksUploaded: js.UndefOr[
        js.Function2[
          /* file */ DropzoneFile, 
          /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit], 
          Unit
        ]
      ] = js.native
    
    var clickable: js.UndefOr[Boolean | String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
    
    var complete: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
    
    var completemultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.native
    
    var createImageThumbnails: js.UndefOr[Boolean] = js.native
    
    var dictCancelUpload: js.UndefOr[String] = js.native
    
    var dictCancelUploadConfirmation: js.UndefOr[String] = js.native
    
    var dictDefaultMessage: js.UndefOr[String] = js.native
    
    var dictFallbackMessage: js.UndefOr[String] = js.native
    
    var dictFallbackText: js.UndefOr[String] = js.native
    
    var dictFileSizeUnits: js.UndefOr[DropzoneDictFileSizeUnits] = js.native
    
    var dictFileTooBig: js.UndefOr[String] = js.native
    
    var dictInvalidFileType: js.UndefOr[String] = js.native
    
    var dictMaxFilesExceeded: js.UndefOr[String] = js.native
    
    var dictRemoveFile: js.UndefOr[String] = js.native
    
    var dictRemoveFileConfirmation: js.UndefOr[String] = js.native
    
    var dictResponseError: js.UndefOr[String] = js.native
    
    var dictUploadCanceled: js.UndefOr[String] = js.native
    
    var dragend: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
    
    var dragenter: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
    
    var dragleave: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
    
    var dragover: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
    
    var dragstart: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
    
    var drop: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
    
    var error: js.UndefOr[
        js.Function3[/* file */ DropzoneFile, /* message */ String | Error, /* xhr */ XMLHttpRequest, Unit]
      ] = js.native
    
    var errormultiple: js.UndefOr[
        js.Function3[
          /* files */ js.Array[DropzoneFile], 
          /* message */ String | Error, 
          /* xhr */ XMLHttpRequest, 
          Unit
        ]
      ] = js.native
    
    var fallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var filesizeBase: js.UndefOr[Double] = js.native
    
    var forceChunking: js.UndefOr[Boolean] = js.native
    
    var forceFallback: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var hiddenInputContainer: js.UndefOr[HTMLElement] = js.native
    
    var ignoreHiddenFiles: js.UndefOr[Boolean] = js.native
    
    var init: js.UndefOr[js.ThisFunction0[/* this */ Dropzone, Unit]] = js.native
    
    var maxFiles: js.UndefOr[Double] = js.native
    
    var maxFilesize: js.UndefOr[Double] = js.native
    
    var maxThumbnailFilesize: js.UndefOr[Double] = js.native
    
    var maxfilesexceeded: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
    
    var maxfilesreached: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
    
    var method: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.native
    
    var parallelChunkUploads: js.UndefOr[Boolean] = js.native
    
    var parallelUploads: js.UndefOr[Double] = js.native
    
    var paramName: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var paste: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
    
    var previewTemplate: js.UndefOr[String] = js.native
    
    var previewsContainer: js.UndefOr[Boolean | String | HTMLElement] = js.native
    
    var processing: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
    
    var processingmultiple: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
    
    var queuecomplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var removedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
    
    var renameFilename: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
    
    var reset: js.UndefOr[js.Function0[Unit]] = js.native
    
    var resize: js.UndefOr[
        js.Function4[
          /* file */ DropzoneFile, 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          /* resizeMethod */ js.UndefOr[String], 
          DropzoneResizeInfo
        ]
      ] = js.native
    
    var resizeHeight: js.UndefOr[Double] = js.native
    
    var resizeMethod: js.UndefOr[contain | crop] = js.native
    
    var resizeMimeType: js.UndefOr[String] = js.native
    
    var resizeQuality: js.UndefOr[Double] = js.native
    
    var resizeWidth: js.UndefOr[Double] = js.native
    
    var retryChunks: js.UndefOr[Boolean] = js.native
    
    var retryChunksLimit: js.UndefOr[Double] = js.native
    
    var sending: js.UndefOr[
        js.Function3[/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData, Unit]
      ] = js.native
    
    var sendingmultiple: js.UndefOr[
        js.Function3[
          /* files */ js.Array[DropzoneFile], 
          /* xhr */ XMLHttpRequest, 
          /* formData */ FormData, 
          Unit
        ]
      ] = js.native
    
    var success: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
    
    var successmultiple: js.UndefOr[
        js.Function2[/* files */ js.Array[DropzoneFile], /* responseText */ String, Unit]
      ] = js.native
    
    var thumbnail: js.UndefOr[js.Function2[/* file */ DropzoneFile, /* dataUrl */ String, Unit]] = js.native
    
    var thumbnailHeight: js.UndefOr[Double] = js.native
    
    var thumbnailMethod: js.UndefOr[contain | crop] = js.native
    
    var thumbnailWidth: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var totaluploadprogress: js.UndefOr[
        js.Function3[/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double, Unit]
      ] = js.native
    
    var transformFile: js.UndefOr[
        js.Function2[
          /* file */ DropzoneFile, 
          /* done */ js.Function1[/* file */ String | Blob, Unit], 
          Unit
        ]
      ] = js.native
    
    var uploadMultiple: js.UndefOr[Boolean] = js.native
    
    var uploadprogress: js.UndefOr[
        js.Function3[/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double, Unit]
      ] = js.native
    
    var url: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object DropzoneOptions {
    
    @scala.inline
    def apply(): DropzoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneOptions]
    }
    
    @scala.inline
    implicit class DropzoneOptionsMutableBuilder[Self <: DropzoneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(
        value: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit]) => Unit
      ): Self = StObject.set(x, "accept", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAcceptedFiles(value: String): Self = StObject.set(x, "acceptedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptedFilesUndefined: Self = StObject.set(x, "acceptedFiles", js.undefined)
      
      @scala.inline
      def setAddRemoveLinks(value: Boolean): Self = StObject.set(x, "addRemoveLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddRemoveLinksUndefined: Self = StObject.set(x, "addRemoveLinks", js.undefined)
      
      @scala.inline
      def setAddedfile(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "addedfile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddedfileUndefined: Self = StObject.set(x, "addedfile", js.undefined)
      
      @scala.inline
      def setAddedfiles(value: /* files */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "addedfiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddedfilesUndefined: Self = StObject.set(x, "addedfiles", js.undefined)
      
      @scala.inline
      def setAutoProcessQueue(value: Boolean): Self = StObject.set(x, "autoProcessQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoProcessQueueUndefined: Self = StObject.set(x, "autoProcessQueue", js.undefined)
      
      @scala.inline
      def setAutoQueue(value: Boolean): Self = StObject.set(x, "autoQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoQueueUndefined: Self = StObject.set(x, "autoQueue", js.undefined)
      
      @scala.inline
      def setCanceled(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "canceled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
      
      @scala.inline
      def setCanceledmultiple(value: /* file */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "canceledmultiple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanceledmultipleUndefined: Self = StObject.set(x, "canceledmultiple", js.undefined)
      
      @scala.inline
      def setCapture(value: String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setChunking(value: Boolean): Self = StObject.set(x, "chunking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkingUndefined: Self = StObject.set(x, "chunking", js.undefined)
      
      @scala.inline
      def setChunksUploaded(
        value: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit]) => Unit
      ): Self = StObject.set(x, "chunksUploaded", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChunksUploadedUndefined: Self = StObject.set(x, "chunksUploaded", js.undefined)
      
      @scala.inline
      def setClickable(value: Boolean | String | HTMLElement | (js.Array[String | HTMLElement])): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setClickableVarargs(value: (String | HTMLElement)*): Self = StObject.set(x, "clickable", js.Array(value :_*))
      
      @scala.inline
      def setComplete(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setCompletemultiple(value: /* file */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "completemultiple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompletemultipleUndefined: Self = StObject.set(x, "completemultiple", js.undefined)
      
      @scala.inline
      def setCreateImageThumbnails(value: Boolean): Self = StObject.set(x, "createImageThumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateImageThumbnailsUndefined: Self = StObject.set(x, "createImageThumbnails", js.undefined)
      
      @scala.inline
      def setDictCancelUpload(value: String): Self = StObject.set(x, "dictCancelUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictCancelUploadConfirmation(value: String): Self = StObject.set(x, "dictCancelUploadConfirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictCancelUploadConfirmationUndefined: Self = StObject.set(x, "dictCancelUploadConfirmation", js.undefined)
      
      @scala.inline
      def setDictCancelUploadUndefined: Self = StObject.set(x, "dictCancelUpload", js.undefined)
      
      @scala.inline
      def setDictDefaultMessage(value: String): Self = StObject.set(x, "dictDefaultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictDefaultMessageUndefined: Self = StObject.set(x, "dictDefaultMessage", js.undefined)
      
      @scala.inline
      def setDictFallbackMessage(value: String): Self = StObject.set(x, "dictFallbackMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictFallbackMessageUndefined: Self = StObject.set(x, "dictFallbackMessage", js.undefined)
      
      @scala.inline
      def setDictFallbackText(value: String): Self = StObject.set(x, "dictFallbackText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictFallbackTextUndefined: Self = StObject.set(x, "dictFallbackText", js.undefined)
      
      @scala.inline
      def setDictFileSizeUnits(value: DropzoneDictFileSizeUnits): Self = StObject.set(x, "dictFileSizeUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictFileSizeUnitsUndefined: Self = StObject.set(x, "dictFileSizeUnits", js.undefined)
      
      @scala.inline
      def setDictFileTooBig(value: String): Self = StObject.set(x, "dictFileTooBig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictFileTooBigUndefined: Self = StObject.set(x, "dictFileTooBig", js.undefined)
      
      @scala.inline
      def setDictInvalidFileType(value: String): Self = StObject.set(x, "dictInvalidFileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictInvalidFileTypeUndefined: Self = StObject.set(x, "dictInvalidFileType", js.undefined)
      
      @scala.inline
      def setDictMaxFilesExceeded(value: String): Self = StObject.set(x, "dictMaxFilesExceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictMaxFilesExceededUndefined: Self = StObject.set(x, "dictMaxFilesExceeded", js.undefined)
      
      @scala.inline
      def setDictRemoveFile(value: String): Self = StObject.set(x, "dictRemoveFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictRemoveFileConfirmation(value: String): Self = StObject.set(x, "dictRemoveFileConfirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictRemoveFileConfirmationUndefined: Self = StObject.set(x, "dictRemoveFileConfirmation", js.undefined)
      
      @scala.inline
      def setDictRemoveFileUndefined: Self = StObject.set(x, "dictRemoveFile", js.undefined)
      
      @scala.inline
      def setDictResponseError(value: String): Self = StObject.set(x, "dictResponseError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictResponseErrorUndefined: Self = StObject.set(x, "dictResponseError", js.undefined)
      
      @scala.inline
      def setDictUploadCanceled(value: String): Self = StObject.set(x, "dictUploadCanceled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictUploadCanceledUndefined: Self = StObject.set(x, "dictUploadCanceled", js.undefined)
      
      @scala.inline
      def setDragend(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
      
      @scala.inline
      def setDragenter(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragenter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
      
      @scala.inline
      def setDragleave(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragleave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
      
      @scala.inline
      def setDragover(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
      
      @scala.inline
      def setDragstart(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
      
      @scala.inline
      def setDrop(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setError(value: (/* file */ DropzoneFile, /* message */ String | Error, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setErrormultiple(
        value: (/* files */ js.Array[DropzoneFile], /* message */ String | Error, /* xhr */ XMLHttpRequest) => Unit
      ): Self = StObject.set(x, "errormultiple", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrormultipleUndefined: Self = StObject.set(x, "errormultiple", js.undefined)
      
      @scala.inline
      def setFallback(value: () => Unit): Self = StObject.set(x, "fallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setFilesizeBase(value: Double): Self = StObject.set(x, "filesizeBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesizeBaseUndefined: Self = StObject.set(x, "filesizeBase", js.undefined)
      
      @scala.inline
      def setForceChunking(value: Boolean): Self = StObject.set(x, "forceChunking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceChunkingUndefined: Self = StObject.set(x, "forceChunking", js.undefined)
      
      @scala.inline
      def setForceFallback(value: Boolean): Self = StObject.set(x, "forceFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFallbackUndefined: Self = StObject.set(x, "forceFallback", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHiddenInputContainer(value: HTMLElement): Self = StObject.set(x, "hiddenInputContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenInputContainerUndefined: Self = StObject.set(x, "hiddenInputContainer", js.undefined)
      
      @scala.inline
      def setIgnoreHiddenFiles(value: Boolean): Self = StObject.set(x, "ignoreHiddenFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHiddenFilesUndefined: Self = StObject.set(x, "ignoreHiddenFiles", js.undefined)
      
      @scala.inline
      def setInit(value: js.ThisFunction0[/* this */ Dropzone, Unit]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      @scala.inline
      def setMaxFilesize(value: Double): Self = StObject.set(x, "maxFilesize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFilesizeUndefined: Self = StObject.set(x, "maxFilesize", js.undefined)
      
      @scala.inline
      def setMaxThumbnailFilesize(value: Double): Self = StObject.set(x, "maxThumbnailFilesize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxThumbnailFilesizeUndefined: Self = StObject.set(x, "maxThumbnailFilesize", js.undefined)
      
      @scala.inline
      def setMaxfilesexceeded(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "maxfilesexceeded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxfilesexceededUndefined: Self = StObject.set(x, "maxfilesexceeded", js.undefined)
      
      @scala.inline
      def setMaxfilesreached(value: /* files */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "maxfilesreached", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxfilesreachedUndefined: Self = StObject.set(x, "maxfilesreached", js.undefined)
      
      @scala.inline
      def setMethod(value: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodFunction1(value: /* files */ js.Array[DropzoneFile] => String): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParallelChunkUploads(value: Boolean): Self = StObject.set(x, "parallelChunkUploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelChunkUploadsUndefined: Self = StObject.set(x, "parallelChunkUploads", js.undefined)
      
      @scala.inline
      def setParallelUploads(value: Double): Self = StObject.set(x, "parallelUploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUploadsUndefined: Self = StObject.set(x, "parallelUploads", js.undefined)
      
      @scala.inline
      def setParamName(value: String): Self = StObject.set(x, "paramName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamNameUndefined: Self = StObject.set(x, "paramName", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPaste(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      @scala.inline
      def setPreviewTemplate(value: String): Self = StObject.set(x, "previewTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewTemplateUndefined: Self = StObject.set(x, "previewTemplate", js.undefined)
      
      @scala.inline
      def setPreviewsContainer(value: Boolean | String | HTMLElement): Self = StObject.set(x, "previewsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewsContainerUndefined: Self = StObject.set(x, "previewsContainer", js.undefined)
      
      @scala.inline
      def setProcessing(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "processing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
      
      @scala.inline
      def setProcessingmultiple(value: /* files */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "processingmultiple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessingmultipleUndefined: Self = StObject.set(x, "processingmultiple", js.undefined)
      
      @scala.inline
      def setQueuecomplete(value: () => Unit): Self = StObject.set(x, "queuecomplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQueuecompleteUndefined: Self = StObject.set(x, "queuecomplete", js.undefined)
      
      @scala.inline
      def setRemovedfile(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "removedfile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovedfileUndefined: Self = StObject.set(x, "removedfile", js.undefined)
      
      @scala.inline
      def setRenameFilename(value: /* name */ String => String): Self = StObject.set(x, "renameFilename", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenameFilenameUndefined: Self = StObject.set(x, "renameFilename", js.undefined)
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setResize(
        value: (/* file */ DropzoneFile, /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* resizeMethod */ js.UndefOr[String]) => DropzoneResizeInfo
      ): Self = StObject.set(x, "resize", js.Any.fromFunction4(value))
      
      @scala.inline
      def setResizeHeight(value: Double): Self = StObject.set(x, "resizeHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHeightUndefined: Self = StObject.set(x, "resizeHeight", js.undefined)
      
      @scala.inline
      def setResizeMethod(value: contain | crop): Self = StObject.set(x, "resizeMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeMethodUndefined: Self = StObject.set(x, "resizeMethod", js.undefined)
      
      @scala.inline
      def setResizeMimeType(value: String): Self = StObject.set(x, "resizeMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeMimeTypeUndefined: Self = StObject.set(x, "resizeMimeType", js.undefined)
      
      @scala.inline
      def setResizeQuality(value: Double): Self = StObject.set(x, "resizeQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeQualityUndefined: Self = StObject.set(x, "resizeQuality", js.undefined)
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setResizeWidth(value: Double): Self = StObject.set(x, "resizeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeWidthUndefined: Self = StObject.set(x, "resizeWidth", js.undefined)
      
      @scala.inline
      def setRetryChunks(value: Boolean): Self = StObject.set(x, "retryChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryChunksLimit(value: Double): Self = StObject.set(x, "retryChunksLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryChunksLimitUndefined: Self = StObject.set(x, "retryChunksLimit", js.undefined)
      
      @scala.inline
      def setRetryChunksUndefined: Self = StObject.set(x, "retryChunks", js.undefined)
      
      @scala.inline
      def setSending(value: (/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit): Self = StObject.set(x, "sending", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSendingUndefined: Self = StObject.set(x, "sending", js.undefined)
      
      @scala.inline
      def setSendingmultiple(
        value: (/* files */ js.Array[DropzoneFile], /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit
      ): Self = StObject.set(x, "sendingmultiple", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSendingmultipleUndefined: Self = StObject.set(x, "sendingmultiple", js.undefined)
      
      @scala.inline
      def setSuccess(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setSuccessmultiple(value: (/* files */ js.Array[DropzoneFile], /* responseText */ String) => Unit): Self = StObject.set(x, "successmultiple", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuccessmultipleUndefined: Self = StObject.set(x, "successmultiple", js.undefined)
      
      @scala.inline
      def setThumbnail(value: (/* file */ DropzoneFile, /* dataUrl */ String) => Unit): Self = StObject.set(x, "thumbnail", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThumbnailHeight(value: Double): Self = StObject.set(x, "thumbnailHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailHeightUndefined: Self = StObject.set(x, "thumbnailHeight", js.undefined)
      
      @scala.inline
      def setThumbnailMethod(value: contain | crop): Self = StObject.set(x, "thumbnailMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailMethodUndefined: Self = StObject.set(x, "thumbnailMethod", js.undefined)
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setThumbnailWidth(value: Double): Self = StObject.set(x, "thumbnailWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailWidthUndefined: Self = StObject.set(x, "thumbnailWidth", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTotaluploadprogress(value: (/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double) => Unit): Self = StObject.set(x, "totaluploadprogress", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTotaluploadprogressUndefined: Self = StObject.set(x, "totaluploadprogress", js.undefined)
      
      @scala.inline
      def setTransformFile(value: (/* file */ DropzoneFile, /* done */ js.Function1[/* file */ String | Blob, Unit]) => Unit): Self = StObject.set(x, "transformFile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformFileUndefined: Self = StObject.set(x, "transformFile", js.undefined)
      
      @scala.inline
      def setUploadMultiple(value: Boolean): Self = StObject.set(x, "uploadMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadMultipleUndefined: Self = StObject.set(x, "uploadMultiple", js.undefined)
      
      @scala.inline
      def setUploadprogress(value: (/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double) => Unit): Self = StObject.set(x, "uploadprogress", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUploadprogressUndefined: Self = StObject.set(x, "uploadprogress", js.undefined)
      
      @scala.inline
      def setUrl(value: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlFunction1(value: /* files */ js.Array[DropzoneFile] => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait DropzoneResizeInfo extends StObject {
    
    var srcHeight: js.UndefOr[Double] = js.native
    
    var srcWidth: js.UndefOr[Double] = js.native
    
    var srcX: js.UndefOr[Double] = js.native
    
    var srcY: js.UndefOr[Double] = js.native
    
    var trgHeight: js.UndefOr[Double] = js.native
    
    var trgWidth: js.UndefOr[Double] = js.native
    
    var trgX: js.UndefOr[Double] = js.native
    
    var trgY: js.UndefOr[Double] = js.native
  }
  object DropzoneResizeInfo {
    
    @scala.inline
    def apply(): DropzoneResizeInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneResizeInfo]
    }
    
    @scala.inline
    implicit class DropzoneResizeInfoMutableBuilder[Self <: DropzoneResizeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrcHeight(value: Double): Self = StObject.set(x, "srcHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcHeightUndefined: Self = StObject.set(x, "srcHeight", js.undefined)
      
      @scala.inline
      def setSrcWidth(value: Double): Self = StObject.set(x, "srcWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcWidthUndefined: Self = StObject.set(x, "srcWidth", js.undefined)
      
      @scala.inline
      def setSrcX(value: Double): Self = StObject.set(x, "srcX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcXUndefined: Self = StObject.set(x, "srcX", js.undefined)
      
      @scala.inline
      def setSrcY(value: Double): Self = StObject.set(x, "srcY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcYUndefined: Self = StObject.set(x, "srcY", js.undefined)
      
      @scala.inline
      def setTrgHeight(value: Double): Self = StObject.set(x, "trgHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrgHeightUndefined: Self = StObject.set(x, "trgHeight", js.undefined)
      
      @scala.inline
      def setTrgWidth(value: Double): Self = StObject.set(x, "trgWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrgWidthUndefined: Self = StObject.set(x, "trgWidth", js.undefined)
      
      @scala.inline
      def setTrgX(value: Double): Self = StObject.set(x, "trgX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrgXUndefined: Self = StObject.set(x, "trgX", js.undefined)
      
      @scala.inline
      def setTrgY(value: Double): Self = StObject.set(x, "trgY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrgYUndefined: Self = StObject.set(x, "trgY", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait HTMLElement extends StObject {
      
      var dropzone: Dropzone = js.native
    }
    object HTMLElement {
      
      @scala.inline
      def apply(dropzone: Dropzone): HTMLElement = {
        val __obj = js.Dynamic.literal(dropzone = dropzone.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElement]
      }
      
      @scala.inline
      implicit class HTMLElementMutableBuilder[Self <: HTMLElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDropzone(value: Dropzone): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait JQuery extends StObject {
      
      def dropzone(options: DropzoneOptions): Dropzone = js.native
    }
    object JQuery {
      
      @scala.inline
      def apply(dropzone: DropzoneOptions => Dropzone): JQuery = {
        val __obj = js.Dynamic.literal(dropzone = js.Any.fromFunction1(dropzone))
        __obj.asInstanceOf[JQuery]
      }
      
      @scala.inline
      implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDropzone(value: DropzoneOptions => Dropzone): Self = StObject.set(x, "dropzone", js.Any.fromFunction1(value))
      }
    }
  }
  
  /* static member */
  object options
}
