package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.ReleaseObjectGroupRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var paramsType: js.Array[ReleaseObjectGroupRequest]
  
  var returnType: Unit
}
object `18` {
  
  inline def apply(paramsType: js.Array[ReleaseObjectGroupRequest], returnType: Unit): `18` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ReleaseObjectGroupRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ReleaseObjectGroupRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
