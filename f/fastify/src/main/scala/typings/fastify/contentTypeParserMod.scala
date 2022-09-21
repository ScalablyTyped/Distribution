package typings.fastify

import typings.fastify.anon.BodyLimit
import typings.fastify.anon.ParseAs
import typings.fastify.loggerMod.FastifyBaseLogger
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.routeMod.RouteGenericInterface
import typings.fastify.schemaMod.FastifySchema
import typings.fastify.typeProviderMod.FastifyTypeProvider
import typings.fastify.typeProviderMod.FastifyTypeProviderDefault
import typings.fastify.typeProviderMod.ResolveFastifyRequestType
import typings.fastify.utilsMod.ContextConfigDefault
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastify.utilsMod.RawServerDefault
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentTypeParserMod {
  
  @js.native
  trait AddContentTypeParser[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
    
    def apply(
      contentType: String,
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: String,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: js.Array[String],
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: js.Array[String],
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: js.RegExp,
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: js.RegExp,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply[parseAs /* <: String | Buffer */](
      contentType: String,
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply[parseAs /* <: String | Buffer */](
      contentType: js.Array[String],
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply[parseAs /* <: String | Buffer */](
      contentType: js.RegExp,
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastify.fastifyStrings.error
    - typings.fastify.fastifyStrings.remove
    - typings.fastify.fastifyStrings.ignore
  */
  trait ConstructorAction extends StObject
  object ConstructorAction {
    
    inline def error: typings.fastify.fastifyStrings.error = "error".asInstanceOf[typings.fastify.fastifyStrings.error]
    
    inline def ignore: typings.fastify.fastifyStrings.ignore = "ignore".asInstanceOf[typings.fastify.fastifyStrings.ignore]
    
    inline def remove: typings.fastify.fastifyStrings.remove = "remove".asInstanceOf[typings.fastify.fastifyStrings.remove]
  }
  
  type ContentTypeParserDoneFunction = js.Function2[/* err */ js.Error | Null, /* body */ js.UndefOr[Any], Unit]
  
  type FastifyBodyParser[RawBody /* <: String | Buffer */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */] = (js.Function3[
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
    /* rawBody */ RawBody, 
    /* done */ ContentTypeParserDoneFunction, 
    Unit
  ]) | (js.Function2[
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
    /* rawBody */ RawBody, 
    js.Promise[Any]
  ])
  
  type FastifyContentTypeParser[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */] = (js.Function2[
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
    /* payload */ RawRequest, 
    js.Promise[Any]
  ]) | (js.Function3[
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
    /* payload */ RawRequest, 
    /* done */ ContentTypeParserDoneFunction, 
    Unit
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastify.fastifyStrings.error
    - typings.fastify.fastifyStrings.remove
    - typings.fastify.fastifyStrings.ignore
  */
  trait ProtoAction extends StObject
  object ProtoAction {
    
    inline def error: typings.fastify.fastifyStrings.error = "error".asInstanceOf[typings.fastify.fastifyStrings.error]
    
    inline def ignore: typings.fastify.fastifyStrings.ignore = "ignore".asInstanceOf[typings.fastify.fastifyStrings.ignore]
    
    inline def remove: typings.fastify.fastifyStrings.remove = "remove".asInstanceOf[typings.fastify.fastifyStrings.remove]
  }
  
  type getDefaultJsonParser = js.Function2[
    /* onProtoPoisoning */ ProtoAction, 
    /* onConstructorPoisoning */ ConstructorAction, 
    FastifyBodyParser[
      String, 
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RouteGenericInterface, 
      FastifySchema, 
      FastifyTypeProviderDefault
    ]
  ]
  
  type hasContentTypeParser = js.Function1[/* contentType */ String | js.RegExp, Boolean]
  
  type removeAllContentTypeParsers = js.Function0[Unit]
  
  type removeContentTypeParser = js.Function1[/* contentType */ String | js.RegExp | (js.Array[String | js.RegExp]), Unit]
}
