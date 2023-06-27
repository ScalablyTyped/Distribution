package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.SetForceUpdateOnPageLoadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  var paramsType: js.Array[SetForceUpdateOnPageLoadRequest]
  
  var returnType: Unit
}
object `203` {
  
  inline def apply(paramsType: js.Array[SetForceUpdateOnPageLoadRequest], returnType: Unit): `203` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`203`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `203`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetForceUpdateOnPageLoadRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetForceUpdateOnPageLoadRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
