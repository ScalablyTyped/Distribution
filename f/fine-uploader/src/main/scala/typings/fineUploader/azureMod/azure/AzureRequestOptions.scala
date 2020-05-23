package typings.fineUploader.azureMod.azure

import typings.fineUploader.coreMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureRequestOptions extends RequestOptions {
  /**
    * URL for your Azure Blob Storage container
    *
    * @default `null`
    */
  var containerUrl: js.UndefOr[String] = js.undefined
}

object AzureRequestOptions {
  @scala.inline
  def apply(
    containerUrl: String = null,
    customHeaders: js.Any = null,
    endpoint: String = null,
    filenameParam: String = null,
    forceMultipart: js.UndefOr[Boolean] = js.undefined,
    inputName: String = null,
    method: String = null,
    omitDefaultParams: js.UndefOr[Boolean] = js.undefined,
    params: js.Any = null,
    paramsInBody: js.UndefOr[Boolean] = js.undefined,
    requireSuccessJson: js.UndefOr[Boolean] = js.undefined,
    totalFileSizeName: String = null,
    uuidName: String = null
  ): AzureRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (containerUrl != null) __obj.updateDynamic("containerUrl")(containerUrl.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (filenameParam != null) __obj.updateDynamic("filenameParam")(filenameParam.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMultipart)) __obj.updateDynamic("forceMultipart")(forceMultipart.get.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(omitDefaultParams)) __obj.updateDynamic("omitDefaultParams")(omitDefaultParams.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(paramsInBody)) __obj.updateDynamic("paramsInBody")(paramsInBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireSuccessJson)) __obj.updateDynamic("requireSuccessJson")(requireSuccessJson.get.asInstanceOf[js.Any])
    if (totalFileSizeName != null) __obj.updateDynamic("totalFileSizeName")(totalFileSizeName.asInstanceOf[js.Any])
    if (uuidName != null) __obj.updateDynamic("uuidName")(uuidName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureRequestOptions]
  }
}

