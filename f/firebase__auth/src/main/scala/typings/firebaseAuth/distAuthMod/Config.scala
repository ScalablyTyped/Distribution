package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  /**
    * The host at which the Firebase Auth backend is running.
    */
  var apiHost: String
  
  /**
    * The API Key used to communicate with the Firebase Auth backend.
    */
  var apiKey: String
  
  /**
    * The scheme used to communicate with the Firebase Auth backend.
    */
  var apiScheme: String
  
  /**
    * The domain at which the web widgets are hosted (provided via Firebase Config).
    */
  var authDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The SDK Client Version.
    */
  var sdkClientVersion: String
  
  /**
    * The host at which the Secure Token API is running.
    */
  var tokenApiHost: String
}
object Config {
  
  inline def apply(apiHost: String, apiKey: String, apiScheme: String, sdkClientVersion: String, tokenApiHost: String): Config = {
    val __obj = js.Dynamic.literal(apiHost = apiHost.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], apiScheme = apiScheme.asInstanceOf[js.Any], sdkClientVersion = sdkClientVersion.asInstanceOf[js.Any], tokenApiHost = tokenApiHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setApiHost(value: String): Self = StObject.set(x, "apiHost", value.asInstanceOf[js.Any])
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiScheme(value: String): Self = StObject.set(x, "apiScheme", value.asInstanceOf[js.Any])
    
    inline def setAuthDomain(value: String): Self = StObject.set(x, "authDomain", value.asInstanceOf[js.Any])
    
    inline def setAuthDomainUndefined: Self = StObject.set(x, "authDomain", js.undefined)
    
    inline def setSdkClientVersion(value: String): Self = StObject.set(x, "sdkClientVersion", value.asInstanceOf[js.Any])
    
    inline def setTokenApiHost(value: String): Self = StObject.set(x, "tokenApiHost", value.asInstanceOf[js.Any])
  }
}
