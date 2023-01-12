package typings.expressWechatAccess

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessTokenUrl extends StObject {
    
    var accessTokenUrl: js.UndefOr[String] = js.undefined
    
    var appId: String
    
    var appSecret: String
    
    var https: js.UndefOr[Boolean] = js.undefined
    
    var ticketUrl: js.UndefOr[String] = js.undefined
  }
  object AccessTokenUrl {
    
    inline def apply(appId: String, appSecret: String): AccessTokenUrl = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appSecret = appSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessTokenUrl] (val x: Self) extends AnyVal {
      
      inline def setAccessTokenUrl(value: String): Self = StObject.set(x, "accessTokenUrl", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUrlUndefined: Self = StObject.set(x, "accessTokenUrl", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppSecret(value: String): Self = StObject.set(x, "appSecret", value.asInstanceOf[js.Any])
      
      inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setTicketUrl(value: String): Self = StObject.set(x, "ticketUrl", value.asInstanceOf[js.Any])
      
      inline def setTicketUrlUndefined: Self = StObject.set(x, "ticketUrl", js.undefined)
    }
  }
}
