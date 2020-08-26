package typings.fineUploader.azureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureSignatureOptions extends js.Object {
  /**
    * Additional headers sent along with each signature request.
    *
    * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any | AzureCustomHeaderFunction] = js.native
  /**
    * The endpoint that Fine Uploader can use to send GET for a SAS before sending requests off to Azure.
    *
    * The blob URL and underlying method type associated with the underlying REST request will be included in the query string
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.native
}

object AzureSignatureOptions {
  @scala.inline
  def apply(): AzureSignatureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureSignatureOptions]
  }
  @scala.inline
  implicit class AzureSignatureOptionsOps[Self <: AzureSignatureOptions] (val x: Self) extends AnyVal {
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
    def setCustomHeadersFunction1(value: /* id */ Double => Unit): Self = this.set("customHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setCustomHeaders(value: js.Any | AzureCustomHeaderFunction): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
  }
  
}

