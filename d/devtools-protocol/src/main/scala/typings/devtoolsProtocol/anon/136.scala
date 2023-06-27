package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SetBypassServiceWorkerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  var paramsType: js.Array[SetBypassServiceWorkerRequest]
  
  var returnType: Unit
}
object `136` {
  
  inline def apply(paramsType: js.Array[SetBypassServiceWorkerRequest], returnType: Unit): `136` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`136`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `136`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetBypassServiceWorkerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetBypassServiceWorkerRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
