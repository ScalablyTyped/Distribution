package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.DispatchTouchEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var paramsType: js.Array[DispatchTouchEventRequest]
  
  var returnType: Unit
}
object `100` {
  
  @scala.inline
  def apply(paramsType: js.Array[DispatchTouchEventRequest], returnType: Unit): `100` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit class `100MutableBuilder`[Self <: `100`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DispatchTouchEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DispatchTouchEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
