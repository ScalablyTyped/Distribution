package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.ForcePseudoStateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var paramsType: js.Array[ForcePseudoStateRequest]
  
  var returnType: Unit
}
object `39` {
  
  @scala.inline
  def apply(paramsType: js.Array[ForcePseudoStateRequest], returnType: Unit): `39` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit class `39MutableBuilder`[Self <: `39`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ForcePseudoStateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ForcePseudoStateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
