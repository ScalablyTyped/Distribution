package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.StartWorkerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `177` extends StObject {
  
  var paramsType: js.Array[StartWorkerRequest] = js.native
  
  var returnType: Unit = js.native
}
object `177` {
  
  @scala.inline
  def apply(paramsType: js.Array[StartWorkerRequest], returnType: Unit): `177` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`177`]
  }
  
  @scala.inline
  implicit class `177MutableBuilder`[Self <: `177`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[StartWorkerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: StartWorkerRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
