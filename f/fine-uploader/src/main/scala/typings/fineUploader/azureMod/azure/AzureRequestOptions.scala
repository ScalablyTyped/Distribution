package typings.fineUploader.azureMod.azure

import typings.fineUploader.coreMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureRequestOptions extends RequestOptions {
  /**
    * URL for your Azure Blob Storage container
    *
    * @default `null`
    */
  var containerUrl: js.UndefOr[String] = js.native
}

object AzureRequestOptions {
  @scala.inline
  def apply(): AzureRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureRequestOptions]
  }
  @scala.inline
  implicit class AzureRequestOptionsOps[Self <: AzureRequestOptions] (val x: Self) extends AnyVal {
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
    def setContainerUrl(value: String): Self = this.set("containerUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerUrl: Self = this.set("containerUrl", js.undefined)
  }
  
}

