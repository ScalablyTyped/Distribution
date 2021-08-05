package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSocialIdResult extends StObject {
  
  /**
    * Contains properties that map a DocuSign user to a social account such as Facebook or Yahoo.
    */
  var socialAccountInformation: js.UndefOr[js.Array[SocialAccountInformation]] = js.undefined
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.undefined
}
object UserSocialIdResult {
  
  inline def apply(): UserSocialIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSocialIdResult]
  }
  
  extension [Self <: UserSocialIdResult](x: Self) {
    
    inline def setSocialAccountInformation(value: js.Array[SocialAccountInformation]): Self = StObject.set(x, "socialAccountInformation", value.asInstanceOf[js.Any])
    
    inline def setSocialAccountInformationUndefined: Self = StObject.set(x, "socialAccountInformation", js.undefined)
    
    inline def setSocialAccountInformationVarargs(value: SocialAccountInformation*): Self = StObject.set(x, "socialAccountInformation", js.Array(value :_*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
