package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesRequest
import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetDatabaseTableNamesResponse extends StObject {
  
  var paramsType: js.Array[GetDatabaseTableNamesRequest]
  
  var returnType: GetDatabaseTableNamesResponse
}
object ReturnTypeGetDatabaseTableNamesResponse {
  
  inline def apply(paramsType: js.Array[GetDatabaseTableNamesRequest], returnType: GetDatabaseTableNamesResponse): ReturnTypeGetDatabaseTableNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDatabaseTableNamesResponse]
  }
  
  extension [Self <: ReturnTypeGetDatabaseTableNamesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetDatabaseTableNamesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetDatabaseTableNamesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetDatabaseTableNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
