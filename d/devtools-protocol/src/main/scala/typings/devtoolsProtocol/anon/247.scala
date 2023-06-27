package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.ContinueRequestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `247` extends StObject {
  
  var paramsType: js.Array[ContinueRequestRequest]
  
  var returnType: Unit
}
object `247` {
  
  inline def apply(paramsType: js.Array[ContinueRequestRequest], returnType: Unit): `247` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`247`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `247`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ContinueRequestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ContinueRequestRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
