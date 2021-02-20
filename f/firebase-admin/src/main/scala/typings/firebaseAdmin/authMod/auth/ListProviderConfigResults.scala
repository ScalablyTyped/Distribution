package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response interface for listing provider configs. This is only available
  * when listing all identity providers' configurations via
  * {@link auth.Auth.listProviderConfigs `listProviderConfigs()`}.
  */
@js.native
trait ListProviderConfigResults extends StObject {
  
  /**
    * The next page token, if available.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of providers for the specified type in the current page.
    */
  var providerConfigs: js.Array[AuthProviderConfig] = js.native
}
object ListProviderConfigResults {
  
  @scala.inline
  def apply(providerConfigs: js.Array[AuthProviderConfig]): ListProviderConfigResults = {
    val __obj = js.Dynamic.literal(providerConfigs = providerConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProviderConfigResults]
  }
  
  @scala.inline
  implicit class ListProviderConfigResultsMutableBuilder[Self <: ListProviderConfigResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProviderConfigs(value: js.Array[AuthProviderConfig]): Self = StObject.set(x, "providerConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderConfigsVarargs(value: AuthProviderConfig*): Self = StObject.set(x, "providerConfigs", js.Array(value :_*))
  }
}
