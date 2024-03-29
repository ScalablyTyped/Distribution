package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectsSetDefaultServiceAccountRequest extends StObject {
  
  /**
    * Email address of the service account.
    */
  var email: js.UndefOr[String | Null] = js.undefined
}
object SchemaProjectsSetDefaultServiceAccountRequest {
  
  inline def apply(): SchemaProjectsSetDefaultServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsSetDefaultServiceAccountRequest]
  }
  
  extension [Self <: SchemaProjectsSetDefaultServiceAccountRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
