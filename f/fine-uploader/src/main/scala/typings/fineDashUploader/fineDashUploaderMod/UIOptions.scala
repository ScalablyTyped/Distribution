package typings.fineDashUploader.fineDashUploaderMod

import typings.fineDashUploader.libCoreMod.BlobsOptions
import typings.fineDashUploader.libCoreMod.CameraOptions
import typings.fineDashUploader.libCoreMod.ChunkingOptions
import typings.fineDashUploader.libCoreMod.CoreEvents
import typings.fineDashUploader.libCoreMod.CoreOptions
import typings.fineDashUploader.libCoreMod.CorsOptions
import typings.fineDashUploader.libCoreMod.ExtraButtonsOptions
import typings.fineDashUploader.libCoreMod.FormOptions
import typings.fineDashUploader.libCoreMod.PromiseOptions
import typings.fineDashUploader.libCoreMod.RequestOptions
import typings.fineDashUploader.libCoreMod.ResumeOptions
import typings.fineDashUploader.libCoreMod.SessionOptions
import typings.fineDashUploader.libCoreMod.ValidationOptions
import typings.fineDashUploader.libCoreMod.WorkArounds
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIOptions extends CoreOptions {
  /**
    * UIDeleteFileOptions
    */
  @JSName("deleteFile")
  var deleteFile_UIOptions: js.UndefOr[UIDeleteFileOptions] = js.undefined
  /**
    * display options
    */
  var display: js.UndefOr[UIDisplayOptions] = js.undefined
  /**
    * dragAndDrop options
    */
  var dragAndDrop: js.UndefOr[UIDragAndDropOptions] = js.undefined
  /**
    * Container element for the default drop zone
    *
    * @default `null`
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /**
    * failedUploadTextDisplay options
    */
  var failedUploadTextDisplay: js.UndefOr[UIFailedUploadTextDisplay] = js.undefined
  /**
    * Container element for the item list
    *
    * @default `null`
    */
  var listElement: js.UndefOr[HTMLElement] = js.undefined
  /**
    * messages
    */
  @JSName("messages")
  var messages_UIOptions: js.UndefOr[UIMessages] = js.undefined
  /**
    * paste UI options
    */
  @JSName("paste")
  var paste_UIOptions: js.UndefOr[UIPasteOptions] = js.undefined
  /**
    * retry options
    */
  var retry: js.UndefOr[UIRetryOptions] = js.undefined
  /**
    * UI scaling options
    */
  @JSName("scaling")
  var scaling_UIOptions: js.UndefOr[UIScalingOptions] = js.undefined
  /**
    * Provide a function here to prompt the user to confirm deletion of a file.
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message) { window.confirm(message); }`
    */
  var showConfirm: js.UndefOr[ShowConfirmFunction] = js.undefined
  /**
    * Provide a function here to display a message to the user when the uploader receives an error or the user attempts to leave the page.
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message) { window.alert(message); }`
    */
  var showMessage: js.UndefOr[ShowMessageFunction] = js.undefined
  /**
    * Provide a function here to prompt the user for a filename when pasting file(s).
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message, defaultValue) { window.prompt(message, defaultValue); }`
    */
  var showPrompt: js.UndefOr[ShowPromptFunction] = js.undefined
  /**
    * This points to the container element that contains the template to use for one or more Fine Uploader UI instances.
    *
    * You can either specify a string, which is the element ID (the ID of the container element on the page) or an `Element` that points to the container element
    *
    * @default `'qq-template'`
    */
  var template: js.UndefOr[String | HTMLElement] = js.undefined
  /**
    * UI text options
    */
  @JSName("text")
  var text_UIOptions: js.UndefOr[UITextOptions] = js.undefined
  /**
    * thumbnail options
    */
  var thumbnails: js.UndefOr[UIThumbnailsOptions] = js.undefined
}

object UIOptions {
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
    deleteFile: UIDeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[Boolean] = js.undefined,
    display: UIDisplayOptions = null,
    dragAndDrop: UIDragAndDropOptions = null,
    element: HTMLElement = null,
    extraButtons: js.Array[ExtraButtonsOptions] = null,
    failedUploadTextDisplay: UIFailedUploadTextDisplay = null,
    form: FormOptions = null,
    formatFileName: /* fileOrBlobName */ String => String = null,
    listElement: HTMLElement = null,
    maxConnections: Int | Double = null,
    messages: UIMessages = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    paste: UIPasteOptions = null,
    request: RequestOptions = null,
    resume: ResumeOptions = null,
    retry: UIRetryOptions = null,
    scaling: UIScalingOptions = null,
    session: SessionOptions = null,
    showConfirm: /* message */ String => PromiseOptions | Unit = null,
    showMessage: /* message */ String => PromiseOptions | Unit = null,
    showPrompt: (/* message */ String, /* defaultValue */ String) => PromiseOptions | Unit = null,
    template: String | HTMLElement = null,
    text: UITextOptions = null,
    thumbnails: UIThumbnailsOptions = null,
    validation: ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    workarounds: WorkArounds = null
  ): UIOptions = {
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
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (dragAndDrop != null) __obj.updateDynamic("dragAndDrop")(dragAndDrop.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (extraButtons != null) __obj.updateDynamic("extraButtons")(extraButtons.asInstanceOf[js.Any])
    if (failedUploadTextDisplay != null) __obj.updateDynamic("failedUploadTextDisplay")(failedUploadTextDisplay.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formatFileName != null) __obj.updateDynamic("formatFileName")(js.Any.fromFunction1(formatFileName))
    if (listElement != null) __obj.updateDynamic("listElement")(listElement.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(paste.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resume != null) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (showConfirm != null) __obj.updateDynamic("showConfirm")(js.Any.fromFunction1(showConfirm))
    if (showMessage != null) __obj.updateDynamic("showMessage")(js.Any.fromFunction1(showMessage))
    if (showPrompt != null) __obj.updateDynamic("showPrompt")(js.Any.fromFunction2(showPrompt))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (!js.isUndefined(warnBeforeUnload)) __obj.updateDynamic("warnBeforeUnload")(warnBeforeUnload.asInstanceOf[js.Any])
    if (workarounds != null) __obj.updateDynamic("workarounds")(workarounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIOptions]
  }
}

