package typings.atGoogleDashCloudCommon.buildSrcServiceMod

import typings.atGoogleDashCloudCommon.atGoogleDashCloudCommonNumbers.`true`
import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Interceptor
import typings.atGoogleDashCloudCommon.buildSrcUtilMod.DecorateRequestOptions
import typings.teenyDashRequest.teenyDashRequestMod.Headers
import typings.teenyDashRequest.teenyDashRequestMod.RequestPart
import typings.teenyDashRequest.teenyDashRequestStrings.CONNECT
import typings.teenyDashRequest.teenyDashRequestStrings.DELETE
import typings.teenyDashRequest.teenyDashRequestStrings.GET
import typings.teenyDashRequest.teenyDashRequestStrings.HEAD
import typings.teenyDashRequest.teenyDashRequestStrings.OPTIONS
import typings.teenyDashRequest.teenyDashRequestStrings.PATCH
import typings.teenyDashRequest.teenyDashRequestStrings.POST
import typings.teenyDashRequest.teenyDashRequestStrings.PUT
import typings.teenyDashRequest.teenyDashRequestStrings.TRACE
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
    maxRetries: Int | Double = null,
    method: GET | POST | PUT | HEAD | OPTIONS | PATCH | DELETE | CONNECT | TRACE = null,
    multipart: js.Array[RequestPart] = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    proxy: String = null,
    qs: js.Any = null,
    timeout: Int | Double = null,
    useQuerystring: js.UndefOr[Boolean] = js.undefined
  ): StreamRequestOptions = {
    val __obj = js.Dynamic.literal(shouldReturnStream = shouldReturnStream, uri = uri)
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (!js.isUndefined(autoPaginateVal)) __obj.updateDynamic("autoPaginateVal")(autoPaginateVal)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (interceptors_ != null) __obj.updateDynamic("interceptors_")(interceptors_)
    if (json != null) __obj.updateDynamic("json")(json)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (multipart != null) __obj.updateDynamic("multipart")(multipart)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring)
    __obj.asInstanceOf[StreamRequestOptions]
  }
}

