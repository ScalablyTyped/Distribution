package typings.fineDashUploader.libCoreMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreOptions extends js.Object {
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
  @scala.inline
  def apply(
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    blobs: BlobsOptions = null,
    button: HTMLElement = null,
    callbacks: CoreEvents = null,
    camera: CameraOptions = null,
    chunking: ChunkingOptions = null,
    cors: CorsOptions = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    deleteFile: DeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[Boolean] = js.undefined,
    extraButtons: js.Array[ExtraButtonsOptions] = null,
    form: FormOptions = null,
    formatFileName: /* fileOrBlobName */ String => String = null,
    maxConnections: Int | Double = null,
    messages: Messages = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    paste: PasteOptions = null,
    request: RequestOptions = null,
    resume: ResumeOptions = null,
    scaling: ScalingOptions = null,
    session: SessionOptions = null,
    text: TextOptions = null,
    validation: ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    workarounds: WorkArounds = null
  ): CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (blobs != null) __obj.updateDynamic("blobs")(blobs.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (chunking != null) __obj.updateDynamic("chunking")(chunking.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (deleteFile != null) __obj.updateDynamic("deleteFile")(deleteFile.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCancelForFormUploads)) __obj.updateDynamic("disableCancelForFormUploads")(disableCancelForFormUploads.asInstanceOf[js.Any])
    if (extraButtons != null) __obj.updateDynamic("extraButtons")(extraButtons.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formatFileName != null) __obj.updateDynamic("formatFileName")(js.Any.fromFunction1(formatFileName))
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(paste.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resume != null) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (!js.isUndefined(warnBeforeUnload)) __obj.updateDynamic("warnBeforeUnload")(warnBeforeUnload.asInstanceOf[js.Any])
    if (workarounds != null) __obj.updateDynamic("workarounds")(workarounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreOptions]
  }
}

