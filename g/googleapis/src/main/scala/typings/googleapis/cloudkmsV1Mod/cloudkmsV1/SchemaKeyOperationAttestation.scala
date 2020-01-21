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
  def apply(content: String = null, format: String = null): SchemaKeyOperationAttestation = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaKeyOperationAttestation]
  }
}

