package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.HandleJavaScriptDialogRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `165` extends StObject {
  
  var paramsType: js.Array[HandleJavaScriptDialogRequest]
  
  var returnType: Unit
}
object `165` {
  
  inline def apply(paramsType: js.Array[HandleJavaScriptDialogRequest], returnType: Unit): `165` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`165`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `165`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[HandleJavaScriptDialogRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: HandleJavaScriptDialogRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
