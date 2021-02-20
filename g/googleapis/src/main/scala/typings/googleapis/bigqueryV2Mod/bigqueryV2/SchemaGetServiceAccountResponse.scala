package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGetServiceAccountResponse extends StObject {
  
  /**
    * The service account email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaGetServiceAccountResponse {
  
  @scala.inline
  def apply(): SchemaGetServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetServiceAccountResponse]
  }
  
  @scala.inline
  implicit class SchemaGetServiceAccountResponseMutableBuilder[Self <: SchemaGetServiceAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
