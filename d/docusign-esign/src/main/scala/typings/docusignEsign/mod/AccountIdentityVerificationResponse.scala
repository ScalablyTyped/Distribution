package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIdentityVerificationResponse extends StObject {
  
  var identityVerification: js.UndefOr[
    js.Array[
      /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
    ]
  ] = js.undefined
}
object AccountIdentityVerificationResponse {
  
  @scala.inline
  def apply(): AccountIdentityVerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityVerificationResponse]
  }
  
  @scala.inline
  implicit class AccountIdentityVerificationResponseMutableBuilder[Self <: AccountIdentityVerificationResponse] (val x: Self) extends AnyVal {
    
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
