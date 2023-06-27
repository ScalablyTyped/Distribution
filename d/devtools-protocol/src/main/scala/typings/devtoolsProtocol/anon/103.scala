package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetVisibleSizeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  var paramsType: js.Array[SetVisibleSizeRequest]
  
  var returnType: Unit
}
object `103` {
  
  inline def apply(paramsType: js.Array[SetVisibleSizeRequest], returnType: Unit): `103` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `103`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetVisibleSizeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetVisibleSizeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
