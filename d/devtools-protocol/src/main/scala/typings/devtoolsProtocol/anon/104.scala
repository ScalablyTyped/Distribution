package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetDisabledImageTypesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  var paramsType: js.Array[SetDisabledImageTypesRequest]
  
  var returnType: Unit
}
object `104` {
  
  inline def apply(paramsType: js.Array[SetDisabledImageTypesRequest], returnType: Unit): `104` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`104`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `104`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetDisabledImageTypesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDisabledImageTypesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
