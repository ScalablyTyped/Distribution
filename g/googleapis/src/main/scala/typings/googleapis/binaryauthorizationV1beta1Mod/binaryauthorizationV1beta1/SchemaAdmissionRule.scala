package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An admission rule specifies either that all container images used in a pod
  * creation request must be attested to by one or more attestors, that all pod
  * creations will be allowed, or that all pod creations will be denied. Images
  * matching an admission whitelist pattern are exempted from admission rules
  * and will never block a pod creation.
  */
trait SchemaAdmissionRule extends StObject {
  
  /**
    * Required. The action when a pod creation is denied by the admission rule.
    */
  var enforcementMode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. How this admission rule will be evaluated.
    */
  var evaluationMode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The resource names of the attestors that must attest to a
    * container image, in the format `projects/x/attestors/x. Each attestor
    * must exist before a policy can reference it.  To add an attestor to a
    * policy the principal issuing the policy change request must be able to
    * read the attestor resource.  Note: this field must be non-empty when the
    * evaluation_mode field specifies REQUIRE_ATTESTATION, otherwise it must be
    * empty.
    */
  var requireAttestationsBy: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAdmissionRule {
  
  @scala.inline
  def apply(): SchemaAdmissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdmissionRule]
  }
  
  @scala.inline
  implicit class SchemaAdmissionRuleMutableBuilder[Self <: SchemaAdmissionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforcementMode(value: String): Self = StObject.set(x, "enforcementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcementModeUndefined: Self = StObject.set(x, "enforcementMode", js.undefined)
    
    @scala.inline
    def setEvaluationMode(value: String): Self = StObject.set(x, "evaluationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationModeUndefined: Self = StObject.set(x, "evaluationMode", js.undefined)
    
    @scala.inline
    def setRequireAttestationsBy(value: js.Array[String]): Self = StObject.set(x, "requireAttestationsBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAttestationsByUndefined: Self = StObject.set(x, "requireAttestationsBy", js.undefined)
    
    @scala.inline
    def setRequireAttestationsByVarargs(value: String*): Self = StObject.set(x, "requireAttestationsBy", js.Array(value :_*))
  }
}
