package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowGridOverlaysRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `154` extends StObject {
  
  var paramsType: js.Array[SetShowGridOverlaysRequest]
  
  var returnType: Unit
}
object `154` {
  
  inline def apply(paramsType: js.Array[SetShowGridOverlaysRequest], returnType: Unit): `154` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`154`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `154`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowGridOverlaysRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowGridOverlaysRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
