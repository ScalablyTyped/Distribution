package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPrivacySandboxEnrollmentOverrideRequest extends StObject {
  
  var url: String
}
object AddPrivacySandboxEnrollmentOverrideRequest {
  
  inline def apply(url: String): AddPrivacySandboxEnrollmentOverrideRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPrivacySandboxEnrollmentOverrideRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddPrivacySandboxEnrollmentOverrideRequest] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
