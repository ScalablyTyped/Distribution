package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionJustification
  extends StObject
     with BackboneElement {
  
  /**
    * Evidence – reference to consent, or a contract, or a policy, or a regulation, or an attachment that contains a screenshot.
    */
  var evidence: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This would be a codeableconcept, or a coding, which can be constrained to , for example, the 6 grounds for processing in GDPR.
    */
  var grounds: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object PermissionJustification {
  
  inline def apply(): PermissionJustification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionJustification]
  }
  
  extension [Self <: PermissionJustification](x: Self) {
    
    inline def setEvidence(value: js.Array[Reference]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: Reference*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setGrounds(value: js.Array[CodeableConcept]): Self = StObject.set(x, "grounds", value.asInstanceOf[js.Any])
    
    inline def setGroundsUndefined: Self = StObject.set(x, "grounds", js.undefined)
    
    inline def setGroundsVarargs(value: CodeableConcept*): Self = StObject.set(x, "grounds", js.Array(value*))
  }
}
