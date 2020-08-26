package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attestor public key that will be used to verify attestations signed by
  * this attestor.
  */
@js.native
trait SchemaAttestorPublicKey extends js.Object {
  /**
    * ASCII-armored representation of a PGP public key, as the entire output by
    * the command `gpg --export --armor foo@example.com` (either LF or CRLF
    * line endings). When using this field, `id` should be left blank.  The
    * BinAuthz API handlers will calculate the ID and fill it in automatically.
    * BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint,
    * represented as upper-case hex.  If `id` is provided by the caller, it
    * will be overwritten by the API-calculated ID.
    */
  var asciiArmoredPgpPublicKey: js.UndefOr[String] = js.native
  /**
    * Optional. A descriptive comment. This field may be updated.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * The ID of this public key. Signatures verified by BinAuthz must include
    * the ID of the public key that can be used to verify them, and that ID
    * must match the contents of this field exactly. Additional restrictions on
    * this field can be imposed based on which public key type is encapsulated.
    * See the documentation on `public_key` cases below for details.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A raw PKIX SubjectPublicKeyInfo format public key.  NOTE: `id` may be
    * explicitly provided by the caller when using this type of public key, but
    * it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will
    * be computed based on the digest of the DER encoding of the public key.
    */
  var pkixPublicKey: js.UndefOr[SchemaPkixPublicKey] = js.native
}

object SchemaAttestorPublicKey {
  @scala.inline
  def apply(): SchemaAttestorPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestorPublicKey]
  }
  @scala.inline
  implicit class SchemaAttestorPublicKeyOps[Self <: SchemaAttestorPublicKey] (val x: Self) extends AnyVal {
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
    def setAsciiArmoredPgpPublicKey(value: String): Self = this.set("asciiArmoredPgpPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsciiArmoredPgpPublicKey: Self = this.set("asciiArmoredPgpPublicKey", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPkixPublicKey(value: SchemaPkixPublicKey): Self = this.set("pkixPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePkixPublicKey: Self = this.set("pkixPublicKey", js.undefined)
  }
  
}

