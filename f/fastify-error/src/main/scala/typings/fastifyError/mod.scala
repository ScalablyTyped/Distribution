package typings.fastifyError

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastify-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(code: String, message: String): FastifyError = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[FastifyError]
  inline def default(code: String, message: String, statusCode: Double): FastifyError = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[FastifyError]
  inline def default(code: String, message: String, statusCode: Double, Base: Error): FastifyError = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any], Base.asInstanceOf[js.Any])).asInstanceOf[FastifyError]
  inline def default(code: String, message: String, statusCode: Unit, Base: Error): FastifyError = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any], Base.asInstanceOf[js.Any])).asInstanceOf[FastifyError]
  
  trait FastifyError
    extends StObject
       with Error {
    
    var code: String
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    var validation: js.UndefOr[js.Array[ValidationResult]] = js.undefined
  }
  object FastifyError {
    
    inline def apply(code: String, message: String, name: String): FastifyError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyError]
    }
    
    extension [Self <: FastifyError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setValidation(value: js.Array[ValidationResult]): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
      
      inline def setValidationVarargs(value: ValidationResult*): Self = StObject.set(x, "validation", js.Array(value :_*))
    }
  }
  
  trait ValidationResult extends StObject {
    
    var dataPath: String
    
    var keyword: String
    
    var message: String
    
    var params: Record[String, String | js.Array[String]]
    
    var schemaPath: String
  }
  object ValidationResult {
    
    inline def apply(
      dataPath: String,
      keyword: String,
      message: String,
      params: Record[String, String | js.Array[String]],
      schemaPath: String
    ): ValidationResult = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResult]
    }
    
    extension [Self <: ValidationResult](x: Self) {
      
      inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
    }
  }
}
