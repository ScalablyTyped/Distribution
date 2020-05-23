package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.BlobsOptions
import typings.fineUploader.coreMod.CameraOptions
import typings.fineUploader.coreMod.CoreEvents
import typings.fineUploader.coreMod.CoreOptions
import typings.fineUploader.coreMod.DeleteFileOptions
import typings.fineUploader.coreMod.ExtraButtonsOptions
import typings.fineUploader.coreMod.FormOptions
import typings.fineUploader.coreMod.Messages
import typings.fineUploader.coreMod.PasteOptions
import typings.fineUploader.coreMod.ResumeOptions
import typings.fineUploader.coreMod.ScalingOptions
import typings.fineUploader.coreMod.SessionOptions
import typings.fineUploader.coreMod.TextOptions
import typings.fineUploader.coreMod.ValidationOptions
import typings.fineUploader.coreMod.WorkArounds
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3CoreOptions extends CoreOptions {
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_S3CoreOptions: js.UndefOr[S3ChunkingOptions] = js.undefined
  /**
    * cors options
    */
  @JSName("cors")
  var cors_S3CoreOptions: js.UndefOr[S3CorsOptions] = js.undefined
  /**
    * credentials
    */
  var credentials: js.UndefOr[S3CredentialsOptions] = js.undefined
  /**
    * iframeSupport options
    */
  var iframeSupport: js.UndefOr[S3iFrameSupportOptions] = js.undefined
  /**
    * objectProperties
    */
  var objectProperties: js.UndefOr[S3ObjectPropertyOptions] = js.undefined
  /**
    * request options
    */
  @JSName("request")
  var request_S3CoreOptions: js.UndefOr[S3RequestOptions] = js.undefined
  /**
    * signature options
    */
  var signature: js.UndefOr[S3SignatureOptions] = js.undefined
  /**
    * upload success options
    */
  var uploadSuccess: js.UndefOr[S3UploadSuccessOptions] = js.undefined
}

object S3CoreOptions {
  @scala.inline
  def apply(
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    blobs: BlobsOptions = null,
    button: HTMLElement = null,
    callbacks: CoreEvents = null,
    camera: CameraOptions = null,
    chunking: S3ChunkingOptions = null,
    cors: S3CorsOptions = null,
    credentials: S3CredentialsOptions = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    deleteFile: DeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[Boolean] = js.undefined,
    extraButtons: js.Array[ExtraButtonsOptions] = null,
    form: FormOptions = null,
    formatFileName: /* fileOrBlobName */ String => String = null,
    iframeSupport: S3iFrameSupportOptions = null,
    maxConnections: js.UndefOr[Double] = js.undefined,
    messages: Messages = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    objectProperties: S3ObjectPropertyOptions = null,
    paste: PasteOptions = null,
    request: S3RequestOptions = null,
    resume: ResumeOptions = null,
    scaling: ScalingOptions = null,
    session: SessionOptions = null,
    signature: S3SignatureOptions = null,
    text: TextOptions = null,
    uploadSuccess: S3UploadSuccessOptions = null,
    validation: ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    workarounds: WorkArounds = null
  ): S3CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.get.asInstanceOf[js.Any])
    if (blobs != null) __obj.updateDynamic("blobs")(blobs.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (chunking != null) __obj.updateDynamic("chunking")(chunking.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (deleteFile != null) __obj.updateDynamic("deleteFile")(deleteFile.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCancelForFormUploads)) __obj.updateDynamic("disableCancelForFormUploads")(disableCancelForFormUploads.get.asInstanceOf[js.Any])
    if (extraButtons != null) __obj.updateDynamic("extraButtons")(extraButtons.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formatFileName != null) __obj.updateDynamic("formatFileName")(js.Any.fromFunction1(formatFileName))
    if (iframeSupport != null) __obj.updateDynamic("iframeSupport")(iframeSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections.get.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (objectProperties != null) __obj.updateDynamic("objectProperties")(objectProperties.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(paste.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resume != null) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (uploadSuccess != null) __obj.updateDynamic("uploadSuccess")(uploadSuccess.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (!js.isUndefined(warnBeforeUnload)) __obj.updateDynamic("warnBeforeUnload")(warnBeforeUnload.get.asInstanceOf[js.Any])
    if (workarounds != null) __obj.updateDynamic("workarounds")(workarounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3CoreOptions]
  }
}

