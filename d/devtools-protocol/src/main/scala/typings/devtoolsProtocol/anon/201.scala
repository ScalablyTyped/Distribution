package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DispatchPeriodicSyncEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  var paramsType: js.Array[DispatchPeriodicSyncEventRequest]
  
  var returnType: Unit
}
object `201` {
  
  inline def apply(paramsType: js.Array[DispatchPeriodicSyncEventRequest], returnType: Unit): `201` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DispatchPeriodicSyncEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DispatchPeriodicSyncEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
