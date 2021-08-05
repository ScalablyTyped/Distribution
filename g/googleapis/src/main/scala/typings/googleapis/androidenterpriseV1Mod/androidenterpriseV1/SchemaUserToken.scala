package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A UserToken is used by a user when setting up a managed device or profile
  * with their managed Google Play account on a device. When the user enters
  * their email address and token (activation code) the appropriate EMM app can
  * be automatically downloaded.
  */
trait SchemaUserToken extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#userToken&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The token (activation code) to be entered by the user. This consists of a
    * sequence of decimal digits. Note that the leading digit may be 0.
    */
  var token: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for the user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object SchemaUserToken {
  
  inline def apply(): SchemaUserToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserToken]
  }
  
  extension [Self <: SchemaUserToken](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
