package typings.fusebitOauthConnector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken extends StObject {
    
    var access_token: String
    
    var expires_at: Double
    
    var expires_in: Double
    
    var ext_expires_in: Double
    
    var refresh_token: String
    
    var scope: String
    
    var token_type: String
  }
  object Accesstoken {
    
    inline def apply(
      access_token: String,
      expires_at: Double,
      expires_in: Double,
      ext_expires_in: Double,
      refresh_token: String,
      scope: String,
      token_type: String
    ): Accesstoken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], ext_expires_in = ext_expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accesstoken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExt_expires_in(value: Double): Self = StObject.set(x, "ext_expires_in", value.asInstanceOf[js.Any])
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectorBaseUrl extends StObject {
    
    var connectorBaseUrl: String
    
    var userId: String
  }
  object ConnectorBaseUrl {
    
    inline def apply(connectorBaseUrl: String, userId: String): ConnectorBaseUrl = {
      val __obj = js.Dynamic.literal(connectorBaseUrl = connectorBaseUrl.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectorBaseUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectorBaseUrl] (val x: Self) extends AnyVal {
      
      inline def setConnectorBaseUrl(value: String): Self = StObject.set(x, "connectorBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
