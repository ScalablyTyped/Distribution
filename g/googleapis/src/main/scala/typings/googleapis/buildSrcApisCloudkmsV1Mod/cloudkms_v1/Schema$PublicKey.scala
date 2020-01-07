package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The public key for a given CryptoKeyVersion. Obtained via GetPublicKey.
  */
@js.native
trait Schema$PublicKey extends js.Object {
  /**
    * The Algorithm associated with this key.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * The public key, encoded in PEM format. For more information, see the [RFC
    * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
    * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and
    * [Textual Encoding of Subject Public Key Info]
    * (https://tools.ietf.org/html/rfc7468#section-13).
    */
  var pem: js.UndefOr[String] = js.native
}

object Schema$PublicKey {
  @scala.inline
  def apply(algorithm: String = null, pem: String = null): Schema$PublicKey = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (pem != null) __obj.updateDynamic("pem")(pem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublicKey]
  }
}

