package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.SetDiscoverTargetsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  var paramsType: js.Array[SetDiscoverTargetsRequest]
  
  var returnType: Unit
}
object `196` {
  
  inline def apply(paramsType: js.Array[SetDiscoverTargetsRequest], returnType: Unit): `196` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`196`]
  }
  
  extension [Self <: `196`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetDiscoverTargetsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDiscoverTargetsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
