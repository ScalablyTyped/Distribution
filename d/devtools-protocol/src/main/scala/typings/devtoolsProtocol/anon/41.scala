package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.ExecuteBrowserCommandRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var paramsType: js.Array[ExecuteBrowserCommandRequest]
  
  var returnType: Unit
}
object `41` {
  
  inline def apply(paramsType: js.Array[ExecuteBrowserCommandRequest], returnType: Unit): `41` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setParamsType(value: js.Array[ExecuteBrowserCommandRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ExecuteBrowserCommandRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
