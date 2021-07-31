package typings.firebaseAdmin.authMod.auth

import typings.firebaseAdmin.firebaseAdminStrings.oidc
import typings.firebaseAdmin.firebaseAdminStrings.saml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The filter interface used for listing provider configurations. This is used
  * when specifying how to list configured identity providers via
  * {@link auth.Auth.listProviderConfigs `listProviderConfigs()`}.
  */
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
  
  @scala.inline
  def apply(`type`: saml | oidc): AuthProviderConfigFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProviderConfigFilter]
  }
  
  @scala.inline
  implicit class AuthProviderConfigFilterMutableBuilder[Self <: AuthProviderConfigFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setType(value: saml | oidc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
