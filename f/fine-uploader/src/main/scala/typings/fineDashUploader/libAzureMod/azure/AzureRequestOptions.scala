package typings.fineDashUploader.libAzureMod.azure

import typings.fineDashUploader.libCoreMod.RequestOptions
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
    if (containerUrl != null) __obj.updateDynamic("containerUrl")(containerUrl)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (filenameParam != null) __obj.updateDynamic("filenameParam")(filenameParam)
    if (!js.isUndefined(forceMultipart)) __obj.updateDynamic("forceMultipart")(forceMultipart)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(omitDefaultParams)) __obj.updateDynamic("omitDefaultParams")(omitDefaultParams)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(paramsInBody)) __obj.updateDynamic("paramsInBody")(paramsInBody)
    if (!js.isUndefined(requireSuccessJson)) __obj.updateDynamic("requireSuccessJson")(requireSuccessJson)
    if (totalFileSizeName != null) __obj.updateDynamic("totalFileSizeName")(totalFileSizeName)
    if (uuidName != null) __obj.updateDynamic("uuidName")(uuidName)
    __obj.asInstanceOf[AzureRequestOptions]
  }
}

