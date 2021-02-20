package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeCredentialsResult extends StObject {
  
  var success: Boolean = js.native
}
object RevokeCredentialsResult {
  
  @scala.inline
  def apply(success: Boolean): RevokeCredentialsResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeCredentialsResult]
  }
  
  @scala.inline
  implicit class RevokeCredentialsResultMutableBuilder[Self <: RevokeCredentialsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
