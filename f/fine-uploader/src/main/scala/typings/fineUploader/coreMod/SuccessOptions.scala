package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessOptions extends js.Object {
  /**
    * Endpoint to send a POST after all chunks have been successfully uploaded for each file.
    *
    * Required if the `concurrent.enabled` option is set.
    * 
    * If a function value is provided, the file's ID will be passed when invoking the function
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Headers to send to with chunking success request. The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return null }`
    */
  var headers: js.UndefOr[js.Function] = js.undefined
  /**
    * Send all parameters in the request body JSON-encoded. Otherwise params will be sent application/x-www-form-urlencoded
    * 
    * @default `false`
    */
  var jsonPayload: js.UndefOr[Boolean] = js.undefined
  /**
    * HTTP method used when sending the success request
    * 
    * @default `POST`
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * Parameters to send in the message body of the success request.  The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return null }`
    */
  var params: js.UndefOr[js.Function] = js.undefined
  /**
    * Fine Uploader will reset the file such that a retry will start at chunk 0 if the success response status matches any of the provided status codes
    * 
    * @default `[]`
    */
  var resetOnStatus: js.UndefOr[js.Array[_]] = js.undefined
}

object SuccessOptions {
  @scala.inline
  def apply(
    endpoint: String | js.Function = null,
    headers: js.Function = null,
    jsonPayload: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    params: js.Function = null,
    resetOnStatus: js.Array[_] = null
  ): SuccessOptions = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonPayload)) __obj.updateDynamic("jsonPayload")(jsonPayload.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (resetOnStatus != null) __obj.updateDynamic("resetOnStatus")(resetOnStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessOptions]
  }
}

