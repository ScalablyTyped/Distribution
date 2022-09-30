package typings.ebayOauthNodejsClient

import typings.ebayOauthNodejsClient.anon.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ebay-oauth-nodejs-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EbayAuthToken {
    def this(options: EbayAuthTokenOptions) = this()
  }
  
  @js.native
  trait EbayAuthToken extends StObject {
    
    def exchangeCodeForAccessToken(environment: EbayEnvironment, code: String): js.Promise[String] = js.native
    
    def generateUserAuthorizationUrl(environment: EbayEnvironment, scopes: String): String = js.native
    def generateUserAuthorizationUrl(environment: EbayEnvironment, scopes: String, options: Prompt): String = js.native
    def generateUserAuthorizationUrl(environment: EbayEnvironment, scopes: js.Array[String]): String = js.native
    def generateUserAuthorizationUrl(environment: EbayEnvironment, scopes: js.Array[String], options: Prompt): String = js.native
    
    def getAccessToken(environment: EbayEnvironment, refreshToken: String, scopes: String): js.Promise[String] = js.native
    def getAccessToken(environment: EbayEnvironment, refreshToken: String, scopes: js.Array[String]): js.Promise[String] = js.native
    
    def getApplicationToken(environment: EbayEnvironment): js.Promise[String] = js.native
    def getApplicationToken(environment: EbayEnvironment, scopes: String): js.Promise[String] = js.native
    def getApplicationToken(environment: EbayEnvironment, scopes: js.Array[String]): js.Promise[String] = js.native
    
    def getRefreshToken(): String = js.native
    
    def setRefreshToken(refreshToken: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ebayOauthNodejsClient.anon.FilePath
    - typings.ebayOauthNodejsClient.anon.BaseUrl
  */
  trait EbayAuthTokenOptions extends StObject
  object EbayAuthTokenOptions {
    
    inline def BaseUrl(clientId: String, clientSecret: String): typings.ebayOauthNodejsClient.anon.BaseUrl = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ebayOauthNodejsClient.anon.BaseUrl]
    }
    
    inline def FilePath(filePath: String): typings.ebayOauthNodejsClient.anon.FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ebayOauthNodejsClient.anon.FilePath]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.SANDBOX
    - typings.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.PRODUCTION
  */
  trait EbayEnvironment extends StObject
  object EbayEnvironment {
    
    inline def PRODUCTION: typings.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.PRODUCTION = "PRODUCTION".asInstanceOf[typings.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.PRODUCTION]
    
    inline def SANDBOX: typings.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.SANDBOX = "SANDBOX".asInstanceOf[typings.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.SANDBOX]
  }
}
