package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetPauseOnExceptionsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var paramsType: js.Array[SetPauseOnExceptionsRequest]
  
  var returnType: Unit
}
object `5` {
  
  inline def apply(paramsType: js.Array[SetPauseOnExceptionsRequest], returnType: Unit): `5` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetPauseOnExceptionsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetPauseOnExceptionsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
