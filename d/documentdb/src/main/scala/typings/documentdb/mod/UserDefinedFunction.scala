package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedFunction
  extends StObject
     with UserScriptable {
  
  /** Type of function */
  var userDefinedFunctionType: js.UndefOr[UserDefinedFunctionType] = js.undefined
}
object UserDefinedFunction {
  
  inline def apply(id: String): UserDefinedFunction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunction]
  }
  
  extension [Self <: UserDefinedFunction](x: Self) {
    
    inline def setUserDefinedFunctionType(value: UserDefinedFunctionType): Self = StObject.set(x, "userDefinedFunctionType", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFunctionTypeUndefined: Self = StObject.set(x, "userDefinedFunctionType", js.undefined)
  }
}
