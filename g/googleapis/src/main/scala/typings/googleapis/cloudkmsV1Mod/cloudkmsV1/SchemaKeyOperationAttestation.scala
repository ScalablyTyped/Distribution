package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains an HSM-generated attestation about a key operation. For more
  * information, see [Verifying attestations]
  * (https://cloud.google.com/kms/docs/attest-key).
  */
@js.native
trait SchemaKeyOperationAttestation extends js.Object {
  /**
    * Output only. The attestation data provided by the HSM when the key
    * operation was performed.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Output only. The format of the attestation data.
    */
  var format: js.UndefOr[String] = js.native
}

object SchemaKeyOperationAttestation {
  @scala.inline
  def apply(): SchemaKeyOperationAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyOperationAttestation]
  }
  @scala.inline
  implicit class SchemaKeyOperationAttestationOps[Self <: SchemaKeyOperationAttestation] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

