package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.FedCm.DismissDialogRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `262` extends StObject {
  
  var paramsType: js.Array[DismissDialogRequest]
  
  var returnType: Unit
}
object `262` {
  
  inline def apply(paramsType: js.Array[DismissDialogRequest], returnType: Unit): `262` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`262`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `262`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DismissDialogRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DismissDialogRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
