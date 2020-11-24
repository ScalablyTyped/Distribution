package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdentityVerificationResponse extends js.Object {
  
  var identityVerification: js.UndefOr[
    js.Array[
      /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
    ]
  ] = js.native
}
object AccountIdentityVerificationResponse {
  
  @scala.inline
  def apply(): AccountIdentityVerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityVerificationResponse]
  }
  
  @scala.inline
  implicit class AccountIdentityVerificationResponseOps[Self <: AccountIdentityVerificationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentityVerificationVarargs(value: (/* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow)*): Self = this.set("identityVerification", js.Array(value :_*))
    
    @scala.inline
    def setIdentityVerification(
      value: js.Array[
          /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
        ]
    ): Self = this.set("identityVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityVerification: Self = this.set("identityVerification", js.undefined)
  }
}
