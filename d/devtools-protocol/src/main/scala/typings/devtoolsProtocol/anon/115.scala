package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.ImeSetCompositionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  var paramsType: js.Array[ImeSetCompositionRequest]
  
  var returnType: Unit
}
object `115` {
  
  inline def apply(paramsType: js.Array[ImeSetCompositionRequest], returnType: Unit): `115` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `115`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ImeSetCompositionRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ImeSetCompositionRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
