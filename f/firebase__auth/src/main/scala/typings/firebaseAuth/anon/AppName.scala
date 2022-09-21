package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppName extends StObject {
  
  /** The name of the Firebase App which triggered this error.  */
  val appName: String
  
  /** The email address of the user's account, used for sign-in and linking. */
  val email: js.UndefOr[String] = js.undefined
  
  /** The phone number of the user's account, used for sign-in and linking. */
  val phoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The tenant ID being used for sign-in and linking.
    *
    * @remarks
    * If you use {@link signInWithRedirect} to sign in,
    * you have to set the tenant ID on the {@link Auth} instance again as the tenant ID is not persisted
    * after redirection.
    */
  val tenantId: js.UndefOr[String] = js.undefined
}
object AppName {
  
  inline def apply(appName: String): AppName = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppName]
  }
  
  extension [Self <: AppName](x: Self) {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
