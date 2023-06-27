package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Cast.StopCastingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  var paramsType: js.Array[StopCastingRequest]
  
  var returnType: Unit
}
object `55` {
  
  inline def apply(paramsType: js.Array[StopCastingRequest], returnType: Unit): `55` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`55`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `55`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[StopCastingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: StopCastingRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
