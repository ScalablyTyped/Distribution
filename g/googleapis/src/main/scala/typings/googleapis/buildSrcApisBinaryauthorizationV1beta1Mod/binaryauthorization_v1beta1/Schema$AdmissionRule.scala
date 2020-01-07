package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An admission rule specifies either that all container images used in a pod
  * creation request must be attested to by one or more attestors, that all pod
  * creations will be allowed, or that all pod creations will be denied. Images
  * matching an admission whitelist pattern are exempted from admission rules
  * and will never block a pod creation.
  */
@js.native
trait Schema$AdmissionRule extends js.Object {
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

object Schema$AdmissionRule {
  @scala.inline
  def apply(
    enforcementMode: String = null,
    evaluationMode: String = null,
    requireAttestationsBy: js.Array[String] = null
  ): Schema$AdmissionRule = {
    val __obj = js.Dynamic.literal()
    if (enforcementMode != null) __obj.updateDynamic("enforcementMode")(enforcementMode.asInstanceOf[js.Any])
    if (evaluationMode != null) __obj.updateDynamic("evaluationMode")(evaluationMode.asInstanceOf[js.Any])
    if (requireAttestationsBy != null) __obj.updateDynamic("requireAttestationsBy")(requireAttestationsBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdmissionRule]
  }
}

