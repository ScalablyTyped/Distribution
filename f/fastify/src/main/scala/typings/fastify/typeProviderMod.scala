package typings.fastify

import typings.fastify.routeMod.RouteGenericInterface
import typings.fastify.schemaMod.FastifySchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeProviderMod {
  
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
    
    extension [Self <: FastifyRequestType[?, ?, ?, ?], Params, Querystring, Headers, Body](x: Self & (FastifyRequestType[Params, Querystring, Headers, Body])) {
      
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
    
    extension [Self <: FastifyTypeProvider](x: Self) {
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  type FastifyTypeProviderDefault = FastifyTypeProvider
  
  // union-aware keyof operator
  //    keyof ({ a: number} | { b: number}) => never
  //    KeysOf<{a: number} | {b: number}>   => "a" | "b"
  // this exists to allow users to override faulty type-provider logic.
  type KeysOf[T] = /* keyof T */ String
  
  type ResolveFastifyReplyReturnType[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = Any | Unit | (js.Promise[Any | Unit])
  
  type ResolveFastifyReplyType[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | (ResolveReplyFromSchemaCompiler[TypeProvider, SchemaCompiler])
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
    
    extension [Self <: ResolveFastifyRequestType[?, ?, ?], TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */](x: Self & (ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric])) {
      
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
  type ResolveReplyFromSchemaCompiler[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */] = Any | (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any)
  
  type ResolveRequestBody[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Body'] */ js.Any) | (CallTypeProvider[
      TypeProvider, 
      /* import warning: importer.ImportType#apply Failed type conversion: SchemaCompiler['body'] */ js.Any
    ])
  ]
  
  type ResolveRequestHeaders[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Headers'] */ js.Any) | (CallTypeProvider[
      TypeProvider, 
      /* import warning: importer.ImportType#apply Failed type conversion: SchemaCompiler['headers'] */ js.Any
    ])
  ]
  
  // Resolves Request types either from generic argument or Type Provider.
  type ResolveRequestParams[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Params'] */ js.Any) | (CallTypeProvider[
      TypeProvider, 
      /* import warning: importer.ImportType#apply Failed type conversion: SchemaCompiler['params'] */ js.Any
    ])
  ]
  
  type ResolveRequestQuerystring[TypeProvider /* <: FastifyTypeProvider */, SchemaCompiler /* <: FastifySchema */, RouteGeneric /* <: RouteGenericInterface */] = UndefinedToUnknown[
    (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Querystring'] */ js.Any) | (CallTypeProvider[
      TypeProvider, 
      /* import warning: importer.ImportType#apply Failed type conversion: SchemaCompiler['querystring'] */ js.Any
    ])
  ]
  
  // -----------------------------------------------------------------------------------------------
  // FastifyRequestType
  // -----------------------------------------------------------------------------------------------
  // Used to map undefined SchemaCompiler properties to unknown
  //   Without brackets, UndefinedToUnknown<undefined | null> => unknown
  type UndefinedToUnknown[T] = T | Any
}
