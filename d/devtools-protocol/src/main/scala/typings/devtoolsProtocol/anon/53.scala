package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Cast.StartDesktopMirroringRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var paramsType: js.Array[StartDesktopMirroringRequest]
  
  var returnType: Unit
}
object `53` {
  
  inline def apply(paramsType: js.Array[StartDesktopMirroringRequest], returnType: Unit): `53` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`53`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `53`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[StartDesktopMirroringRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: StartDesktopMirroringRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
