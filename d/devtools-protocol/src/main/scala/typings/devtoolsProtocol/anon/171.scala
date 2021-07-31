package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DeliverPushMessageRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171` extends StObject {
  
  var paramsType: js.Array[DeliverPushMessageRequest]
  
  var returnType: Unit
}
object `171` {
  
  @scala.inline
  def apply(paramsType: js.Array[DeliverPushMessageRequest], returnType: Unit): `171` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`171`]
  }
  
  @scala.inline
  implicit class `171MutableBuilder`[Self <: `171`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DeliverPushMessageRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DeliverPushMessageRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
