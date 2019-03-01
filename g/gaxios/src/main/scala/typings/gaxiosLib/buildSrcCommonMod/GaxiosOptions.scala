package typings
package gaxiosLib.buildSrcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaxiosOptions extends js.Object {
  /**
    * Optional method to override making the actual HTTP request. Useful
    * for writing tests.
    */
  var adapter: js.UndefOr[js.Function1[/* options */ GaxiosOptions, GaxiosPromise[_]]] = js.undefined
  var agent: js.UndefOr[nodeLib.httpsMod.Agent] = js.undefined
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var follow: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  /**
    * The maximum size of the http response content in bytes allowed.
    */
  var maxContentLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of redirects to follow. Defaults to 20.
    */
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[
    gaxiosLib.gaxiosLibStrings.GET | gaxiosLib.gaxiosLibStrings.HEAD | gaxiosLib.gaxiosLibStrings.POST | gaxiosLib.gaxiosLibStrings.DELETE | gaxiosLib.gaxiosLibStrings.PUT | gaxiosLib.gaxiosLibStrings.CONNECT | gaxiosLib.gaxiosLibStrings.OPTIONS | gaxiosLib.gaxiosLibStrings.TRACE | gaxiosLib.gaxiosLibStrings.PATCH
  ] = js.undefined
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, scala.Unit]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var paramsSerializer: js.UndefOr[
    js.Function1[
      /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double], 
      java.lang.String
    ]
  ] = js.undefined
  var responseType: js.UndefOr[
    gaxiosLib.gaxiosLibStrings.arraybuffer | gaxiosLib.gaxiosLibStrings.blob | gaxiosLib.gaxiosLibStrings.json | gaxiosLib.gaxiosLibStrings.text | gaxiosLib.gaxiosLibStrings.stream
  ] = js.undefined
  var retry: js.UndefOr[scala.Boolean] = js.undefined
  var retryConfig: js.UndefOr[RetryConfig] = js.undefined
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var validateStatus: js.UndefOr[js.Function1[/* status */ scala.Double, scala.Boolean]] = js.undefined
}

object GaxiosOptions {
  @scala.inline
  def apply(
    adapter: js.Function1[/* options */ GaxiosOptions, GaxiosPromise[_]] = null,
    agent: nodeLib.httpsMod.Agent = null,
    baseURL: java.lang.String = null,
    baseUrl: java.lang.String = null,
    body: js.Any = null,
    data: js.Any = null,
    follow: scala.Int | scala.Double = null,
    headers: Headers = null,
    maxContentLength: scala.Int | scala.Double = null,
    maxRedirects: scala.Int | scala.Double = null,
    method: gaxiosLib.gaxiosLibStrings.GET | gaxiosLib.gaxiosLibStrings.HEAD | gaxiosLib.gaxiosLibStrings.POST | gaxiosLib.gaxiosLibStrings.DELETE | gaxiosLib.gaxiosLibStrings.PUT | gaxiosLib.gaxiosLibStrings.CONNECT | gaxiosLib.gaxiosLibStrings.OPTIONS | gaxiosLib.gaxiosLibStrings.TRACE | gaxiosLib.gaxiosLibStrings.PATCH = null,
    onUploadProgress: js.Function1[/* progressEvent */ js.Any, scala.Unit] = null,
    params: js.Any = null,
    paramsSerializer: js.Function1[
      /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double], 
      java.lang.String
    ] = null,
    responseType: gaxiosLib.gaxiosLibStrings.arraybuffer | gaxiosLib.gaxiosLibStrings.blob | gaxiosLib.gaxiosLibStrings.json | gaxiosLib.gaxiosLibStrings.text | gaxiosLib.gaxiosLibStrings.stream = null,
    retry: js.UndefOr[scala.Boolean] = js.undefined,
    retryConfig: RetryConfig = null,
    signal: stdLib.AbortSignal = null,
    size: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    validateStatus: js.Function1[/* status */ scala.Double, scala.Boolean] = null
  ): GaxiosOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (body != null) __obj.updateDynamic("body")(body)
    if (data != null) __obj.updateDynamic("data")(data)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (maxContentLength != null) __obj.updateDynamic("maxContentLength")(maxContentLength.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(onUploadProgress)
    if (params != null) __obj.updateDynamic("params")(params)
    if (paramsSerializer != null) __obj.updateDynamic("paramsSerializer")(paramsSerializer)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry)
    if (retryConfig != null) __obj.updateDynamic("retryConfig")(retryConfig)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus)
    __obj.asInstanceOf[GaxiosOptions]
  }
}

