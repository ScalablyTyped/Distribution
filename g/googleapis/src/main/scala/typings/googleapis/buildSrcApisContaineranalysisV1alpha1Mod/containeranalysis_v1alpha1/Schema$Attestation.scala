package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Occurrence that represents a single &quot;attestation&quot;.  The
  * authenticity of an Attestation can be verified using the attached
  * signature. If the verifier trusts the public key of the signer, then
  * verifying the signature is sufficient to establish trust.  In this
  * circumstance, the AttestationAuthority to which this Attestation is
  * attached is primarily useful for look-up (how to find this Attestation if
  * you already know the Authority and artifact to be verified) and intent
  * (which authority was this attestation intended to sign for).
  */
@js.native
trait Schema$Attestation extends js.Object {
  var pgpSignedAttestation: js.UndefOr[Schema$PgpSignedAttestation] = js.native
}

object Schema$Attestation {
  @scala.inline
  def apply(pgpSignedAttestation: Schema$PgpSignedAttestation = null): Schema$Attestation = {
    val __obj = js.Dynamic.literal()
    if (pgpSignedAttestation != null) __obj.updateDynamic("pgpSignedAttestation")(pgpSignedAttestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Attestation]
  }
}

