package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosPromise
import typings.gaxios.commonMod.Headers
import typings.gaxios.commonMod.RetryConfig
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
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.UserAgentDirective
import typings.node.httpMod.Agent
import typings.node.urlMod.URL_
import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends GlobalOptions {
  var version: v1beta1 = js.native
}

object Options {
  @scala.inline
  def apply(
    version: v1beta1,
    adapter: /* options */ GaxiosOptions => GaxiosPromise[_] = null,
    agent: Agent | (js.Function1[/* parsedUrl */ URL_, Agent]) = null,
    auth: OAuth2Client | String = null,
    baseURL: String = null,
    baseUrl: String = null,
    body: js.Any = null,
    data: js.Any = null,
    follow: js.UndefOr[Double] = js.undefined,
    headers: Headers = null,
    maxContentLength: js.UndefOr[Double] = js.undefined,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    method: GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH = null,
    onUploadProgress: /* progressEvent */ js.Any => Unit = null,
    params: js.Any = null,
    paramsSerializer: /* params */ StringDictionary[String | Double] => String = null,
    responseType: arraybuffer | blob | json | text | stream = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    retryConfig: RetryConfig = null,
    rootUrl: String = null,
    signal: AbortSignal = null,
    size: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    url: String = null,
    userAgentDirectives: js.Array[UserAgentDirective] = null,
    validateStatus: /* status */ Double => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (adapter != null) __obj.updateDynamic("adapter")(js.Any.fromFunction1(adapter))
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxContentLength)) __obj.updateDynamic("maxContentLength")(maxContentLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(js.Any.fromFunction1(onUploadProgress))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paramsSerializer != null) __obj.updateDynamic("paramsSerializer")(js.Any.fromFunction1(paramsSerializer))
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.get.asInstanceOf[js.Any])
    if (retryConfig != null) __obj.updateDynamic("retryConfig")(retryConfig.asInstanceOf[js.Any])
    if (rootUrl != null) __obj.updateDynamic("rootUrl")(rootUrl.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userAgentDirectives != null) __obj.updateDynamic("userAgentDirectives")(userAgentDirectives.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    __obj.asInstanceOf[Options]
  }
}

