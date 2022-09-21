package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.DisposeBrowserContextRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `220` extends StObject {
  
  var paramsType: js.Array[DisposeBrowserContextRequest]
  
  var returnType: Unit
}
object `220` {
  
  inline def apply(paramsType: js.Array[DisposeBrowserContextRequest], returnType: Unit): `220` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`220`]
  }
  
  extension [Self <: `220`](x: Self) {
    
    inline def setParamsType(value: js.Array[DisposeBrowserContextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DisposeBrowserContextRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
