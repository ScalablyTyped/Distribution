package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientUser extends StObject {
  
  /**
    * Required. The client user's email address that has to be unique across all users for the same client.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the client user. Format: `buyers/{accountId\}/clients/{clientAccountId\}/users/{userId\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the client user.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaClientUser {
  
  inline def apply(): SchemaClientUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUser]
  }
  
  extension [Self <: SchemaClientUser](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
