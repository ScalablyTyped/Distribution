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
import typings.std.Event
import typings.std.File
import typings.std.FormData
import typings.std.HTMLInputElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dropzone", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Dropzone {
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
  inline def ACCEPTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCEPTED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "ADDED")
  @js.native
  def ADDED: String = js.native
  inline def ADDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "CANCELED")
  @js.native
  def CANCELED: String = js.native
  inline def CANCELED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "ERROR")
  @js.native
  def ERROR: String = js.native
  inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "PROCESSING")
  @js.native
  def PROCESSING: String = js.native
  inline def PROCESSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "QUEUED")
  @js.native
  def QUEUED: String = js.native
  inline def QUEUED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEUED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "SUCCESS")
  @js.native
  def SUCCESS: String = js.native
  inline def SUCCESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "UPLOADING")
  @js.native
  def UPLOADING: String = js.native
  inline def UPLOADING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPLOADING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "autoDiscover")
  @js.native
  def autoDiscover: Boolean = js.native
  inline def autoDiscover_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDiscover")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "blacklistedBrowsers")
  @js.native
  def blacklistedBrowsers: js.Array[js.RegExp] = js.native
  inline def blacklistedBrowsers_=(x: js.Array[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blacklistedBrowsers")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dropzone", "confirm")
  @js.native
  def confirm: js.Function3[
    /* question */ String, 
    /* accepted */ js.Function0[Unit], 
    /* rejected */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ] = js.native
  inline def confirm_=(
    x: js.Function3[
      /* question */ String, 
      /* accepted */ js.Function0[Unit], 
      /* rejected */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirm")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def createElement(string: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(string.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  /* static member */
  inline def dataURItoBlob(dataURI: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("dataURItoBlob")(dataURI.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  /* static member */
  inline def discover(): js.Array[Dropzone] = ^.asInstanceOf[js.Dynamic].applyDynamic("discover")().asInstanceOf[js.Array[Dropzone]]
  
  /* static member */
  inline def elementInside(element: HTMLElement, container: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementInside")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def forElement(element: String): Dropzone = ^.asInstanceOf[js.Dynamic].applyDynamic("forElement")(element.asInstanceOf[js.Any]).asInstanceOf[Dropzone]
  inline def forElement(element: HTMLElement): Dropzone = ^.asInstanceOf[js.Dynamic].applyDynamic("forElement")(element.asInstanceOf[js.Any]).asInstanceOf[Dropzone]
  
  /* static member */
  inline def getElement(element: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def getElement(element: String, name: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def getElement(element: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def getElement(element: HTMLElement, name: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  /* static member */
  inline def getElements(elements: String): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getElements(elements: js.Array[String | HTMLElement]): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getElements(elements: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  
  /* static member */
  @JSImport("dropzone", "instances")
  @js.native
  def instances: js.Array[Dropzone] = js.native
  inline def instances_=(x: js.Array[Dropzone]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instances")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def isBrowserSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserSupported")().asInstanceOf[Boolean]
  
  /* static member */
  inline def isValidFile(file: File, acceptedFiles: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidFile")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def optionsForElement(element: HTMLElement): js.UndefOr[DropzoneOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsForElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DropzoneOptions]]
  
  /* static member */
  @JSImport("dropzone", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Dropzone extends StObject {
    
    def accept(file: DropzoneFile, done: js.Function1[/* error */ js.UndefOr[String | js.Error], Unit]): Unit = js.native
    
    def addFile(file: DropzoneFile): Unit = js.native
    
    def cancelUpload(file: DropzoneFile): Unit = js.native
    
    def createThumbnail(file: DropzoneFile): Any = js.native
    def createThumbnail(file: DropzoneFile, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Double): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Double, height: Double): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Double, height: Double, resizeMethod: String): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Double, height: Double, resizeMethod: String, fixOrientation: Boolean): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Double,
      height: Double,
      resizeMethod: String,
      fixOrientation: Boolean,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Double,
      height: Double,
      resizeMethod: String,
      fixOrientation: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Double, height: Double, resizeMethod: Unit, fixOrientation: Boolean): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Double,
      height: Double,
      resizeMethod: Unit,
      fixOrientation: Boolean,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Double,
      height: Double,
      resizeMethod: Unit,
      fixOrientation: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Double, height: Unit, resizeMethod: String): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Double, height: Unit, resizeMethod: String, fixOrientation: Boolean): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Double,
      height: Unit,
      resizeMethod: String,
      fixOrientation: Boolean,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Double,
      height: Unit,
      resizeMethod: String,
      fixOrientation: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Double, height: Unit, resizeMethod: Unit, fixOrientation: Boolean): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Double,
      height: Unit,
      resizeMethod: Unit,
      fixOrientation: Boolean,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Double,
      height: Unit,
      resizeMethod: Unit,
      fixOrientation: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Unit, height: Double): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Unit, height: Double, resizeMethod: String): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Unit, height: Double, resizeMethod: String, fixOrientation: Boolean): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Unit,
      height: Double,
      resizeMethod: String,
      fixOrientation: Boolean,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Unit,
      height: Double,
      resizeMethod: String,
      fixOrientation: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Unit, height: Double, resizeMethod: Unit, fixOrientation: Boolean): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Unit,
      height: Double,
      resizeMethod: Unit,
      fixOrientation: Boolean,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Unit,
      height: Double,
      resizeMethod: Unit,
      fixOrientation: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Unit, height: Unit, resizeMethod: String): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Unit, height: Unit, resizeMethod: String, fixOrientation: Boolean): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Unit,
      height: Unit,
      resizeMethod: String,
      fixOrientation: Boolean,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Unit,
      height: Unit,
      resizeMethod: String,
      fixOrientation: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(file: DropzoneFile, width: Unit, height: Unit, resizeMethod: Unit, fixOrientation: Boolean): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Unit,
      height: Unit,
      resizeMethod: Unit,
      fixOrientation: Boolean,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    def createThumbnail(
      file: DropzoneFile,
      width: Unit,
      height: Unit,
      resizeMethod: Unit,
      fixOrientation: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Any = js.native
    
    def createThumbnailFromUrl(file: DropzoneFile, url: String): Any = js.native
    def createThumbnailFromUrl(file: DropzoneFile, url: String, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
    def createThumbnailFromUrl(
      file: DropzoneFile,
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      resizeMethod: js.UndefOr[String],
      fixOrientation: js.UndefOr[Boolean],
      callback: js.UndefOr[js.Function1[/* repeated */ Any, Unit]],
      crossOrigin: js.UndefOr[String]
    ): Any = js.native
    
    var defaultOptions: DropzoneOptions = js.native
    
    def destroy(): Dropzone = js.native
    
    def disable(): Unit = js.native
    
    def displayExistingFile(mockFile: DropzoneMockFile, imageUrl: String): Any = js.native
    def displayExistingFile(mockFile: DropzoneMockFile, imageUrl: String, callback: js.Function0[Unit]): Any = js.native
    def displayExistingFile(
      mockFile: DropzoneMockFile,
      imageUrl: String,
      callback: js.Function0[Unit],
      crossOrigin: anonymous | `use-credentials`
    ): Any = js.native
    def displayExistingFile(
      mockFile: DropzoneMockFile,
      imageUrl: String,
      callback: js.Function0[Unit],
      crossOrigin: anonymous | `use-credentials`,
      resizeThumbnail: Boolean
    ): Any = js.native
    def displayExistingFile(
      mockFile: DropzoneMockFile,
      imageUrl: String,
      callback: js.Function0[Unit],
      crossOrigin: Unit,
      resizeThumbnail: Boolean
    ): Any = js.native
    def displayExistingFile(
      mockFile: DropzoneMockFile,
      imageUrl: String,
      callback: Unit,
      crossOrigin: anonymous | `use-credentials`
    ): Any = js.native
    def displayExistingFile(
      mockFile: DropzoneMockFile,
      imageUrl: String,
      callback: Unit,
      crossOrigin: anonymous | `use-credentials`,
      resizeThumbnail: Boolean
    ): Any = js.native
    def displayExistingFile(
      mockFile: DropzoneMockFile,
      imageUrl: String,
      callback: Unit,
      crossOrigin: Unit,
      resizeThumbnail: Boolean
    ): Any = js.native
    
    var element: HTMLElement = js.native
    
    def emit(eventName: String, args: Any*): Dropzone = js.native
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
    def emit_error(eventName: error, file: DropzoneFile, message: js.Error): Dropzone = js.native
    @JSName("emit")
    def emit_errormultiple(eventName: errormultiple, files: js.Array[DropzoneFile], message: String): Dropzone = js.native
    @JSName("emit")
    def emit_errormultiple(eventName: errormultiple, files: js.Array[DropzoneFile], message: js.Error): Dropzone = js.native
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
    def off(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Dropzone = js.native
    
    def on(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Dropzone = js.native
    @JSName("on")
    def on_addedfile(eventName: addedfile, callback: js.Function1[/* file */ DropzoneFile, Any]): Dropzone = js.native
    @JSName("on")
    def on_addedfiles(eventName: addedfiles, callback: js.Function1[/* files */ js.Array[DropzoneFile], Any]): Dropzone = js.native
    @JSName("on")
    def on_canceled(eventName: canceled, callback: js.Function1[/* file */ DropzoneFile, Any]): Dropzone = js.native
    @JSName("on")
    def on_canceledmultiple(eventName: canceledmultiple, callback: js.Function1[/* file */ js.Array[DropzoneFile], Any]): Dropzone = js.native
    @JSName("on")
    def on_complete(eventName: complete, callback: js.Function1[/* file */ DropzoneFile, Any]): Dropzone = js.native
    @JSName("on")
    def on_completemultiple(eventName: completemultiple, callback: js.Function1[/* file */ js.Array[DropzoneFile], Any]): Dropzone = js.native
    @JSName("on")
    def on_dragend(eventName: dragend, callback: js.Function1[/* e */ DragEvent, Any]): Dropzone = js.native
    @JSName("on")
    def on_dragenter(eventName: dragenter, callback: js.Function1[/* e */ DragEvent, Any]): Dropzone = js.native
    @JSName("on")
    def on_dragleave(eventName: dragleave, callback: js.Function1[/* e */ DragEvent, Any]): Dropzone = js.native
    @JSName("on")
    def on_dragover(eventName: dragover, callback: js.Function1[/* e */ DragEvent, Any]): Dropzone = js.native
    @JSName("on")
    def on_dragstart(eventName: dragstart, callback: js.Function1[/* e */ DragEvent, Any]): Dropzone = js.native
    @JSName("on")
    def on_drop(eventName: drop, callback: js.Function1[/* e */ DragEvent, Any]): Dropzone = js.native
    @JSName("on")
    def on_error(
      eventName: error,
      callback: js.Function2[/* file */ DropzoneFile, /* message */ String | js.Error, Any]
    ): Dropzone = js.native
    @JSName("on")
    def on_errormultiple(
      eventName: errormultiple,
      callback: js.Function2[/* files */ js.Array[DropzoneFile], /* message */ String | js.Error, Any]
    ): Dropzone = js.native
    @JSName("on")
    def on_maxfilesexceeded(eventName: maxfilesexceeded, callback: js.Function1[/* file */ DropzoneFile, Any]): Dropzone = js.native
    @JSName("on")
    def on_maxfilesreached(eventName: maxfilesreached, callback: js.Function1[/* files */ js.Array[DropzoneFile], Any]): Dropzone = js.native
    @JSName("on")
    def on_paste(eventName: paste, callback: js.Function1[/* e */ DragEvent, Any]): Dropzone = js.native
    @JSName("on")
    def on_processing(eventName: processing, callback: js.Function1[/* file */ DropzoneFile, Any]): Dropzone = js.native
    @JSName("on")
    def on_processingmultiple(eventName: processingmultiple, callback: js.Function1[/* files */ js.Array[DropzoneFile], Any]): Dropzone = js.native
    @JSName("on")
    def on_queuecomplete(eventName: queuecomplete): Dropzone = js.native
    @JSName("on")
    def on_removedfile(eventName: removedfile, callback: js.Function1[/* file */ DropzoneFile, Any]): Dropzone = js.native
    @JSName("on")
    def on_reset(eventName: reset): Dropzone = js.native
    @JSName("on")
    def on_sending(
      eventName: sending,
      callback: js.Function3[/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData, Any]
    ): Dropzone = js.native
    @JSName("on")
    def on_sendingmultiple(
      eventName: sendingmultiple,
      callback: js.Function3[
          /* files */ js.Array[DropzoneFile], 
          /* xhr */ XMLHttpRequest, 
          /* formData */ FormData, 
          Any
        ]
    ): Dropzone = js.native
    @JSName("on")
    def on_success(
      eventName: success,
      callback: js.Function2[/* file */ DropzoneFile, /* response */ js.Object | String, Any]
    ): Dropzone = js.native
    @JSName("on")
    def on_successmultiple(eventName: successmultiple, callback: js.Function1[/* files */ js.Array[DropzoneFile], Any]): Dropzone = js.native
    @JSName("on")
    def on_thumbnail(eventName: thumbnail, callback: js.Function2[/* file */ DropzoneFile, /* dataUrl */ String, Any]): Dropzone = js.native
    @JSName("on")
    def on_totaluploadprogress(
      eventName: totaluploadprogress,
      callback: js.Function3[/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double, Any]
    ): Dropzone = js.native
    @JSName("on")
    def on_uploadprogress(
      eventName: uploadprogress,
      callback: js.Function3[/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double, Any]
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
    def resizeImage(file: DropzoneFile, width: Double): Unit = js.native
    def resizeImage(file: DropzoneFile, width: Double, height: Double): Unit = js.native
    def resizeImage(file: DropzoneFile, width: Double, height: Double, resizeMethod: String): Unit = js.native
    def resizeImage(
      file: DropzoneFile,
      width: Double,
      height: Double,
      resizeMethod: String,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def resizeImage(
      file: DropzoneFile,
      width: Double,
      height: Double,
      resizeMethod: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def resizeImage(file: DropzoneFile, width: Double, height: Unit, resizeMethod: String): Unit = js.native
    def resizeImage(
      file: DropzoneFile,
      width: Double,
      height: Unit,
      resizeMethod: String,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def resizeImage(
      file: DropzoneFile,
      width: Double,
      height: Unit,
      resizeMethod: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def resizeImage(file: DropzoneFile, width: Unit, height: Double): Unit = js.native
    def resizeImage(file: DropzoneFile, width: Unit, height: Double, resizeMethod: String): Unit = js.native
    def resizeImage(
      file: DropzoneFile,
      width: Unit,
      height: Double,
      resizeMethod: String,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def resizeImage(
      file: DropzoneFile,
      width: Unit,
      height: Double,
      resizeMethod: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def resizeImage(file: DropzoneFile, width: Unit, height: Unit, resizeMethod: String): Unit = js.native
    def resizeImage(
      file: DropzoneFile,
      width: Unit,
      height: Unit,
      resizeMethod: String,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    def resizeImage(
      file: DropzoneFile,
      width: Unit,
      height: Unit,
      resizeMethod: Unit,
      callback: js.Function1[/* repeated */ Any, Unit]
    ): Unit = js.native
    
    def uploadFile(file: DropzoneFile): Unit = js.native
    
    def uploadFiles(files: js.Array[DropzoneFile]): Unit = js.native
    
    var version: String = js.native
  }
  
  trait DropzoneDictFileSizeUnits extends StObject {
    
    var b: js.UndefOr[String] = js.undefined
    
    var gb: js.UndefOr[String] = js.undefined
    
    var kb: js.UndefOr[String] = js.undefined
    
    var mb: js.UndefOr[String] = js.undefined
    
    var tb: js.UndefOr[String] = js.undefined
  }
  object DropzoneDictFileSizeUnits {
    
    inline def apply(): DropzoneDictFileSizeUnits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneDictFileSizeUnits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropzoneDictFileSizeUnits] (val x: Self) extends AnyVal {
      
      inline def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setGb(value: String): Self = StObject.set(x, "gb", value.asInstanceOf[js.Any])
      
      inline def setGbUndefined: Self = StObject.set(x, "gb", js.undefined)
      
      inline def setKb(value: String): Self = StObject.set(x, "kb", value.asInstanceOf[js.Any])
      
      inline def setKbUndefined: Self = StObject.set(x, "kb", js.undefined)
      
      inline def setMb(value: String): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setTb(value: String): Self = StObject.set(x, "tb", value.asInstanceOf[js.Any])
      
      inline def setTbUndefined: Self = StObject.set(x, "tb", js.undefined)
    }
  }
  
  @js.native
  trait DropzoneFile
    extends StObject
       with File {
    
    var accepted: Boolean = js.native
    
    var dataURL: js.UndefOr[String] = js.native
    
    var previewElement: HTMLElement = js.native
    
    var previewTemplate: HTMLElement = js.native
    
    var previewsContainer: HTMLElement = js.native
    
    var status: String = js.native
    
    var upload: js.UndefOr[DropzoneFileUpload] = js.native
    
    var xhr: js.UndefOr[XMLHttpRequest] = js.native
  }
  
  trait DropzoneFileUpload extends StObject {
    
    var bytesSent: Double
    
    var progress: Double
    
    var total: Double
    
    var totalChunkCount: js.UndefOr[Double] = js.undefined
    
    var uuid: String
  }
  object DropzoneFileUpload {
    
    inline def apply(bytesSent: Double, progress: Double, total: Double, uuid: String): DropzoneFileUpload = {
      val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropzoneFileUpload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropzoneFileUpload] (val x: Self) extends AnyVal {
      
      inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalChunkCount(value: Double): Self = StObject.set(x, "totalChunkCount", value.asInstanceOf[js.Any])
      
      inline def setTotalChunkCountUndefined: Self = StObject.set(x, "totalChunkCount", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropzoneListener extends StObject {
    
    var element: HTMLElement
    
    var events: StringDictionary[js.Function1[/* e */ Event, Any]]
  }
  object DropzoneListener {
    
    inline def apply(element: HTMLElement, events: StringDictionary[js.Function1[/* e */ Event, Any]]): DropzoneListener = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropzoneListener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropzoneListener] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: StringDictionary[js.Function1[/* e */ Event, Any]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropzoneMockFile
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    var name: String
    
    var size: Double
  }
  object DropzoneMockFile {
    
    inline def apply(name: String, size: Double): DropzoneMockFile = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropzoneMockFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropzoneMockFile] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropzoneOptions extends StObject {
    
    var accept: js.UndefOr[
        js.Function2[
          /* file */ DropzoneFile, 
          /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var acceptedFiles: js.UndefOr[String] = js.undefined
    
    var addRemoveLinks: js.UndefOr[Boolean] = js.undefined
    
    var addedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
    
    var addedfiles: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
    
    var autoProcessQueue: js.UndefOr[Boolean] = js.undefined
    
    var autoQueue: js.UndefOr[Boolean] = js.undefined
    
    var canceled: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
    
    var canceledmultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.undefined
    
    var capture: js.UndefOr[String] = js.undefined
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var chunking: js.UndefOr[Boolean] = js.undefined
    
    var chunksUploaded: js.UndefOr[
        js.Function2[
          /* file */ DropzoneFile, 
          /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var clickable: js.UndefOr[Boolean | String | HTMLElement | (js.Array[String | HTMLElement])] = js.undefined
    
    var complete: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
    
    var completemultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.undefined
    
    var createImageThumbnails: js.UndefOr[Boolean] = js.undefined
    
    var dictCancelUpload: js.UndefOr[String] = js.undefined
    
    var dictCancelUploadConfirmation: js.UndefOr[String] = js.undefined
    
    var dictDefaultMessage: js.UndefOr[String] = js.undefined
    
    var dictFallbackMessage: js.UndefOr[String] = js.undefined
    
    var dictFallbackText: js.UndefOr[String] = js.undefined
    
    var dictFileSizeUnits: js.UndefOr[DropzoneDictFileSizeUnits] = js.undefined
    
    var dictFileTooBig: js.UndefOr[String] = js.undefined
    
    var dictInvalidFileType: js.UndefOr[String] = js.undefined
    
    var dictMaxFilesExceeded: js.UndefOr[String] = js.undefined
    
    var dictRemoveFile: js.UndefOr[String] = js.undefined
    
    var dictRemoveFileConfirmation: js.UndefOr[String] = js.undefined
    
    var dictResponseError: js.UndefOr[String] = js.undefined
    
    var dictUploadCanceled: js.UndefOr[String] = js.undefined
    
    var dragend: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var dragenter: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var dragleave: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var dragover: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var dragstart: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var drop: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var error: js.UndefOr[
        js.Function3[
          /* file */ DropzoneFile, 
          /* message */ String | js.Error, 
          /* xhr */ XMLHttpRequest, 
          Unit
        ]
      ] = js.undefined
    
    var errormultiple: js.UndefOr[
        js.Function3[
          /* files */ js.Array[DropzoneFile], 
          /* message */ String | js.Error, 
          /* xhr */ XMLHttpRequest, 
          Unit
        ]
      ] = js.undefined
    
    var fallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var filesizeBase: js.UndefOr[Double] = js.undefined
    
    var forceChunking: js.UndefOr[Boolean] = js.undefined
    
    var forceFallback: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var hiddenInputContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var ignoreHiddenFiles: js.UndefOr[Boolean] = js.undefined
    
    var init: js.UndefOr[js.ThisFunction0[/* this */ Dropzone, Unit]] = js.undefined
    
    var maxFiles: js.UndefOr[Double] = js.undefined
    
    var maxFilesize: js.UndefOr[Double] = js.undefined
    
    var maxThumbnailFilesize: js.UndefOr[Double] = js.undefined
    
    var maxfilesexceeded: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
    
    var maxfilesreached: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
    
    var method: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.undefined
    
    var parallelChunkUploads: js.UndefOr[Boolean] = js.undefined
    
    var parallelUploads: js.UndefOr[Double] = js.undefined
    
    var paramName: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var paste: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var previewTemplate: js.UndefOr[String] = js.undefined
    
    var previewsContainer: js.UndefOr[Boolean | String | HTMLElement] = js.undefined
    
    var processing: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
    
    var processingmultiple: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
    
    var queuecomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
    
    var renameFilename: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    
    var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var resize: js.UndefOr[
        js.Function4[
          /* file */ DropzoneFile, 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          /* resizeMethod */ js.UndefOr[String], 
          DropzoneResizeInfo
        ]
      ] = js.undefined
    
    var resizeHeight: js.UndefOr[Double] = js.undefined
    
    var resizeMethod: js.UndefOr[contain | crop] = js.undefined
    
    var resizeMimeType: js.UndefOr[String] = js.undefined
    
    var resizeQuality: js.UndefOr[Double] = js.undefined
    
    var resizeWidth: js.UndefOr[Double] = js.undefined
    
    var retryChunks: js.UndefOr[Boolean] = js.undefined
    
    var retryChunksLimit: js.UndefOr[Double] = js.undefined
    
    var sending: js.UndefOr[
        js.Function3[/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData, Unit]
      ] = js.undefined
    
    var sendingmultiple: js.UndefOr[
        js.Function3[
          /* files */ js.Array[DropzoneFile], 
          /* xhr */ XMLHttpRequest, 
          /* formData */ FormData, 
          Unit
        ]
      ] = js.undefined
    
    var success: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
    
    var successmultiple: js.UndefOr[
        js.Function2[/* files */ js.Array[DropzoneFile], /* responseText */ String, Unit]
      ] = js.undefined
    
    var thumbnail: js.UndefOr[js.Function2[/* file */ DropzoneFile, /* dataUrl */ String, Unit]] = js.undefined
    
    var thumbnailHeight: js.UndefOr[Double] = js.undefined
    
    var thumbnailMethod: js.UndefOr[contain | crop] = js.undefined
    
    var thumbnailWidth: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var totaluploadprogress: js.UndefOr[
        js.Function3[/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double, Unit]
      ] = js.undefined
    
    var transformFile: js.UndefOr[
        js.Function2[
          /* file */ DropzoneFile, 
          /* done */ js.Function1[/* file */ String | Blob, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var uploadMultiple: js.UndefOr[Boolean] = js.undefined
    
    var uploadprogress: js.UndefOr[
        js.Function3[/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double, Unit]
      ] = js.undefined
    
    var url: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object DropzoneOptions {
    
    inline def apply(): DropzoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropzoneOptions] (val x: Self) extends AnyVal {
      
      inline def setAccept(
        value: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "accept", js.Any.fromFunction2(value))
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAcceptedFiles(value: String): Self = StObject.set(x, "acceptedFiles", value.asInstanceOf[js.Any])
      
      inline def setAcceptedFilesUndefined: Self = StObject.set(x, "acceptedFiles", js.undefined)
      
      inline def setAddRemoveLinks(value: Boolean): Self = StObject.set(x, "addRemoveLinks", value.asInstanceOf[js.Any])
      
      inline def setAddRemoveLinksUndefined: Self = StObject.set(x, "addRemoveLinks", js.undefined)
      
      inline def setAddedfile(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "addedfile", js.Any.fromFunction1(value))
      
      inline def setAddedfileUndefined: Self = StObject.set(x, "addedfile", js.undefined)
      
      inline def setAddedfiles(value: /* files */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "addedfiles", js.Any.fromFunction1(value))
      
      inline def setAddedfilesUndefined: Self = StObject.set(x, "addedfiles", js.undefined)
      
      inline def setAutoProcessQueue(value: Boolean): Self = StObject.set(x, "autoProcessQueue", value.asInstanceOf[js.Any])
      
      inline def setAutoProcessQueueUndefined: Self = StObject.set(x, "autoProcessQueue", js.undefined)
      
      inline def setAutoQueue(value: Boolean): Self = StObject.set(x, "autoQueue", value.asInstanceOf[js.Any])
      
      inline def setAutoQueueUndefined: Self = StObject.set(x, "autoQueue", js.undefined)
      
      inline def setCanceled(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "canceled", js.Any.fromFunction1(value))
      
      inline def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
      
      inline def setCanceledmultiple(value: /* file */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "canceledmultiple", js.Any.fromFunction1(value))
      
      inline def setCanceledmultipleUndefined: Self = StObject.set(x, "canceledmultiple", js.undefined)
      
      inline def setCapture(value: String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setChunking(value: Boolean): Self = StObject.set(x, "chunking", value.asInstanceOf[js.Any])
      
      inline def setChunkingUndefined: Self = StObject.set(x, "chunking", js.undefined)
      
      inline def setChunksUploaded(
        value: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "chunksUploaded", js.Any.fromFunction2(value))
      
      inline def setChunksUploadedUndefined: Self = StObject.set(x, "chunksUploaded", js.undefined)
      
      inline def setClickable(value: Boolean | String | HTMLElement | (js.Array[String | HTMLElement])): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setClickableVarargs(value: (String | HTMLElement)*): Self = StObject.set(x, "clickable", js.Array(value*))
      
      inline def setComplete(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setCompletemultiple(value: /* file */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "completemultiple", js.Any.fromFunction1(value))
      
      inline def setCompletemultipleUndefined: Self = StObject.set(x, "completemultiple", js.undefined)
      
      inline def setCreateImageThumbnails(value: Boolean): Self = StObject.set(x, "createImageThumbnails", value.asInstanceOf[js.Any])
      
      inline def setCreateImageThumbnailsUndefined: Self = StObject.set(x, "createImageThumbnails", js.undefined)
      
      inline def setDictCancelUpload(value: String): Self = StObject.set(x, "dictCancelUpload", value.asInstanceOf[js.Any])
      
      inline def setDictCancelUploadConfirmation(value: String): Self = StObject.set(x, "dictCancelUploadConfirmation", value.asInstanceOf[js.Any])
      
      inline def setDictCancelUploadConfirmationUndefined: Self = StObject.set(x, "dictCancelUploadConfirmation", js.undefined)
      
      inline def setDictCancelUploadUndefined: Self = StObject.set(x, "dictCancelUpload", js.undefined)
      
      inline def setDictDefaultMessage(value: String): Self = StObject.set(x, "dictDefaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDictDefaultMessageUndefined: Self = StObject.set(x, "dictDefaultMessage", js.undefined)
      
      inline def setDictFallbackMessage(value: String): Self = StObject.set(x, "dictFallbackMessage", value.asInstanceOf[js.Any])
      
      inline def setDictFallbackMessageUndefined: Self = StObject.set(x, "dictFallbackMessage", js.undefined)
      
      inline def setDictFallbackText(value: String): Self = StObject.set(x, "dictFallbackText", value.asInstanceOf[js.Any])
      
      inline def setDictFallbackTextUndefined: Self = StObject.set(x, "dictFallbackText", js.undefined)
      
      inline def setDictFileSizeUnits(value: DropzoneDictFileSizeUnits): Self = StObject.set(x, "dictFileSizeUnits", value.asInstanceOf[js.Any])
      
      inline def setDictFileSizeUnitsUndefined: Self = StObject.set(x, "dictFileSizeUnits", js.undefined)
      
      inline def setDictFileTooBig(value: String): Self = StObject.set(x, "dictFileTooBig", value.asInstanceOf[js.Any])
      
      inline def setDictFileTooBigUndefined: Self = StObject.set(x, "dictFileTooBig", js.undefined)
      
      inline def setDictInvalidFileType(value: String): Self = StObject.set(x, "dictInvalidFileType", value.asInstanceOf[js.Any])
      
      inline def setDictInvalidFileTypeUndefined: Self = StObject.set(x, "dictInvalidFileType", js.undefined)
      
      inline def setDictMaxFilesExceeded(value: String): Self = StObject.set(x, "dictMaxFilesExceeded", value.asInstanceOf[js.Any])
      
      inline def setDictMaxFilesExceededUndefined: Self = StObject.set(x, "dictMaxFilesExceeded", js.undefined)
      
      inline def setDictRemoveFile(value: String): Self = StObject.set(x, "dictRemoveFile", value.asInstanceOf[js.Any])
      
      inline def setDictRemoveFileConfirmation(value: String): Self = StObject.set(x, "dictRemoveFileConfirmation", value.asInstanceOf[js.Any])
      
      inline def setDictRemoveFileConfirmationUndefined: Self = StObject.set(x, "dictRemoveFileConfirmation", js.undefined)
      
      inline def setDictRemoveFileUndefined: Self = StObject.set(x, "dictRemoveFile", js.undefined)
      
      inline def setDictResponseError(value: String): Self = StObject.set(x, "dictResponseError", value.asInstanceOf[js.Any])
      
      inline def setDictResponseErrorUndefined: Self = StObject.set(x, "dictResponseError", js.undefined)
      
      inline def setDictUploadCanceled(value: String): Self = StObject.set(x, "dictUploadCanceled", value.asInstanceOf[js.Any])
      
      inline def setDictUploadCanceledUndefined: Self = StObject.set(x, "dictUploadCanceled", js.undefined)
      
      inline def setDragend(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
      
      inline def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
      
      inline def setDragenter(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragenter", js.Any.fromFunction1(value))
      
      inline def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
      
      inline def setDragleave(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragleave", js.Any.fromFunction1(value))
      
      inline def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
      
      inline def setDragover(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragover", js.Any.fromFunction1(value))
      
      inline def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
      
      inline def setDragstart(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
      
      inline def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
      
      inline def setDrop(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setError(
        value: (/* file */ DropzoneFile, /* message */ String | js.Error, /* xhr */ XMLHttpRequest) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrormultiple(
        value: (/* files */ js.Array[DropzoneFile], /* message */ String | js.Error, /* xhr */ XMLHttpRequest) => Unit
      ): Self = StObject.set(x, "errormultiple", js.Any.fromFunction3(value))
      
      inline def setErrormultipleUndefined: Self = StObject.set(x, "errormultiple", js.undefined)
      
      inline def setFallback(value: () => Unit): Self = StObject.set(x, "fallback", js.Any.fromFunction0(value))
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFilesizeBase(value: Double): Self = StObject.set(x, "filesizeBase", value.asInstanceOf[js.Any])
      
      inline def setFilesizeBaseUndefined: Self = StObject.set(x, "filesizeBase", js.undefined)
      
      inline def setForceChunking(value: Boolean): Self = StObject.set(x, "forceChunking", value.asInstanceOf[js.Any])
      
      inline def setForceChunkingUndefined: Self = StObject.set(x, "forceChunking", js.undefined)
      
      inline def setForceFallback(value: Boolean): Self = StObject.set(x, "forceFallback", value.asInstanceOf[js.Any])
      
      inline def setForceFallbackUndefined: Self = StObject.set(x, "forceFallback", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHiddenInputContainer(value: HTMLElement): Self = StObject.set(x, "hiddenInputContainer", value.asInstanceOf[js.Any])
      
      inline def setHiddenInputContainerUndefined: Self = StObject.set(x, "hiddenInputContainer", js.undefined)
      
      inline def setIgnoreHiddenFiles(value: Boolean): Self = StObject.set(x, "ignoreHiddenFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHiddenFilesUndefined: Self = StObject.set(x, "ignoreHiddenFiles", js.undefined)
      
      inline def setInit(value: js.ThisFunction0[/* this */ Dropzone, Unit]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      inline def setMaxFilesize(value: Double): Self = StObject.set(x, "maxFilesize", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesizeUndefined: Self = StObject.set(x, "maxFilesize", js.undefined)
      
      inline def setMaxThumbnailFilesize(value: Double): Self = StObject.set(x, "maxThumbnailFilesize", value.asInstanceOf[js.Any])
      
      inline def setMaxThumbnailFilesizeUndefined: Self = StObject.set(x, "maxThumbnailFilesize", js.undefined)
      
      inline def setMaxfilesexceeded(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "maxfilesexceeded", js.Any.fromFunction1(value))
      
      inline def setMaxfilesexceededUndefined: Self = StObject.set(x, "maxfilesexceeded", js.undefined)
      
      inline def setMaxfilesreached(value: /* files */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "maxfilesreached", js.Any.fromFunction1(value))
      
      inline def setMaxfilesreachedUndefined: Self = StObject.set(x, "maxfilesreached", js.undefined)
      
      inline def setMethod(value: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction1(value: /* files */ js.Array[DropzoneFile] => String): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParallelChunkUploads(value: Boolean): Self = StObject.set(x, "parallelChunkUploads", value.asInstanceOf[js.Any])
      
      inline def setParallelChunkUploadsUndefined: Self = StObject.set(x, "parallelChunkUploads", js.undefined)
      
      inline def setParallelUploads(value: Double): Self = StObject.set(x, "parallelUploads", value.asInstanceOf[js.Any])
      
      inline def setParallelUploadsUndefined: Self = StObject.set(x, "parallelUploads", js.undefined)
      
      inline def setParamName(value: String): Self = StObject.set(x, "paramName", value.asInstanceOf[js.Any])
      
      inline def setParamNameUndefined: Self = StObject.set(x, "paramName", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPaste(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setPreviewTemplate(value: String): Self = StObject.set(x, "previewTemplate", value.asInstanceOf[js.Any])
      
      inline def setPreviewTemplateUndefined: Self = StObject.set(x, "previewTemplate", js.undefined)
      
      inline def setPreviewsContainer(value: Boolean | String | HTMLElement): Self = StObject.set(x, "previewsContainer", value.asInstanceOf[js.Any])
      
      inline def setPreviewsContainerUndefined: Self = StObject.set(x, "previewsContainer", js.undefined)
      
      inline def setProcessing(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "processing", js.Any.fromFunction1(value))
      
      inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
      
      inline def setProcessingmultiple(value: /* files */ js.Array[DropzoneFile] => Unit): Self = StObject.set(x, "processingmultiple", js.Any.fromFunction1(value))
      
      inline def setProcessingmultipleUndefined: Self = StObject.set(x, "processingmultiple", js.undefined)
      
      inline def setQueuecomplete(value: () => Unit): Self = StObject.set(x, "queuecomplete", js.Any.fromFunction0(value))
      
      inline def setQueuecompleteUndefined: Self = StObject.set(x, "queuecomplete", js.undefined)
      
      inline def setRemovedfile(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "removedfile", js.Any.fromFunction1(value))
      
      inline def setRemovedfileUndefined: Self = StObject.set(x, "removedfile", js.undefined)
      
      inline def setRenameFilename(value: /* name */ String => String): Self = StObject.set(x, "renameFilename", js.Any.fromFunction1(value))
      
      inline def setRenameFilenameUndefined: Self = StObject.set(x, "renameFilename", js.undefined)
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setResize(
        value: (/* file */ DropzoneFile, /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* resizeMethod */ js.UndefOr[String]) => DropzoneResizeInfo
      ): Self = StObject.set(x, "resize", js.Any.fromFunction4(value))
      
      inline def setResizeHeight(value: Double): Self = StObject.set(x, "resizeHeight", value.asInstanceOf[js.Any])
      
      inline def setResizeHeightUndefined: Self = StObject.set(x, "resizeHeight", js.undefined)
      
      inline def setResizeMethod(value: contain | crop): Self = StObject.set(x, "resizeMethod", value.asInstanceOf[js.Any])
      
      inline def setResizeMethodUndefined: Self = StObject.set(x, "resizeMethod", js.undefined)
      
      inline def setResizeMimeType(value: String): Self = StObject.set(x, "resizeMimeType", value.asInstanceOf[js.Any])
      
      inline def setResizeMimeTypeUndefined: Self = StObject.set(x, "resizeMimeType", js.undefined)
      
      inline def setResizeQuality(value: Double): Self = StObject.set(x, "resizeQuality", value.asInstanceOf[js.Any])
      
      inline def setResizeQualityUndefined: Self = StObject.set(x, "resizeQuality", js.undefined)
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setResizeWidth(value: Double): Self = StObject.set(x, "resizeWidth", value.asInstanceOf[js.Any])
      
      inline def setResizeWidthUndefined: Self = StObject.set(x, "resizeWidth", js.undefined)
      
      inline def setRetryChunks(value: Boolean): Self = StObject.set(x, "retryChunks", value.asInstanceOf[js.Any])
      
      inline def setRetryChunksLimit(value: Double): Self = StObject.set(x, "retryChunksLimit", value.asInstanceOf[js.Any])
      
      inline def setRetryChunksLimitUndefined: Self = StObject.set(x, "retryChunksLimit", js.undefined)
      
      inline def setRetryChunksUndefined: Self = StObject.set(x, "retryChunks", js.undefined)
      
      inline def setSending(value: (/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit): Self = StObject.set(x, "sending", js.Any.fromFunction3(value))
      
      inline def setSendingUndefined: Self = StObject.set(x, "sending", js.undefined)
      
      inline def setSendingmultiple(
        value: (/* files */ js.Array[DropzoneFile], /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit
      ): Self = StObject.set(x, "sendingmultiple", js.Any.fromFunction3(value))
      
      inline def setSendingmultipleUndefined: Self = StObject.set(x, "sendingmultiple", js.undefined)
      
      inline def setSuccess(value: /* file */ DropzoneFile => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setSuccessmultiple(value: (/* files */ js.Array[DropzoneFile], /* responseText */ String) => Unit): Self = StObject.set(x, "successmultiple", js.Any.fromFunction2(value))
      
      inline def setSuccessmultipleUndefined: Self = StObject.set(x, "successmultiple", js.undefined)
      
      inline def setThumbnail(value: (/* file */ DropzoneFile, /* dataUrl */ String) => Unit): Self = StObject.set(x, "thumbnail", js.Any.fromFunction2(value))
      
      inline def setThumbnailHeight(value: Double): Self = StObject.set(x, "thumbnailHeight", value.asInstanceOf[js.Any])
      
      inline def setThumbnailHeightUndefined: Self = StObject.set(x, "thumbnailHeight", js.undefined)
      
      inline def setThumbnailMethod(value: contain | crop): Self = StObject.set(x, "thumbnailMethod", value.asInstanceOf[js.Any])
      
      inline def setThumbnailMethodUndefined: Self = StObject.set(x, "thumbnailMethod", js.undefined)
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setThumbnailWidth(value: Double): Self = StObject.set(x, "thumbnailWidth", value.asInstanceOf[js.Any])
      
      inline def setThumbnailWidthUndefined: Self = StObject.set(x, "thumbnailWidth", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTotaluploadprogress(value: (/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double) => Unit): Self = StObject.set(x, "totaluploadprogress", js.Any.fromFunction3(value))
      
      inline def setTotaluploadprogressUndefined: Self = StObject.set(x, "totaluploadprogress", js.undefined)
      
      inline def setTransformFile(value: (/* file */ DropzoneFile, /* done */ js.Function1[/* file */ String | Blob, Unit]) => Unit): Self = StObject.set(x, "transformFile", js.Any.fromFunction2(value))
      
      inline def setTransformFileUndefined: Self = StObject.set(x, "transformFile", js.undefined)
      
      inline def setUploadMultiple(value: Boolean): Self = StObject.set(x, "uploadMultiple", value.asInstanceOf[js.Any])
      
      inline def setUploadMultipleUndefined: Self = StObject.set(x, "uploadMultiple", js.undefined)
      
      inline def setUploadprogress(value: (/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double) => Unit): Self = StObject.set(x, "uploadprogress", js.Any.fromFunction3(value))
      
      inline def setUploadprogressUndefined: Self = StObject.set(x, "uploadprogress", js.undefined)
      
      inline def setUrl(value: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction1(value: /* files */ js.Array[DropzoneFile] => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait DropzoneResizeInfo extends StObject {
    
    var srcHeight: js.UndefOr[Double] = js.undefined
    
    var srcWidth: js.UndefOr[Double] = js.undefined
    
    var srcX: js.UndefOr[Double] = js.undefined
    
    var srcY: js.UndefOr[Double] = js.undefined
    
    var trgHeight: js.UndefOr[Double] = js.undefined
    
    var trgWidth: js.UndefOr[Double] = js.undefined
    
    var trgX: js.UndefOr[Double] = js.undefined
    
    var trgY: js.UndefOr[Double] = js.undefined
  }
  object DropzoneResizeInfo {
    
    inline def apply(): DropzoneResizeInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneResizeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropzoneResizeInfo] (val x: Self) extends AnyVal {
      
      inline def setSrcHeight(value: Double): Self = StObject.set(x, "srcHeight", value.asInstanceOf[js.Any])
      
      inline def setSrcHeightUndefined: Self = StObject.set(x, "srcHeight", js.undefined)
      
      inline def setSrcWidth(value: Double): Self = StObject.set(x, "srcWidth", value.asInstanceOf[js.Any])
      
      inline def setSrcWidthUndefined: Self = StObject.set(x, "srcWidth", js.undefined)
      
      inline def setSrcX(value: Double): Self = StObject.set(x, "srcX", value.asInstanceOf[js.Any])
      
      inline def setSrcXUndefined: Self = StObject.set(x, "srcX", js.undefined)
      
      inline def setSrcY(value: Double): Self = StObject.set(x, "srcY", value.asInstanceOf[js.Any])
      
      inline def setSrcYUndefined: Self = StObject.set(x, "srcY", js.undefined)
      
      inline def setTrgHeight(value: Double): Self = StObject.set(x, "trgHeight", value.asInstanceOf[js.Any])
      
      inline def setTrgHeightUndefined: Self = StObject.set(x, "trgHeight", js.undefined)
      
      inline def setTrgWidth(value: Double): Self = StObject.set(x, "trgWidth", value.asInstanceOf[js.Any])
      
      inline def setTrgWidthUndefined: Self = StObject.set(x, "trgWidth", js.undefined)
      
      inline def setTrgX(value: Double): Self = StObject.set(x, "trgX", value.asInstanceOf[js.Any])
      
      inline def setTrgXUndefined: Self = StObject.set(x, "trgX", js.undefined)
      
      inline def setTrgY(value: Double): Self = StObject.set(x, "trgY", value.asInstanceOf[js.Any])
      
      inline def setTrgYUndefined: Self = StObject.set(x, "trgY", js.undefined)
    }
  }
  
  object global {
    
    trait HTMLElement extends StObject {
      
      var dropzone: Dropzone
    }
    object HTMLElement {
      
      inline def apply(dropzone: Dropzone): HTMLElement = {
        val __obj = js.Dynamic.literal(dropzone = dropzone.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElement]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElement] (val x: Self) extends AnyVal {
        
        inline def setDropzone(value: Dropzone): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
      }
    }
    
    trait JQuery extends StObject {
      
      def dropzone(options: DropzoneOptions): Dropzone
    }
    object JQuery {
      
      inline def apply(dropzone: DropzoneOptions => Dropzone): JQuery = {
        val __obj = js.Dynamic.literal(dropzone = js.Any.fromFunction1(dropzone))
        __obj.asInstanceOf[JQuery]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
        
        inline def setDropzone(value: DropzoneOptions => Dropzone): Self = StObject.set(x, "dropzone", js.Any.fromFunction1(value))
      }
    }
  }
}
