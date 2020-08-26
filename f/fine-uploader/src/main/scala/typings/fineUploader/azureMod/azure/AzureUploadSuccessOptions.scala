package typings.fineUploader.azureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureUploadSuccessOptions extends js.Object {
  /**
    * Additional headers sent along with each signature request
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any] = js.native
  /**
    * An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage.
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The request method (i.e. POST/PUT)
    *
    * @default `POST`
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Any additional parameters to attach to upload success file requests.
    *
    * ###Note:
    * Fine Uploader will still send the `bucket`, `key`, `filename`, `UUID`, and `etag` (if available) as well
    *
    * @default `{}`
    */
  var params: js.UndefOr[js.Any] = js.native
}

object AzureUploadSuccessOptions {
  @scala.inline
  def apply(): AzureUploadSuccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureUploadSuccessOptions]
  }
  @scala.inline
  implicit class AzureUploadSuccessOptionsOps[Self <: AzureUploadSuccessOptions] (val x: Self) extends AnyVal {
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
    def setCustomHeaders(value: js.Any): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

