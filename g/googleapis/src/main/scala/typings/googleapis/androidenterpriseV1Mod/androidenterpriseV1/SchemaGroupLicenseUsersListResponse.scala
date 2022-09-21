package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupLicenseUsersListResponse extends StObject {
  
  /**
    * A user of an enterprise.
    */
  var user: js.UndefOr[js.Array[SchemaUser]] = js.undefined
}
object SchemaGroupLicenseUsersListResponse {
  
  inline def apply(): SchemaGroupLicenseUsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLicenseUsersListResponse]
  }
  
  extension [Self <: SchemaGroupLicenseUsersListResponse](x: Self) {
    
    inline def setUser(value: js.Array[SchemaUser]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUserVarargs(value: SchemaUser*): Self = StObject.set(x, "user", js.Array(value*))
  }
}
