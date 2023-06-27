package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.ResetSharedStorageBudgetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227` extends StObject {
  
  var paramsType: js.Array[ResetSharedStorageBudgetRequest]
  
  var returnType: Unit
}
object `227` {
  
  inline def apply(paramsType: js.Array[ResetSharedStorageBudgetRequest], returnType: Unit): `227` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`227`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `227`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ResetSharedStorageBudgetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ResetSharedStorageBudgetRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
