package typings.fineUploader.azureMod.azure

import typings.fineUploader.mod.UIOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fineUploader.coreMod.CoreOptions because Already inherited
- typings.fineUploader.azureMod.azure.AzureCoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined blobProperties, signature, uploadSuccess */ @js.native
trait AzureUIOptions extends UIOptions {
  /**
    * blobProperties
    */
  var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.native
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_AzureUIOptions: js.UndefOr[AzureChunkingOptions] = js.native
  /**
    * cors options
    */
  @JSName("cors")
  var cors_AzureUIOptions: js.UndefOr[AzureCorsOptions] = js.native
  /**
    * failedUploadText options
    */
  @JSName("failedUploadTextDisplay")
  var failedUploadTextDisplay_AzureUIOptions: js.UndefOr[AzureFailedUploadTextDisplayOptions] = js.native
  /**
    * RequestOptions
    */
  @JSName("request")
  var request_AzureUIOptions: js.UndefOr[AzureRequestOptions] = js.native
  /**
    * AzureSignatureOptions
    */
  var signature: js.UndefOr[AzureSignatureOptions] = js.native
  /**
    * AzureUploadSuccessOptions
    */
  var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.native
}

object AzureUIOptions {
  @scala.inline
  def apply(): AzureUIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureUIOptions]
  }
  @scala.inline
  implicit class AzureUIOptionsOps[Self <: AzureUIOptions] (val x: Self) extends AnyVal {
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
    def setBlobProperties(value: AzureBlobPropertyOptions): Self = this.set("blobProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlobProperties: Self = this.set("blobProperties", js.undefined)
    @scala.inline
    def setChunking(value: AzureChunkingOptions): Self = this.set("chunking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunking: Self = this.set("chunking", js.undefined)
    @scala.inline
    def setCors(value: AzureCorsOptions): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setFailedUploadTextDisplay(value: AzureFailedUploadTextDisplayOptions): Self = this.set("failedUploadTextDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedUploadTextDisplay: Self = this.set("failedUploadTextDisplay", js.undefined)
    @scala.inline
    def setRequest(value: AzureRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setSignature(value: AzureSignatureOptions): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setUploadSuccess(value: AzureUploadSuccessOptions): Self = this.set("uploadSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadSuccess: Self = this.set("uploadSuccess", js.undefined)
  }
  
}

