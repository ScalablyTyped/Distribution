package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Cast.StopCastingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var paramsType: js.Array[StopCastingRequest]
  
  var returnType: Unit
}
object `48` {
  
  @scala.inline
  def apply(paramsType: js.Array[StopCastingRequest], returnType: Unit): `48` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit class `48MutableBuilder`[Self <: `48`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[StopCastingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: StopCastingRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
