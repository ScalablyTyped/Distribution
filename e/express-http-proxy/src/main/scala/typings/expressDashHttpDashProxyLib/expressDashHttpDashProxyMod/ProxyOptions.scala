package typings
package expressDashHttpDashProxyLib.expressDashHttpDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var filter: js.UndefOr[
    js.Function2[
      /* req */ expressLib.expressMod.Request, 
      /* res */ expressLib.expressMod.Response, 
      scala.Boolean
    ]
  ] = js.undefined
  var https: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    * See https://github.com/stream-utils/raw-body/blob/master/index.d.ts
    */
  var limit: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var memoizeHost: js.UndefOr[scala.Boolean] = js.undefined
  var parseReqBody: js.UndefOr[scala.Boolean] = js.undefined
  var preserveHostHdr: js.UndefOr[scala.Boolean] = js.undefined
  var proxyErrorHandler: js.UndefOr[
    js.Function3[
      /* err */ js.Any, 
      /* res */ expressLib.expressMod.Response, 
      /* next */ expressLib.expressMod.NextFunction, 
      _
    ]
  ] = js.undefined
  var proxyReqBodyDecorator: js.UndefOr[
    js.Function2[/* bodyContent */ js.Any, /* srcReq */ expressLib.expressMod.Request, _]
  ] = js.undefined
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ nodeLib.httpMod.RequestOptions, 
      /* srcReq */ expressLib.expressMod.Request, 
      nodeLib.httpMod.RequestOptions | js.Promise[nodeLib.httpMod.RequestOptions]
    ]
  ] = js.undefined
  var proxyReqPathResolver: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.Request, java.lang.String]] = js.undefined
  var reqAsBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var reqBodyEncoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var skipToNextHandlerFilter: js.UndefOr[js.Function1[/* proxyRes */ expressLib.expressMod.Response, scala.Boolean]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var userResDecorator: js.UndefOr[
    js.Function4[
      /* proxyRes */ expressLib.expressMod.Response, 
      /* proxyResData */ js.Any, 
      /* userReq */ expressLib.expressMod.Request, 
      /* userRes */ expressLib.expressMod.Response, 
      nodeLib.Buffer | java.lang.String | (js.Promise[nodeLib.Buffer | java.lang.String])
    ]
  ] = js.undefined
  var userResHeaderDecorator: js.UndefOr[
    js.Function5[
      /* headers */ nodeLib.httpMod.IncomingHttpHeaders, 
      /* userReq */ expressLib.expressMod.Request, 
      /* userRes */ expressLib.expressMod.Response, 
      /* proxyReq */ expressLib.expressMod.Request, 
      /* proxyRes */ expressLib.expressMod.Response, 
      nodeLib.httpMod.OutgoingHttpHeaders
    ]
  ] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    filter: (/* req */ expressLib.expressMod.Request, /* res */ expressLib.expressMod.Response) => scala.Boolean = null,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Double | java.lang.String = null,
    memoizeHost: js.UndefOr[scala.Boolean] = js.undefined,
    parseReqBody: js.UndefOr[scala.Boolean] = js.undefined,
    preserveHostHdr: js.UndefOr[scala.Boolean] = js.undefined,
    proxyErrorHandler: (/* err */ js.Any, /* res */ expressLib.expressMod.Response, /* next */ expressLib.expressMod.NextFunction) => _ = null,
    proxyReqBodyDecorator: (/* bodyContent */ js.Any, /* srcReq */ expressLib.expressMod.Request) => _ = null,
    proxyReqOptDecorator: (/* proxyReqOpts */ nodeLib.httpMod.RequestOptions, /* srcReq */ expressLib.expressMod.Request) => nodeLib.httpMod.RequestOptions | js.Promise[nodeLib.httpMod.RequestOptions] = null,
    proxyReqPathResolver: /* req */ expressLib.expressMod.Request => java.lang.String = null,
    reqAsBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    reqBodyEncoding: java.lang.String = null,
    skipToNextHandlerFilter: /* proxyRes */ expressLib.expressMod.Response => scala.Boolean = null,
    timeout: scala.Int | scala.Double = null,
    userResDecorator: (/* proxyRes */ expressLib.expressMod.Response, /* proxyResData */ js.Any, /* userReq */ expressLib.expressMod.Request, /* userRes */ expressLib.expressMod.Response) => nodeLib.Buffer | java.lang.String | (js.Promise[nodeLib.Buffer | java.lang.String]) = null,
    userResHeaderDecorator: (/* headers */ nodeLib.httpMod.IncomingHttpHeaders, /* userReq */ expressLib.expressMod.Request, /* userRes */ expressLib.expressMod.Response, /* proxyReq */ expressLib.expressMod.Request, /* proxyRes */ expressLib.expressMod.Response) => nodeLib.httpMod.OutgoingHttpHeaders = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(memoizeHost)) __obj.updateDynamic("memoizeHost")(memoizeHost)
    if (!js.isUndefined(parseReqBody)) __obj.updateDynamic("parseReqBody")(parseReqBody)
    if (!js.isUndefined(preserveHostHdr)) __obj.updateDynamic("preserveHostHdr")(preserveHostHdr)
    if (proxyErrorHandler != null) __obj.updateDynamic("proxyErrorHandler")(js.Any.fromFunction3(proxyErrorHandler))
    if (proxyReqBodyDecorator != null) __obj.updateDynamic("proxyReqBodyDecorator")(js.Any.fromFunction2(proxyReqBodyDecorator))
    if (proxyReqOptDecorator != null) __obj.updateDynamic("proxyReqOptDecorator")(js.Any.fromFunction2(proxyReqOptDecorator))
    if (proxyReqPathResolver != null) __obj.updateDynamic("proxyReqPathResolver")(js.Any.fromFunction1(proxyReqPathResolver))
    if (!js.isUndefined(reqAsBuffer)) __obj.updateDynamic("reqAsBuffer")(reqAsBuffer)
    if (reqBodyEncoding != null) __obj.updateDynamic("reqBodyEncoding")(reqBodyEncoding)
    if (skipToNextHandlerFilter != null) __obj.updateDynamic("skipToNextHandlerFilter")(js.Any.fromFunction1(skipToNextHandlerFilter))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userResDecorator != null) __obj.updateDynamic("userResDecorator")(js.Any.fromFunction4(userResDecorator))
    if (userResHeaderDecorator != null) __obj.updateDynamic("userResHeaderDecorator")(js.Any.fromFunction5(userResHeaderDecorator))
    __obj.asInstanceOf[ProxyOptions]
  }
}

