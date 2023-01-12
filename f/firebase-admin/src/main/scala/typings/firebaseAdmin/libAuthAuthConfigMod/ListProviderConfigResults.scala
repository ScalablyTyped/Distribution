package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProviderConfigResults extends StObject {
  
  /**
    * The next page token, if available.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of providers for the specified type in the current page.
    */
  var providerConfigs: js.Array[AuthProviderConfig]
}
object ListProviderConfigResults {
  
  inline def apply(providerConfigs: js.Array[AuthProviderConfig]): ListProviderConfigResults = {
    val __obj = js.Dynamic.literal(providerConfigs = providerConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProviderConfigResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProviderConfigResults] (val x: Self) extends AnyVal {
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProviderConfigs(value: js.Array[AuthProviderConfig]): Self = StObject.set(x, "providerConfigs", value.asInstanceOf[js.Any])
    
    inline def setProviderConfigsVarargs(value: AuthProviderConfig*): Self = StObject.set(x, "providerConfigs", js.Array(value*))
  }
}
