package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetEmulatedVisionDeficiencyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  var paramsType: js.Array[SetEmulatedVisionDeficiencyRequest]
  
  var returnType: Unit
}
object `94` {
  
  inline def apply(paramsType: js.Array[SetEmulatedVisionDeficiencyRequest], returnType: Unit): `94` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`94`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `94`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetEmulatedVisionDeficiencyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetEmulatedVisionDeficiencyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
