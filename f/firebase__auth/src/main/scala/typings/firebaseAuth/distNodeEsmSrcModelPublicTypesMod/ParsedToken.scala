package typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAuth.anon.Identities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedToken
  extends StObject
     with /** Map of any additional custom claims. */
/* key */ StringDictionary[Any] {
  
  /** Time at which authentication was performed. */
  var auth_time: js.UndefOr[String] = js.undefined
  
  /** Expiration time of the token. */
  var exp: js.UndefOr[String] = js.undefined
  
  /** Firebase specific claims, containing the provider(s) used to authenticate the user. */
  var firebase: js.UndefOr[Identities] = js.undefined
  
  /** Issuance time of the token. */
  var iat: js.UndefOr[String] = js.undefined
  
  /** UID of the user. */
  var sub: js.UndefOr[String] = js.undefined
}
object ParsedToken {
  
  inline def apply(): ParsedToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedToken] (val x: Self) extends AnyVal {
    
    inline def setAuth_time(value: String): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
    
    inline def setAuth_timeUndefined: Self = StObject.set(x, "auth_time", js.undefined)
    
    inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setFirebase(value: Identities): Self = StObject.set(x, "firebase", value.asInstanceOf[js.Any])
    
    inline def setFirebaseUndefined: Self = StObject.set(x, "firebase", js.undefined)
    
    inline def setIat(value: String): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
  }
}
