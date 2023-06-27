package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IO.CloseRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  var paramsType: js.Array[CloseRequest]
  
  var returnType: Unit
}
object `108` {
  
  inline def apply(paramsType: js.Array[CloseRequest], returnType: Unit): `108` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`108`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `108`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[CloseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CloseRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
