package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveEventListenerBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  var paramsType: js.Array[RemoveEventListenerBreakpointRequest]
  
  var returnType: Unit
}
object `63` {
  
  @scala.inline
  def apply(paramsType: js.Array[RemoveEventListenerBreakpointRequest], returnType: Unit): `63` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`63`]
  }
  
  @scala.inline
  implicit class `63MutableBuilder`[Self <: `63`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RemoveEventListenerBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RemoveEventListenerBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
