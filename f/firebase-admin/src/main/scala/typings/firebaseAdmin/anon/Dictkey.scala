package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Provider-specific identity details corresponding
    * to the provider used to sign in the user.
    */
  var identities: StringDictionary[Any]
  
  /**
    * The `uid` of the second factor used to sign in, provided the
    * ID token was obtained from a multi-factor authenticated user.
    */
  var second_factor_identifier: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the provider used to sign in the user.
    * One of `"anonymous"`, `"password"`, `"facebook.com"`, `"github.com"`,
    * `"google.com"`, `"twitter.com"`, `"apple.com"`, `"microsoft.com"`,
    * `"yahoo.com"`, `"phone"`, `"playgames.google.com"`, `"gc.apple.com"`,
    * or `"custom"`.
    *
    * Additional Identity Platform provider IDs include `"linkedin.com"`,
    * OIDC and SAML identity providers prefixed with `"saml."` and `"oidc."`
    * respectively.
    */
  var sign_in_provider: String
  
  /**
    * The type identifier or `factorId` of the second factor, provided the
    * ID token was obtained from a multi-factor authenticated user.
    * For phone, this is `"phone"`.
    */
  var sign_in_second_factor: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the tenant the user belongs to, if available.
    */
  var tenant: js.UndefOr[String] = js.undefined
}
object Dictkey {
  
  inline def apply(identities: StringDictionary[Any], sign_in_provider: String): Dictkey = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setIdentities(value: StringDictionary[Any]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setSecond_factor_identifier(value: String): Self = StObject.set(x, "second_factor_identifier", value.asInstanceOf[js.Any])
    
    inline def setSecond_factor_identifierUndefined: Self = StObject.set(x, "second_factor_identifier", js.undefined)
    
    inline def setSign_in_provider(value: String): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
    
    inline def setSign_in_second_factor(value: String): Self = StObject.set(x, "sign_in_second_factor", value.asInstanceOf[js.Any])
    
    inline def setSign_in_second_factorUndefined: Self = StObject.set(x, "sign_in_second_factor", js.undefined)
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
  }
}
