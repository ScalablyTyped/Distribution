package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.SetInterceptDragsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  var paramsType: js.Array[SetInterceptDragsRequest]
  
  var returnType: Unit
}
object `120` {
  
  inline def apply(paramsType: js.Array[SetInterceptDragsRequest], returnType: Unit): `120` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`120`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `120`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetInterceptDragsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetInterceptDragsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
