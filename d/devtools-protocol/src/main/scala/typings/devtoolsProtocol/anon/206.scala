package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.StopWorkerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  var paramsType: js.Array[StopWorkerRequest]
  
  var returnType: Unit
}
object `206` {
  
  inline def apply(paramsType: js.Array[StopWorkerRequest], returnType: Unit): `206` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`206`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `206`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[StopWorkerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: StopWorkerRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
