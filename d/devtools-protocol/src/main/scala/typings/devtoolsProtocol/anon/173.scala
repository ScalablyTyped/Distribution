package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DispatchPeriodicSyncEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  var paramsType: js.Array[DispatchPeriodicSyncEventRequest]
  
  var returnType: Unit
}
object `173` {
  
  inline def apply(paramsType: js.Array[DispatchPeriodicSyncEventRequest], returnType: Unit): `173` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`173`]
  }
  
  extension [Self <: `173`](x: Self) {
    
    inline def setParamsType(value: js.Array[DispatchPeriodicSyncEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DispatchPeriodicSyncEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
