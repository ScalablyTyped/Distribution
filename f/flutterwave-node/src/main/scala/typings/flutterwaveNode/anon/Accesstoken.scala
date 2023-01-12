package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accesstoken extends StObject {
  
  var access_token: Any
  
  var expires_in: Double
  
  var refresh_token: Any
  
  var token_type: Any
}
object Accesstoken {
  
  inline def apply(access_token: Any, expires_in: Double, refresh_token: Any, token_type: Any): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
    
    inline def setAccess_token(value: Any): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setRefresh_token(value: Any): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setToken_type(value: Any): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
  }
}
