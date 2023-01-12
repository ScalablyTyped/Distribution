package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.GetInterestGroupDetailsRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetInterestGroupDetailsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetInterestGroupDetailsResponse extends StObject {
  
  var paramsType: js.Array[GetInterestGroupDetailsRequest]
  
  var returnType: GetInterestGroupDetailsResponse
}
object ReturnTypeGetInterestGroupDetailsResponse {
  
  inline def apply(paramsType: js.Array[GetInterestGroupDetailsRequest], returnType: GetInterestGroupDetailsResponse): ReturnTypeGetInterestGroupDetailsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetInterestGroupDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetInterestGroupDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetInterestGroupDetailsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetInterestGroupDetailsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetInterestGroupDetailsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
