package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPasswordRules extends StObject {
  
  /**
    * Contains details about the password rules for the user.
    */
  var passwordRules: js.UndefOr[AccountPasswordRules] = js.undefined
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.undefined
}
object UserPasswordRules {
  
  inline def apply(): UserPasswordRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPasswordRules]
  }
  
  extension [Self <: UserPasswordRules](x: Self) {
    
    inline def setPasswordRules(value: AccountPasswordRules): Self = StObject.set(x, "passwordRules", value.asInstanceOf[js.Any])
    
    inline def setPasswordRulesUndefined: Self = StObject.set(x, "passwordRules", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
