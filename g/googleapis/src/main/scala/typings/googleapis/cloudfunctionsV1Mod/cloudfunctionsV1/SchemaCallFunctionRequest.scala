package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCallFunctionRequest extends StObject {
  
  /**
    * Required. Input to be passed to the function.
    */
  var data: js.UndefOr[String | Null] = js.undefined
}
object SchemaCallFunctionRequest {
  
  inline def apply(): SchemaCallFunctionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallFunctionRequest]
  }
  
  extension [Self <: SchemaCallFunctionRequest](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
