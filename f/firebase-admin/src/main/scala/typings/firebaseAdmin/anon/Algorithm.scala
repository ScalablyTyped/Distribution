package typings.firebaseAdmin.anon

import typings.firebaseAdmin.authMod.admin.auth.HashAlgorithmType
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
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
  var saltSeparator: js.UndefOr[Buffer] = js.undefined
}

object Algorithm {
  @scala.inline
  def apply(
    algorithm: HashAlgorithmType,
    blockSize: js.UndefOr[Double] = js.undefined,
    derivedKeyLength: js.UndefOr[Double] = js.undefined,
    key: Buffer = null,
    memoryCost: js.UndefOr[Double] = js.undefined,
    parallelization: js.UndefOr[Double] = js.undefined,
    rounds: js.UndefOr[Double] = js.undefined,
    saltSeparator: Buffer = null
  ): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(blockSize)) __obj.updateDynamic("blockSize")(blockSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(derivedKeyLength)) __obj.updateDynamic("derivedKeyLength")(derivedKeyLength.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryCost)) __obj.updateDynamic("memoryCost")(memoryCost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelization)) __obj.updateDynamic("parallelization")(parallelization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rounds)) __obj.updateDynamic("rounds")(rounds.get.asInstanceOf[js.Any])
    if (saltSeparator != null) __obj.updateDynamic("saltSeparator")(saltSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
}

