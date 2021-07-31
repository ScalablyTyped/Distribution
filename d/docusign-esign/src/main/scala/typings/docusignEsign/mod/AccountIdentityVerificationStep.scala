package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIdentityVerificationStep extends StObject {
  
  /**
    * The name of the Identity Verification workflow step.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object AccountIdentityVerificationStep {
  
  @scala.inline
  def apply(): AccountIdentityVerificationStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityVerificationStep]
  }
  
  @scala.inline
  implicit class AccountIdentityVerificationStepMutableBuilder[Self <: AccountIdentityVerificationStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
