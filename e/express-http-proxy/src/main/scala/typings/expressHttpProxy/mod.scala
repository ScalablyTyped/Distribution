package typings.expressHttpProxy

import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-http-proxy", JSImport.Namespace)
  @js.native
  def apply(host: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-http-proxy", JSImport.Namespace)
  @js.native
  def apply(host: String, options: ProxyOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-http-proxy", JSImport.Namespace)
  @js.native
  def apply(host: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-http-proxy", JSImport.Namespace)
  @js.native
  def apply(
    host: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String],
    options: ProxyOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait ProxyOptions extends StObject {
    
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
    implicit class ProxyOptionsMutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMemoizeHost(value: Boolean): Self = StObject.set(x, "memoizeHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoizeHostUndefined: Self = StObject.set(x, "memoizeHost", js.undefined)
      
      @scala.inline
      def setParseReqBody(value: Boolean): Self = StObject.set(x, "parseReqBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseReqBodyUndefined: Self = StObject.set(x, "parseReqBody", js.undefined)
      
      @scala.inline
      def setPreserveHostHdr(value: Boolean): Self = StObject.set(x, "preserveHostHdr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveHostHdrUndefined: Self = StObject.set(x, "preserveHostHdr", js.undefined)
      
      @scala.inline
      def setProxyErrorHandler(value: (/* err */ js.Any, /* res */ Response_[_], /* next */ NextFunction) => _): Self = StObject.set(x, "proxyErrorHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setProxyErrorHandlerUndefined: Self = StObject.set(x, "proxyErrorHandler", js.undefined)
      
      @scala.inline
      def setProxyReqBodyDecorator(value: (/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary, _, _, Query]) => _): Self = StObject.set(x, "proxyReqBodyDecorator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProxyReqBodyDecoratorUndefined: Self = StObject.set(x, "proxyReqBodyDecorator", js.undefined)
      
      @scala.inline
      def setProxyReqOptDecorator(
        value: (/* proxyReqOpts */ RequestOptions, /* srcReq */ Request_[ParamsDictionary, _, _, Query]) => RequestOptions | js.Promise[RequestOptions]
      ): Self = StObject.set(x, "proxyReqOptDecorator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProxyReqOptDecoratorUndefined: Self = StObject.set(x, "proxyReqOptDecorator", js.undefined)
      
      @scala.inline
      def setProxyReqPathResolver(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String | js.Promise[String]): Self = StObject.set(x, "proxyReqPathResolver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProxyReqPathResolverUndefined: Self = StObject.set(x, "proxyReqPathResolver", js.undefined)
      
      @scala.inline
      def setReqAsBuffer(value: Boolean): Self = StObject.set(x, "reqAsBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqAsBufferUndefined: Self = StObject.set(x, "reqAsBuffer", js.undefined)
      
      @scala.inline
      def setReqBodyEncoding(value: String): Self = StObject.set(x, "reqBodyEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqBodyEncodingNull: Self = StObject.set(x, "reqBodyEncoding", null)
      
      @scala.inline
      def setReqBodyEncodingUndefined: Self = StObject.set(x, "reqBodyEncoding", js.undefined)
      
      @scala.inline
      def setSkipToNextHandlerFilter(value: /* proxyRes */ Response_[_] => Boolean): Self = StObject.set(x, "skipToNextHandlerFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkipToNextHandlerFilterUndefined: Self = StObject.set(x, "skipToNextHandlerFilter", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserResDecorator(
        value: (/* proxyRes */ Response_[_], /* proxyResData */ js.Any, /* userReq */ Request_[ParamsDictionary, _, _, Query], /* userRes */ Response_[_]) => Buffer | String | (js.Promise[Buffer | String])
      ): Self = StObject.set(x, "userResDecorator", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUserResDecoratorUndefined: Self = StObject.set(x, "userResDecorator", js.undefined)
      
      @scala.inline
      def setUserResHeaderDecorator(
        value: (/* headers */ IncomingHttpHeaders, /* userReq */ Request_[ParamsDictionary, _, _, Query], /* userRes */ Response_[_], /* proxyReq */ Request_[ParamsDictionary, _, _, Query], /* proxyRes */ Response_[_]) => OutgoingHttpHeaders
      ): Self = StObject.set(x, "userResHeaderDecorator", js.Any.fromFunction5(value))
      
      @scala.inline
      def setUserResHeaderDecoratorUndefined: Self = StObject.set(x, "userResHeaderDecorator", js.undefined)
    }
  }
}
