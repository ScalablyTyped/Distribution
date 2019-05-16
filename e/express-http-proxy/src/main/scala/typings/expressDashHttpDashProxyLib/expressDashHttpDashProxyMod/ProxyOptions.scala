package typings
package expressDashHttpDashProxyLib.expressDashHttpDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    * See https://github.com/stream-utils/raw-body/blob/master/index.d.ts
    */
  var limit: js.UndefOr[scala.Double | java.lang.String] = js.undefined
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
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ nodeLib.httpMod.RequestOptions, 
      /* srcReq */ expressLib.expressMod.Request, 
      nodeLib.httpMod.RequestOptions
    ]
  ] = js.undefined
  var proxyReqPathResolver: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.Request, java.lang.String]] = js.undefined
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
    limit: scala.Double | java.lang.String = null,
    parseReqBody: js.UndefOr[scala.Boolean] = js.undefined,
    preserveHostHdr: js.UndefOr[scala.Boolean] = js.undefined,
    proxyErrorHandler: (/* err */ js.Any, /* res */ expressLib.expressMod.Response, /* next */ expressLib.expressMod.NextFunction) => _ = null,
    proxyReqOptDecorator: (/* proxyReqOpts */ nodeLib.httpMod.RequestOptions, /* srcReq */ expressLib.expressMod.Request) => nodeLib.httpMod.RequestOptions = null,
    proxyReqPathResolver: /* req */ expressLib.expressMod.Request => java.lang.String = null,
    userResHeaderDecorator: (/* headers */ nodeLib.httpMod.IncomingHttpHeaders, /* userReq */ expressLib.expressMod.Request, /* userRes */ expressLib.expressMod.Response, /* proxyReq */ expressLib.expressMod.Request, /* proxyRes */ expressLib.expressMod.Response) => nodeLib.httpMod.OutgoingHttpHeaders = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(parseReqBody)) __obj.updateDynamic("parseReqBody")(parseReqBody)
    if (!js.isUndefined(preserveHostHdr)) __obj.updateDynamic("preserveHostHdr")(preserveHostHdr)
    if (proxyErrorHandler != null) __obj.updateDynamic("proxyErrorHandler")(js.Any.fromFunction3(proxyErrorHandler))
    if (proxyReqOptDecorator != null) __obj.updateDynamic("proxyReqOptDecorator")(js.Any.fromFunction2(proxyReqOptDecorator))
    if (proxyReqPathResolver != null) __obj.updateDynamic("proxyReqPathResolver")(js.Any.fromFunction1(proxyReqPathResolver))
    if (userResHeaderDecorator != null) __obj.updateDynamic("userResHeaderDecorator")(js.Any.fromFunction5(userResHeaderDecorator))
    __obj.asInstanceOf[ProxyOptions]
  }
}

