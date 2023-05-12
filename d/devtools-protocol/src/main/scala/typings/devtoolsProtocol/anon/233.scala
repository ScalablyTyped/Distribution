package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.SetAutoAttachRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  var paramsType: js.Array[SetAutoAttachRequest]
  
  var returnType: Unit
}
object `233` {
  
  inline def apply(paramsType: js.Array[SetAutoAttachRequest], returnType: Unit): `233` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`233`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `233`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetAutoAttachRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetAutoAttachRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
