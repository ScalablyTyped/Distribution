package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInviteeInfo extends StObject {
  
  /**
    * Email as typed by the user when invited to Room or DM. This value will be canonicalized and hashed before retained in storage.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique, immutable ID of the User.
    */
  var userId: js.UndefOr[SchemaUserId] = js.undefined
}
object SchemaInviteeInfo {
  
  inline def apply(): SchemaInviteeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInviteeInfo]
  }
  
  extension [Self <: SchemaInviteeInfo](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setUserId(value: SchemaUserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
