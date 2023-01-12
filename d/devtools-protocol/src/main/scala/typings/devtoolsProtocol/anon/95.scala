package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetPageScaleFactorRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var paramsType: js.Array[SetPageScaleFactorRequest]
  
  var returnType: Unit
}
object `95` {
  
  inline def apply(paramsType: js.Array[SetPageScaleFactorRequest], returnType: Unit): `95` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`95`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `95`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetPageScaleFactorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetPageScaleFactorRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
