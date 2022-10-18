package typings.fastify

import typings.fastify.anon.BodyLimit
import typings.fastify.anon.Default
import typings.fastify.anon.DefaultFastifyPluginAsync
import typings.fastify.anon.ParseAs
import typings.fastify.anon.PreHandler
import typings.fastify.anon.ReadonlyconnectionTimeout
import typings.fastify.fastifyStrings.constraints
import typings.fastify.fastifyStrings.method
import typings.fastify.fastifyStrings.onClose
import typings.fastify.fastifyStrings.onError
import typings.fastify.fastifyStrings.onReady
import typings.fastify.fastifyStrings.onRegister
import typings.fastify.fastifyStrings.onRequest
import typings.fastify.fastifyStrings.onResponse
import typings.fastify.fastifyStrings.onRoute
import typings.fastify.fastifyStrings.onSend
import typings.fastify.fastifyStrings.onTimeout
import typings.fastify.fastifyStrings.preHandler
import typings.fastify.fastifyStrings.preParsing
import typings.fastify.fastifyStrings.preSerialization
import typings.fastify.fastifyStrings.preValidation
import typings.fastify.fastifyStrings.url
import typings.fastify.typesContentTypeParserMod.AddContentTypeParser
import typings.fastify.typesContentTypeParserMod.ConstructorAction
import typings.fastify.typesContentTypeParserMod.FastifyBodyParser
import typings.fastify.typesContentTypeParserMod.FastifyContentTypeParser
import typings.fastify.typesContentTypeParserMod.ProtoAction
import typings.fastify.typesContentTypeParserMod.getDefaultJsonParser
import typings.fastify.typesContentTypeParserMod.hasContentTypeParser
import typings.fastify.typesContentTypeParserMod.removeAllContentTypeParsers
import typings.fastify.typesContentTypeParserMod.removeContentTypeParser
import typings.fastify.typesHooksMod.onCloseAsyncHookHandler
import typings.fastify.typesHooksMod.onCloseHookHandler
import typings.fastify.typesHooksMod.onErrorAsyncHookHandler
import typings.fastify.typesHooksMod.onErrorHookHandler
import typings.fastify.typesHooksMod.onReadyAsyncHookHandler
import typings.fastify.typesHooksMod.onReadyHookHandler
import typings.fastify.typesHooksMod.onRegisterHookHandler
import typings.fastify.typesHooksMod.onRequestAsyncHookHandler
import typings.fastify.typesHooksMod.onRequestHookHandler
import typings.fastify.typesHooksMod.onResponseAsyncHookHandler
import typings.fastify.typesHooksMod.onResponseHookHandler
import typings.fastify.typesHooksMod.onRouteHookHandler
import typings.fastify.typesHooksMod.onSendAsyncHookHandler
import typings.fastify.typesHooksMod.onSendHookHandler
import typings.fastify.typesHooksMod.onTimeoutAsyncHookHandler
import typings.fastify.typesHooksMod.onTimeoutHookHandler
import typings.fastify.typesHooksMod.preHandlerAsyncHookHandler
import typings.fastify.typesHooksMod.preHandlerHookHandler
import typings.fastify.typesHooksMod.preParsingAsyncHookHandler
import typings.fastify.typesHooksMod.preParsingHookHandler
import typings.fastify.typesHooksMod.preSerializationAsyncHookHandler
import typings.fastify.typesHooksMod.preSerializationHookHandler
import typings.fastify.typesHooksMod.preValidationAsyncHookHandler
import typings.fastify.typesHooksMod.preValidationHookHandler
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesPluginMod.FastifyPluginAsync
import typings.fastify.typesPluginMod.FastifyPluginCallback
import typings.fastify.typesPluginMod.FastifyPluginOptions
import typings.fastify.typesRegisterMod.FastifyRegister
import typings.fastify.typesRegisterMod.FastifyRegisterOptions
import typings.fastify.typesReplyMod.FastifyReply
import typings.fastify.typesRequestMod.FastifyRequest
import typings.fastify.typesRouteMod.DefaultRoute
import typings.fastify.typesRouteMod.RouteGenericInterface
import typings.fastify.typesRouteMod.RouteHandlerMethod
import typings.fastify.typesRouteMod.RouteOptions
import typings.fastify.typesRouteMod.RouteShorthandMethod
import typings.fastify.typesRouteMod.RouteShorthandOptions
import typings.fastify.typesRouteMod.RouteShorthandOptionsWithHandler
import typings.fastify.typesSchemaMod.FastifySchema
import typings.fastify.typesSchemaMod.FastifySchemaCompiler
import typings.fastify.typesSchemaMod.FastifySchemaControllerOptions
import typings.fastify.typesSchemaMod.FastifySchemaValidationError
import typings.fastify.typesSchemaMod.FastifySerializerCompiler
import typings.fastify.typesTypeProviderMod.FastifyTypeProvider
import typings.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typings.fastify.typesTypeProviderMod.ResolveFastifyReplyType
import typings.fastify.typesTypeProviderMod.ResolveFastifyRequestType
import typings.fastify.typesUtilsMod.ContextConfigDefault
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerBase
import typings.fastify.typesUtilsMod.RawServerDefault
import typings.fastifyError.mod.FastifyError
import typings.findMyWay.mod.ConstraintStrategy
import typings.lightMyRequest.mod.CallbackFunc
import typings.lightMyRequest.mod.Chain
import typings.lightMyRequest.mod.InjectOptions
import typings.lightMyRequest.mod.Response
import typings.node.bufferMod.global.Buffer
import typings.std.AbortSignal
import typings.std.Pick
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInstanceMod {
  
  @js.native
  trait FastifyInstance[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
    
    def addConstraintStrategy(strategy: ConstraintStrategy[FindMyWayVersion[RawServer], Any]): Unit = js.native
    
    /**
      * Add a content type parser
      */
    def addContentTypeParser(
      contentType: String,
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    /**
      * Add a content type parser
      */
    def addContentTypeParser(
      contentType: String,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    def addContentTypeParser(
      contentType: js.Array[String],
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    def addContentTypeParser(
      contentType: js.Array[String],
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    def addContentTypeParser(
      contentType: js.RegExp,
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    def addContentTypeParser(
      contentType: js.RegExp,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    /**
      * Add a content type parser
      */
    def addContentTypeParser[parseAs /* <: String | Buffer */](
      contentType: String,
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    def addContentTypeParser[parseAs /* <: String | Buffer */](
      contentType: js.Array[String],
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    def addContentTypeParser[parseAs /* <: String | Buffer */](
      contentType: js.RegExp,
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider]
    ): Unit = js.native
    /**
      * Add a content type parser
      */
    @JSName("addContentTypeParser")
    var addContentTypeParser_Original: AddContentTypeParser[RawServer, RawRequest, RouteGenericInterface, FastifySchema, TypeProvider] = js.native
    
    @JSName("addHook")
    def addHook_onClose(
      name: onClose,
      hook: onCloseAsyncHookHandler[RawServer, RawRequest, RawReply, Logger, FastifyTypeProviderDefault]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, FastifyTypeProviderDefault] = js.native
    /**
      * Triggered when fastify.close() is invoked to stop the server. It is useful when plugins need a "shutdown" event, for example to close an open connection to a database.
      */
    @JSName("addHook")
    def addHook_onClose(name: onClose, hook: onCloseHookHandler[RawServer, RawRequest, RawReply, Logger, TypeProvider]): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_onError[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onError,
      hook: onErrorAsyncHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          FastifyError, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * This hook is useful if you need to do some custom error logging or add some specific header in case of error.
      * It is not intended for changing the error, and calling reply.send will throw an exception.
      * This hook will be executed only after the customErrorHandler has been executed, and only if the customErrorHandler sends an error back to the user (Note that the default customErrorHandler always sends the error back to the user).
      * Notice: unlike the other hooks, pass an error to the done function is not supported.
      */
    @JSName("addHook")
    def addHook_onError[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onError,
      hook: onErrorHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          FastifyError, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_onReady(
      name: onReady,
      hook: onReadyAsyncHookHandler[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyBaseLogger, 
          FastifyTypeProviderDefault
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * Triggered when fastify.listen() or fastify.ready() is invoked to start the server. It is useful when plugins need a "ready" event, for example to load data before the server start listening for requests.
      */
    @JSName("addHook")
    def addHook_onReady(
      name: onReady,
      hook: onReadyHookHandler[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyBaseLogger, 
          FastifyTypeProviderDefault
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * Triggered when a new plugin is registered and a new encapsulation context is created. The hook will be executed before the registered code.
      * This hook can be useful if you are developing a plugin that needs to know when a plugin context is formed, and you want to operate in that specific context.
      * Note: This hook will not be called if a plugin is wrapped inside fastify-plugin.
      */
    @JSName("addHook")
    def addHook_onRegister(
      name: onRegister,
      hook: onRegisterHookHandler[RawServer, RawRequest, RawReply, Logger, TypeProvider, FastifyPluginOptions]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_onRequest[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onRequest,
      hook: onRequestAsyncHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    // addHook: overloads
    // Lifecycle addHooks
    /**
      * `onRequest` is the first hook to be executed in the request lifecycle. There was no previous hook, the next hook will be `preParsing`.
      *  Notice: in the `onRequest` hook, request.body will always be null, because the body parsing happens before the `preHandler` hook.
      */
    @JSName("addHook")
    def addHook_onRequest[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onRequest,
      hook: onRequestHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_onResponse[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onResponse,
      hook: onResponseAsyncHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * `onResponse` is the seventh and last hook in the request hook lifecycle. The previous hook was `onSend`, there is no next hook.
      * The onResponse hook is executed when a response has been sent, so you will not be able to send more data to the client. It can however be useful for sending data to external services, for example to gather statistics.
      */
    @JSName("addHook")
    def addHook_onResponse[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onResponse,
      hook: onResponseHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    // Application addHooks
    /**
      * Triggered when a new route is registered. Listeners are passed a routeOptions object as the sole parameter. The interface is synchronous, and, as such, the listener does not get passed a callback
      */
    @JSName("addHook")
    def addHook_onRoute[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onRoute,
      hook: onRouteHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_onSend[OnSendPayload, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onSend,
      hook: onSendAsyncHookHandler[
          OnSendPayload, 
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * You can change the payload with the `onSend` hook. It is the sixth hook to be executed in the request lifecycle. The previous hook was `preSerialization`, the next hook will be `onResponse`.
      * Note: If you change the payload, you may only change it to a string, a Buffer, a stream, or null.
      */
    @JSName("addHook")
    def addHook_onSend[OnSendPayload, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onSend,
      hook: onSendHookHandler[
          OnSendPayload, 
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_onTimeout[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onTimeout,
      hook: onTimeoutAsyncHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * `onTimeout` is useful if you need to monitor the request timed out in your service. (if the `connectionTimeout` property is set on the fastify instance)
      * The onTimeout hook is executed when a request is timed out and the http socket has been hanged up. Therefore you will not be able to send data to the client.
      */
    @JSName("addHook")
    def addHook_onTimeout[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: onTimeout,
      hook: onTimeoutHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_preHandler[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: preHandler,
      hook: preHandlerAsyncHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * `preHandler` is the fourth hook to be executed in the request lifecycle. The previous hook was `preValidation`, the next hook will be `preSerialization`.
      */
    @JSName("addHook")
    def addHook_preHandler[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: preHandler,
      hook: preHandlerHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_preParsing[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: preParsing,
      hook: preParsingAsyncHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * `preParsing` is the second hook to be executed in the request lifecycle. The previous hook was `onRequest`, the next hook will be `preValidation`.
      * Notice: in the `preParsing` hook, request.body will always be null, because the body parsing happens before the `preHandler` hook.
      */
    @JSName("addHook")
    def addHook_preParsing[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: preParsing,
      hook: preParsingHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_preSerialization[PreSerializationPayload, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: preSerialization,
      hook: preSerializationAsyncHookHandler[
          PreSerializationPayload, 
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * `preSerialization` is the fifth hook to be executed in the request lifecycle. The previous hook was `preHandler`, the next hook will be `onSend`.
      *  Note: the hook is NOT called if the payload is a string, a Buffer, a stream or null.
      */
    @JSName("addHook")
    def addHook_preSerialization[PreSerializationPayload, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: preSerialization,
      hook: preSerializationHookHandler[
          PreSerializationPayload, 
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("addHook")
    def addHook_preValidation[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: preValidation,
      hook: preValidationAsyncHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    /**
      * `preValidation` is the third hook to be executed in the request lifecycle. The previous hook was `preParsing`, the next hook will be `preHandler`.
      */
    @JSName("addHook")
    def addHook_preValidation[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      name: preValidation,
      hook: preValidationHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    def addSchema(schema: Any): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    def after(): (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit] = js.native
    def after(afterListener: js.Function1[/* err */ js.Error, Unit]): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    def all[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def all[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptionsWithHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def all[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("all")
    var all_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply, TypeProvider] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(closeListener: js.Function0[Unit]): Unit = js.native
    
    // should be able to define something useful with the decorator getter/setter pattern using Generics to enforce the users function returns what they expect it to
    def decorate[T](
      property: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/instance.FastifyInstance<RawServer, RawRequest, RawReply, Logger, TypeProvider>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorate[T](
      property: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/instance.FastifyInstance<RawServer, RawRequest, RawReply, Logger, TypeProvider>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any,
      dependencies: js.Array[String]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorate[T](
      property: js.Symbol,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/instance.FastifyInstance<RawServer, RawRequest, RawReply, Logger, TypeProvider>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorate[T](
      property: js.Symbol,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/instance.FastifyInstance<RawServer, RawRequest, RawReply, Logger, TypeProvider>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any,
      dependencies: js.Array[String]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    def decorateReply[T](
      property: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/reply.FastifyReply<fastify.fastify/types/utils.RawServerDefault, fastify.fastify/types/utils.RawRequestDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/utils.RawReplyDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/route.RouteGenericInterface, fastify.fastify/types/utils.ContextConfigDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/type-provider.ResolveFastifyReplyType<fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/route.RouteGenericInterface>>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorateReply[T](
      property: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/reply.FastifyReply<fastify.fastify/types/utils.RawServerDefault, fastify.fastify/types/utils.RawRequestDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/utils.RawReplyDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/route.RouteGenericInterface, fastify.fastify/types/utils.ContextConfigDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/type-provider.ResolveFastifyReplyType<fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/route.RouteGenericInterface>>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any,
      dependencies: js.Array[String]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorateReply[T](
      property: js.Symbol,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/reply.FastifyReply<fastify.fastify/types/utils.RawServerDefault, fastify.fastify/types/utils.RawRequestDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/utils.RawReplyDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/route.RouteGenericInterface, fastify.fastify/types/utils.ContextConfigDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/type-provider.ResolveFastifyReplyType<fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/route.RouteGenericInterface>>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorateReply[T](
      property: js.Symbol,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/reply.FastifyReply<fastify.fastify/types/utils.RawServerDefault, fastify.fastify/types/utils.RawRequestDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/utils.RawReplyDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/route.RouteGenericInterface, fastify.fastify/types/utils.ContextConfigDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/type-provider.ResolveFastifyReplyType<fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/route.RouteGenericInterface>>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any,
      dependencies: js.Array[String]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    def decorateRequest[T](
      property: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/request.FastifyRequest<fastify.fastify/types/route.RouteGenericInterface, fastify.fastify/types/utils.RawServerDefault, fastify.fastify/types/utils.RawRequestDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/utils.ContextConfigDefault, fastify.fastify/types/logger.FastifyBaseLogger, fastify.fastify/types/type-provider.ResolveFastifyRequestType<fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/route.RouteGenericInterface>>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorateRequest[T](
      property: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/request.FastifyRequest<fastify.fastify/types/route.RouteGenericInterface, fastify.fastify/types/utils.RawServerDefault, fastify.fastify/types/utils.RawRequestDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/utils.ContextConfigDefault, fastify.fastify/types/logger.FastifyBaseLogger, fastify.fastify/types/type-provider.ResolveFastifyRequestType<fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/route.RouteGenericInterface>>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any,
      dependencies: js.Array[String]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorateRequest[T](
      property: js.Symbol,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/request.FastifyRequest<fastify.fastify/types/route.RouteGenericInterface, fastify.fastify/types/utils.RawServerDefault, fastify.fastify/types/utils.RawRequestDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/utils.ContextConfigDefault, fastify.fastify/types/logger.FastifyBaseLogger, fastify.fastify/types/type-provider.ResolveFastifyRequestType<fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/route.RouteGenericInterface>>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def decorateRequest[T](
      property: js.Symbol,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? (this : fastify.fastify/types/request.FastifyRequest<fastify.fastify/types/route.RouteGenericInterface, fastify.fastify/types/utils.RawServerDefault, fastify.fastify/types/utils.RawRequestDefaultExpression<fastify.fastify/types/utils.RawServerDefault>, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/utils.ContextConfigDefault, fastify.fastify/types/logger.FastifyBaseLogger, fastify.fastify/types/type-provider.ResolveFastifyRequestType<fastify.fastify/types/type-provider.FastifyTypeProviderDefault, fastify.fastify/types/schema.FastifySchema, fastify.fastify/types/route.RouteGenericInterface>>, args : std.Parameters<T>): std.ReturnType<T> : T */ js.Any,
      dependencies: js.Array[String]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    /**
      * Fastify default plain text parser
      */
    var defaultTextParser: FastifyBodyParser[
        String, 
        RawServerDefault, 
        RawRequestDefaultExpression[RawServerDefault], 
        RouteGenericInterface, 
        FastifySchema, 
        FastifyTypeProviderDefault
      ] = js.native
    
    def delete[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def delete[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptionsWithHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def delete[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("delete")
    var delete_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply, TypeProvider] = js.native
    
    /**
      * Fastify default error handler
      */
    def errorHandler(
      error: FastifyError,
      request: FastifyRequest[
          RouteGenericInterface, 
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          FastifySchema, 
          FastifyTypeProviderDefault, 
          ContextConfigDefault, 
          FastifyBaseLogger, 
          ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
        ],
      reply: FastifyReply[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          RouteGenericInterface, 
          ContextConfigDefault, 
          FastifySchema, 
          FastifyTypeProviderDefault, 
          ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
        ]
    ): Unit = js.native
    
    def get[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def get[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptionsWithHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def get[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    /**
      * Fastify default JSON parser
      */
    def getDefaultJsonParser(onProtoPoisoning: ProtoAction, onConstructorPoisoning: ConstructorAction): FastifyBodyParser[
        String, 
        RawServerDefault, 
        RawRequestDefaultExpression[RawServerDefault], 
        RouteGenericInterface, 
        FastifySchema, 
        FastifyTypeProviderDefault
      ] = js.native
    /**
      * Fastify default JSON parser
      */
    @JSName("getDefaultJsonParser")
    var getDefaultJsonParser_Original: getDefaultJsonParser = js.native
    
    def getDefaultRoute(): DefaultRoute[RawRequest, RawReply] = js.native
    
    def getSchema(schemaId: String): Any = js.native
    
    def getSchemas(): Record[String, Any] = js.native
    
    @JSName("get")
    var get_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply, TypeProvider] = js.native
    
    def hasConstraintStrategy(strategyName: String): Boolean = js.native
    
    def hasContentTypeParser(contentType: String): Boolean = js.native
    def hasContentTypeParser(contentType: js.RegExp): Boolean = js.native
    @JSName("hasContentTypeParser")
    var hasContentTypeParser_Original: hasContentTypeParser = js.native
    
    def hasDecorator(decorator: String): Boolean = js.native
    def hasDecorator(decorator: js.Symbol): Boolean = js.native
    
    def hasReplyDecorator(decorator: String): Boolean = js.native
    def hasReplyDecorator(decorator: js.Symbol): Boolean = js.native
    
    def hasRequestDecorator(decorator: String): Boolean = js.native
    def hasRequestDecorator(decorator: js.Symbol): Boolean = js.native
    
    def hasRoute[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */](
      opts: Pick[
          RouteOptions[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            FastifyBaseLogger
          ], 
          method | url | constraints
        ]
    ): Boolean = js.native
    
    def head[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def head[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptionsWithHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def head[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("head")
    var head_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply, TypeProvider] = js.native
    
    /**
      *  Frozen read-only object registering the initial options passed down by the user to the fastify instance
      */
    var initialConfig: ReadonlyconnectionTimeout = js.native
    
    def inject(): Chain = js.native
    def inject(opts: String): js.Promise[Response] = js.native
    def inject(opts: String, cb: CallbackFunc): Unit = js.native
    def inject(opts: InjectOptions): js.Promise[Response] = js.native
    def inject(opts: InjectOptions, cb: CallbackFunc): Unit = js.native
    
    def listen(): js.Promise[String] = js.native
    def listen(callback: js.Function2[/* err */ js.Error | Null, /* address */ String, Unit]): Unit = js.native
    def listen(opts: FastifyListenOptions): js.Promise[String] = js.native
    def listen(
      opts: FastifyListenOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* address */ String, Unit]
    ): Unit = js.native
    def listen(port: String): js.Promise[String] = js.native
    def listen(port: String, address: String): js.Promise[String] = js.native
    def listen(port: String, address: String, backlog: Double): js.Promise[String] = js.native
    def listen(
      port: String,
      address: String,
      backlog: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* address */ String, Unit]
    ): Unit = js.native
    def listen(
      port: String,
      address: String,
      callback: js.Function2[/* err */ js.Error | Null, /* address */ String, Unit]
    ): Unit = js.native
    def listen(port: String, address: Unit, backlog: Double): js.Promise[String] = js.native
    def listen(port: String, callback: js.Function2[/* err */ js.Error | Null, /* address */ String, Unit]): Unit = js.native
    /**
      * @deprecated Variadic listen method is deprecated. Please use `.listen(optionsObject)` instead. The variadic signature will be removed in `fastify@5`
      * @see https://github.com/fastify/fastify/pull/3712
      */
    def listen(port: Double): js.Promise[String] = js.native
    def listen(port: Double, address: String): js.Promise[String] = js.native
    def listen(port: Double, address: String, backlog: Double): js.Promise[String] = js.native
    /**
      * @deprecated Variadic listen method is deprecated. Please use `.listen(optionsObject, callback)` instead. The variadic signature will be removed in `fastify@5`
      * @see https://github.com/fastify/fastify/pull/3712
      */
    def listen(
      port: Double,
      address: String,
      backlog: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* address */ String, Unit]
    ): Unit = js.native
    /**
      * @deprecated Variadic listen method is deprecated. Please use `.listen(optionsObject, callback)` instead. The variadic signature will be removed in `fastify@5`
      * @see https://github.com/fastify/fastify/pull/3712
      */
    def listen(
      port: Double,
      address: String,
      callback: js.Function2[/* err */ js.Error | Null, /* address */ String, Unit]
    ): Unit = js.native
    def listen(port: Double, address: Unit, backlog: Double): js.Promise[String] = js.native
    /**
      * @deprecated Variadic listen method is deprecated. Please use `.listen(optionsObject, callback)` instead. The variadic signature will be removed in `fastify@5`
      * @see https://github.com/fastify/fastify/pull/3712
      */
    def listen(port: Double, callback: js.Function2[/* err */ js.Error | Null, /* address */ String, Unit]): Unit = js.native
    
    var log: Logger = js.native
    
    def options[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def options[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptionsWithHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def options[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("options")
    var options_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply, TypeProvider] = js.native
    
    def patch[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def patch[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptionsWithHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def patch[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("patch")
    var patch_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply, TypeProvider] = js.native
    
    def post[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def post[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptionsWithHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def post[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("post")
    var post_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply, TypeProvider] = js.native
    
    var prefix: String = js.native
    
    /**
      * Prints the representation of the plugin tree used by avvio, the plugin registration system
      */
    def printPlugins(): String = js.native
    
    /**
      * Prints the representation of the internal radix tree used by the router
      */
    def printRoutes(): String = js.native
    def printRoutes(opts: PrintRoutesOptions): String = js.native
    
    def put[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def put[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptionsWithHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    def put[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
      path: String,
      opts: RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("put")
    var put_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply, TypeProvider] = js.native
    
    def ready(): (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit] = js.native
    def ready(readyListener: js.Function1[/* err */ js.Error, Unit]): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    def register[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
      plugin: js.Promise[
          (Default[Options, Server, TypeProvider]) | (DefaultFastifyPluginAsync[Options, Server, TypeProvider])
        ]
    ): (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit] = js.native
    def register[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
      plugin: js.Promise[
          (Default[Options, Server, TypeProvider]) | (DefaultFastifyPluginAsync[Options, Server, TypeProvider])
        ],
      opts: FastifyRegisterOptions[Options]
    ): (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit] = js.native
    def register[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](plugin: FastifyPluginAsync[Options, Server, TypeProvider]): (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit] = js.native
    def register[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](plugin: FastifyPluginAsync[Options, Server, TypeProvider], opts: FastifyRegisterOptions[Options]): (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit] = js.native
    def register[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](plugin: FastifyPluginCallback[Options, Server, TypeProvider]): (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit] = js.native
    def register[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
      plugin: FastifyPluginCallback[Options, Server, TypeProvider],
      opts: FastifyRegisterOptions[Options]
    ): (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit] = js.native
    @JSName("register")
    var register_Original: FastifyRegister[
        (FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider]) & PromiseLike[Unit], 
        RawServerDefault, 
        FastifyTypeProvider
      ] = js.native
    
    /**
      * Remove all content type parsers, including the default ones
      */
    def removeAllContentTypeParsers(): Unit = js.native
    /**
      * Remove all content type parsers, including the default ones
      */
    @JSName("removeAllContentTypeParsers")
    var removeAllContentTypeParsers_Original: removeAllContentTypeParsers = js.native
    
    /**
      * Remove an existing content type parser
      */
    def removeContentTypeParser(contentType: String): Unit = js.native
    def removeContentTypeParser(contentType: js.Array[String | js.RegExp]): Unit = js.native
    def removeContentTypeParser(contentType: js.RegExp): Unit = js.native
    /**
      * Remove an existing content type parser
      */
    @JSName("removeContentTypeParser")
    var removeContentTypeParser_Original: removeContentTypeParser = js.native
    
    def route[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */](
      opts: RouteOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          FastifyBaseLogger
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    def routing(req: RawRequest, res: RawReply): Unit = js.native
    
    /**
      * Fastify schema serializer for all routes.
      */
    var serializerCompiler: js.UndefOr[FastifySerializerCompiler[Any]] = js.native
    
    var server: RawServer = js.native
    
    def setDefaultRoute(defaultRoute: DefaultRoute[RawRequest, RawReply]): Unit = js.native
    
    /**
      * Set a function that will be called whenever an error happens
      */
    def setErrorHandler[TError /* <: js.Error */, RouteGeneric /* <: RouteGenericInterface */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */](
      handler: js.ThisFunction3[
          /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
          /* error */ TError, 
          /* request */ FastifyRequest[
            RouteGeneric, 
            RawServer, 
            RawRequest, 
            SchemaCompiler, 
            TypeProvider, 
            ContextConfigDefault, 
            FastifyBaseLogger, 
            ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
          ], 
          /* reply */ FastifyReply[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfigDefault, 
            SchemaCompiler, 
            TypeProvider, 
            ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
          ], 
          Any | js.Promise[Any]
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    /**
      * Set the 404 handler
      */
    @JSName("setNotFoundHandler")
    def setNotFoundHandler_Reply[RouteGeneric /* <: RouteGenericInterface */, TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */](
      handler: js.Function2[
          /* request */ FastifyRequest[
            RouteGeneric, 
            RawServer, 
            RawRequest, 
            SchemaCompiler, 
            TypeProvider, 
            ContextConfigDefault, 
            FastifyBaseLogger, 
            ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
          ], 
          /* reply */ FastifyReply[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfigDefault, 
            SchemaCompiler, 
            TypeProvider, 
            ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
          ], 
          Unit | (js.Promise[
            (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit
          ])
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    @JSName("setNotFoundHandler")
    def setNotFoundHandler_Reply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig /* <: ContextConfigDefault */, TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */](
      opts: PreHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, SchemaCompiler, TypeProvider],
      handler: js.Function2[
          /* request */ FastifyRequest[
            RouteGeneric, 
            RawServer, 
            RawRequest, 
            SchemaCompiler, 
            TypeProvider, 
            ContextConfigDefault, 
            FastifyBaseLogger, 
            ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
          ], 
          /* reply */ FastifyReply[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfigDefault, 
            SchemaCompiler, 
            TypeProvider, 
            ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
          ], 
          Unit | (js.Promise[
            (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit
          ])
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    /**
      * Set the reply serializer for all routes.
      */
    def setReplySerializer(replySerializer: js.Function2[/* payload */ Any, /* statusCode */ Double, String]): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    /**
      * Set the schema controller for all routes.
      */
    def setSchemaController(schemaControllerOpts: FastifySchemaControllerOptions): FastifyInstance[RawServer, RawRequest, RawReply, Logger, FastifyTypeProviderDefault] = js.native
    
    /*
      * Set the schema error formatter for all routes.
      */
    def setSchemaErrorFormatter(
      errorFormatter: js.Function2[/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String, js.Error]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    /**
      * Set the schema serializer for all routes.
      */
    def setSerializerCompiler[T](schemaCompiler: FastifySerializerCompiler[T]): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    /**
      * Set the schema validator for all routes.
      */
    def setValidatorCompiler[T](schemaCompiler: FastifySchemaCompiler[T]): FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider] = js.native
    
    /**
      * Fastify schema validator for all routes.
      */
    var validatorCompiler: js.UndefOr[FastifySchemaCompiler[Any]] = js.native
    
    var version: String = js.native
    
    def withTypeProvider[Provider /* <: FastifyTypeProvider */](): FastifyInstance[RawServer, RawRequest, RawReply, Logger, Provider] = js.native
  }
  
  trait FastifyListenOptions extends StObject {
    
    /**
      * Specify the maximum length of the queue of pending connections.
      * The actual length will be determined by the OS through sysctl settings such as `tcp_max_syn_backlog` and `somaxconn` on Linux.
      * Default to `511`.
      */
    var backlog: js.UndefOr[Double] = js.undefined
    
    /**
      * Default to `false`.
      */
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default to `localhost`.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * For TCP servers, setting `ipv6Only` to `true` will disable dual-stack support, i.e., binding to host `::` won't make `0.0.0.0` be bound.
      * Default to `false`.
      */
    var ipv6Only: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will be ignored if `port` is specified.
      * @see [Identifying paths for IPC connections](https://nodejs.org/api/net.html#identifying-paths-for-ipc-connections).
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Default to `0` (picks the first available open port).
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * For IPC servers makes the pipe readable for all users.
      * Default to `false`.
      */
    var readableAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An AbortSignal that may be used to close a listening server.
      * @since This option is available only in Node.js v15.6.0 and greater
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * For IPC servers makes the pipe writable for all users.
      * Default to `false`.
      */
    var writableAll: js.UndefOr[Boolean] = js.undefined
  }
  object FastifyListenOptions {
    
    inline def apply(): FastifyListenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyListenOptions]
    }
    
    extension [Self <: FastifyListenOptions](x: Self) {
      
      inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIpv6Only(value: Boolean): Self = StObject.set(x, "ipv6Only", value.asInstanceOf[js.Any])
      
      inline def setIpv6OnlyUndefined: Self = StObject.set(x, "ipv6Only", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReadableAll(value: Boolean): Self = StObject.set(x, "readableAll", value.asInstanceOf[js.Any])
      
      inline def setReadableAllUndefined: Self = StObject.set(x, "readableAll", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setWritableAll(value: Boolean): Self = StObject.set(x, "writableAll", value.asInstanceOf[js.Any])
      
      inline def setWritableAllUndefined: Self = StObject.set(x, "writableAll", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    RawServer extends node.http.Server<new (socket : node.node:net.Socket): node.http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>> ? find-my-way.find-my-way.HTTPVersion.V1 : find-my-way.find-my-way.HTTPVersion.V2
    }}}
    */
  @js.native
  trait FindMyWayVersion[RawServer /* <: RawServerBase */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Key extends keyof _Interface ? never : Key
    }}}
    */
  @js.native
  trait NotInInterface[Key, _Interface] extends StObject
  
  trait PrintRoutesOptions extends StObject {
    
    var commonPrefix: js.UndefOr[Boolean] = js.undefined
    
    var includeHooks: js.UndefOr[Boolean] = js.undefined
    
    var includeMeta: js.UndefOr[Boolean | (js.Array[String | js.Symbol])] = js.undefined
  }
  object PrintRoutesOptions {
    
    inline def apply(): PrintRoutesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintRoutesOptions]
    }
    
    extension [Self <: PrintRoutesOptions](x: Self) {
      
      inline def setCommonPrefix(value: Boolean): Self = StObject.set(x, "commonPrefix", value.asInstanceOf[js.Any])
      
      inline def setCommonPrefixUndefined: Self = StObject.set(x, "commonPrefix", js.undefined)
      
      inline def setIncludeHooks(value: Boolean): Self = StObject.set(x, "includeHooks", value.asInstanceOf[js.Any])
      
      inline def setIncludeHooksUndefined: Self = StObject.set(x, "includeHooks", js.undefined)
      
      inline def setIncludeMeta(value: Boolean | (js.Array[String | js.Symbol])): Self = StObject.set(x, "includeMeta", value.asInstanceOf[js.Any])
      
      inline def setIncludeMetaUndefined: Self = StObject.set(x, "includeMeta", js.undefined)
      
      inline def setIncludeMetaVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "includeMeta", js.Array(value*))
    }
  }
}
