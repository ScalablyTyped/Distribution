package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIOptions
  extends fineDashUploaderLib.libCoreMod.CoreOptions {
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
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * failedUploadTextDisplay options
    */
  var failedUploadTextDisplay: js.UndefOr[UIFailedUploadTextDisplay] = js.undefined
  /**
    * Container element for the item list
    *
    * @default `null`
    */
  var listElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
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
  var template: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
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
    autoUpload: js.UndefOr[scala.Boolean] = js.undefined,
    blobs: fineDashUploaderLib.libCoreMod.BlobsOptions = null,
    button: stdLib.HTMLElement = null,
    callbacks: fineDashUploaderLib.libCoreMod.CoreEvents = null,
    camera: fineDashUploaderLib.libCoreMod.CameraOptions = null,
    chunking: fineDashUploaderLib.libCoreMod.ChunkingOptions = null,
    cors: fineDashUploaderLib.libCoreMod.CorsOptions = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    deleteFile: UIDeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[scala.Boolean] = js.undefined,
    display: UIDisplayOptions = null,
    dragAndDrop: UIDragAndDropOptions = null,
    element: stdLib.HTMLElement = null,
    extraButtons: js.Array[fineDashUploaderLib.libCoreMod.ExtraButtonsOptions] = null,
    failedUploadTextDisplay: UIFailedUploadTextDisplay = null,
    form: fineDashUploaderLib.libCoreMod.FormOptions = null,
    formatFileName: fineDashUploaderLib.libCoreMod.FormatFileNameFuncton = null,
    listElement: stdLib.HTMLElement = null,
    maxConnections: scala.Int | scala.Double = null,
    messages: UIMessages = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    paste: UIPasteOptions = null,
    request: fineDashUploaderLib.libCoreMod.RequestOptions = null,
    resume: fineDashUploaderLib.libCoreMod.ResumeOptions = null,
    retry: UIRetryOptions = null,
    scaling: UIScalingOptions = null,
    session: fineDashUploaderLib.libCoreMod.SessionOptions = null,
    showConfirm: ShowConfirmFunction = null,
    showMessage: ShowMessageFunction = null,
    showPrompt: ShowPromptFunction = null,
    template: java.lang.String | stdLib.HTMLElement = null,
    text: UITextOptions = null,
    thumbnails: UIThumbnailsOptions = null,
    validation: fineDashUploaderLib.libCoreMod.ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[scala.Boolean] = js.undefined,
    workarounds: fineDashUploaderLib.libCoreMod.WorkArounds = null
  ): UIOptions = {
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
    if (display != null) __obj.updateDynamic("display")(display)
    if (dragAndDrop != null) __obj.updateDynamic("dragAndDrop")(dragAndDrop)
    if (element != null) __obj.updateDynamic("element")(element)
    if (extraButtons != null) __obj.updateDynamic("extraButtons")(extraButtons)
    if (failedUploadTextDisplay != null) __obj.updateDynamic("failedUploadTextDisplay")(failedUploadTextDisplay)
    if (form != null) __obj.updateDynamic("form")(form)
    if (formatFileName != null) __obj.updateDynamic("formatFileName")(formatFileName)
    if (listElement != null) __obj.updateDynamic("listElement")(listElement)
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (request != null) __obj.updateDynamic("request")(request)
    if (resume != null) __obj.updateDynamic("resume")(resume)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (scaling != null) __obj.updateDynamic("scaling")(scaling)
    if (session != null) __obj.updateDynamic("session")(session)
    if (showConfirm != null) __obj.updateDynamic("showConfirm")(showConfirm)
    if (showMessage != null) __obj.updateDynamic("showMessage")(showMessage)
    if (showPrompt != null) __obj.updateDynamic("showPrompt")(showPrompt)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    if (!js.isUndefined(warnBeforeUnload)) __obj.updateDynamic("warnBeforeUnload")(warnBeforeUnload)
    if (workarounds != null) __obj.updateDynamic("workarounds")(workarounds)
    __obj.asInstanceOf[UIOptions]
  }
}

