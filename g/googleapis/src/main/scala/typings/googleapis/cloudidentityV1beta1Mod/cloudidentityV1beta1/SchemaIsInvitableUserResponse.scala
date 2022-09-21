package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIsInvitableUserResponse extends StObject {
  
  /**
    * Returns true if the email address is invitable.
    */
  var isInvitableUser: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaIsInvitableUserResponse {
  
  inline def apply(): SchemaIsInvitableUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIsInvitableUserResponse]
  }
  
  extension [Self <: SchemaIsInvitableUserResponse](x: Self) {
    
    inline def setIsInvitableUser(value: Boolean): Self = StObject.set(x, "isInvitableUser", value.asInstanceOf[js.Any])
    
    inline def setIsInvitableUserNull: Self = StObject.set(x, "isInvitableUser", null)
    
    inline def setIsInvitableUserUndefined: Self = StObject.set(x, "isInvitableUser", js.undefined)
  }
}
