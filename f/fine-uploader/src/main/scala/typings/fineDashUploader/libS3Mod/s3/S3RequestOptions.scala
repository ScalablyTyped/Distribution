package typings.fineDashUploader.libS3Mod.s3

import typings.fineDashUploader.libCoreMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3RequestOptions extends RequestOptions {
  /**
    * Your AWS public key. NOT YOUR SECRET KEY. Ignored if `credentials` have been set
    *
    * @default `null`
    */
  var accessKey: js.UndefOr[String] = js.undefined
  /**
    * Number of milliseconds to add to the `x-amz-date` header and the policy expiration date to account for clock drift on the browser/client machine
    *
    * @default `0`
    */
  var clockDrift: js.UndefOr[Double] = js.undefined
}

object S3RequestOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    clockDrift: Int | Double = null,
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
  ): S3RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (clockDrift != null) __obj.updateDynamic("clockDrift")(clockDrift.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[S3RequestOptions]
  }
}

