package typings.fineDashUploader.libAzureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureUploadSuccessOptions extends js.Object {
  /**
    * Additional headers sent along with each signature request
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any] = js.undefined
  /**
    * An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage.
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.undefined
  /**
    * The request method (i.e. POST/PUT)
    *
    * @default `POST`
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * Any additional parameters to attach to upload success file requests.
    *
    * ###Note:
    * Fine Uploader will still send the `bucket`, `key`, `filename`, `UUID`, and `etag` (if available) as well
    *
    * @default `{}`
    */
  var params: js.UndefOr[js.Any] = js.undefined
}

object AzureUploadSuccessOptions {
  @scala.inline
  def apply(
    customHeaders: js.Any = null,
    endpoint: String = null,
    method: String = null,
    params: js.Any = null
  ): AzureUploadSuccessOptions = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[AzureUploadSuccessOptions]
  }
}

