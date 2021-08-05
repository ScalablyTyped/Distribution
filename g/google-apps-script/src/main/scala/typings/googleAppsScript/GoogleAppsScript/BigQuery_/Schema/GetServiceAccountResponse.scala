package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceAccountResponse extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object GetServiceAccountResponse {
  
  inline def apply(): GetServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceAccountResponse]
  }
  
  extension [Self <: GetServiceAccountResponse](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
