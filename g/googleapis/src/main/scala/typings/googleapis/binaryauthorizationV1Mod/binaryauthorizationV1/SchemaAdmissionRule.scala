package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdmissionRule extends StObject {
  
  /**
    * Required. The action when a pod creation is denied by the admission rule.
    */
  var enforcementMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. How this admission rule will be evaluated.
    */
  var evaluationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The resource names of the attestors that must attest to a container image, in the format `projects/x/attestors/x`. Each attestor must exist before a policy can reference it. To add an attestor to a policy the principal issuing the policy change request must be able to read the attestor resource. Note: this field must be non-empty when the evaluation_mode field specifies REQUIRE_ATTESTATION, otherwise it must be empty.
    */
  var requireAttestationsBy: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAdmissionRule {
  
  inline def apply(): SchemaAdmissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdmissionRule]
  }
  
  extension [Self <: SchemaAdmissionRule](x: Self) {
    
    inline def setEnforcementMode(value: String): Self = StObject.set(x, "enforcementMode", value.asInstanceOf[js.Any])
    
    inline def setEnforcementModeNull: Self = StObject.set(x, "enforcementMode", null)
    
    inline def setEnforcementModeUndefined: Self = StObject.set(x, "enforcementMode", js.undefined)
    
    inline def setEvaluationMode(value: String): Self = StObject.set(x, "evaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeNull: Self = StObject.set(x, "evaluationMode", null)
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "evaluationMode", js.undefined)
    
    inline def setRequireAttestationsBy(value: js.Array[String]): Self = StObject.set(x, "requireAttestationsBy", value.asInstanceOf[js.Any])
    
    inline def setRequireAttestationsByNull: Self = StObject.set(x, "requireAttestationsBy", null)
    
    inline def setRequireAttestationsByUndefined: Self = StObject.set(x, "requireAttestationsBy", js.undefined)
    
    inline def setRequireAttestationsByVarargs(value: String*): Self = StObject.set(x, "requireAttestationsBy", js.Array(value*))
  }
}
