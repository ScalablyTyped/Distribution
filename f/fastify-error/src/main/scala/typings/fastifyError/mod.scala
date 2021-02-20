package typings.fastifyError

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastify-error", JSImport.Default)
  @js.native
  def default(code: String, message: String): FastifyError = js.native
  @JSImport("fastify-error", JSImport.Default)
  @js.native
  def default(code: String, message: String, statusCode: js.UndefOr[scala.Nothing], Base: Error): FastifyError = js.native
  @JSImport("fastify-error", JSImport.Default)
  @js.native
  def default(code: String, message: String, statusCode: Double): FastifyError = js.native
  @JSImport("fastify-error", JSImport.Default)
  @js.native
  def default(code: String, message: String, statusCode: Double, Base: Error): FastifyError = js.native
  
  @js.native
  trait FastifyError extends Error {
    
    var code: String = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
    
    var validation: js.UndefOr[js.Array[ValidationResult]] = js.native
  }
  object FastifyError {
    
    @scala.inline
    def apply(code: String, message: String, name: String): FastifyError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyError]
    }
    
    @scala.inline
    implicit class FastifyErrorMutableBuilder[Self <: FastifyError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setValidation(value: js.Array[ValidationResult]): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
      
      @scala.inline
      def setValidationVarargs(value: ValidationResult*): Self = StObject.set(x, "validation", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ValidationResult extends StObject {
    
    var dataPath: String = js.native
    
    var keyword: String = js.native
    
    var message: String = js.native
    
    var params: Record[String, String | js.Array[String]] = js.native
    
    var schemaPath: String = js.native
  }
  object ValidationResult {
    
    @scala.inline
    def apply(
      dataPath: String,
      keyword: String,
      message: String,
      params: Record[String, String | js.Array[String]],
      schemaPath: String
    ): ValidationResult = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResult]
    }
    
    @scala.inline
    implicit class ValidationResultMutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
    }
  }
}
