package typings.fineUploader.s3Mod.s3

import typings.fineUploader.mod.UIOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fineUploader.coreMod.CoreOptions because Already inherited
- typings.fineUploader.s3Mod.s3.S3CoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined credentials, iframeSupport, objectProperties, signature, uploadSuccess */ @js.native
trait S3UIOptions extends UIOptions {
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_S3UIOptions: js.UndefOr[S3ChunkingOptions] = js.native
  /**
    * cors options
    */
  @JSName("cors")
  var cors_S3UIOptions: js.UndefOr[S3CorsOptions] = js.native
  /**
    * credentials
    */
  var credentials: js.UndefOr[S3CredentialsOptions] = js.native
  /**
    * failedUploadText options
    */
  @JSName("failedUploadTextDisplay")
  var failedUploadTextDisplay_S3UIOptions: js.UndefOr[S3FailedUploadTextDisplayOptions] = js.native
  /**
    * iframeSupport options
    */
  var iframeSupport: js.UndefOr[S3iFrameSupportOptions] = js.native
  /**
    * objectProperties
    */
  var objectProperties: js.UndefOr[S3ObjectPropertyOptions] = js.native
  /**
    * request options
    */
  @JSName("request")
  var request_S3UIOptions: js.UndefOr[S3RequestOptions] = js.native
  /**
    * signature options
    */
  var signature: js.UndefOr[S3SignatureOptions] = js.native
  /**
    * upload success options
    */
  var uploadSuccess: js.UndefOr[S3UploadSuccessOptions] = js.native
}

object S3UIOptions {
  @scala.inline
  def apply(): S3UIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3UIOptions]
  }
  @scala.inline
  implicit class S3UIOptionsOps[Self <: S3UIOptions] (val x: Self) extends AnyVal {
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
    def setChunking(value: S3ChunkingOptions): Self = this.set("chunking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunking: Self = this.set("chunking", js.undefined)
    @scala.inline
    def setCors(value: S3CorsOptions): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setCredentials(value: S3CredentialsOptions): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setFailedUploadTextDisplay(value: S3FailedUploadTextDisplayOptions): Self = this.set("failedUploadTextDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedUploadTextDisplay: Self = this.set("failedUploadTextDisplay", js.undefined)
    @scala.inline
    def setIframeSupport(value: S3iFrameSupportOptions): Self = this.set("iframeSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeSupport: Self = this.set("iframeSupport", js.undefined)
    @scala.inline
    def setObjectProperties(value: S3ObjectPropertyOptions): Self = this.set("objectProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectProperties: Self = this.set("objectProperties", js.undefined)
    @scala.inline
    def setRequest(value: S3RequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setSignature(value: S3SignatureOptions): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setUploadSuccess(value: S3UploadSuccessOptions): Self = this.set("uploadSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadSuccess: Self = this.set("uploadSuccess", js.undefined)
  }
  
}

