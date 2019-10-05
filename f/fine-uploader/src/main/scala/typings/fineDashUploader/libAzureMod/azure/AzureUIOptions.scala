package typings.fineDashUploader.libAzureMod.azure

import typings.fineDashUploader.fineDashUploaderMod.UIDeleteFileOptions
import typings.fineDashUploader.fineDashUploaderMod.UIDisplayOptions
import typings.fineDashUploader.fineDashUploaderMod.UIDragAndDropOptions
import typings.fineDashUploader.fineDashUploaderMod.UIMessages
import typings.fineDashUploader.fineDashUploaderMod.UIOptions
import typings.fineDashUploader.fineDashUploaderMod.UIPasteOptions
import typings.fineDashUploader.fineDashUploaderMod.UIRetryOptions
import typings.fineDashUploader.fineDashUploaderMod.UIScalingOptions
import typings.fineDashUploader.fineDashUploaderMod.UITextOptions
import typings.fineDashUploader.fineDashUploaderMod.UIThumbnailsOptions
import typings.fineDashUploader.libCoreMod.BlobsOptions
import typings.fineDashUploader.libCoreMod.CameraOptions
import typings.fineDashUploader.libCoreMod.CoreEvents
import typings.fineDashUploader.libCoreMod.ExtraButtonsOptions
import typings.fineDashUploader.libCoreMod.FormOptions
import typings.fineDashUploader.libCoreMod.PromiseOptions
import typings.fineDashUploader.libCoreMod.ResumeOptions
import typings.fineDashUploader.libCoreMod.SessionOptions
import typings.fineDashUploader.libCoreMod.ValidationOptions
import typings.fineDashUploader.libCoreMod.WorkArounds
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fineDashUploader.libCoreMod.CoreOptions because Already inherited
- typings.fineDashUploader.libAzureMod.azure.AzureCoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined blobProperties, signature, uploadSuccess */ trait AzureUIOptions extends UIOptions {
  /**
    * blobProperties
    */
  var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.undefined
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_AzureUIOptions: js.UndefOr[AzureChunkingOptions] = js.undefined
  /**
    * cors options
    */
  @JSName("cors")
  var cors_AzureUIOptions: js.UndefOr[AzureCorsOptions] = js.undefined
  /**
    * failedUploadText options
    */
  @JSName("failedUploadTextDisplay")
  var failedUploadTextDisplay_AzureUIOptions: js.UndefOr[AzureFailedUploadTextDisplayOptions] = js.undefined
  /**
    * RequestOptions
    */
  @JSName("request")
  var request_AzureUIOptions: js.UndefOr[AzureRequestOptions] = js.undefined
  /**
    * AzureSignatureOptions
    */
  var signature: js.UndefOr[AzureSignatureOptions] = js.undefined
  /**
    * AzureUploadSuccessOptions
    */
  var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.undefined
}

object AzureUIOptions {
  @scala.inline
  def apply(
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    blobProperties: AzureBlobPropertyOptions = null,
    blobs: BlobsOptions = null,
    button: HTMLElement = null,
    callbacks: CoreEvents = null,
    camera: CameraOptions = null,
    chunking: AzureChunkingOptions = null,
    cors: AzureCorsOptions = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    deleteFile: UIDeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[Boolean] = js.undefined,
    display: UIDisplayOptions = null,
    dragAndDrop: UIDragAndDropOptions = null,
    element: HTMLElement = null,
    extraButtons: js.Array[ExtraButtonsOptions] = null,
    failedUploadTextDisplay: AzureFailedUploadTextDisplayOptions = null,
    form: FormOptions = null,
    formatFileName: /* fileOrBlobName */ String => String = null,
    listElement: HTMLElement = null,
    maxConnections: Int | Double = null,
    messages: UIMessages = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    paste: UIPasteOptions = null,
    request: AzureRequestOptions = null,
    resume: ResumeOptions = null,
    retry: UIRetryOptions = null,
    scaling: UIScalingOptions = null,
    session: SessionOptions = null,
    showConfirm: /* message */ String => PromiseOptions | Unit = null,
    showMessage: /* message */ String => PromiseOptions | Unit = null,
    showPrompt: (/* message */ String, /* defaultValue */ String) => PromiseOptions | Unit = null,
    signature: AzureSignatureOptions = null,
    template: String | HTMLElement = null,
    text: UITextOptions = null,
    thumbnails: UIThumbnailsOptions = null,
    uploadSuccess: AzureUploadSuccessOptions = null,
    validation: ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    workarounds: WorkArounds = null
  ): AzureUIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload)
    if (blobProperties != null) __obj.updateDynamic("blobProperties")(blobProperties)
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
    if (formatFileName != null) __obj.updateDynamic("formatFileName")(js.Any.fromFunction1(formatFileName))
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
    if (showConfirm != null) __obj.updateDynamic("showConfirm")(js.Any.fromFunction1(showConfirm))
    if (showMessage != null) __obj.updateDynamic("showMessage")(js.Any.fromFunction1(showMessage))
    if (showPrompt != null) __obj.updateDynamic("showPrompt")(js.Any.fromFunction2(showPrompt))
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (uploadSuccess != null) __obj.updateDynamic("uploadSuccess")(uploadSuccess)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    if (!js.isUndefined(warnBeforeUnload)) __obj.updateDynamic("warnBeforeUnload")(warnBeforeUnload)
    if (workarounds != null) __obj.updateDynamic("workarounds")(workarounds)
    __obj.asInstanceOf[AzureUIOptions]
  }
}

