package typings.firebaseDashAdmin

import typings.firebaseDashAdmin.admin.auth.HashAlgorithmType
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  /**
    * The password hashing algorithm identifier. The following algorithm
    * identifiers are supported:
    * `SCRYPT`, `STANDARD_SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`, `HMAC_SHA1`,
    * `HMAC_MD5`, `MD5`, `PBKDF_SHA1`, `BCRYPT`, `PBKDF2_SHA256`, `SHA512`,
    * `SHA256` and `SHA1`.
    */
  var algorithm: HashAlgorithmType
  /**
    * The block size (normally 8) of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var blockSize: js.UndefOr[Double] = js.undefined
  /**
    * The derived key length of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var derivedKeyLength: js.UndefOr[Double] = js.undefined
  /**
    * The signing key used in the hash algorithm in buffer bytes.
    * Required by hashing algorithms `SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`,
    * `HAMC_SHA1` and `HMAC_MD5`.
    */
  var key: js.UndefOr[Buffer] = js.undefined
  /**
    * The memory cost required for `SCRYPT` algorithm, or the CPU/memory cost.
    * Required for `STANDARD_SCRYPT` algorithm.
    */
  var memoryCost: js.UndefOr[Double] = js.undefined
  /**
    * The parallelization of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var parallelization: js.UndefOr[Double] = js.undefined
  /**
    * The number of rounds for hashing calculation.
    * Required for `SCRYPT`, `MD5`, `SHA512`, `SHA256`, `SHA1`, `PBKDF_SHA1` and
    * `PBKDF2_SHA256`.
    */
  var rounds: js.UndefOr[Double] = js.undefined
  /**
    * The salt separator in buffer bytes which is appended to salt when
    * verifying a password. This is only used by the `SCRYPT` algorithm.
    */
  var saltSeparator: js.UndefOr[String] = js.undefined
}

object Anon_Algorithm {
  @scala.inline
  def apply(
    algorithm: HashAlgorithmType,
    blockSize: Int | Double = null,
    derivedKeyLength: Int | Double = null,
    key: Buffer = null,
    memoryCost: Int | Double = null,
    parallelization: Int | Double = null,
    rounds: Int | Double = null,
    saltSeparator: String = null
  ): Anon_Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (derivedKeyLength != null) __obj.updateDynamic("derivedKeyLength")(derivedKeyLength.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (memoryCost != null) __obj.updateDynamic("memoryCost")(memoryCost.asInstanceOf[js.Any])
    if (parallelization != null) __obj.updateDynamic("parallelization")(parallelization.asInstanceOf[js.Any])
    if (rounds != null) __obj.updateDynamic("rounds")(rounds.asInstanceOf[js.Any])
    if (saltSeparator != null) __obj.updateDynamic("saltSeparator")(saltSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

