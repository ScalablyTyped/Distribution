package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetEffectivePropertyValueForNodeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var paramsType: js.Array[SetEffectivePropertyValueForNodeRequest]
  
  var returnType: Unit
}
object `47` {
  
  inline def apply(paramsType: js.Array[SetEffectivePropertyValueForNodeRequest], returnType: Unit): `47` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`47`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `47`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetEffectivePropertyValueForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetEffectivePropertyValueForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
