package typings.ebayOauthNodejsClient

import typings.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.consent
import typings.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.login
import typings.ebayOauthNodejsClient.mod.EbayAuthTokenOptions
import typings.ebayOauthNodejsClient.mod.EbayEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseUrl
    extends StObject
       with EbayAuthTokenOptions {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var clientId: String
    
    var clientSecret: String
    
    var env: js.UndefOr[EbayEnvironment] = js.undefined
    
    var redirectUri: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[js.Array[String] | String] = js.undefined
  }
  object BaseUrl {
    
    inline def apply(clientId: String, clientSecret: String): BaseUrl = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: EbayEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setScope(value: js.Array[String] | String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
  
  trait FilePath
    extends StObject
       with EbayAuthTokenOptions {
    
    var filePath: String
  }
  object FilePath {
    
    inline def apply(filePath: String): FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prompt extends StObject {
    
    var prompt: js.UndefOr[login | consent] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Prompt {
    
    inline def apply(): Prompt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Prompt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prompt] (val x: Self) extends AnyVal {
      
      inline def setPrompt(value: login | consent): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
