package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.StopWorkerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `178` extends StObject {
  
  var paramsType: js.Array[StopWorkerRequest]
  
  var returnType: Unit
}
object `178` {
  
  @scala.inline
  def apply(paramsType: js.Array[StopWorkerRequest], returnType: Unit): `178` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`178`]
  }
  
  @scala.inline
  implicit class `178MutableBuilder`[Self <: `178`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[StopWorkerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: StopWorkerRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
