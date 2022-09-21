package typings.fastify

import org.scalablytyped.runtime.StringDictionary
import typings.fastify.contextMod.FastifyContextConfig
import typings.fastify.fastifyStrings.`no-slash`
import typings.fastify.fastifyStrings.both
import typings.fastify.fastifyStrings.slash
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
import typings.fastify.loggerMod.FastifyBaseLogger
import typings.fastify.loggerMod.LogLevel
import typings.fastify.replyMod.FastifyReply
import typings.fastify.replyMod.ReplyGenericInterface
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.requestMod.RequestGenericInterface
import typings.fastify.schemaMod.FastifyRouteSchemaDef
import typings.fastify.schemaMod.FastifySchema
import typings.fastify.schemaMod.FastifySchemaCompiler
import typings.fastify.schemaMod.FastifySchemaValidationError
import typings.fastify.schemaMod.FastifySerializerCompiler
import typings.fastify.schemaMod.FastifyValidationResult
import typings.fastify.typeProviderMod.FastifyTypeProvider
import typings.fastify.typeProviderMod.FastifyTypeProviderDefault
import typings.fastify.typeProviderMod.ResolveFastifyReplyReturnType
import typings.fastify.typeProviderMod.ResolveFastifyReplyType
import typings.fastify.typeProviderMod.ResolveFastifyRequestType
import typings.fastify.utilsMod.ContextConfigDefault
import typings.fastify.utilsMod.HTTPMethods
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastify.utilsMod.RawServerDefault
import typings.fastifyError.mod.FastifyError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod {
  
  type DefaultRoute[Request, Reply] = js.Function2[/* req */ Request, /* res */ Reply, Unit]
  
  trait RouteGenericInterface
    extends StObject
       with RequestGenericInterface
       with ReplyGenericInterface
  object RouteGenericInterface {
    
    inline def apply(): RouteGenericInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteGenericInterface]
    }
  }
  
  type RouteHandler[RouteGeneric /* <: RouteGenericInterface */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit | (js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit
    ])
  ]
  
  type RouteHandlerMethod[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    ResolveFastifyReplyReturnType[TypeProvider, SchemaCompiler, RouteGeneric]
  ]
  
  trait RouteOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */]
    extends StObject
       with RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ] {
    
    def handler(
      request: FastifyRequest[
          RouteGeneric, 
          RawServer, 
          RawRequest, 
          SchemaCompiler, 
          TypeProvider, 
          ContextConfig, 
          Logger, 
          ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
        ],
      reply: FastifyReply[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
        ]
    ): ResolveFastifyReplyReturnType[TypeProvider, SchemaCompiler, RouteGeneric]
    @JSName("handler")
    var handler_Original: RouteHandlerMethod[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        Logger
      ]
    
    var method: HTTPMethods | js.Array[HTTPMethods]
    
    var url: String
  }
  object RouteOptions {
    
    inline def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */](
      handler: RouteHandlerMethod[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ],
      method: HTTPMethods | js.Array[HTTPMethods],
      url: String
    ): RouteOptions[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        Logger
      ] = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        Logger
      ]]
    }
    
    extension [Self <: RouteOptions[?, ?, ?, ?, ?, ?, ?, ?], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */](x: Self & (RouteOptions[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ])) {
      
      inline def setHandler(
        value: RouteHandlerMethod[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]
      ): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: HTTPMethods | js.Array[HTTPMethods]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodVarargs(value: HTTPMethods*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteShorthandMethod[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
    
    def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
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
    def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
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
    def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, Logger /* <: FastifyBaseLogger */](
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
  }
  
  trait RouteShorthandOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] extends StObject {
    
    // originally FastifySchema
    var attachValidation: js.UndefOr[Boolean] = js.undefined
    
    var bodyLimit: js.UndefOr[Double] = js.undefined
    
    var config: js.UndefOr[FastifyContextConfig & ContextConfig] = js.undefined
    
    var constraints: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var errorHandler: js.UndefOr[
        js.ThisFunction3[
          /* this */ FastifyInstance[
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault], 
            RawReplyDefaultExpression[RawServerDefault], 
            FastifyBaseLogger, 
            FastifyTypeProviderDefault
          ], 
          /* error */ FastifyError, 
          /* request */ FastifyRequest[
            RouteGenericInterface, 
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault], 
            FastifySchema, 
            FastifyTypeProviderDefault, 
            ContextConfigDefault, 
            FastifyBaseLogger, 
            ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
          ], 
          /* reply */ FastifyReply[
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault], 
            RawReplyDefaultExpression[RawServerDefault], 
            RouteGenericInterface, 
            ContextConfigDefault, 
            FastifySchema, 
            FastifyTypeProviderDefault, 
            ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
          ], 
          Unit
        ]
      ] = js.undefined
    
    var exposeHeadRoute: js.UndefOr[Boolean] = js.undefined
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var onError: js.UndefOr[
        (onErrorHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          FastifyError, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          onErrorHookHandler[
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
        ])
      ] = js.undefined
    
    // hooks
    var onRequest: js.UndefOr[
        (onRequestHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          onRequestHookHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ]
        ])
      ] = js.undefined
    
    var onResponse: js.UndefOr[
        (onResponseHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          onResponseHookHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ]
        ])
      ] = js.undefined
    
    var onSend: js.UndefOr[
        (onSendHookHandler[
          Any, 
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          onSendHookHandler[
            Any, 
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ]
        ])
      ] = js.undefined
    
    var onTimeout: js.UndefOr[
        (onTimeoutHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          onTimeoutHookHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ]
        ])
      ] = js.undefined
    
    var preHandler: js.UndefOr[
        (preHandlerHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          preHandlerHookHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ]
        ])
      ] = js.undefined
    
    var preParsing: js.UndefOr[
        (preParsingHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          preParsingHookHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ]
        ])
      ] = js.undefined
    
    var preSerialization: js.UndefOr[
        (preSerializationHookHandler[
          Any, 
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          preSerializationHookHandler[
            Any, 
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ]
        ])
      ] = js.undefined
    
    var preValidation: js.UndefOr[
        (preValidationHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ]) | (js.Array[
          preValidationHookHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ]
        ])
      ] = js.undefined
    
    var prefixTrailingSlash: js.UndefOr[slash | `no-slash` | both] = js.undefined
    
    var schema: js.UndefOr[SchemaCompiler] = js.undefined
    
    // TODO: Change to actual type.
    var schemaErrorFormatter: js.UndefOr[
        js.Function2[/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String, js.Error]
      ] = js.undefined
    
    var serializerCompiler: js.UndefOr[FastifySerializerCompiler[SchemaCompiler]] = js.undefined
    
    var validatorCompiler: js.UndefOr[FastifySchemaCompiler[SchemaCompiler]] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object RouteShorthandOptions {
    
    inline def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */](): RouteShorthandOptions[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        Logger
      ] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteShorthandOptions[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        Logger
      ]]
    }
    
    extension [Self <: RouteShorthandOptions[?, ?, ?, ?, ?, ?, ?, ?], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */](x: Self & (RouteShorthandOptions[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ])) {
      
      inline def setAttachValidation(value: Boolean): Self = StObject.set(x, "attachValidation", value.asInstanceOf[js.Any])
      
      inline def setAttachValidationUndefined: Self = StObject.set(x, "attachValidation", js.undefined)
      
      inline def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
      
      inline def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
      
      inline def setConfig(value: FastifyContextConfig & ContextConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConstraints(value: StringDictionary[Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setErrorHandler(
        value: js.ThisFunction3[
              /* this */ FastifyInstance[
                RawServerDefault, 
                RawRequestDefaultExpression[RawServerDefault], 
                RawReplyDefaultExpression[RawServerDefault], 
                FastifyBaseLogger, 
                FastifyTypeProviderDefault
              ], 
              /* error */ FastifyError, 
              /* request */ FastifyRequest[
                RouteGenericInterface, 
                RawServerDefault, 
                RawRequestDefaultExpression[RawServerDefault], 
                FastifySchema, 
                FastifyTypeProviderDefault, 
                ContextConfigDefault, 
                FastifyBaseLogger, 
                ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
              ], 
              /* reply */ FastifyReply[
                RawServerDefault, 
                RawRequestDefaultExpression[RawServerDefault], 
                RawReplyDefaultExpression[RawServerDefault], 
                RouteGenericInterface, 
                ContextConfigDefault, 
                FastifySchema, 
                FastifyTypeProviderDefault, 
                ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setExposeHeadRoute(value: Boolean): Self = StObject.set(x, "exposeHeadRoute", value.asInstanceOf[js.Any])
      
      inline def setExposeHeadRouteUndefined: Self = StObject.set(x, "exposeHeadRoute", js.undefined)
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setOnError(
        value: (onErrorHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              FastifyError, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              onErrorHookHandler[
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
            ])
      ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnErrorVarargs(
        value: (onErrorHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              FastifyError, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "onError", js.Array(value*))
      
      inline def setOnRequest(
        value: (onRequestHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              onRequestHookHandler[
                RawServer, 
                RawRequest, 
                RawReply, 
                RouteGeneric, 
                ContextConfig, 
                SchemaCompiler, 
                TypeProvider, 
                Logger
              ]
            ])
      ): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
      
      inline def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
      
      inline def setOnRequestVarargs(
        value: (onRequestHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "onRequest", js.Array(value*))
      
      inline def setOnResponse(
        value: (onResponseHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              onResponseHookHandler[
                RawServer, 
                RawRequest, 
                RawReply, 
                RouteGeneric, 
                ContextConfig, 
                SchemaCompiler, 
                TypeProvider, 
                Logger
              ]
            ])
      ): Self = StObject.set(x, "onResponse", value.asInstanceOf[js.Any])
      
      inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      inline def setOnResponseVarargs(
        value: (onResponseHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "onResponse", js.Array(value*))
      
      inline def setOnSend(
        value: (onSendHookHandler[
              Any, 
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              onSendHookHandler[
                Any, 
                RawServer, 
                RawRequest, 
                RawReply, 
                RouteGeneric, 
                ContextConfig, 
                SchemaCompiler, 
                TypeProvider, 
                Logger
              ]
            ])
      ): Self = StObject.set(x, "onSend", value.asInstanceOf[js.Any])
      
      inline def setOnSendUndefined: Self = StObject.set(x, "onSend", js.undefined)
      
      inline def setOnSendVarargs(
        value: (onSendHookHandler[
              Any, 
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "onSend", js.Array(value*))
      
      inline def setOnTimeout(
        value: (onTimeoutHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              onTimeoutHookHandler[
                RawServer, 
                RawRequest, 
                RawReply, 
                RouteGeneric, 
                ContextConfig, 
                SchemaCompiler, 
                TypeProvider, 
                Logger
              ]
            ])
      ): Self = StObject.set(x, "onTimeout", value.asInstanceOf[js.Any])
      
      inline def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
      
      inline def setOnTimeoutVarargs(
        value: (onTimeoutHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "onTimeout", js.Array(value*))
      
      inline def setPreHandler(
        value: (preHandlerHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              preHandlerHookHandler[
                RawServer, 
                RawRequest, 
                RawReply, 
                RouteGeneric, 
                ContextConfig, 
                SchemaCompiler, 
                TypeProvider, 
                Logger
              ]
            ])
      ): Self = StObject.set(x, "preHandler", value.asInstanceOf[js.Any])
      
      inline def setPreHandlerUndefined: Self = StObject.set(x, "preHandler", js.undefined)
      
      inline def setPreHandlerVarargs(
        value: (preHandlerHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "preHandler", js.Array(value*))
      
      inline def setPreParsing(
        value: (preParsingHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              preParsingHookHandler[
                RawServer, 
                RawRequest, 
                RawReply, 
                RouteGeneric, 
                ContextConfig, 
                SchemaCompiler, 
                TypeProvider, 
                Logger
              ]
            ])
      ): Self = StObject.set(x, "preParsing", value.asInstanceOf[js.Any])
      
      inline def setPreParsingUndefined: Self = StObject.set(x, "preParsing", js.undefined)
      
      inline def setPreParsingVarargs(
        value: (preParsingHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "preParsing", js.Array(value*))
      
      inline def setPreSerialization(
        value: (preSerializationHookHandler[
              Any, 
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              preSerializationHookHandler[
                Any, 
                RawServer, 
                RawRequest, 
                RawReply, 
                RouteGeneric, 
                ContextConfig, 
                SchemaCompiler, 
                TypeProvider, 
                Logger
              ]
            ])
      ): Self = StObject.set(x, "preSerialization", value.asInstanceOf[js.Any])
      
      inline def setPreSerializationUndefined: Self = StObject.set(x, "preSerialization", js.undefined)
      
      inline def setPreSerializationVarargs(
        value: (preSerializationHookHandler[
              Any, 
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "preSerialization", js.Array(value*))
      
      inline def setPreValidation(
        value: (preValidationHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]) | (js.Array[
              preValidationHookHandler[
                RawServer, 
                RawRequest, 
                RawReply, 
                RouteGeneric, 
                ContextConfig, 
                SchemaCompiler, 
                TypeProvider, 
                Logger
              ]
            ])
      ): Self = StObject.set(x, "preValidation", value.asInstanceOf[js.Any])
      
      inline def setPreValidationUndefined: Self = StObject.set(x, "preValidation", js.undefined)
      
      inline def setPreValidationVarargs(
        value: (preValidationHookHandler[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ])*
      ): Self = StObject.set(x, "preValidation", js.Array(value*))
      
      inline def setPrefixTrailingSlash(value: slash | `no-slash` | both): Self = StObject.set(x, "prefixTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setPrefixTrailingSlashUndefined: Self = StObject.set(x, "prefixTrailingSlash", js.undefined)
      
      inline def setSchema(value: SchemaCompiler): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaErrorFormatter(value: (/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String) => js.Error): Self = StObject.set(x, "schemaErrorFormatter", js.Any.fromFunction2(value))
      
      inline def setSchemaErrorFormatterUndefined: Self = StObject.set(x, "schemaErrorFormatter", js.undefined)
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSerializerCompiler(
        value: /* routeSchema */ FastifyRouteSchemaDef[SchemaCompiler] => js.Function1[/* data */ Any, String]
      ): Self = StObject.set(x, "serializerCompiler", js.Any.fromFunction1(value))
      
      inline def setSerializerCompilerUndefined: Self = StObject.set(x, "serializerCompiler", js.undefined)
      
      inline def setValidatorCompiler(value: /* routeSchema */ FastifyRouteSchemaDef[SchemaCompiler] => FastifyValidationResult): Self = StObject.set(x, "validatorCompiler", js.Any.fromFunction1(value))
      
      inline def setValidatorCompilerUndefined: Self = StObject.set(x, "validatorCompiler", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait RouteShorthandOptionsWithHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */]
    extends StObject
       with RouteShorthandOptions[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          Logger
        ] {
    
    def handler(
      request: FastifyRequest[
          RouteGeneric, 
          RawServer, 
          RawRequest, 
          SchemaCompiler, 
          TypeProvider, 
          ContextConfig, 
          Logger, 
          ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
        ],
      reply: FastifyReply[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
        ]
    ): ResolveFastifyReplyReturnType[TypeProvider, SchemaCompiler, RouteGeneric]
    @JSName("handler")
    var handler_Original: RouteHandlerMethod[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        Logger
      ]
  }
  object RouteShorthandOptionsWithHandler {
    
    inline def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */](
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
    ): RouteShorthandOptionsWithHandler[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        Logger
      ] = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteShorthandOptionsWithHandler[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        Logger
      ]]
    }
    
    extension [Self <: RouteShorthandOptionsWithHandler[?, ?, ?, ?, ?, ?, ?, ?], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */](x: Self & (RouteShorthandOptionsWithHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            Logger
          ])) {
      
      inline def setHandler(
        value: RouteHandlerMethod[
              RawServer, 
              RawRequest, 
              RawReply, 
              RouteGeneric, 
              ContextConfig, 
              SchemaCompiler, 
              TypeProvider, 
              Logger
            ]
      ): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
}
