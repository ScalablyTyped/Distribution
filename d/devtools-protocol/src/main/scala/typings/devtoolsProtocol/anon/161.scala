package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowHitTestBordersRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  var paramsType: js.Array[SetShowHitTestBordersRequest]
  
  var returnType: Unit
}
object `161` {
  
  inline def apply(paramsType: js.Array[SetShowHitTestBordersRequest], returnType: Unit): `161` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`161`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `161`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowHitTestBordersRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowHitTestBordersRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
