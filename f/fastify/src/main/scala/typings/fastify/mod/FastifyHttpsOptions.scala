package typings.fastify.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fastify.anon.CustomOptions
import typings.fastify.anon.DeriveVersion
import typings.fastify.fastifyStrings.error
import typings.fastify.fastifyStrings.ignore
import typings.fastify.fastifyStrings.remove
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
import typings.fastifyError.mod.FastifyError
import typings.node.httpsMod.Server
import typings.node.httpsMod.ServerOptions
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined fastify.fastify.FastifyServerOptions<Server, Logger> & {  https :node.https.ServerOptions} */
@js.native
trait FastifyHttpsOptions[Server /* <: Server */, Logger /* <: FastifyLoggerInstance */] extends js.Object {
  
  var ajv: js.UndefOr[CustomOptions] = js.native
  
  var bodyLimit: js.UndefOr[Double] = js.native
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  var disableRequestLogging: js.UndefOr[Boolean] = js.native
  
  var frameworkErrors: js.UndefOr[
    js.Function3[
      /* error */ FastifyError, 
      /* req */ FastifyRequest[RequestGenericInterface, Server, RawRequestDefaultExpression[Server]], 
      /* res */ FastifyReply[
        Server, 
        RawRequestDefaultExpression[Server], 
        RawReplyDefaultExpression[Server], 
        RouteGenericInterface, 
        ContextConfigDefault
      ], 
      Unit
    ]
  ] = js.native
  
  var genReqId: js.UndefOr[
    js.Function1[
      /* req */ FastifyRequest[RequestGenericInterface, Server, RawRequestDefaultExpression[Server]], 
      String
    ]
  ] = js.native
  
  var https: ServerOptions = js.native
  
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
  
  var keepAliveTimeout: js.UndefOr[Double] = js.native
  
  var logger: js.UndefOr[
    Boolean | (FastifyLoggerOptions[Server, RawRequestDefaultExpression[Server], RawReplyDefaultExpression[Server]]) | Logger
  ] = js.native
  
  var maxParamLength: js.UndefOr[Double] = js.native
  
  var onConstructorPoisoning: js.UndefOr[error | remove | ignore] = js.native
  
  var onProtoPoisoning: js.UndefOr[error | remove | ignore] = js.native
  
  var pluginTimeout: js.UndefOr[Double] = js.native
  
  var querystringParser: js.UndefOr[js.Function1[/* str */ String, StringDictionary[String | js.Array[String]]]] = js.native
  
  var requestIdHeader: js.UndefOr[String] = js.native
  
  var requestIdLogLabel: js.UndefOr[String] = js.native
  
  var return503OnClosing: js.UndefOr[Boolean] = js.native
  
  var rewriteUrl: js.UndefOr[js.Function1[/* req */ RawRequestDefaultExpression[Server], String]] = js.native
  
  var schemaErrorFormatter: js.UndefOr[
    js.Function2[/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String, Error]
  ] = js.native
  
  var serverFactory: js.UndefOr[FastifyServerFactory[Server]] = js.native
  
  var trustProxy: js.UndefOr[Boolean | String | js.Array[String] | Double | TrustProxyFunction] = js.native
  
  var versioning: js.UndefOr[DeriveVersion] = js.native
}
object FastifyHttpsOptions {
  
  @scala.inline
  def apply[Server /* <: typings.node.httpsMod.Server */, Logger /* <: FastifyLoggerInstance */](https: ServerOptions): FastifyHttpsOptions[Server, Logger] = {
    val __obj = js.Dynamic.literal(https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyHttpsOptions[Server, Logger]]
  }
  
  @scala.inline
  implicit class FastifyHttpsOptionsOps[Self <: FastifyHttpsOptions[_, _], Server /* <: Server */, Logger /* <: FastifyLoggerInstance */] (val x: Self with (FastifyHttpsOptions[Server, Logger])) extends AnyVal {
    
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
    def setHttps(value: ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjv(value: CustomOptions): Self = this.set("ajv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjv: Self = this.set("ajv", js.undefined)
    
    @scala.inline
    def setBodyLimit(value: Double): Self = this.set("bodyLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLimit: Self = this.set("bodyLimit", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setDisableRequestLogging(value: Boolean): Self = this.set("disableRequestLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRequestLogging: Self = this.set("disableRequestLogging", js.undefined)
    
    @scala.inline
    def setFrameworkErrors(
      value: (/* error */ FastifyError, /* req */ FastifyRequest[RequestGenericInterface, Server, RawRequestDefaultExpression[Server]], /* res */ FastifyReply[
          Server, 
          RawRequestDefaultExpression[Server], 
          RawReplyDefaultExpression[Server], 
          RouteGenericInterface, 
          ContextConfigDefault
        ]) => Unit
    ): Self = this.set("frameworkErrors", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFrameworkErrors: Self = this.set("frameworkErrors", js.undefined)
    
    @scala.inline
    def setGenReqId(
      value: /* req */ FastifyRequest[RequestGenericInterface, Server, RawRequestDefaultExpression[Server]] => String
    ): Self = this.set("genReqId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenReqId: Self = this.set("genReqId", js.undefined)
    
    @scala.inline
    def setIgnoreTrailingSlash(value: Boolean): Self = this.set("ignoreTrailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreTrailingSlash: Self = this.set("ignoreTrailingSlash", js.undefined)
    
    @scala.inline
    def setKeepAliveTimeout(value: Double): Self = this.set("keepAliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveTimeout: Self = this.set("keepAliveTimeout", js.undefined)
    
    @scala.inline
    def setLogger(
      value: Boolean | (FastifyLoggerOptions[Server, RawRequestDefaultExpression[Server], RawReplyDefaultExpression[Server]]) | Logger
    ): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxParamLength(value: Double): Self = this.set("maxParamLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxParamLength: Self = this.set("maxParamLength", js.undefined)
    
    @scala.inline
    def setOnConstructorPoisoning(value: error | remove | ignore): Self = this.set("onConstructorPoisoning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnConstructorPoisoning: Self = this.set("onConstructorPoisoning", js.undefined)
    
    @scala.inline
    def setOnProtoPoisoning(value: error | remove | ignore): Self = this.set("onProtoPoisoning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProtoPoisoning: Self = this.set("onProtoPoisoning", js.undefined)
    
    @scala.inline
    def setPluginTimeout(value: Double): Self = this.set("pluginTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginTimeout: Self = this.set("pluginTimeout", js.undefined)
    
    @scala.inline
    def setQuerystringParser(value: /* str */ String => StringDictionary[String | js.Array[String]]): Self = this.set("querystringParser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQuerystringParser: Self = this.set("querystringParser", js.undefined)
    
    @scala.inline
    def setRequestIdHeader(value: String): Self = this.set("requestIdHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestIdHeader: Self = this.set("requestIdHeader", js.undefined)
    
    @scala.inline
    def setRequestIdLogLabel(value: String): Self = this.set("requestIdLogLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestIdLogLabel: Self = this.set("requestIdLogLabel", js.undefined)
    
    @scala.inline
    def setReturn503OnClosing(value: Boolean): Self = this.set("return503OnClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn503OnClosing: Self = this.set("return503OnClosing", js.undefined)
    
    @scala.inline
    def setRewriteUrl(value: /* req */ RawRequestDefaultExpression[Server] => String): Self = this.set("rewriteUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRewriteUrl: Self = this.set("rewriteUrl", js.undefined)
    
    @scala.inline
    def setSchemaErrorFormatter(value: (/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String) => Error): Self = this.set("schemaErrorFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSchemaErrorFormatter: Self = this.set("schemaErrorFormatter", js.undefined)
    
    @scala.inline
    def setServerFactory(
      value: (/* handler */ FastifyServerFactoryHandler[Server, RawRequestDefaultExpression[Server], RawReplyDefaultExpression[Server]], /* opts */ Record[String, js.Any]) => Server
    ): Self = this.set("serverFactory", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteServerFactory: Self = this.set("serverFactory", js.undefined)
    
    @scala.inline
    def setTrustProxyFunction2(value: (/* address */ String, /* hop */ Double) => Boolean): Self = this.set("trustProxy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrustProxyVarargs(value: String*): Self = this.set("trustProxy", js.Array(value :_*))
    
    @scala.inline
    def setTrustProxy(value: Boolean | String | js.Array[String] | Double | TrustProxyFunction): Self = this.set("trustProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustProxy: Self = this.set("trustProxy", js.undefined)
    
    @scala.inline
    def setVersioning(value: DeriveVersion): Self = this.set("versioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
  }
}
