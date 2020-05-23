package typings.googleCloudCommon.serviceMod

import typings.googleCloudCommon.googleCloudCommonBooleans.`true`
import typings.googleCloudCommon.serviceObjectMod.Interceptor
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import typings.teenyRequest.mod.Headers
import typings.teenyRequest.mod.RequestPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamRequestOptions extends DecorateRequestOptions {
  @JSName("shouldReturnStream")
  var shouldReturnStream_StreamRequestOptions: `true`
}

object StreamRequestOptions {
  @scala.inline
  def apply(
    shouldReturnStream: `true`,
    uri: String,
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    autoPaginateVal: js.UndefOr[Boolean] = js.undefined,
    body: String | js.Object = null,
    forever: js.UndefOr[Boolean] = js.undefined,
    gzip: js.UndefOr[Boolean] = js.undefined,
    headers: Headers = null,
    interceptors_ : js.Array[Interceptor] = null,
    json: js.Any = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    multipart: js.Array[RequestPart] = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    proxy: String = null,
    qs: js.Any = null,
    timeout: js.UndefOr[Double] = js.undefined,
    useQuerystring: js.UndefOr[Boolean] = js.undefined
  ): StreamRequestOptions = {
    val __obj = js.Dynamic.literal(shouldReturnStream = shouldReturnStream.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPaginateVal)) __obj.updateDynamic("autoPaginateVal")(autoPaginateVal.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (interceptors_ != null) __obj.updateDynamic("interceptors_")(interceptors_.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRequestOptions]
  }
}

