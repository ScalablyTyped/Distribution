package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetEffectivePropertyValueForNodeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var paramsType: js.Array[SetEffectivePropertyValueForNodeRequest]
  
  var returnType: Unit
}
object `41` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetEffectivePropertyValueForNodeRequest], returnType: Unit): `41` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit class `41MutableBuilder`[Self <: `41`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetEffectivePropertyValueForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetEffectivePropertyValueForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
