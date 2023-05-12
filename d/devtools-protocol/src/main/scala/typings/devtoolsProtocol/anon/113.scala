package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.ImeSetCompositionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var paramsType: js.Array[ImeSetCompositionRequest]
  
  var returnType: Unit
}
object `113` {
  
  inline def apply(paramsType: js.Array[ImeSetCompositionRequest], returnType: Unit): `113` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `113`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ImeSetCompositionRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ImeSetCompositionRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
