package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.OverrideQuotaForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214` extends StObject {
  
  var paramsType: js.Array[OverrideQuotaForOriginRequest]
  
  var returnType: Unit
}
object `214` {
  
  inline def apply(paramsType: js.Array[OverrideQuotaForOriginRequest], returnType: Unit): `214` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`214`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `214`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[OverrideQuotaForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: OverrideQuotaForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
