package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveXHRBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `65` extends StObject {
  
  var paramsType: js.Array[RemoveXHRBreakpointRequest] = js.native
  
  var returnType: Unit = js.native
}
object `65` {
  
  @scala.inline
  def apply(paramsType: js.Array[RemoveXHRBreakpointRequest], returnType: Unit): `65` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`65`]
  }
  
  @scala.inline
  implicit class `65MutableBuilder`[Self <: `65`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RemoveXHRBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RemoveXHRBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
