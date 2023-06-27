package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.DisposeBrowserContextRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  var paramsType: js.Array[DisposeBrowserContextRequest]
  
  var returnType: Unit
}
object `234` {
  
  inline def apply(paramsType: js.Array[DisposeBrowserContextRequest], returnType: Unit): `234` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`234`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `234`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DisposeBrowserContextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DisposeBrowserContextRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
