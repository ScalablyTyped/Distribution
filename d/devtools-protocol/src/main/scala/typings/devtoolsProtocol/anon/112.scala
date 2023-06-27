package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.DispatchDragEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  var paramsType: js.Array[DispatchDragEventRequest]
  
  var returnType: Unit
}
object `112` {
  
  inline def apply(paramsType: js.Array[DispatchDragEventRequest], returnType: Unit): `112` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `112`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DispatchDragEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DispatchDragEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
