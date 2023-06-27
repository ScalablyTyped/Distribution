package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Autofill.SetAddressesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var paramsType: js.Array[SetAddressesRequest]
  
  var returnType: Unit
}
object `31` {
  
  inline def apply(paramsType: js.Array[SetAddressesRequest], returnType: Unit): `31` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetAddressesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetAddressesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
