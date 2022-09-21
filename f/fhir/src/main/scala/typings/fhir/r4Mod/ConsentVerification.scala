package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentVerification
  extends StObject
     with BackboneElement {
  
  var _verificationDate: js.UndefOr[Element] = js.undefined
  
  var _verified: js.UndefOr[Element] = js.undefined
  
  /**
    * Date verification was collected.
    */
  var verificationDate: js.UndefOr[String] = js.undefined
  
  /**
    * Has the instruction been verified.
    */
  var verified: Boolean
  
  /**
    * Who verified the instruction (Patient, Relative or other Authorized Person).
    */
  var verifiedWith: js.UndefOr[Reference] = js.undefined
}
object ConsentVerification {
  
  inline def apply(verified: Boolean): ConsentVerification = {
    val __obj = js.Dynamic.literal(verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentVerification]
  }
  
  extension [Self <: ConsentVerification](x: Self) {
    
    inline def setVerificationDate(value: String): Self = StObject.set(x, "verificationDate", value.asInstanceOf[js.Any])
    
    inline def setVerificationDateUndefined: Self = StObject.set(x, "verificationDate", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedWith(value: Reference): Self = StObject.set(x, "verifiedWith", value.asInstanceOf[js.Any])
    
    inline def setVerifiedWithUndefined: Self = StObject.set(x, "verifiedWith", js.undefined)
    
    inline def set_verificationDate(value: Element): Self = StObject.set(x, "_verificationDate", value.asInstanceOf[js.Any])
    
    inline def set_verificationDateUndefined: Self = StObject.set(x, "_verificationDate", js.undefined)
    
    inline def set_verified(value: Element): Self = StObject.set(x, "_verified", value.asInstanceOf[js.Any])
    
    inline def set_verifiedUndefined: Self = StObject.set(x, "_verified", js.undefined)
  }
}
