package typings
package fetchDotIoLib.fetchDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends stdLib.RequestInit {
  var afterJSON: js.UndefOr[js.Function1[/* body */ js.Any, scala.Unit]] = js.undefined
  var afterResponse: js.UndefOr[js.Function1[/* res */ stdLib.Response, scala.Unit]] = js.undefined
  var beforeRequest: js.UndefOr[
    js.Function2[/* url */ TUrl, /* body */ stdLib.BodyInit, scala.Boolean | scala.Unit]
  ] = js.undefined
  var header: js.UndefOr[Header] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterJSON: /* body */ js.Any => scala.Unit = null,
    afterResponse: /* res */ stdLib.Response => scala.Unit = null,
    beforeRequest: (/* url */ TUrl, /* body */ stdLib.BodyInit) => scala.Boolean | scala.Unit = null,
    body: stdLib.BodyInit = null,
    cache: stdLib.RequestCache = null,
    credentials: stdLib.RequestCredentials = null,
    header: Header = null,
    headers: stdLib.HeadersInit = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: stdLib.RequestMode = null,
    prefix: java.lang.String = null,
    query: Query = null,
    redirect: stdLib.RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: stdLib.ReferrerPolicy = null,
    signal: stdLib.AbortSignal = null,
    window: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterJSON != null) __obj.updateDynamic("afterJSON")(js.Any.fromFunction1(afterJSON))
    if (afterResponse != null) __obj.updateDynamic("afterResponse")(js.Any.fromFunction1(afterResponse))
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(js.Any.fromFunction2(beforeRequest))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (query != null) __obj.updateDynamic("query")(query)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[Options]
  }
}

