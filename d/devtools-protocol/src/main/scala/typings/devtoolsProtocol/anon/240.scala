package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Tethering.BindRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `240` extends StObject {
  
  var paramsType: js.Array[BindRequest]
  
  var returnType: Unit
}
object `240` {
  
  inline def apply(paramsType: js.Array[BindRequest], returnType: Unit): `240` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`240`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `240`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[BindRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: BindRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
