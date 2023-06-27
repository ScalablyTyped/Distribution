package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetTimezoneOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `102` extends StObject {
  
  var paramsType: js.Array[SetTimezoneOverrideRequest]
  
  var returnType: Unit
}
object `102` {
  
  inline def apply(paramsType: js.Array[SetTimezoneOverrideRequest], returnType: Unit): `102` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`102`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `102`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetTimezoneOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetTimezoneOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
