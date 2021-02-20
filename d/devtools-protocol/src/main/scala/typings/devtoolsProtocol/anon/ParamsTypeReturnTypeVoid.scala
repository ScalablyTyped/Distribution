package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.RemoveBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsTypeReturnTypeVoid extends StObject {
  
  var paramsType: js.Array[RemoveBreakpointRequest] = js.native
  
  var returnType: Unit = js.native
}
object ParamsTypeReturnTypeVoid {
  
  @scala.inline
  def apply(paramsType: js.Array[RemoveBreakpointRequest], returnType: Unit): ParamsTypeReturnTypeVoid = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnTypeVoid]
  }
  
  @scala.inline
  implicit class ParamsTypeReturnTypeVoidMutableBuilder[Self <: ParamsTypeReturnTypeVoid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RemoveBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RemoveBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
