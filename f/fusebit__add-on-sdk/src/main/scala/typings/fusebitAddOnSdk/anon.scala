package typings.fusebitAddOnSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: String
    
    var permissions: js.Array[String]
  }
  object AccessToken {
    
    inline def apply(accessToken: String, permissions: js.Array[String]): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    }
  }
  
  trait Caller extends StObject {
    
    var caller: AccessToken
    
    var functionAccessToken: String
  }
  object Caller {
    
    inline def apply(caller: AccessToken, functionAccessToken: String): Caller = {
      val __obj = js.Dynamic.literal(caller = caller.asInstanceOf[js.Any], functionAccessToken = functionAccessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[Caller]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Caller] (val x: Self) extends AnyVal {
      
      inline def setCaller(value: AccessToken): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setFunctionAccessToken(value: String): Self = StObject.set(x, "functionAccessToken", value.asInstanceOf[js.Any])
    }
  }
}
