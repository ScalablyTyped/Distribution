package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Cast.SetSinkToUseRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  var paramsType: js.Array[SetSinkToUseRequest]
  
  var returnType: Unit
}
object `52` {
  
  inline def apply(paramsType: js.Array[SetSinkToUseRequest], returnType: Unit): `52` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`52`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `52`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetSinkToUseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetSinkToUseRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
