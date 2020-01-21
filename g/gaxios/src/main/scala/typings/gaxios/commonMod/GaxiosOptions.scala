package typings.gaxios.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.gaxiosStrings.CONNECT
import typings.gaxios.gaxiosStrings.DELETE
import typings.gaxios.gaxiosStrings.GET
import typings.gaxios.gaxiosStrings.HEAD
import typings.gaxios.gaxiosStrings.OPTIONS
import typings.gaxios.gaxiosStrings.PATCH
import typings.gaxios.gaxiosStrings.POST
import typings.gaxios.gaxiosStrings.PUT
import typings.gaxios.gaxiosStrings.TRACE
import typings.gaxios.gaxiosStrings.arraybuffer
import typings.gaxios.gaxiosStrings.blob
import typings.gaxios.gaxiosStrings.json
import typings.gaxios.gaxiosStrings.stream
import typings.gaxios.gaxiosStrings.text
import typings.node.httpsMod.Agent
import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaxiosOptions extends js.Object {
  /**
    * Optional method to override making the actual HTTP request. Useful
    * for writing tests.
    */
  var adapter: js.UndefOr[js.Function1[/* options */ GaxiosOptions, GaxiosPromise[_]]] = js.undefined
  var agent: js.UndefOr[Agent] = js.undefined
  var baseURL: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var follow: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  /**
    * The maximum size of the http response content in bytes allowed.
    */
  var maxContentLength: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of redirects to follow. Defaults to 20.
    */
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH] = js.undefined
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var paramsSerializer: js.UndefOr[js.Function1[/* params */ StringDictionary[String | Double], String]] = js.undefined
  var responseType: js.UndefOr[arraybuffer | blob | json | text | stream] = js.undefined
  var retry: js.UndefOr[Boolean] = js.undefined
  var retryConfig: js.UndefOr[RetryConfig] = js.undefined
  var signal: js.UndefOr[AbortSignal] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var validateStatus: js.UndefOr[js.Function1[/* status */ Double, Boolean]] = js.undefined
}

object GaxiosOptions {
  @scala.inline
  def apply(
    adapter: /* options */ GaxiosOptions => GaxiosPromise[_] = null,
    agent: Agent = null,
    baseURL: String = null,
    baseUrl: String = null,
    body: js.Any = null,
    data: js.Any = null,
    follow: Int | Double = null,
    headers: Headers = null,
    maxContentLength: Int | Double = null,
    maxRedirects: Int | Double = null,
    method: GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH = null,
    onUploadProgress: /* progressEvent */ js.Any => Unit = null,
    params: js.Any = null,
    paramsSerializer: /* params */ StringDictionary[String | Double] => String = null,
    responseType: arraybuffer | blob | json | text | stream = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    retryConfig: RetryConfig = null,
    signal: AbortSignal = null,
    size: Int | Double = null,
    timeout: Int | Double = null,
    url: String = null,
    validateStatus: /* status */ Double => Boolean = null
  ): GaxiosOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(js.Any.fromFunction1(adapter))
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (maxContentLength != null) __obj.updateDynamic("maxContentLength")(maxContentLength.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(js.Any.fromFunction1(onUploadProgress))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paramsSerializer != null) __obj.updateDynamic("paramsSerializer")(js.Any.fromFunction1(paramsSerializer))
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryConfig != null) __obj.updateDynamic("retryConfig")(retryConfig.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    __obj.asInstanceOf[GaxiosOptions]
  }
}

