package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetServiceAccountResponse extends StObject {
  
  /**
    * The service account email address.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetServiceAccountResponse {
  
  inline def apply(): SchemaGetServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetServiceAccountResponse]
  }
  
  extension [Self <: SchemaGetServiceAccountResponse](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
