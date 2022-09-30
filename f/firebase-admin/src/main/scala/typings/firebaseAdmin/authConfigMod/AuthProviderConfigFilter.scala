package typings.firebaseAdmin.authConfigMod

import typings.firebaseAdmin.firebaseAdminStrings.oidc
import typings.firebaseAdmin.firebaseAdminStrings.saml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthProviderConfigFilter extends StObject {
  
  /**
    * The maximum number of results to return per page. The default and maximum is
    * 100.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The next page token. When not specified, the lookup starts from the beginning
    * of the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Auth provider configuration filter. This can be either `saml` or `oidc`.
    * The former is used to look up SAML providers only, while the latter is used
    * for OIDC providers.
    */
  var `type`: saml | oidc
}
object AuthProviderConfigFilter {
  
  inline def apply(`type`: saml | oidc): AuthProviderConfigFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProviderConfigFilter]
  }
  
  extension [Self <: AuthProviderConfigFilter](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setType(value: saml | oidc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
