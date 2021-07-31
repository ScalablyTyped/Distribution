package typings.fastify

import org.scalablytyped.runtime.StringDictionary
import typings.fastify.anon.CustomOptions
import typings.fastify.anon.DeriveVersion
import typings.fastify.fastifyBooleans.`true`
import typings.fastify.fastifyStrings.error
import typings.fastify.fastifyStrings.ignore
import typings.fastify.fastifyStrings.remove
import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyLoggerInstance
import typings.fastify.loggerMod.FastifyLoggerOptions
import typings.fastify.replyMod.FastifyReply
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.requestMod.RequestGenericInterface
import typings.fastify.routeMod.RouteGenericInterface
import typings.fastify.schemaMod.FastifySchemaValidationError
import typings.fastify.serverFactoryMod.FastifyServerFactory
import typings.fastify.serverFactoryMod.FastifyServerFactoryHandler
import typings.fastify.utilsMod.ContextConfigDefault
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastifyError.mod.FastifyError
import typings.node.http2Mod.Http2SecureServer
import typings.node.http2Mod.Http2Server
import typings.node.http2Mod.SecureServerOptions
import typings.node.httpsMod.Server
import typings.node.httpsMod.ServerOptions
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Server /* <: typings.node.httpMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  @scala.inline
  def default[Server /* <: Http2Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttp2Options[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  /**
    * Fastify factor function for the standard fastify http, https, or http2 server instance.
    *
    * The default function utilizes http
    *
    * @param opts Fastify server options
    * @returns Fastify server instance
    */
  @scala.inline
  def default[Server /* <: Http2SecureServer */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttp2SecureOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  @scala.inline
  def default[Server /* <: typings.node.httpsMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttpsOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  @scala.inline
  def default[Server /* <: typings.node.httpMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyServerOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  
  @scala.inline
  def fastify[Server /* <: typings.node.httpMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("fastify")().asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  @scala.inline
  def fastify[Server /* <: Http2Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttp2Options[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("fastify")(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  /**
    * Fastify factor function for the standard fastify http, https, or http2 server instance.
    *
    * The default function utilizes http
    *
    * @param opts Fastify server options
    * @returns Fastify server instance
    */
  @scala.inline
  def fastify[Server /* <: Http2SecureServer */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttp2SecureOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("fastify")(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  @scala.inline
  def fastify[Server /* <: typings.node.httpsMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttpsOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("fastify")(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  @scala.inline
  def fastify[Server /* <: typings.node.httpMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyServerOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("fastify")(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger]) & (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]])]
  
  trait FastifyHttp2Options[Server /* <: Http2Server */, Logger /* <: FastifyLoggerInstance */]
    extends StObject
       with FastifyServerOptions[Server, Logger] {
    
    var http2: `true`
    
    var http2SessionTimeout: js.UndefOr[Double] = js.undefined
  }
  object FastifyHttp2Options {
    
    @scala.inline
    def apply[Server /* <: Http2Server */, Logger /* <: FastifyLoggerInstance */](): FastifyHttp2Options[Server, Logger] = {
      val __obj = js.Dynamic.literal(http2 = true)
      __obj.asInstanceOf[FastifyHttp2Options[Server, Logger]]
    }
    
    @scala.inline
    implicit class FastifyHttp2OptionsMutableBuilder[Self <: FastifyHttp2Options[?, ?], Server /* <: Http2Server */, Logger /* <: FastifyLoggerInstance */] (val x: Self & (FastifyHttp2Options[Server, Logger])) extends AnyVal {
      
      @scala.inline
      def setHttp2(value: `true`): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp2SessionTimeout(value: Double): Self = StObject.set(x, "http2SessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp2SessionTimeoutUndefined: Self = StObject.set(x, "http2SessionTimeout", js.undefined)
    }
  }
  
  trait FastifyHttp2SecureOptions[Server /* <: Http2SecureServer */, Logger /* <: FastifyLoggerInstance */]
    extends StObject
       with FastifyServerOptions[Server, Logger] {
    
    var http2: `true`
    
    var https: SecureServerOptions
  }
  object FastifyHttp2SecureOptions {
    
    @scala.inline
    def apply[Server /* <: Http2SecureServer */, Logger /* <: FastifyLoggerInstance */](https: SecureServerOptions): FastifyHttp2SecureOptions[Server, Logger] = {
      val __obj = js.Dynamic.literal(http2 = true, https = https.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyHttp2SecureOptions[Server, Logger]]
    }
    
    @scala.inline
    implicit class FastifyHttp2SecureOptionsMutableBuilder[Self <: FastifyHttp2SecureOptions[?, ?], Server /* <: Http2SecureServer */, Logger /* <: FastifyLoggerInstance */] (val x: Self & (FastifyHttp2SecureOptions[Server, Logger])) extends AnyVal {
      
      @scala.inline
      def setHttp2(value: `true`): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttps(value: SecureServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastifyHttpsOptions[Server /* <: Server */, Logger /* <: FastifyLoggerInstance */]
    extends StObject
       with FastifyServerOptions[Server, Logger] {
    
    var https: ServerOptions
  }
  object FastifyHttpsOptions {
    
    @scala.inline
    def apply[Server /* <: typings.node.httpsMod.Server */, Logger /* <: FastifyLoggerInstance */](https: ServerOptions): FastifyHttpsOptions[Server, Logger] = {
      val __obj = js.Dynamic.literal(https = https.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyHttpsOptions[Server, Logger]]
    }
    
    @scala.inline
    implicit class FastifyHttpsOptionsMutableBuilder[Self <: FastifyHttpsOptions[?, ?], Server /* <: Server */, Logger /* <: FastifyLoggerInstance */] (val x: Self & (FastifyHttpsOptions[Server, Logger])) extends AnyVal {
      
      @scala.inline
      def setHttps(value: ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastifyServerOptions[RawServer /* <: RawServerBase */, Logger /* <: FastifyLoggerInstance */] extends StObject {
    
    var ajv: js.UndefOr[CustomOptions] = js.undefined
    
    var bodyLimit: js.UndefOr[Double] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var disableRequestLogging: js.UndefOr[Boolean] = js.undefined
    
    var frameworkErrors: js.UndefOr[
        js.Function3[
          /* error */ FastifyError, 
          /* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequestDefaultExpression[RawServer]], 
          /* res */ FastifyReply[
            RawServer, 
            RawRequestDefaultExpression[RawServer], 
            RawReplyDefaultExpression[RawServer], 
            RouteGenericInterface, 
            ContextConfigDefault
          ], 
          Unit
        ]
      ] = js.undefined
    
    var genReqId: js.UndefOr[
        js.Function1[
          /* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequestDefaultExpression[RawServer]], 
          String
        ]
      ] = js.undefined
    
    var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveTimeout: js.UndefOr[Double] = js.undefined
    
    var logger: js.UndefOr[
        Boolean | (FastifyLoggerOptions[
          RawServer, 
          RawRequestDefaultExpression[RawServer], 
          RawReplyDefaultExpression[RawServer]
        ]) | Logger
      ] = js.undefined
    
    var maxParamLength: js.UndefOr[Double] = js.undefined
    
    var onConstructorPoisoning: js.UndefOr[error | remove | ignore] = js.undefined
    
    var onProtoPoisoning: js.UndefOr[error | remove | ignore] = js.undefined
    
    var pluginTimeout: js.UndefOr[Double] = js.undefined
    
    var querystringParser: js.UndefOr[js.Function1[/* str */ String, StringDictionary[String | js.Array[String]]]] = js.undefined
    
    var requestIdHeader: js.UndefOr[String] = js.undefined
    
    var requestIdLogLabel: js.UndefOr[String] = js.undefined
    
    var return503OnClosing: js.UndefOr[Boolean] = js.undefined
    
    var rewriteUrl: js.UndefOr[js.Function1[/* req */ RawRequestDefaultExpression[RawServer], String]] = js.undefined
    
    var schemaErrorFormatter: js.UndefOr[
        js.Function2[/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String, Error]
      ] = js.undefined
    
    var serverFactory: js.UndefOr[FastifyServerFactory[RawServer]] = js.undefined
    
    var trustProxy: js.UndefOr[Boolean | String | js.Array[String] | Double | TrustProxyFunction] = js.undefined
    
    var versioning: js.UndefOr[DeriveVersion] = js.undefined
  }
  object FastifyServerOptions {
    
    @scala.inline
    def apply[RawServer /* <: RawServerBase */, Logger /* <: FastifyLoggerInstance */](): FastifyServerOptions[RawServer, Logger] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyServerOptions[RawServer, Logger]]
    }
    
    @scala.inline
    implicit class FastifyServerOptionsMutableBuilder[Self <: FastifyServerOptions[?, ?], RawServer /* <: RawServerBase */, Logger /* <: FastifyLoggerInstance */] (val x: Self & (FastifyServerOptions[RawServer, Logger])) extends AnyVal {
      
      @scala.inline
      def setAjv(value: CustomOptions): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjvUndefined: Self = StObject.set(x, "ajv", js.undefined)
      
      @scala.inline
      def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setDisableRequestLogging(value: Boolean): Self = StObject.set(x, "disableRequestLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRequestLoggingUndefined: Self = StObject.set(x, "disableRequestLogging", js.undefined)
      
      @scala.inline
      def setFrameworkErrors(
        value: (/* error */ FastifyError, /* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequestDefaultExpression[RawServer]], /* res */ FastifyReply[
              RawServer, 
              RawRequestDefaultExpression[RawServer], 
              RawReplyDefaultExpression[RawServer], 
              RouteGenericInterface, 
              ContextConfigDefault
            ]) => Unit
      ): Self = StObject.set(x, "frameworkErrors", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFrameworkErrorsUndefined: Self = StObject.set(x, "frameworkErrors", js.undefined)
      
      @scala.inline
      def setGenReqId(
        value: /* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequestDefaultExpression[RawServer]] => String
      ): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      @scala.inline
      def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
      
      @scala.inline
      def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
      
      @scala.inline
      def setLogger(
        value: Boolean | (FastifyLoggerOptions[
              RawServer, 
              RawRequestDefaultExpression[RawServer], 
              RawReplyDefaultExpression[RawServer]
            ]) | Logger
      ): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMaxParamLength(value: Double): Self = StObject.set(x, "maxParamLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxParamLengthUndefined: Self = StObject.set(x, "maxParamLength", js.undefined)
      
      @scala.inline
      def setOnConstructorPoisoning(value: error | remove | ignore): Self = StObject.set(x, "onConstructorPoisoning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnConstructorPoisoningUndefined: Self = StObject.set(x, "onConstructorPoisoning", js.undefined)
      
      @scala.inline
      def setOnProtoPoisoning(value: error | remove | ignore): Self = StObject.set(x, "onProtoPoisoning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnProtoPoisoningUndefined: Self = StObject.set(x, "onProtoPoisoning", js.undefined)
      
      @scala.inline
      def setPluginTimeout(value: Double): Self = StObject.set(x, "pluginTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginTimeoutUndefined: Self = StObject.set(x, "pluginTimeout", js.undefined)
      
      @scala.inline
      def setQuerystringParser(value: /* str */ String => StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "querystringParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuerystringParserUndefined: Self = StObject.set(x, "querystringParser", js.undefined)
      
      @scala.inline
      def setRequestIdHeader(value: String): Self = StObject.set(x, "requestIdHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdHeaderUndefined: Self = StObject.set(x, "requestIdHeader", js.undefined)
      
      @scala.inline
      def setRequestIdLogLabel(value: String): Self = StObject.set(x, "requestIdLogLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdLogLabelUndefined: Self = StObject.set(x, "requestIdLogLabel", js.undefined)
      
      @scala.inline
      def setReturn503OnClosing(value: Boolean): Self = StObject.set(x, "return503OnClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn503OnClosingUndefined: Self = StObject.set(x, "return503OnClosing", js.undefined)
      
      @scala.inline
      def setRewriteUrl(value: /* req */ RawRequestDefaultExpression[RawServer] => String): Self = StObject.set(x, "rewriteUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRewriteUrlUndefined: Self = StObject.set(x, "rewriteUrl", js.undefined)
      
      @scala.inline
      def setSchemaErrorFormatter(value: (/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String) => Error): Self = StObject.set(x, "schemaErrorFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSchemaErrorFormatterUndefined: Self = StObject.set(x, "schemaErrorFormatter", js.undefined)
      
      @scala.inline
      def setServerFactory(
        value: (/* handler */ FastifyServerFactoryHandler[
              RawServer, 
              RawRequestDefaultExpression[RawServer], 
              RawReplyDefaultExpression[RawServer]
            ], /* opts */ Record[String, js.Any]) => RawServer
      ): Self = StObject.set(x, "serverFactory", js.Any.fromFunction2(value))
      
      @scala.inline
      def setServerFactoryUndefined: Self = StObject.set(x, "serverFactory", js.undefined)
      
      @scala.inline
      def setTrustProxy(value: Boolean | String | js.Array[String] | Double | TrustProxyFunction): Self = StObject.set(x, "trustProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustProxyFunction2(value: (/* address */ String, /* hop */ Double) => Boolean): Self = StObject.set(x, "trustProxy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTrustProxyUndefined: Self = StObject.set(x, "trustProxy", js.undefined)
      
      @scala.inline
      def setTrustProxyVarargs(value: String*): Self = StObject.set(x, "trustProxy", js.Array(value :_*))
      
      @scala.inline
      def setVersioning(value: DeriveVersion): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    }
  }
  
  type TrustProxyFunction = js.Function2[/* address */ String, /* hop */ Double, Boolean]
}
