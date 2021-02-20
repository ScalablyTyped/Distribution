package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.manifest.HttpURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @js.native
  trait AccountInfo extends StObject {
    
    /** A unique identifier for the account. This ID will not change for the lifetime of the account. */
    var id: String = js.native
  }
  object AccountInfo {
    
    @scala.inline
    def apply(id: String): AccountInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    @scala.inline
    implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAuthTokenDetails extends StObject {
    
    var account: js.UndefOr[AccountInfo] = js.native
    
    var interactive: js.UndefOr[Boolean] = js.native
    
    var scopes: js.UndefOr[js.Array[String]] = js.native
  }
  object GetAuthTokenDetails {
    
    @scala.inline
    def apply(): GetAuthTokenDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAuthTokenDetails]
    }
    
    @scala.inline
    implicit class GetAuthTokenDetailsMutableBuilder[Self <: GetAuthTokenDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetProfileUserInfoReturnUserinfo extends StObject {
    
    var email: String = js.native
    
    var id: String = js.native
  }
  object GetProfileUserInfoReturnUserinfo {
    
    @scala.inline
    def apply(email: String, id: String): GetProfileUserInfoReturnUserinfo = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProfileUserInfoReturnUserinfo]
    }
    
    @scala.inline
    implicit class GetProfileUserInfoReturnUserinfoMutableBuilder[Self <: GetProfileUserInfoReturnUserinfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LaunchWebAuthFlowDetails extends StObject {
    
    var interactive: js.UndefOr[Boolean] = js.native
    
    var url: HttpURL = js.native
  }
  object LaunchWebAuthFlowDetails {
    
    @scala.inline
    def apply(url: HttpURL): LaunchWebAuthFlowDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchWebAuthFlowDetails]
    }
    
    @scala.inline
    implicit class LaunchWebAuthFlowDetailsMutableBuilder[Self <: LaunchWebAuthFlowDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setUrl(value: HttpURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveCachedAuthTokenDetails extends StObject {
    
    var token: String = js.native
  }
  object RemoveCachedAuthTokenDetails {
    
    @scala.inline
    def apply(token: String): RemoveCachedAuthTokenDetails = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveCachedAuthTokenDetails]
    }
    
    @scala.inline
    implicit class RemoveCachedAuthTokenDetailsMutableBuilder[Self <: RemoveCachedAuthTokenDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveCachedAuthTokenReturnUserinfo extends StObject {
    
    var email: String = js.native
    
    var id: String = js.native
  }
  object RemoveCachedAuthTokenReturnUserinfo {
    
    @scala.inline
    def apply(email: String, id: String): RemoveCachedAuthTokenReturnUserinfo = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveCachedAuthTokenReturnUserinfo]
    }
    
    @scala.inline
    implicit class RemoveCachedAuthTokenReturnUserinfoMutableBuilder[Self <: RemoveCachedAuthTokenReturnUserinfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
