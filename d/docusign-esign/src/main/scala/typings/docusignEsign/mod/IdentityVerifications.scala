package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityVerifications extends StObject {
  
  var identityVerification: js.UndefOr[
    js.Array[
      /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
    ]
  ] = js.undefined
}
object IdentityVerifications {
  
  inline def apply(): IdentityVerifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityVerifications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityVerifications] (val x: Self) extends AnyVal {
    
    inline def setIdentityVerification(
      value: js.Array[
          /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
        ]
    ): Self = StObject.set(x, "identityVerification", value.asInstanceOf[js.Any])
    
    inline def setIdentityVerificationUndefined: Self = StObject.set(x, "identityVerification", js.undefined)
    
    inline def setIdentityVerificationVarargs(value: (/* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow)*): Self = StObject.set(x, "identityVerification", js.Array(value*))
  }
}
