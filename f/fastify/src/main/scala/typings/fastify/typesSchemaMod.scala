package typings.fastify

import typings.fastify.anon.Add
import typings.fastify.anon.BuildValidator
import typings.fastify.anon.Error
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSchemaMod {
  
  trait FastifyRouteSchemaDef[T] extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var httpPart: js.UndefOr[String] = js.undefined
    
    var httpStatus: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var schema: T
    
    var url: String
  }
  object FastifyRouteSchemaDef {
    
    inline def apply[T](method: String, schema: T, url: String): FastifyRouteSchemaDef[T] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyRouteSchemaDef[T]]
    }
    
    extension [Self <: FastifyRouteSchemaDef[?], T](x: Self & FastifyRouteSchemaDef[T]) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setHttpPart(value: String): Self = StObject.set(x, "httpPart", value.asInstanceOf[js.Any])
      
      inline def setHttpPartUndefined: Self = StObject.set(x, "httpPart", js.undefined)
      
      inline def setHttpStatus(value: String): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
      
      inline def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: T): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastifySchema extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var querystring: js.UndefOr[Any] = js.undefined
    
    var response: js.UndefOr[Any] = js.undefined
  }
  object FastifySchema {
    
    inline def apply(): FastifySchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifySchema]
    }
    
    extension [Self <: FastifySchema](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuerystring(value: Any): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  type FastifySchemaCompiler[T] = js.Function1[/* routeSchema */ FastifyRouteSchemaDef[T], FastifyValidationResult]
  
  trait FastifySchemaControllerOptions extends StObject {
    
    var bucket: js.UndefOr[js.Function1[/* parentSchemas */ js.UndefOr[Any], Add]] = js.undefined
    
    var compilersFactory: js.UndefOr[BuildValidator] = js.undefined
  }
  object FastifySchemaControllerOptions {
    
    inline def apply(): FastifySchemaControllerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifySchemaControllerOptions]
    }
    
    extension [Self <: FastifySchemaControllerOptions](x: Self) {
      
      inline def setBucket(value: /* parentSchemas */ js.UndefOr[Any] => Add): Self = StObject.set(x, "bucket", js.Any.fromFunction1(value))
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setCompilersFactory(value: BuildValidator): Self = StObject.set(x, "compilersFactory", value.asInstanceOf[js.Any])
      
      inline def setCompilersFactoryUndefined: Self = StObject.set(x, "compilersFactory", js.undefined)
    }
  }
  
  trait FastifySchemaValidationError extends StObject {
    
    var instancePath: String
    
    var keyword: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var params: Record[String, String | js.Array[String]]
    
    var schemaPath: String
  }
  object FastifySchemaValidationError {
    
    inline def apply(
      instancePath: String,
      keyword: String,
      params: Record[String, String | js.Array[String]],
      schemaPath: String
    ): FastifySchemaValidationError = {
      val __obj = js.Dynamic.literal(instancePath = instancePath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifySchemaValidationError]
    }
    
    extension [Self <: FastifySchemaValidationError](x: Self) {
      
      inline def setInstancePath(value: String): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setParams(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
    }
  }
  
  type FastifySerializerCompiler[T] = js.Function1[/* routeSchema */ FastifyRouteSchemaDef[T], js.Function1[/* data */ Any, String]]
  
  @js.native
  trait FastifyValidationResult extends StObject {
    
    def apply(data: Any): Boolean | PromiseLike[Any] | Error = js.native
    
    var errors: js.UndefOr[js.Array[FastifySchemaValidationError] | Null] = js.native
  }
}
