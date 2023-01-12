package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.manifest.HttpURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.identity API to get OAuth2 access tokens.
  *
  * Permissions: `identity`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object identity {
  
  /* identity types */
  /** An object encapsulating an OAuth account id. */
  trait AccountInfo extends StObject {
    
    /** A unique identifier for the account. This ID will not change for the lifetime of the account. */
    var id: String
  }
  object AccountInfo {
    
    inline def apply(id: String): AccountInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAuthTokenDetails extends StObject {
    
    var account: js.UndefOr[AccountInfo] = js.undefined
    
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetAuthTokenDetails {
    
    inline def apply(): GetAuthTokenDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAuthTokenDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAuthTokenDetails] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  trait GetProfileUserInfoReturnUserinfo extends StObject {
    
    var email: String
    
    var id: String
  }
  object GetProfileUserInfoReturnUserinfo {
    
    inline def apply(email: String, id: String): GetProfileUserInfoReturnUserinfo = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProfileUserInfoReturnUserinfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetProfileUserInfoReturnUserinfo] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait LaunchWebAuthFlowDetails extends StObject {
    
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var url: HttpURL
  }
  object LaunchWebAuthFlowDetails {
    
    inline def apply(url: HttpURL): LaunchWebAuthFlowDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchWebAuthFlowDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LaunchWebAuthFlowDetails] (val x: Self) extends AnyVal {
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setUrl(value: HttpURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveCachedAuthTokenDetails extends StObject {
    
    var token: String
  }
  object RemoveCachedAuthTokenDetails {
    
    inline def apply(token: String): RemoveCachedAuthTokenDetails = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveCachedAuthTokenDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveCachedAuthTokenDetails] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveCachedAuthTokenReturnUserinfo extends StObject {
    
    var email: String
    
    var id: String
  }
  object RemoveCachedAuthTokenReturnUserinfo {
    
    inline def apply(email: String, id: String): RemoveCachedAuthTokenReturnUserinfo = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveCachedAuthTokenReturnUserinfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveCachedAuthTokenReturnUserinfo] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
