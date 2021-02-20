package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityVerifications extends StObject {
  
  var identityVerification: js.UndefOr[
    js.Array[
      /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
    ]
  ] = js.native
}
object IdentityVerifications {
  
  @scala.inline
  def apply(): IdentityVerifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityVerifications]
  }
  
  @scala.inline
  implicit class IdentityVerificationsMutableBuilder[Self <: IdentityVerifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityVerification(
      value: js.Array[
          /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
        ]
    ): Self = StObject.set(x, "identityVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityVerificationUndefined: Self = StObject.set(x, "identityVerification", js.undefined)
    
    @scala.inline
    def setIdentityVerificationVarargs(value: (/* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow)*): Self = StObject.set(x, "identityVerification", js.Array(value :_*))
  }
}
