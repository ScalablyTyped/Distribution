package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Security.HandleCertificateErrorRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `197` extends StObject {
  
  var paramsType: js.Array[HandleCertificateErrorRequest]
  
  var returnType: Unit
}
object `197` {
  
  inline def apply(paramsType: js.Array[HandleCertificateErrorRequest], returnType: Unit): `197` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`197`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `197`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[HandleCertificateErrorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: HandleCertificateErrorRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
