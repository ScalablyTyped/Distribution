package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DispatchSyncEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `172` extends StObject {
  
  var paramsType: js.Array[DispatchSyncEventRequest] = js.native
  
  var returnType: Unit = js.native
}
object `172` {
  
  @scala.inline
  def apply(paramsType: js.Array[DispatchSyncEventRequest], returnType: Unit): `172` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`172`]
  }
  
  @scala.inline
  implicit class `172MutableBuilder`[Self <: `172`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DispatchSyncEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DispatchSyncEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
