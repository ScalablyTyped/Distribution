package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A public key in the PkixPublicKey format (see
  * https://tools.ietf.org/html/rfc5280#section-4.1.2.7 for details). Public
  * keys of this type are typically textually encoded using the PEM format.
  */
@js.native
trait SchemaPkixPublicKey extends js.Object {
  /**
    * A PEM-encoded public key, as described in
    * https://tools.ietf.org/html/rfc7468#section-13
    */
  var publicKeyPem: js.UndefOr[String] = js.native
  /**
    * The signature algorithm used to verify a message against a signature
    * using this key. These signature algorithm must match the structure and
    * any object identifiers encoded in `public_key_pem` (i.e. this algorithm
    * must match that of the public key).
    */
  var signatureAlgorithm: js.UndefOr[String] = js.native
}

object SchemaPkixPublicKey {
  @scala.inline
  def apply(publicKeyPem: String = null, signatureAlgorithm: String = null): SchemaPkixPublicKey = {
    val __obj = js.Dynamic.literal()
    if (publicKeyPem != null) __obj.updateDynamic("publicKeyPem")(publicKeyPem.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPkixPublicKey]
  }
}

