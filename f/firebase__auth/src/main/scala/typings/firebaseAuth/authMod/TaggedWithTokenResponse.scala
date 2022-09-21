package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait TaggedWithTokenResponse extends StObject {
  
  var _tokenResponse: js.UndefOr[PhoneOrOauthTokenResponse] = js.undefined
}
object TaggedWithTokenResponse {
  
  inline def apply(): TaggedWithTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedWithTokenResponse]
  }
  
  extension [Self <: TaggedWithTokenResponse](x: Self) {
    
    inline def set_tokenResponse(value: PhoneOrOauthTokenResponse): Self = StObject.set(x, "_tokenResponse", value.asInstanceOf[js.Any])
    
    inline def set_tokenResponseUndefined: Self = StObject.set(x, "_tokenResponse", js.undefined)
  }
}
