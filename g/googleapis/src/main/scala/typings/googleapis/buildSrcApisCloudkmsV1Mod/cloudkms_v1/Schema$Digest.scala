package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Digest holds a cryptographic message digest.
  */
@js.native
trait Schema$Digest extends js.Object {
  /**
    * A message digest produced with the SHA-256 algorithm.
    */
  var sha256: js.UndefOr[String] = js.native
  /**
    * A message digest produced with the SHA-384 algorithm.
    */
  var sha384: js.UndefOr[String] = js.native
  /**
    * A message digest produced with the SHA-512 algorithm.
    */
  var sha512: js.UndefOr[String] = js.native
}

object Schema$Digest {
  @scala.inline
  def apply(sha256: String = null, sha384: String = null, sha512: String = null): Schema$Digest = {
    val __obj = js.Dynamic.literal()
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    if (sha384 != null) __obj.updateDynamic("sha384")(sha384.asInstanceOf[js.Any])
    if (sha512 != null) __obj.updateDynamic("sha512")(sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Digest]
  }
}

