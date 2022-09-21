package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthenticationToken extends StObject {
  
  /**
    * The authentication token to be passed to the device policy client on the device where it can be used to provision the account for which this token was generated.
    */
  var token: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthenticationToken {
  
  inline def apply(): SchemaAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationToken]
  }
  
  extension [Self <: SchemaAuthenticationToken](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
