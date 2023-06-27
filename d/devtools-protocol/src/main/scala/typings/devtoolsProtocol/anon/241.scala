package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Tethering.UnbindRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `241` extends StObject {
  
  var paramsType: js.Array[UnbindRequest]
  
  var returnType: Unit
}
object `241` {
  
  inline def apply(paramsType: js.Array[UnbindRequest], returnType: Unit): `241` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`241`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `241`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[UnbindRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: UnbindRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
