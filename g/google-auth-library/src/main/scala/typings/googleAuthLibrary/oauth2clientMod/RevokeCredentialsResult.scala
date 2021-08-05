package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeCredentialsResult extends StObject {
  
  var success: Boolean
}
object RevokeCredentialsResult {
  
  inline def apply(success: Boolean): RevokeCredentialsResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeCredentialsResult]
  }
  
  extension [Self <: RevokeCredentialsResult](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
