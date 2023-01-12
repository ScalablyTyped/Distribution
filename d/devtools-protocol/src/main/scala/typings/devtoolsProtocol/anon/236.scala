package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.FulfillRequestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `236` extends StObject {
  
  var paramsType: js.Array[FulfillRequestRequest]
  
  var returnType: Unit
}
object `236` {
  
  inline def apply(paramsType: js.Array[FulfillRequestRequest], returnType: Unit): `236` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`236`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `236`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[FulfillRequestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: FulfillRequestRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
