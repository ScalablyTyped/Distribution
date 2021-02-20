package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProjectsSetDefaultServiceAccountRequest extends StObject {
  
  /**
    * Email address of the service account.
    */
  var email: js.UndefOr[String] = js.native
}
object SchemaProjectsSetDefaultServiceAccountRequest {
  
  @scala.inline
  def apply(): SchemaProjectsSetDefaultServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsSetDefaultServiceAccountRequest]
  }
  
  @scala.inline
  implicit class SchemaProjectsSetDefaultServiceAccountRequestMutableBuilder[Self <: SchemaProjectsSetDefaultServiceAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
