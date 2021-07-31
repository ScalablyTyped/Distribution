package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetScriptExecutionDisabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  var paramsType: js.Array[SetScriptExecutionDisabledRequest]
  
  var returnType: Unit
}
object `87` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetScriptExecutionDisabledRequest], returnType: Unit): `87` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit class `87MutableBuilder`[Self <: `87`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetScriptExecutionDisabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetScriptExecutionDisabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
