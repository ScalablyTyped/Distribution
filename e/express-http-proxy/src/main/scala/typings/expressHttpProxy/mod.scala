package typings.expressHttpProxy

import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(host: String): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(host: String, options: ProxyOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(
    host: js.Function1[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      String
    ]
  ): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(
    host: js.Function1[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      String
    ],
    options: ProxyOptions
  ): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-http-proxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ProxyOptions extends StObject {
    
    /**
      * The filter option can be used to limit what requests are proxied.
      * Return true to continue to execute proxy; return false-y to skip proxy for this request.
      */
    var filter: js.UndefOr[
        js.Function2[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
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
        js.Function3[
          /* err */ Any, 
          /* res */ Response_[Any, Record[String, Any]], 
          /* next */ NextFunction, 
          Any
        ]
      ] = js.undefined
    
    var proxyReqBodyDecorator: js.UndefOr[
        js.Function2[
          /* bodyContent */ Any, 
          /* srcReq */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          Any
        ]
      ] = js.undefined
    
    var proxyReqOptDecorator: js.UndefOr[
        js.Function2[
          /* proxyReqOpts */ RequestOptions, 
          /* srcReq */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          RequestOptions | js.Promise[RequestOptions]
        ]
      ] = js.undefined
    
    var proxyReqPathResolver: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String | js.Promise[String]
        ]
      ] = js.undefined
    
    var reqAsBuffer: js.UndefOr[Boolean] = js.undefined
    
    var reqBodyEncoding: js.UndefOr[String | Null] = js.undefined
    
    var skipToNextHandlerFilter: js.UndefOr[js.Function1[/* proxyRes */ IncomingMessage, Boolean]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var userResDecorator: js.UndefOr[
        js.Function4[
          /* proxyRes */ IncomingMessage, 
          /* proxyResData */ Any, 
          /* userReq */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* userRes */ Response_[Any, Record[String, Any]], 
          Buffer | String | (js.Promise[Buffer | String])
        ]
      ] = js.undefined
    
    var userResHeaderDecorator: js.UndefOr[
        js.Function5[
          /* headers */ IncomingHttpHeaders, 
          /* userReq */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* userRes */ Response_[Any, Record[String, Any]], 
          /* proxyReq */ ClientRequest, 
          /* proxyRes */ IncomingMessage, 
          OutgoingHttpHeaders
        ]
      ] = js.undefined
  }
  object ProxyOptions {
    
    inline def apply(): ProxyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyOptions]
    }
    
    extension [Self <: ProxyOptions](x: Self) {
      
      inline def setFilter(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]]) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMemoizeHost(value: Boolean): Self = StObject.set(x, "memoizeHost", value.asInstanceOf[js.Any])
      
      inline def setMemoizeHostUndefined: Self = StObject.set(x, "memoizeHost", js.undefined)
      
      inline def setParseReqBody(value: Boolean): Self = StObject.set(x, "parseReqBody", value.asInstanceOf[js.Any])
      
      inline def setParseReqBodyUndefined: Self = StObject.set(x, "parseReqBody", js.undefined)
      
      inline def setPreserveHostHdr(value: Boolean): Self = StObject.set(x, "preserveHostHdr", value.asInstanceOf[js.Any])
      
      inline def setPreserveHostHdrUndefined: Self = StObject.set(x, "preserveHostHdr", js.undefined)
      
      inline def setProxyErrorHandler(
        value: (/* err */ Any, /* res */ Response_[Any, Record[String, Any]], /* next */ NextFunction) => Any
      ): Self = StObject.set(x, "proxyErrorHandler", js.Any.fromFunction3(value))
      
      inline def setProxyErrorHandlerUndefined: Self = StObject.set(x, "proxyErrorHandler", js.undefined)
      
      inline def setProxyReqBodyDecorator(
        value: (/* bodyContent */ Any, /* srcReq */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => Any
      ): Self = StObject.set(x, "proxyReqBodyDecorator", js.Any.fromFunction2(value))
      
      inline def setProxyReqBodyDecoratorUndefined: Self = StObject.set(x, "proxyReqBodyDecorator", js.undefined)
      
      inline def setProxyReqOptDecorator(
        value: (/* proxyReqOpts */ RequestOptions, /* srcReq */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => RequestOptions | js.Promise[RequestOptions]
      ): Self = StObject.set(x, "proxyReqOptDecorator", js.Any.fromFunction2(value))
      
      inline def setProxyReqOptDecoratorUndefined: Self = StObject.set(x, "proxyReqOptDecorator", js.undefined)
      
      inline def setProxyReqPathResolver(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String | js.Promise[String]
      ): Self = StObject.set(x, "proxyReqPathResolver", js.Any.fromFunction1(value))
      
      inline def setProxyReqPathResolverUndefined: Self = StObject.set(x, "proxyReqPathResolver", js.undefined)
      
      inline def setReqAsBuffer(value: Boolean): Self = StObject.set(x, "reqAsBuffer", value.asInstanceOf[js.Any])
      
      inline def setReqAsBufferUndefined: Self = StObject.set(x, "reqAsBuffer", js.undefined)
      
      inline def setReqBodyEncoding(value: String): Self = StObject.set(x, "reqBodyEncoding", value.asInstanceOf[js.Any])
      
      inline def setReqBodyEncodingNull: Self = StObject.set(x, "reqBodyEncoding", null)
      
      inline def setReqBodyEncodingUndefined: Self = StObject.set(x, "reqBodyEncoding", js.undefined)
      
      inline def setSkipToNextHandlerFilter(value: /* proxyRes */ IncomingMessage => Boolean): Self = StObject.set(x, "skipToNextHandlerFilter", js.Any.fromFunction1(value))
      
      inline def setSkipToNextHandlerFilterUndefined: Self = StObject.set(x, "skipToNextHandlerFilter", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserResDecorator(
        value: (/* proxyRes */ IncomingMessage, /* proxyResData */ Any, /* userReq */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* userRes */ Response_[Any, Record[String, Any]]) => Buffer | String | (js.Promise[Buffer | String])
      ): Self = StObject.set(x, "userResDecorator", js.Any.fromFunction4(value))
      
      inline def setUserResDecoratorUndefined: Self = StObject.set(x, "userResDecorator", js.undefined)
      
      inline def setUserResHeaderDecorator(
        value: (/* headers */ IncomingHttpHeaders, /* userReq */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* userRes */ Response_[Any, Record[String, Any]], /* proxyReq */ ClientRequest, /* proxyRes */ IncomingMessage) => OutgoingHttpHeaders
      ): Self = StObject.set(x, "userResHeaderDecorator", js.Any.fromFunction5(value))
      
      inline def setUserResHeaderDecoratorUndefined: Self = StObject.set(x, "userResHeaderDecorator", js.undefined)
    }
  }
}
