package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DeliverPushMessageRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  var paramsType: js.Array[DeliverPushMessageRequest]
  
  var returnType: Unit
}
object `199` {
  
  inline def apply(paramsType: js.Array[DeliverPushMessageRequest], returnType: Unit): `199` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`199`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `199`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DeliverPushMessageRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeliverPushMessageRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
