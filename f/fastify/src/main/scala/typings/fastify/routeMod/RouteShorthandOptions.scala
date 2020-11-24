package typings.fastify.routeMod

import typings.fastify.fastifyStrings.`no-slash`
import typings.fastify.fastifyStrings.both
import typings.fastify.fastifyStrings.slash
import typings.fastify.hooksMod.DoneFuncWithErrOrRes
import typings.fastify.hooksMod.HookHandlerDoneFunction
import typings.fastify.hooksMod.RequestPayload
import typings.fastify.hooksMod.onErrorHookHandler
import typings.fastify.hooksMod.onRequestHookHandler
import typings.fastify.hooksMod.onResponseHookHandler
import typings.fastify.hooksMod.onSendHookHandler
import typings.fastify.hooksMod.onTimeoutHookHandler
import typings.fastify.hooksMod.preHandlerHookHandler
import typings.fastify.hooksMod.preParsingHookHandler
import typings.fastify.hooksMod.preSerializationHookHandler
import typings.fastify.hooksMod.preValidationHookHandler
import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyLoggerInstance
import typings.fastify.loggerMod.LogLevel
import typings.fastify.replyMod.FastifyReply
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.schemaMod.FastifyRouteSchemaDef
import typings.fastify.schemaMod.FastifySchema
import typings.fastify.schemaMod.FastifySchemaCompiler
import typings.fastify.schemaMod.FastifySchemaValidationError
import typings.fastify.schemaMod.FastifyValidationResult
import typings.fastify.utilsMod.ContextConfigDefault
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastify.utilsMod.RawServerDefault
import typings.fastifyError.mod.FastifyError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteShorthandOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] extends js.Object {
  
  var attachValidation: js.UndefOr[Boolean] = js.native
  
  var bodyLimit: js.UndefOr[Double] = js.native
  
  var config: js.UndefOr[ContextConfig] = js.native
  
  var errorHandler: js.UndefOr[
    js.ThisFunction3[
      /* this */ FastifyInstance[
        RawServerDefault, 
        RawRequestDefaultExpression[RawServerDefault], 
        RawReplyDefaultExpression[RawServerDefault], 
        FastifyLoggerInstance
      ], 
      /* error */ FastifyError, 
      /* request */ FastifyRequest[
        RouteGenericInterface, 
        RawServerDefault, 
        RawRequestDefaultExpression[RawServerDefault]
      ], 
      /* reply */ FastifyReply[
        RawServerDefault, 
        RawRequestDefaultExpression[RawServerDefault], 
        RawReplyDefaultExpression[RawServerDefault], 
        RouteGenericInterface, 
        ContextConfigDefault
      ], 
      Unit
    ]
  ] = js.native
  
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  var onError: js.UndefOr[
    (onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]) | (js.Array[
      onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]
    ])
  ] = js.native
  
  // hooks
  var onRequest: js.UndefOr[
    (onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
      onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ])
  ] = js.native
  
  var onResponse: js.UndefOr[
    (onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
      onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ])
  ] = js.native
  
  var onSend: js.UndefOr[
    (onSendHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
      onSendHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ])
  ] = js.native
  
  var onTimeout: js.UndefOr[
    (onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
      onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ])
  ] = js.native
  
  var preHandler: js.UndefOr[
    (preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
      preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ])
  ] = js.native
  
  var preParsing: js.UndefOr[
    (preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
      preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ])
  ] = js.native
  
  var preSerialization: js.UndefOr[
    (preSerializationHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
      preSerializationHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ])
  ] = js.native
  
  var preValidation: js.UndefOr[
    (preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
      preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ])
  ] = js.native
  
  var prefixTrailingSlash: js.UndefOr[slash | `no-slash` | both] = js.native
  
  var schema: js.UndefOr[FastifySchema] = js.native
  
  // TODO: Change to actual type.
  var schemaErrorFormatter: js.UndefOr[
    js.Function2[/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String, Error]
  ] = js.native
  
  var serializerCompiler: js.UndefOr[FastifySchemaCompiler] = js.native
  
  var validatorCompiler: js.UndefOr[FastifySchemaCompiler] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object RouteShorthandOptions {
  
  @scala.inline
  def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig](): RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]]
  }
  
  @scala.inline
  implicit class RouteShorthandOptionsOps[Self <: RouteShorthandOptions[_, _, _, _, _], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] (val x: Self with (RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])) extends AnyVal {
    
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
    def setAttachValidation(value: Boolean): Self = this.set("attachValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachValidation: Self = this.set("attachValidation", js.undefined)
    
    @scala.inline
    def setBodyLimit(value: Double): Self = this.set("bodyLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLimit: Self = this.set("bodyLimit", js.undefined)
    
    @scala.inline
    def setConfig(value: ContextConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setErrorHandler(
      value: js.ThisFunction3[
          /* this */ FastifyInstance[
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault], 
            RawReplyDefaultExpression[RawServerDefault], 
            FastifyLoggerInstance
          ], 
          /* error */ FastifyError, 
          /* request */ FastifyRequest[
            RouteGenericInterface, 
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault]
          ], 
          /* reply */ FastifyReply[
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault], 
            RawReplyDefaultExpression[RawServerDefault], 
            RouteGenericInterface, 
            ContextConfigDefault
          ], 
          Unit
        ]
    ): Self = this.set("errorHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setOnErrorVarargs(
      value: (onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError])*
    ): Self = this.set("onError", js.Array(value :_*))
    
    @scala.inline
    def setOnErrorFunction4(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], FastifyError, /* done */ js.Function0[Unit]) => Unit
    ): Self = this.set("onError", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnError(
      value: (onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]) | (js.Array[
          onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]
        ])
    ): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnRequestVarargs(value: (onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = this.set("onRequest", js.Array(value :_*))
    
    @scala.inline
    def setOnRequestFunction3(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
    ): Self = this.set("onRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRequest(
      value: (onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
    ): Self = this.set("onRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRequest: Self = this.set("onRequest", js.undefined)
    
    @scala.inline
    def setOnResponseVarargs(value: (onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = this.set("onResponse", js.Array(value :_*))
    
    @scala.inline
    def setOnResponseFunction3(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
    ): Self = this.set("onResponse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnResponse(
      value: (onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
    ): Self = this.set("onResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponse: Self = this.set("onResponse", js.undefined)
    
    @scala.inline
    def setOnSendVarargs(value: (onSendHookHandler[js.Any, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = this.set("onSend", js.Array(value :_*))
    
    @scala.inline
    def setOnSendFunction4(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], _, /* done */ DoneFuncWithErrOrRes) => Unit
    ): Self = this.set("onSend", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnSend(
      value: (onSendHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          onSendHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
    ): Self = this.set("onSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSend: Self = this.set("onSend", js.undefined)
    
    @scala.inline
    def setOnTimeoutVarargs(value: (onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = this.set("onTimeout", js.Array(value :_*))
    
    @scala.inline
    def setOnTimeoutFunction3(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
    ): Self = this.set("onTimeout", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnTimeout(
      value: (onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
    ): Self = this.set("onTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeout: Self = this.set("onTimeout", js.undefined)
    
    @scala.inline
    def setPreHandlerVarargs(value: (preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = this.set("preHandler", js.Array(value :_*))
    
    @scala.inline
    def setPreHandlerFunction3(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
    ): Self = this.set("preHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPreHandler(
      value: (preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
    ): Self = this.set("preHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreHandler: Self = this.set("preHandler", js.undefined)
    
    @scala.inline
    def setPreParsingVarargs(value: (preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = this.set("preParsing", js.Array(value :_*))
    
    @scala.inline
    def setPreParsingFunction4(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* payload */ RequestPayload, /* done */ js.Function2[
          /* err */ js.UndefOr[FastifyError | Null], 
          /* res */ js.UndefOr[RequestPayload], 
          Unit
        ]) => Unit
    ): Self = this.set("preParsing", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPreParsing(
      value: (preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
    ): Self = this.set("preParsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreParsing: Self = this.set("preParsing", js.undefined)
    
    @scala.inline
    def setPreSerializationVarargs(
      value: (preSerializationHookHandler[js.Any, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*
    ): Self = this.set("preSerialization", js.Array(value :_*))
    
    @scala.inline
    def setPreSerializationFunction4(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], _, /* done */ DoneFuncWithErrOrRes) => Unit
    ): Self = this.set("preSerialization", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPreSerialization(
      value: (preSerializationHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          preSerializationHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
    ): Self = this.set("preSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreSerialization: Self = this.set("preSerialization", js.undefined)
    
    @scala.inline
    def setPreValidationVarargs(value: (preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = this.set("preValidation", js.Array(value :_*))
    
    @scala.inline
    def setPreValidationFunction3(
      value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
    ): Self = this.set("preValidation", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPreValidation(
      value: (preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
    ): Self = this.set("preValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreValidation: Self = this.set("preValidation", js.undefined)
    
    @scala.inline
    def setPrefixTrailingSlash(value: slash | `no-slash` | both): Self = this.set("prefixTrailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixTrailingSlash: Self = this.set("prefixTrailingSlash", js.undefined)
    
    @scala.inline
    def setSchema(value: FastifySchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSchemaErrorFormatter(value: (/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String) => Error): Self = this.set("schemaErrorFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSchemaErrorFormatter: Self = this.set("schemaErrorFormatter", js.undefined)
    
    @scala.inline
    def setSerializerCompiler(value: /* routeSchema */ FastifyRouteSchemaDef => FastifyValidationResult): Self = this.set("serializerCompiler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerializerCompiler: Self = this.set("serializerCompiler", js.undefined)
    
    @scala.inline
    def setValidatorCompiler(value: /* routeSchema */ FastifyRouteSchemaDef => FastifyValidationResult): Self = this.set("validatorCompiler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidatorCompiler: Self = this.set("validatorCompiler", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
