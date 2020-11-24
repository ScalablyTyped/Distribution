package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An admission rule specifies either that all container images used in a pod
  * creation request must be attested to by one or more attestors, that all pod
  * creations will be allowed, or that all pod creations will be denied. Images
  * matching an admission whitelist pattern are exempted from admission rules
  * and will never block a pod creation.
  */
@js.native
trait SchemaAdmissionRule extends js.Object {
  
  /**
    * Required. The action when a pod creation is denied by the admission rule.
    */
  var enforcementMode: js.UndefOr[String] = js.native
  
  /**
    * Required. How this admission rule will be evaluated.
    */
  var evaluationMode: js.UndefOr[String] = js.native
  
  /**
    * Optional. The resource names of the attestors that must attest to a
    * container image, in the format `projects/x/attestors/x. Each attestor
    * must exist before a policy can reference it.  To add an attestor to a
    * policy the principal issuing the policy change request must be able to
    * read the attestor resource.  Note: this field must be non-empty when the
    * evaluation_mode field specifies REQUIRE_ATTESTATION, otherwise it must be
    * empty.
    */
  var requireAttestationsBy: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAdmissionRule {
  
  @scala.inline
  def apply(): SchemaAdmissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdmissionRule]
  }
  
  @scala.inline
  implicit class SchemaAdmissionRuleOps[Self <: SchemaAdmissionRule] (val x: Self) extends AnyVal {
    
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
    def setEnforcementMode(value: String): Self = this.set("enforcementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcementMode: Self = this.set("enforcementMode", js.undefined)
    
    @scala.inline
    def setEvaluationMode(value: String): Self = this.set("evaluationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationMode: Self = this.set("evaluationMode", js.undefined)
    
    @scala.inline
    def setRequireAttestationsByVarargs(value: String*): Self = this.set("requireAttestationsBy", js.Array(value :_*))
    
    @scala.inline
    def setRequireAttestationsBy(value: js.Array[String]): Self = this.set("requireAttestationsBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireAttestationsBy: Self = this.set("requireAttestationsBy", js.undefined)
  }
}
