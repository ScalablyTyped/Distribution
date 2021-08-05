package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetCertificateRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetCertificateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetCertificateResponse extends StObject {
  
  var paramsType: js.Array[GetCertificateRequest]
  
  var returnType: GetCertificateResponse
}
object ReturnTypeGetCertificateResponse {
  
  inline def apply(paramsType: js.Array[GetCertificateRequest], returnType: GetCertificateResponse): ReturnTypeGetCertificateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCertificateResponse]
  }
  
  extension [Self <: ReturnTypeGetCertificateResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetCertificateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetCertificateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetCertificateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
