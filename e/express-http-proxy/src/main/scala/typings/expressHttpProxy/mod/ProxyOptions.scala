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

@js.native
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
  ] = js.native
  var https: js.UndefOr[Boolean] = js.native
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    * See https://github.com/stream-utils/raw-body/blob/master/index.d.ts
    */
  var limit: js.UndefOr[Double | String] = js.native
  var memoizeHost: js.UndefOr[Boolean] = js.native
  var parseReqBody: js.UndefOr[Boolean] = js.native
  var preserveHostHdr: js.UndefOr[Boolean] = js.native
  var proxyErrorHandler: js.UndefOr[
    js.Function3[/* err */ js.Any, /* res */ Response_[_], /* next */ NextFunction, _]
  ] = js.native
  var proxyReqBodyDecorator: js.UndefOr[
    js.Function2[/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary, _, _, Query], _]
  ] = js.native
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ RequestOptions, 
      /* srcReq */ Request_[ParamsDictionary, _, _, Query], 
      RequestOptions | js.Promise[RequestOptions]
    ]
  ] = js.native
  var proxyReqPathResolver: js.UndefOr[
    js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String | js.Promise[String]]
  ] = js.native
  var reqAsBuffer: js.UndefOr[Boolean] = js.native
  var reqBodyEncoding: js.UndefOr[String | Null] = js.native
  var skipToNextHandlerFilter: js.UndefOr[js.Function1[/* proxyRes */ Response_[_], Boolean]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var userResDecorator: js.UndefOr[
    js.Function4[
      /* proxyRes */ Response_[_], 
      /* proxyResData */ js.Any, 
      /* userReq */ Request_[ParamsDictionary, _, _, Query], 
      /* userRes */ Response_[_], 
      Buffer | String | (js.Promise[Buffer | String])
    ]
  ] = js.native
  var userResHeaderDecorator: js.UndefOr[
    js.Function5[
      /* headers */ IncomingHttpHeaders, 
      /* userReq */ Request_[ParamsDictionary, _, _, Query], 
      /* userRes */ Response_[_], 
      /* proxyReq */ Request_[ParamsDictionary, _, _, Query], 
      /* proxyRes */ Response_[_], 
      OutgoingHttpHeaders
    ]
  ] = js.native
}

object ProxyOptions {
  @scala.inline
  def apply(): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyOptions]
  }
  @scala.inline
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilter(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean | js.Promise[Boolean]
    ): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    @scala.inline
    def setLimit(value: Double | String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMemoizeHost(value: Boolean): Self = this.set("memoizeHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoizeHost: Self = this.set("memoizeHost", js.undefined)
    @scala.inline
    def setParseReqBody(value: Boolean): Self = this.set("parseReqBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseReqBody: Self = this.set("parseReqBody", js.undefined)
    @scala.inline
    def setPreserveHostHdr(value: Boolean): Self = this.set("preserveHostHdr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveHostHdr: Self = this.set("preserveHostHdr", js.undefined)
    @scala.inline
    def setProxyErrorHandler(value: (/* err */ js.Any, /* res */ Response_[_], /* next */ NextFunction) => _): Self = this.set("proxyErrorHandler", js.Any.fromFunction3(value))
    @scala.inline
    def deleteProxyErrorHandler: Self = this.set("proxyErrorHandler", js.undefined)
    @scala.inline
    def setProxyReqBodyDecorator(value: (/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary, _, _, Query]) => _): Self = this.set("proxyReqBodyDecorator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProxyReqBodyDecorator: Self = this.set("proxyReqBodyDecorator", js.undefined)
    @scala.inline
    def setProxyReqOptDecorator(
      value: (/* proxyReqOpts */ RequestOptions, /* srcReq */ Request_[ParamsDictionary, _, _, Query]) => RequestOptions | js.Promise[RequestOptions]
    ): Self = this.set("proxyReqOptDecorator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProxyReqOptDecorator: Self = this.set("proxyReqOptDecorator", js.undefined)
    @scala.inline
    def setProxyReqPathResolver(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String | js.Promise[String]): Self = this.set("proxyReqPathResolver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProxyReqPathResolver: Self = this.set("proxyReqPathResolver", js.undefined)
    @scala.inline
    def setReqAsBuffer(value: Boolean): Self = this.set("reqAsBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReqAsBuffer: Self = this.set("reqAsBuffer", js.undefined)
    @scala.inline
    def setReqBodyEncoding(value: String): Self = this.set("reqBodyEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReqBodyEncoding: Self = this.set("reqBodyEncoding", js.undefined)
    @scala.inline
    def setReqBodyEncodingNull: Self = this.set("reqBodyEncoding", null)
    @scala.inline
    def setSkipToNextHandlerFilter(value: /* proxyRes */ Response_[_] => Boolean): Self = this.set("skipToNextHandlerFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSkipToNextHandlerFilter: Self = this.set("skipToNextHandlerFilter", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUserResDecorator(
      value: (/* proxyRes */ Response_[_], /* proxyResData */ js.Any, /* userReq */ Request_[ParamsDictionary, _, _, Query], /* userRes */ Response_[_]) => Buffer | String | (js.Promise[Buffer | String])
    ): Self = this.set("userResDecorator", js.Any.fromFunction4(value))
    @scala.inline
    def deleteUserResDecorator: Self = this.set("userResDecorator", js.undefined)
    @scala.inline
    def setUserResHeaderDecorator(
      value: (/* headers */ IncomingHttpHeaders, /* userReq */ Request_[ParamsDictionary, _, _, Query], /* userRes */ Response_[_], /* proxyReq */ Request_[ParamsDictionary, _, _, Query], /* proxyRes */ Response_[_]) => OutgoingHttpHeaders
    ): Self = this.set("userResHeaderDecorator", js.Any.fromFunction5(value))
    @scala.inline
    def deleteUserResHeaderDecorator: Self = this.set("userResHeaderDecorator", js.undefined)
  }
  
}

