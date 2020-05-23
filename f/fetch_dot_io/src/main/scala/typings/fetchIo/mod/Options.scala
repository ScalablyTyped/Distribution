package typings.fetchIo.mod

import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends RequestInit {
  var afterJSON: js.UndefOr[js.Function1[/* body */ js.Any, Unit]] = js.undefined
  var afterResponse: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.undefined
  var beforeRequest: js.UndefOr[js.Function2[/* url */ TUrl, /* body */ BodyInit, Boolean | Unit]] = js.undefined
  var header: js.UndefOr[Header] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterJSON: /* body */ js.Any => Unit = null,
    afterResponse: /* res */ Response => Unit = null,
    beforeRequest: (/* url */ TUrl, /* body */ BodyInit) => Boolean | Unit = null,
    body: js.UndefOr[Null | BodyInit] = js.undefined,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    header: Header = null,
    headers: HeadersInit = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode = null,
    prefix: String = null,
    query: Query = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    signal: js.UndefOr[Null | AbortSignal] = js.undefined,
    window: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterJSON != null) __obj.updateDynamic("afterJSON")(js.Any.fromFunction1(afterJSON))
    if (afterResponse != null) __obj.updateDynamic("afterResponse")(js.Any.fromFunction1(afterResponse))
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(js.Any.fromFunction2(beforeRequest))
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(signal)) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

