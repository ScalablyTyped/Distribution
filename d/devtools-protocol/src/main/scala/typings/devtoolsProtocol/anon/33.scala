package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.BackgroundService.StopObservingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  var paramsType: js.Array[StopObservingRequest]
  
  var returnType: Unit
}
object `33` {
  
  inline def apply(paramsType: js.Array[StopObservingRequest], returnType: Unit): `33` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`33`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `33`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[StopObservingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: StopObservingRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
