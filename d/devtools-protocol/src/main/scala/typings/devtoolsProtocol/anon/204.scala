package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.SkipWaitingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  var paramsType: js.Array[SkipWaitingRequest]
  
  var returnType: Unit
}
object `204` {
  
  inline def apply(paramsType: js.Array[SkipWaitingRequest], returnType: Unit): `204` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `204`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SkipWaitingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SkipWaitingRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
