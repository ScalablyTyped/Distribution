package typings.expressWechatAccess

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessTokenUrl extends StObject {
    
    var accessTokenUrl: js.UndefOr[String] = js.native
    
    var appId: String = js.native
    
    var appSecret: String = js.native
    
    var https: js.UndefOr[Boolean] = js.native
    
    var ticketUrl: js.UndefOr[String] = js.native
  }
  object AccessTokenUrl {
    
    @scala.inline
    def apply(appId: String, appSecret: String): AccessTokenUrl = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appSecret = appSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenUrl]
    }
    
    @scala.inline
    implicit class AccessTokenUrlMutableBuilder[Self <: AccessTokenUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessTokenUrl(value: String): Self = StObject.set(x, "accessTokenUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUrlUndefined: Self = StObject.set(x, "accessTokenUrl", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppSecret(value: String): Self = StObject.set(x, "appSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setTicketUrl(value: String): Self = StObject.set(x, "ticketUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketUrlUndefined: Self = StObject.set(x, "ticketUrl", js.undefined)
    }
  }
}
