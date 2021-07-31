package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.DispatchKeyEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var paramsType: js.Array[DispatchKeyEventRequest]
  
  var returnType: Unit
}
object `97` {
  
  @scala.inline
  def apply(paramsType: js.Array[DispatchKeyEventRequest], returnType: Unit): `97` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit class `97MutableBuilder`[Self <: `97`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DispatchKeyEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DispatchKeyEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
