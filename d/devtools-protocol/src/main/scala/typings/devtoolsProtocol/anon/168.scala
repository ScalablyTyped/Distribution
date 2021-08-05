package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Security.SetIgnoreCertificateErrorsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var paramsType: js.Array[SetIgnoreCertificateErrorsRequest]
  
  var returnType: Unit
}
object `168` {
  
  inline def apply(paramsType: js.Array[SetIgnoreCertificateErrorsRequest], returnType: Unit): `168` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`168`]
  }
  
  extension [Self <: `168`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetIgnoreCertificateErrorsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetIgnoreCertificateErrorsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
