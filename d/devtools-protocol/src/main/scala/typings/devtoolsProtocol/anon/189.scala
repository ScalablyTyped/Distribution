package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Performance.SetTimeDomainRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  var paramsType: js.Array[SetTimeDomainRequest]
  
  var returnType: Unit
}
object `189` {
  
  inline def apply(paramsType: js.Array[SetTimeDomainRequest], returnType: Unit): `189` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`189`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `189`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetTimeDomainRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetTimeDomainRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
