package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionJustification
  extends StObject
     with BackboneElement {
  
  /**
    * This would be a codeableconcept, or a coding, which can be constrained to , for example, the 6 grounds for processing in GDPR.
    */
  var basis: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * While any resource may be used, DocumentReference, Consent, PlanDefinition, and Contract would be most frequent
    */
  var evidence: js.UndefOr[js.Array[Reference]] = js.undefined
}
object PermissionJustification {
  
  inline def apply(): PermissionJustification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionJustification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionJustification] (val x: Self) extends AnyVal {
    
    inline def setBasis(value: js.Array[CodeableConcept]): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    inline def setBasisVarargs(value: CodeableConcept*): Self = StObject.set(x, "basis", js.Array(value*))
    
    inline def setEvidence(value: js.Array[Reference]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: Reference*): Self = StObject.set(x, "evidence", js.Array(value*))
  }
}
