package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attestor public key that will be used to verify attestations signed by
  * this attestor.
  */
@js.native
trait Schema$AttestorPublicKey extends js.Object {
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
  var pkixPublicKey: js.UndefOr[Schema$PkixPublicKey] = js.native
}

object Schema$AttestorPublicKey {
  @scala.inline
  def apply(
    asciiArmoredPgpPublicKey: String = null,
    comment: String = null,
    id: String = null,
    pkixPublicKey: Schema$PkixPublicKey = null
  ): Schema$AttestorPublicKey = {
    val __obj = js.Dynamic.literal()
    if (asciiArmoredPgpPublicKey != null) __obj.updateDynamic("asciiArmoredPgpPublicKey")(asciiArmoredPgpPublicKey.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (pkixPublicKey != null) __obj.updateDynamic("pkixPublicKey")(pkixPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AttestorPublicKey]
  }
}

