package typings.fineUploader.azureMod.azure

import typings.fineUploader.coreMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureCoreOptions extends CoreOptions {
  /**
    * blobProperties
    */
  var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.native
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_AzureCoreOptions: js.UndefOr[AzureChunkingOptions] = js.native
  /**
    * cors options
    */
  @JSName("cors")
  var cors_AzureCoreOptions: js.UndefOr[AzureCorsOptions] = js.native
  /**
    * RequestOptions
    */
  @JSName("request")
  var request_AzureCoreOptions: js.UndefOr[AzureRequestOptions] = js.native
  /**
    * AzureSignatureOptions
    */
  var signature: js.UndefOr[AzureSignatureOptions] = js.native
  /**
    * AzureUploadSuccessOptions
    */
  var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.native
}

object AzureCoreOptions {
  @scala.inline
  def apply(): AzureCoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureCoreOptions]
  }
  @scala.inline
  implicit class AzureCoreOptionsOps[Self <: AzureCoreOptions] (val x: Self) extends AnyVal {
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

