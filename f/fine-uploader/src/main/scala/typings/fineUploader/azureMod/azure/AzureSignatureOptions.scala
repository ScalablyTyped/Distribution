package typings.fineUploader.azureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureSignatureOptions extends js.Object {
  /**
    * Additional headers sent along with each signature request.
    *
    * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any | AzureCustomHeaderFunction] = js.undefined
  /**
    * The endpoint that Fine Uploader can use to send GET for a SAS before sending requests off to Azure.
    *
    * The blob URL and underlying method type associated with the underlying REST request will be included in the query string
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.undefined
}

object AzureSignatureOptions {
  @scala.inline
  def apply(customHeaders: js.Any | AzureCustomHeaderFunction = null, endpoint: String = null): AzureSignatureOptions = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSignatureOptions]
  }
}

