package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokeCredentialsResult] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
