package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Interceptor
import typings.teenyDashRequest.teenyDashRequestMod.CoreOptions
import typings.teenyDashRequest.teenyDashRequestMod.Headers
import typings.teenyDashRequest.teenyDashRequestMod.RequestPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorateRequestOptions extends CoreOptions {
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  var autoPaginateVal: js.UndefOr[Boolean] = js.undefined
  var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var shouldReturnStream: js.UndefOr[Boolean] = js.undefined
  var uri: String
}

object DecorateRequestOptions {
  @scala.inline
  def apply(
    uri: String,
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    autoPaginateVal: js.UndefOr[Boolean] = js.undefined,
    body: String | js.Object = null,
    forever: js.UndefOr[Boolean] = js.undefined,
    gzip: js.UndefOr[Boolean] = js.undefined,
    headers: Headers = null,
    interceptors_ : js.Array[Interceptor] = null,
    json: js.Any = null,
    maxRetries: Int | Double = null,
    method: String = null,
    multipart: js.Array[RequestPart] = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    proxy: String = null,
    qs: js.Any = null,
    shouldReturnStream: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    useQuerystring: js.UndefOr[Boolean] = js.undefined
  ): DecorateRequestOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPaginateVal)) __obj.updateDynamic("autoPaginateVal")(autoPaginateVal.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (interceptors_ != null) __obj.updateDynamic("interceptors_")(interceptors_.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldReturnStream)) __obj.updateDynamic("shouldReturnStream")(shouldReturnStream.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorateRequestOptions]
  }
}

