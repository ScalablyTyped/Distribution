package typings.fastify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  trait FastifyRouteSchemaDef extends StObject {
    
    var httpPart: js.UndefOr[String] = js.undefined
    
    var httpStatus: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var schema: FastifySchema
    
    var url: String
  }
  object FastifyRouteSchemaDef {
    
    inline def apply(method: String, schema: FastifySchema, url: String): FastifyRouteSchemaDef = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyRouteSchemaDef]
    }
    
    extension [Self <: FastifyRouteSchemaDef](x: Self) {
      
      inline def setHttpPart(value: String): Self = StObject.set(x, "httpPart", value.asInstanceOf[js.Any])
      
      inline def setHttpPartUndefined: Self = StObject.set(x, "httpPart", js.undefined)
      
      inline def setHttpStatus(value: String): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
      
      inline def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: FastifySchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastifySchema extends StObject {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var params: js.UndefOr[js.Any] = js.undefined
    
    var querystring: js.UndefOr[js.Any] = js.undefined
    
    var response: js.UndefOr[js.Any] = js.undefined
  }
  object FastifySchema {
    
    inline def apply(): FastifySchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifySchema]
    }
    
    extension [Self <: FastifySchema](x: Self) {
      
      inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuerystring(value: js.Any): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
      
      inline def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  type FastifySchemaCompiler = js.Function1[/* routeSchema */ FastifyRouteSchemaDef, FastifyValidationResult]
  
  trait FastifySchemaValidationError extends StObject {
    
    var dataPath: String
    
    var message: js.UndefOr[String] = js.undefined
  }
  object FastifySchemaValidationError {
    
    inline def apply(dataPath: String): FastifySchemaValidationError = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifySchemaValidationError]
    }
    
    extension [Self <: FastifySchemaValidationError](x: Self) {
      
      inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait FastifyValidationResult extends StObject {
    
    var errors: js.UndefOr[js.Array[FastifySchemaValidationError] | Null] = js.undefined
  }
  object FastifyValidationResult {
    
    inline def apply(): FastifyValidationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyValidationResult]
    }
    
    extension [Self <: FastifyValidationResult](x: Self) {
      
      inline def setErrors(value: js.Array[FastifySchemaValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsNull: Self = StObject.set(x, "errors", null)
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: FastifySchemaValidationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
}
