package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An user owned drydock note references a Drydock ATTESTATION_AUTHORITY Note
  * created by the user.
  */
@js.native
trait SchemaUserOwnedDrydockNote extends js.Object {
  /**
    * Output only. This field will contain the service account email address
    * that this Attestor will use as the principal when querying Container
    * Analysis. Attestor administrators must grant this service account the IAM
    * role needed to read attestations from the note_reference in Container
    * Analysis (`containeranalysis.notes.occurrences.viewer`).  This email
    * address is fixed for the lifetime of the Attestor, but callers should not
    * make any other assumptions about the service account email; future
    * versions may use an email based on a different naming pattern.
    */
  var delegationServiceAccountEmail: js.UndefOr[String] = js.native
  /**
    * Required. The Drydock resource name of a ATTESTATION_AUTHORITY Note,
    * created by the user, in the format: `projects/x/notes/x (or the legacy
    * `providers/x/notes/x). This field may not be updated.  An attestation by
    * this attestor is stored as a Drydock ATTESTATION_AUTHORITY Occurrence
    * that names a container image and that links to this Note. Drydock is an
    * external dependency.
    */
  var noteReference: js.UndefOr[String] = js.native
  /**
    * Optional. Public keys that verify attestations signed by this attestor.
    * This field may be updated.  If this field is non-empty, one of the
    * specified public keys must verify that an attestation was signed by this
    * attestor for the image specified in the admission request.  If this field
    * is empty, this attestor always returns that no valid attestations exist.
    */
  var publicKeys: js.UndefOr[js.Array[SchemaAttestorPublicKey]] = js.native
}

object SchemaUserOwnedDrydockNote {
  @scala.inline
  def apply(): SchemaUserOwnedDrydockNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserOwnedDrydockNote]
  }
  @scala.inline
  implicit class SchemaUserOwnedDrydockNoteOps[Self <: SchemaUserOwnedDrydockNote] (val x: Self) extends AnyVal {
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
    def setDelegationServiceAccountEmail(value: String): Self = this.set("delegationServiceAccountEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegationServiceAccountEmail: Self = this.set("delegationServiceAccountEmail", js.undefined)
    @scala.inline
    def setNoteReference(value: String): Self = this.set("noteReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteReference: Self = this.set("noteReference", js.undefined)
    @scala.inline
    def setPublicKeysVarargs(value: SchemaAttestorPublicKey*): Self = this.set("publicKeys", js.Array(value :_*))
    @scala.inline
    def setPublicKeys(value: js.Array[SchemaAttestorPublicKey]): Self = this.set("publicKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKeys: Self = this.set("publicKeys", js.undefined)
  }
  
}

