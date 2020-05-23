package typings.expressHttpProxy.mod

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  /**
    * The filter option can be used to limit what requests are proxied.
    * Return true to continue to execute proxy; return false-y to skip proxy for this request.
    */
  var filter: js.UndefOr[
    js.Function2[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      Boolean | js.Promise[Boolean]
    ]
  ] = js.undefined
  var https: js.UndefOr[Boolean] = js.undefined
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    * See https://github.com/stream-utils/raw-body/blob/master/index.d.ts
    */
  var limit: js.UndefOr[Double | String] = js.undefined
  var memoizeHost: js.UndefOr[Boolean] = js.undefined
  var parseReqBody: js.UndefOr[Boolean] = js.undefined
  var preserveHostHdr: js.UndefOr[Boolean] = js.undefined
  var proxyErrorHandler: js.UndefOr[
    js.Function3[/* err */ js.Any, /* res */ Response_[_], /* next */ NextFunction, _]
  ] = js.undefined
  var proxyReqBodyDecorator: js.UndefOr[
    js.Function2[/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary, _, _, Query], _]
  ] = js.undefined
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ RequestOptions, 
      /* srcReq */ Request_[ParamsDictionary, _, _, Query], 
      RequestOptions | js.Promise[RequestOptions]
    ]
  ] = js.undefined
  var proxyReqPathResolver: js.UndefOr[
    js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String | js.Promise[String]]
  ] = js.undefined
  var reqAsBuffer: js.UndefOr[Boolean] = js.undefined
  var reqBodyEncoding: js.UndefOr[String | Null] = js.undefined
  var skipToNextHandlerFilter: js.UndefOr[js.Function1[/* proxyRes */ Response_[_], Boolean]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userResDecorator: js.UndefOr[
    js.Function4[
      /* proxyRes */ Response_[_], 
      /* proxyResData */ js.Any, 
      /* userReq */ Request_[ParamsDictionary, _, _, Query], 
      /* userRes */ Response_[_], 
      Buffer | String | (js.Promise[Buffer | String])
    ]
  ] = js.undefined
  var userResHeaderDecorator: js.UndefOr[
    js.Function5[
      /* headers */ IncomingHttpHeaders, 
      /* userReq */ Request_[ParamsDictionary, _, _, Query], 
      /* userRes */ Response_[_], 
      /* proxyReq */ Request_[ParamsDictionary, _, _, Query], 
      /* proxyRes */ Response_[_], 
      OutgoingHttpHeaders
    ]
  ] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    filter: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean | js.Promise[Boolean] = null,
    https: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    memoizeHost: js.UndefOr[Boolean] = js.undefined,
    parseReqBody: js.UndefOr[Boolean] = js.undefined,
    preserveHostHdr: js.UndefOr[Boolean] = js.undefined,
    proxyErrorHandler: (/* err */ js.Any, /* res */ Response_[_], /* next */ NextFunction) => _ = null,
    proxyReqBodyDecorator: (/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary, _, _, Query]) => _ = null,
    proxyReqOptDecorator: (/* proxyReqOpts */ RequestOptions, /* srcReq */ Request_[ParamsDictionary, _, _, Query]) => RequestOptions | js.Promise[RequestOptions] = null,
    proxyReqPathResolver: /* req */ Request_[ParamsDictionary, _, _, Query] => String | js.Promise[String] = null,
    reqAsBuffer: js.UndefOr[Boolean] = js.undefined,
    reqBodyEncoding: js.UndefOr[Null | String] = js.undefined,
    skipToNextHandlerFilter: /* proxyRes */ Response_[_] => Boolean = null,
    timeout: js.UndefOr[Double] = js.undefined,
    userResDecorator: (/* proxyRes */ Response_[_], /* proxyResData */ js.Any, /* userReq */ Request_[ParamsDictionary, _, _, Query], /* userRes */ Response_[_]) => Buffer | String | (js.Promise[Buffer | String]) = null,
    userResHeaderDecorator: (/* headers */ IncomingHttpHeaders, /* userReq */ Request_[ParamsDictionary, _, _, Query], /* userRes */ Response_[_], /* proxyReq */ Request_[ParamsDictionary, _, _, Query], /* proxyRes */ Response_[_]) => OutgoingHttpHeaders = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.get.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(memoizeHost)) __obj.updateDynamic("memoizeHost")(memoizeHost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseReqBody)) __obj.updateDynamic("parseReqBody")(parseReqBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveHostHdr)) __obj.updateDynamic("preserveHostHdr")(preserveHostHdr.get.asInstanceOf[js.Any])
    if (proxyErrorHandler != null) __obj.updateDynamic("proxyErrorHandler")(js.Any.fromFunction3(proxyErrorHandler))
    if (proxyReqBodyDecorator != null) __obj.updateDynamic("proxyReqBodyDecorator")(js.Any.fromFunction2(proxyReqBodyDecorator))
    if (proxyReqOptDecorator != null) __obj.updateDynamic("proxyReqOptDecorator")(js.Any.fromFunction2(proxyReqOptDecorator))
    if (proxyReqPathResolver != null) __obj.updateDynamic("proxyReqPathResolver")(js.Any.fromFunction1(proxyReqPathResolver))
    if (!js.isUndefined(reqAsBuffer)) __obj.updateDynamic("reqAsBuffer")(reqAsBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reqBodyEncoding)) __obj.updateDynamic("reqBodyEncoding")(reqBodyEncoding.asInstanceOf[js.Any])
    if (skipToNextHandlerFilter != null) __obj.updateDynamic("skipToNextHandlerFilter")(js.Any.fromFunction1(skipToNextHandlerFilter))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (userResDecorator != null) __obj.updateDynamic("userResDecorator")(js.Any.fromFunction4(userResDecorator))
    if (userResHeaderDecorator != null) __obj.updateDynamic("userResHeaderDecorator")(js.Any.fromFunction5(userResHeaderDecorator))
    __obj.asInstanceOf[ProxyOptions]
  }
}

