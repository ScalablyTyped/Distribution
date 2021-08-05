package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.InsertTextRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98` extends StObject {
  
  var paramsType: js.Array[InsertTextRequest]
  
  var returnType: Unit
}
object `98` {
  
  inline def apply(paramsType: js.Array[InsertTextRequest], returnType: Unit): `98` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`98`]
  }
  
  extension [Self <: `98`](x: Self) {
    
    inline def setParamsType(value: js.Array[InsertTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: InsertTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
