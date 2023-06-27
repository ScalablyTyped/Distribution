package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.ContinueWithAuthRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `248` extends StObject {
  
  var paramsType: js.Array[ContinueWithAuthRequest]
  
  var returnType: Unit
}
object `248` {
  
  inline def apply(paramsType: js.Array[ContinueWithAuthRequest], returnType: Unit): `248` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`248`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `248`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ContinueWithAuthRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ContinueWithAuthRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
