package typings.googleapis.cloudfunctionsV1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCallFunctionResponse extends StObject {
  
  /**
    * Either system or user-function generated error. Set if execution was not successful.
    */
  var error: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Execution id of function invocation.
    */
  var executionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Result populated for successful execution of synchronous function. Will not be populated if function does not return a result through context.
    */
  var result: js.UndefOr[String | Null] = js.undefined
}
object SchemaCallFunctionResponse {
  
  inline def apply(): SchemaCallFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallFunctionResponse]
  }
  
  extension [Self <: SchemaCallFunctionResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdNull: Self = StObject.set(x, "executionId", null)
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
