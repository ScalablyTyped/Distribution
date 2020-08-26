package typings.fineUploader.coreMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreOptions extends js.Object {
  /**
    * Set to false if you want to be able to upload queued items later by calling the `uploadStoredFiles()` method
    *
    * @default `true`
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  /**
    * blobs options
    */
  var blobs: js.UndefOr[BlobsOptions] = js.native
  /**
    * Specify an element to use as the 'select files' button. Cannot be a `<button>`
    *
    * @default `null`
    */
  var button: js.UndefOr[HTMLElement] = js.native
  /**
    * Core callback functions
    */
  var callbacks: js.UndefOr[CoreEvents] = js.native
  /**
    * camera options
    */
  var camera: js.UndefOr[CameraOptions] = js.native
  /**
    * ChunkingOptions
    */
  var chunking: js.UndefOr[ChunkingOptions] = js.native
  /**
    * CorsOptions
    */
  var cors: js.UndefOr[CorsOptions] = js.native
  /**
    * This will result in log messages being written to the `window.console` object
    *
    * @default `false`
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * DeleteFileOptions
    */
  var deleteFile: js.UndefOr[DeleteFileOptions] = js.native
  /**
    * When true the cancel link does not appear next to files when the form uploader is used
    *
    * @default `false`
    */
  var disableCancelForFormUploads: js.UndefOr[Boolean] = js.native
  /**
    * ExtraButtonsOptions
    */
  var extraButtons: js.UndefOr[js.Array[ExtraButtonsOptions]] = js.native
  /**
    * FormOptions
    */
  var form: js.UndefOr[FormOptions] = js.native
  /**
    * Provide a function to control the display of file names.
    *
    * The raw file name is passed into the function when it is invoked. Your function may return a modified file name.
    *
    * Note that this does not affect the actual file name, only the displayed file name
    */
  var formatFileName: js.UndefOr[FormatFileNameFuncton] = js.native
  /**
    * Maximum allowable concurrent requests
    *
    * @default `3`
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * Messages
    */
  var messages: js.UndefOr[Messages] = js.native
  /**
    * When false this will prevent the user from simultaneously selecting or dropping more than one item
    *
    * @default `true`
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * PasteOptions
    */
  var paste: js.UndefOr[PasteOptions] = js.native
  /**
    * RequestOptions
    */
  var request: js.UndefOr[RequestOptions] = js.native
  /**
    * ResumeOptions
    */
  var resume: js.UndefOr[ResumeOptions] = js.native
  /**
    * ScalingOptions
    */
  var scaling: js.UndefOr[ScalingOptions] = js.native
  /**
    * SessionOptions
    */
  var session: js.UndefOr[SessionOptions] = js.native
  /**
    * TextOptions
    */
  var text: js.UndefOr[TextOptions] = js.native
  /**
    * ValidationOptions
    */
  var validation: js.UndefOr[ValidationOptions] = js.native
  /**
    * When true Fine Uploader will ensure a modal confirmation dialog appears whenever a user tries to navigate away from the page with uploads in progress
    *
    * @default `true`
    */
  var warnBeforeUnload: js.UndefOr[Boolean] = js.native
  /**
    * WorkArounds
    */
  var workarounds: js.UndefOr[WorkArounds] = js.native
}

object CoreOptions {
  @scala.inline
  def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  @scala.inline
  implicit class CoreOptionsOps[Self <: CoreOptions] (val x: Self) extends AnyVal {
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
    def setAutoUpload(value: Boolean): Self = this.set("autoUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpload: Self = this.set("autoUpload", js.undefined)
    @scala.inline
    def setBlobs(value: BlobsOptions): Self = this.set("blobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlobs: Self = this.set("blobs", js.undefined)
    @scala.inline
    def setButton(value: HTMLElement): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setCallbacks(value: CoreEvents): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setCamera(value: CameraOptions): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setChunking(value: ChunkingOptions): Self = this.set("chunking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunking: Self = this.set("chunking", js.undefined)
    @scala.inline
    def setCors(value: CorsOptions): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDeleteFile(value: DeleteFileOptions): Self = this.set("deleteFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteFile: Self = this.set("deleteFile", js.undefined)
    @scala.inline
    def setDisableCancelForFormUploads(value: Boolean): Self = this.set("disableCancelForFormUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCancelForFormUploads: Self = this.set("disableCancelForFormUploads", js.undefined)
    @scala.inline
    def setExtraButtonsVarargs(value: ExtraButtonsOptions*): Self = this.set("extraButtons", js.Array(value :_*))
    @scala.inline
    def setExtraButtons(value: js.Array[ExtraButtonsOptions]): Self = this.set("extraButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraButtons: Self = this.set("extraButtons", js.undefined)
    @scala.inline
    def setForm(value: FormOptions): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setFormatFileName(value: /* fileOrBlobName */ String => String): Self = this.set("formatFileName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatFileName: Self = this.set("formatFileName", js.undefined)
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    @scala.inline
    def setMessages(value: Messages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setPaste(value: PasteOptions): Self = this.set("paste", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    @scala.inline
    def setRequest(value: RequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResume(value: ResumeOptions): Self = this.set("resume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResume: Self = this.set("resume", js.undefined)
    @scala.inline
    def setScaling(value: ScalingOptions): Self = this.set("scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
    @scala.inline
    def setSession(value: SessionOptions): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setText(value: TextOptions): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValidation(value: ValidationOptions): Self = this.set("validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
    @scala.inline
    def setWarnBeforeUnload(value: Boolean): Self = this.set("warnBeforeUnload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnBeforeUnload: Self = this.set("warnBeforeUnload", js.undefined)
    @scala.inline
    def setWorkarounds(value: WorkArounds): Self = this.set("workarounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkarounds: Self = this.set("workarounds", js.undefined)
  }
  
}

