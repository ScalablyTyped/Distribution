package typings
package atGoogleDashCloudCommonLib.buildSrcServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamRequestOptions
  extends atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions {
  @JSName("shouldReturnStream")
  var shouldReturnStream_StreamRequestOptions: atGoogleDashCloudCommonLib.atGoogleDashCloudCommonLibNumbers.`true`
}

object StreamRequestOptions {
  @scala.inline
  def apply(
    shouldReturnStream: atGoogleDashCloudCommonLib.atGoogleDashCloudCommonLibNumbers.`true`,
    uri: java.lang.String,
    agent: nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent = null,
    agentClass: js.Any = null,
    agentOptions: nodeLib.httpMod.AgentOptions | nodeLib.httpsMod.AgentOptions = null,
    auth: requestLib.requestMod.requestNs.AuthOptions = null,
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    autoPaginateVal: js.UndefOr[scala.Boolean] = js.undefined,
    aws: requestLib.requestMod.requestNs.AWSOptions = null,
    baseUrl: java.lang.String = null,
    body: js.Any = null,
    ca: java.lang.String | nodeLib.Buffer | js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = null,
    callback: requestLib.requestMod.requestNs.RequestCallback = null,
    cert: nodeLib.Buffer = null,
    encoding: java.lang.String = null,
    family: requestLib.requestLibNumbers.`4` | requestLib.requestLibNumbers.`6` = null,
    followAllRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    followOriginalHttpMethod: js.UndefOr[scala.Boolean] = js.undefined,
    followRedirect: scala.Boolean | (js.Function1[/* response */ nodeLib.httpMod.IncomingMessage, scala.Boolean]) = null,
    forever: js.Any = null,
    form: org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = null,
    formData: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    har: requestLib.requestMod.requestNs.HttpArchiveRequest = null,
    hawk: requestLib.requestMod.requestNs.HawkOptions = null,
    headers: requestLib.requestMod.requestNs.Headers = null,
    host: java.lang.String = null,
    interceptors_ : js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Interceptor] = null,
    jar: requestLib.requestMod.requestNs.CookieJar | scala.Boolean = null,
    json: js.Any = null,
    jsonReplacer: (/* key */ java.lang.String, /* value */ js.Any) => _ = null,
    jsonReviver: (/* key */ java.lang.String, /* value */ js.Any) => _ = null,
    key: nodeLib.Buffer = null,
    localAddress: java.lang.String = null,
    maxRedirects: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    multipart: js.Array[requestLib.requestMod.requestNs.RequestPart] | requestLib.requestMod.requestNs.Multipart = null,
    oauth: requestLib.requestMod.requestNs.OAuthOptions = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    passphrase: java.lang.String = null,
    pool: js.Any = null,
    port: scala.Int | scala.Double = null,
    postambleCRLF: js.UndefOr[scala.Boolean] = js.undefined,
    preambleCRLF: js.UndefOr[scala.Boolean] = js.undefined,
    proxy: js.Any = null,
    qs: js.Any = null,
    qsParseOptions: js.Any = null,
    qsStringifyOptions: js.Any = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    removeRefererHeader: js.UndefOr[scala.Boolean] = js.undefined,
    strictSSL: js.UndefOr[scala.Boolean] = js.undefined,
    time: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    tunnel: js.UndefOr[scala.Boolean] = js.undefined,
    useQuerystring: js.UndefOr[scala.Boolean] = js.undefined,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): StreamRequestOptions = {
    val __obj = js.Dynamic.literal(shouldReturnStream = shouldReturnStream, uri = uri)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (agentClass != null) __obj.updateDynamic("agentClass")(agentClass)
    if (agentOptions != null) __obj.updateDynamic("agentOptions")(agentOptions.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (!js.isUndefined(autoPaginateVal)) __obj.updateDynamic("autoPaginateVal")(autoPaginateVal)
    if (aws != null) __obj.updateDynamic("aws")(aws)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (body != null) __obj.updateDynamic("body")(body)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects)
    if (!js.isUndefined(followOriginalHttpMethod)) __obj.updateDynamic("followOriginalHttpMethod")(followOriginalHttpMethod)
    if (followRedirect != null) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (forever != null) __obj.updateDynamic("forever")(forever)
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (har != null) __obj.updateDynamic("har")(har)
    if (hawk != null) __obj.updateDynamic("hawk")(hawk)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (interceptors_ != null) __obj.updateDynamic("interceptors_")(interceptors_)
    if (jar != null) __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json)
    if (jsonReplacer != null) __obj.updateDynamic("jsonReplacer")(js.Any.fromFunction2(jsonReplacer))
    if (jsonReviver != null) __obj.updateDynamic("jsonReviver")(js.Any.fromFunction2(jsonReviver))
    if (key != null) __obj.updateDynamic("key")(key)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (oauth != null) __obj.updateDynamic("oauth")(oauth)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(postambleCRLF)) __obj.updateDynamic("postambleCRLF")(postambleCRLF)
    if (!js.isUndefined(preambleCRLF)) __obj.updateDynamic("preambleCRLF")(preambleCRLF)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (qsParseOptions != null) __obj.updateDynamic("qsParseOptions")(qsParseOptions)
    if (qsStringifyOptions != null) __obj.updateDynamic("qsStringifyOptions")(qsStringifyOptions)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(removeRefererHeader)) __obj.updateDynamic("removeRefererHeader")(removeRefererHeader)
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel)
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[StreamRequestOptions]
  }
}

