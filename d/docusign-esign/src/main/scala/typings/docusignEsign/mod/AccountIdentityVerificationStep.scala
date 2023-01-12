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
  
  inline def apply(): AccountIdentityVerificationStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityVerificationStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountIdentityVerificationStep] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
