package typings.firebaseAdmin.anon

import typings.firebaseAdmin.libAuthTenantMod.TenantServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextPageToken extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var tenants: js.Array[TenantServerResponse]
}
object NextPageToken {
  
  inline def apply(tenants: js.Array[TenantServerResponse]): NextPageToken = {
    val __obj = js.Dynamic.literal(tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPageToken]
  }
  
  extension [Self <: NextPageToken](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTenants(value: js.Array[TenantServerResponse]): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
    
    inline def setTenantsVarargs(value: TenantServerResponse*): Self = StObject.set(x, "tenants", js.Array(value*))
  }
}
