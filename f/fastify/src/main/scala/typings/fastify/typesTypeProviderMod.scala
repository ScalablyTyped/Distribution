package typings.fastify

import typings.fastify.typesRouteMod.RouteGenericInterface
import typings.fastify.typesSchemaMod.FastifySchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypeProviderMod {
  
  type CallTypeProvider[F /* <: FastifyTypeProvider */, I] = /* import warning: importer.ImportType#apply Failed type conversion: F & fastify.anon.Input<I>['output'] */ js.Any
  
  type FastifyReplyType[Reply] = Reply
  
  trait FastifyRequestType[Params, Querystring, Headers, Body] extends StObject {
    
    var body: Body
    
    var headers: Headers
    
    var params: Params
    
    var query: Querystring
  }
  object FastifyRequestType {
    
    inline def apply[Params, Querystring, Headers, Body](body: Body, headers: Headers, params: Params, query: Querystring): FastifyRequestType[Params, Querystring, Headers, Body] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyRequestType[Params, Querystring, Headers, Body]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FastifyRequestType[?, ?, ?, ?], Params, Querystring, Headers, Body] (val x: Self & (FastifyRequestType[Params, Querystring, Headers, Body])) extends AnyVal {
      
      inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Querystring): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastifyTypeProvider extends StObject {
    
    val input: Any
    
    val output: Any
  }
  object FastifyTypeProvider {
    
    inline def apply(input: Any, output: Any): FastifyTypeProvider = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyTypeProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FastifyTypeProvider] (val x: Self) extends AnyVal {
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  type FastifyTypeProviderDefault = FastifyTypeProvider
  
  // union-aware keyof operator
  //    keyof ({ a: number} | { b: number}) => never
  //    KeysOf<{a: number} | {b: number}>   => "a" | "b"
  // this exists to allow users to override faulty type-provider logic.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? keyof T : never
    }}}
    */
  type KeysOf[T] = /* keyof T */ String
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    fastify.fastify/types/type-provider.ResolveFastifyReplyType<TypeProvider, SchemaCompiler, RouteGeneric> extends infer Return ? Return | void | std.Promise<Return | void> : unknown
    }}}
    */
  @js.native
  trait ResolveFastifyReplyReturnType[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] extends StObject
  
  type ResolveFastifyReplyType[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    /* import warning: importer.ImportType#apply Failed type conversion: fastify.fastify/types/type-provider.KeysOf<RouteGeneric['Reply']> extends never ? fastify.fastify/types/type-provider.ResolveReplyFromSchemaCompiler<TypeProvider, SchemaCompiler> : RouteGeneric['Reply'] */ js.Any
  ]
  
  trait ResolveFastifyRequestType[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */]
    extends StObject
       with FastifyRequestType[Any, Any, Any, Any] {
    
    @JSName("body")
    var body_ResolveFastifyRequestType: ResolveRequestBody[TypeProvider, SchemaCompiler, RouteGeneric]
    
    @JSName("headers")
    var headers_ResolveFastifyRequestType: ResolveRequestHeaders[TypeProvider, SchemaCompiler, RouteGeneric]
    
    @JSName("params")
    var params_ResolveFastifyRequestType: ResolveRequestParams[TypeProvider, SchemaCompiler, RouteGeneric]
    
    @JSName("query")
    var query_ResolveFastifyRequestType: ResolveRequestQuerystring[TypeProvider, SchemaCompiler, RouteGeneric]
  }
  object ResolveFastifyRequestType {
    
    inline def apply[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */](
      body: ResolveRequestBody[TypeProvider, SchemaCompiler, RouteGeneric],
      headers: ResolveRequestHeaders[TypeProvider, SchemaCompiler, RouteGeneric],
      params: ResolveRequestParams[TypeProvider, SchemaCompiler, RouteGeneric],
      query: ResolveRequestQuerystring[TypeProvider, SchemaCompiler, RouteGeneric]
    ): ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveFastifyRequestType[?, ?, ?], TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] (val x: Self & (ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric])) extends AnyVal {
      
      inline def setBody(value: ResolveRequestBody[TypeProvider, SchemaCompiler, RouteGeneric]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: ResolveRequestHeaders[TypeProvider, SchemaCompiler, RouteGeneric]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setParams(value: ResolveRequestParams[TypeProvider, SchemaCompiler, RouteGeneric]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: ResolveRequestQuerystring[TypeProvider, SchemaCompiler, RouteGeneric]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  // -----------------------------------------------------------------------------------------------
  // FastifyReplyType
  // -----------------------------------------------------------------------------------------------
  // Resolves the Reply type by taking a union of response status codes
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    {[ K in keyof SchemaCompiler['response'] ]: fastify.fastify/types/type-provider.CallTypeProvider<TypeProvider, SchemaCompiler['response'][K]>} extends infer Result ? Result[keyof Result] : unknown
    }}}
    */
  @js.native
  trait ResolveReplyFromSchemaCompiler[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */] extends StObject
  
  type ResolveRequestBody[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    /* import warning: importer.ImportType#apply Failed type conversion: fastify.fastify/types/type-provider.KeysOf<RouteGeneric['Body']> extends never ? fastify.fastify/types/type-provider.CallTypeProvider<TypeProvider, SchemaCompiler['body']> : RouteGeneric['Body'] */ js.Any
  ]
  
  type ResolveRequestHeaders[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    /* import warning: importer.ImportType#apply Failed type conversion: fastify.fastify/types/type-provider.KeysOf<RouteGeneric['Headers']> extends never ? fastify.fastify/types/type-provider.CallTypeProvider<TypeProvider, SchemaCompiler['headers']> : RouteGeneric['Headers'] */ js.Any
  ]
  
  // Resolves Request types either from generic argument or Type Provider.
  type ResolveRequestParams[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    /* import warning: importer.ImportType#apply Failed type conversion: fastify.fastify/types/type-provider.KeysOf<RouteGeneric['Params']> extends never ? fastify.fastify/types/type-provider.CallTypeProvider<TypeProvider, SchemaCompiler['params']> : RouteGeneric['Params'] */ js.Any
  ]
  
  type ResolveRequestQuerystring[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    /* import warning: importer.ImportType#apply Failed type conversion: fastify.fastify/types/type-provider.KeysOf<RouteGeneric['Querystring']> extends never ? fastify.fastify/types/type-provider.CallTypeProvider<TypeProvider, SchemaCompiler['querystring']> : RouteGeneric['Querystring'] */ js.Any
  ]
  
  // -----------------------------------------------------------------------------------------------
  // FastifyRequestType
  // -----------------------------------------------------------------------------------------------
  // Used to map undefined SchemaCompiler properties to unknown
  //   Without brackets, UndefinedToUnknown<undefined | null> => unknown
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [undefined] ? unknown : T
    }}}
    */
  type UndefinedToUnknown[T] = T
}
