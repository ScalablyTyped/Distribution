package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetAdBlockingEnabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171` extends StObject {
  
  var paramsType: js.Array[SetAdBlockingEnabledRequest]
  
  var returnType: Unit
}
object `171` {
  
  inline def apply(paramsType: js.Array[SetAdBlockingEnabledRequest], returnType: Unit): `171` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`171`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `171`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetAdBlockingEnabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetAdBlockingEnabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
