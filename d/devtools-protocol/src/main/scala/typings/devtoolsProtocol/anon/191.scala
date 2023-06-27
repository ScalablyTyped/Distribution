package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetInterceptFileChooserDialogRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var paramsType: js.Array[SetInterceptFileChooserDialogRequest]
  
  var returnType: Unit
}
object `191` {
  
  inline def apply(paramsType: js.Array[SetInterceptFileChooserDialogRequest], returnType: Unit): `191` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`191`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `191`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetInterceptFileChooserDialogRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetInterceptFileChooserDialogRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
