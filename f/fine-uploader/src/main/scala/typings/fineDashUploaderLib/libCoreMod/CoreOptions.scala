package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreOptions extends js.Object {
  /**
    * Set to false if you want to be able to upload queued items later by calling the `uploadStoredFiles()` method
    *
    * @default `true`
    */
  var autoUpload: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * blobs options
    */
  var blobs: js.UndefOr[BlobsOptions] = js.undefined
  /**
    * Specify an element to use as the 'select files' button. Cannot be a `<button>`
    *
    * @default `null`
    */
  var button: js.UndefOr[stdLib.HTMLElement] = js.undefined
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
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * DeleteFileOptions
    */
  var deleteFile: js.UndefOr[DeleteFileOptions] = js.undefined
  /**
    * When true the cancel link does not appear next to files when the form uploader is used
    *
    * @default `false`
    */
  var disableCancelForFormUploads: js.UndefOr[scala.Boolean] = js.undefined
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
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  /**
    * Messages
    */
  var messages: js.UndefOr[Messages] = js.undefined
  /**
    * When false this will prevent the user from simultaneously selecting or dropping more than one item
    *
    * @default `true`
    */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
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
  var warnBeforeUnload: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * WorkArounds
    */
  var workarounds: js.UndefOr[WorkArounds] = js.undefined
}

object CoreOptions {
  @scala.inline
  def apply(
    autoUpload: js.UndefOr[scala.Boolean] = js.undefined,
    blobs: BlobsOptions = null,
    button: stdLib.HTMLElement = null,
    callbacks: CoreEvents = null,
    camera: CameraOptions = null,
    chunking: ChunkingOptions = null,
    cors: CorsOptions = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    deleteFile: DeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[scala.Boolean] = js.undefined,
    extraButtons: js.Array[ExtraButtonsOptions] = null,
    form: FormOptions = null,
    formatFileName: FormatFileNameFuncton = null,
    maxConnections: scala.Int | scala.Double = null,
    messages: Messages = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    paste: PasteOptions = null,
    request: RequestOptions = null,
    resume: ResumeOptions = null,
    scaling: ScalingOptions = null,
    session: SessionOptions = null,
    text: TextOptions = null,
    validation: ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[scala.Boolean] = js.undefined,
    workarounds: WorkArounds = null
  ): CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload)
    if (blobs != null) __obj.updateDynamic("blobs")(blobs)
    if (button != null) __obj.updateDynamic("button")(button)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (camera != null) __obj.updateDynamic("camera")(camera)
    if (chunking != null) __obj.updateDynamic("chunking")(chunking)
    if (cors != null) __obj.updateDynamic("cors")(cors)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (deleteFile != null) __obj.updateDynamic("deleteFile")(deleteFile)
    if (!js.isUndefined(disableCancelForFormUploads)) __obj.updateDynamic("disableCancelForFormUploads")(disableCancelForFormUploads)
    if (extraButtons != null) __obj.updateDynamic("extraButtons")(extraButtons)
    if (form != null) __obj.updateDynamic("form")(form)
    if (formatFileName != null) __obj.updateDynamic("formatFileName")(formatFileName)
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (request != null) __obj.updateDynamic("request")(request)
    if (resume != null) __obj.updateDynamic("resume")(resume)
    if (scaling != null) __obj.updateDynamic("scaling")(scaling)
    if (session != null) __obj.updateDynamic("session")(session)
    if (text != null) __obj.updateDynamic("text")(text)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    if (!js.isUndefined(warnBeforeUnload)) __obj.updateDynamic("warnBeforeUnload")(warnBeforeUnload)
    if (workarounds != null) __obj.updateDynamic("workarounds")(workarounds)
    __obj.asInstanceOf[CoreOptions]
  }
}

