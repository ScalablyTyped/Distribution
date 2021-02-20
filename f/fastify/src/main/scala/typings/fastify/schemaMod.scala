package typings.fastify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @js.native
  trait FastifyRouteSchemaDef extends StObject {
    
    var httpPart: js.UndefOr[String] = js.native
    
    var httpStatus: js.UndefOr[String] = js.native
    
    var method: String = js.native
    
    var schema: FastifySchema = js.native
    
    var url: String = js.native
  }
  object FastifyRouteSchemaDef {
    
    @scala.inline
    def apply(method: String, schema: FastifySchema, url: String): FastifyRouteSchemaDef = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyRouteSchemaDef]
    }
    
    @scala.inline
    implicit class FastifyRouteSchemaDefMutableBuilder[Self <: FastifyRouteSchemaDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpPart(value: String): Self = StObject.set(x, "httpPart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpPartUndefined: Self = StObject.set(x, "httpPart", js.undefined)
      
      @scala.inline
      def setHttpStatus(value: String): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: FastifySchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FastifySchema extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var querystring: js.UndefOr[js.Any] = js.native
    
    var response: js.UndefOr[js.Any] = js.native
  }
  object FastifySchema {
    
    @scala.inline
    def apply(): FastifySchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifySchema]
    }
    
    @scala.inline
    implicit class FastifySchemaMutableBuilder[Self <: FastifySchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuerystring(value: js.Any): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
      
      @scala.inline
      def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  type FastifySchemaCompiler = js.Function1[/* routeSchema */ FastifyRouteSchemaDef, FastifyValidationResult]
  
  @js.native
  trait FastifySchemaValidationError extends StObject {
    
    var dataPath: String = js.native
    
    var message: js.UndefOr[String] = js.native
  }
  object FastifySchemaValidationError {
    
    @scala.inline
    def apply(dataPath: String): FastifySchemaValidationError = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifySchemaValidationError]
    }
    
    @scala.inline
    implicit class FastifySchemaValidationErrorMutableBuilder[Self <: FastifySchemaValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait FastifyValidationResult extends StObject {
    
    var errors: js.UndefOr[js.Array[FastifySchemaValidationError] | Null] = js.native
  }
  object FastifyValidationResult {
    
    @scala.inline
    def apply(): FastifyValidationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyValidationResult]
    }
    
    @scala.inline
    implicit class FastifyValidationResultMutableBuilder[Self <: FastifyValidationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[FastifySchemaValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsNull: Self = StObject.set(x, "errors", null)
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: FastifySchemaValidationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
}
