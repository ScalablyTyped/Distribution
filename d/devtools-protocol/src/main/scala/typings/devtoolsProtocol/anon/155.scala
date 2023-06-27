package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowFlexOverlaysRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var paramsType: js.Array[SetShowFlexOverlaysRequest]
  
  var returnType: Unit
}
object `155` {
  
  inline def apply(paramsType: js.Array[SetShowFlexOverlaysRequest], returnType: Unit): `155` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `155`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowFlexOverlaysRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowFlexOverlaysRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
