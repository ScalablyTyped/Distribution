package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.InspectWorkerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `174` extends StObject {
  
  var paramsType: js.Array[InspectWorkerRequest] = js.native
  
  var returnType: Unit = js.native
}
object `174` {
  
  @scala.inline
  def apply(paramsType: js.Array[InspectWorkerRequest], returnType: Unit): `174` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`174`]
  }
  
  @scala.inline
  implicit class `174MutableBuilder`[Self <: `174`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[InspectWorkerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: InspectWorkerRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
