package typings.fineUploader.libCoreMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreOptions extends StObject {
  
  /**
    * Set to false if you want to be able to upload queued items later by calling the `uploadStoredFiles()` method
    *
    * @default `true`
    */
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * blobs options
    */
  var blobs: js.UndefOr[BlobsOptions] = js.undefined
  
  /**
    * Specify an element to use as the 'select files' button. Cannot be a `<button>`
    *
    * @default `null`
    */
  var button: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * Core callback functions
    */
  var callbacks: js.UndefOr[CoreEvents] = js.undefined
  
  /**
    * camera options
    */
  var camera: js.UndefOr[CameraOptions] = js.undefined
  
  /**
    * ChunkingOptions
    */
  var chunking: js.UndefOr[ChunkingOptions] = js.undefined
  
  /**
    * CorsOptions
    */
  var cors: js.UndefOr[CorsOptions] = js.undefined
  
  /**
    * This will result in log messages being written to the `window.console` object
    *
    * @default `false`
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * DeleteFileOptions
    */
  var deleteFile: js.UndefOr[DeleteFileOptions] = js.undefined
  
  /**
    * When true the cancel link does not appear next to files when the form uploader is used
    *
    * @default `false`
    */
  var disableCancelForFormUploads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ExtraButtonsOptions
    */
  var extraButtons: js.UndefOr[js.Array[ExtraButtonsOptions]] = js.undefined
  
  /**
    * FormOptions
    */
  var form: js.UndefOr[FormOptions] = js.undefined
  
  /**
    * Provide a function to control the display of file names.
    *
    * The raw file name is passed into the function when it is invoked. Your function may return a modified file name.
    *
    * Note that this does not affect the actual file name, only the displayed file name
    */
  var formatFileName: js.UndefOr[FormatFileNameFuncton] = js.undefined
  
  /**
    * Maximum allowable concurrent requests
    *
    * @default `3`
    */
  var maxConnections: js.UndefOr[Double] = js.undefined
  
  /**
    * Messages
    */
  var messages: js.UndefOr[Messages] = js.undefined
  
  /**
    * When false this will prevent the user from simultaneously selecting or dropping more than one item
    *
    * @default `true`
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * PasteOptions
    */
  var paste: js.UndefOr[PasteOptions] = js.undefined
  
  /**
    * RequestOptions
    */
  var request: js.UndefOr[RequestOptions] = js.undefined
  
  /**
    * ResumeOptions
    */
  var resume: js.UndefOr[ResumeOptions] = js.undefined
  
  /**
    * ScalingOptions
    */
  var scaling: js.UndefOr[ScalingOptions] = js.undefined
  
  /**
    * SessionOptions
    */
  var session: js.UndefOr[SessionOptions] = js.undefined
  
  /**
    * TextOptions
    */
  var text: js.UndefOr[TextOptions] = js.undefined
  
  /**
    * ValidationOptions
    */
  var validation: js.UndefOr[ValidationOptions] = js.undefined
  
  /**
    * When true Fine Uploader will ensure a modal confirmation dialog appears whenever a user tries to navigate away from the page with uploads in progress
    *
    * @default `true`
    */
  var warnBeforeUnload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * WorkArounds
    */
  var workarounds: js.UndefOr[WorkArounds] = js.undefined
}
object CoreOptions {
  
  inline def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
    
    inline def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
    
    inline def setBlobs(value: BlobsOptions): Self = StObject.set(x, "blobs", value.asInstanceOf[js.Any])
    
    inline def setBlobsUndefined: Self = StObject.set(x, "blobs", js.undefined)
    
    inline def setButton(value: HTMLElement): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setCallbacks(value: CoreEvents): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setCamera(value: CameraOptions): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setChunking(value: ChunkingOptions): Self = StObject.set(x, "chunking", value.asInstanceOf[js.Any])
    
    inline def setChunkingUndefined: Self = StObject.set(x, "chunking", js.undefined)
    
    inline def setCors(value: CorsOptions): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDeleteFile(value: DeleteFileOptions): Self = StObject.set(x, "deleteFile", value.asInstanceOf[js.Any])
    
    inline def setDeleteFileUndefined: Self = StObject.set(x, "deleteFile", js.undefined)
    
    inline def setDisableCancelForFormUploads(value: Boolean): Self = StObject.set(x, "disableCancelForFormUploads", value.asInstanceOf[js.Any])
    
    inline def setDisableCancelForFormUploadsUndefined: Self = StObject.set(x, "disableCancelForFormUploads", js.undefined)
    
    inline def setExtraButtons(value: js.Array[ExtraButtonsOptions]): Self = StObject.set(x, "extraButtons", value.asInstanceOf[js.Any])
    
    inline def setExtraButtonsUndefined: Self = StObject.set(x, "extraButtons", js.undefined)
    
    inline def setExtraButtonsVarargs(value: ExtraButtonsOptions*): Self = StObject.set(x, "extraButtons", js.Array(value*))
    
    inline def setForm(value: FormOptions): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setFormatFileName(value: /* fileOrBlobName */ String => String): Self = StObject.set(x, "formatFileName", js.Any.fromFunction1(value))
    
    inline def setFormatFileNameUndefined: Self = StObject.set(x, "formatFileName", js.undefined)
    
    inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    
    inline def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setPaste(value: PasteOptions): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setRequest(value: RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResume(value: ResumeOptions): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
    
    inline def setScaling(value: ScalingOptions): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    inline def setSession(value: SessionOptions): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValidation(value: ValidationOptions): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    
    inline def setWarnBeforeUnload(value: Boolean): Self = StObject.set(x, "warnBeforeUnload", value.asInstanceOf[js.Any])
    
    inline def setWarnBeforeUnloadUndefined: Self = StObject.set(x, "warnBeforeUnload", js.undefined)
    
    inline def setWorkarounds(value: WorkArounds): Self = StObject.set(x, "workarounds", value.asInstanceOf[js.Any])
    
    inline def setWorkaroundsUndefined: Self = StObject.set(x, "workarounds", js.undefined)
  }
}
