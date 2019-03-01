package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyUploadAccountRequest extends js.Object {
  /** Whether allow overwrite existing account when user local_id exists. */
  var allowOverwrite: js.UndefOr[scala.Boolean] = js.undefined
  var blockSize: js.UndefOr[scala.Double] = js.undefined
  /** The following 4 fields are for standard scrypt algorithm. */
  var cpuMemCost: js.UndefOr[scala.Double] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  var dkLen: js.UndefOr[scala.Double] = js.undefined
  /** The password hash algorithm. */
  var hashAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /** Memory cost for hash calculation. Used by scrypt similar algorithms. */
  var memoryCost: js.UndefOr[scala.Double] = js.undefined
  var parallelization: js.UndefOr[scala.Double] = js.undefined
  /** Rounds for hash calculation. Used by scrypt and similar algorithms. */
  var rounds: js.UndefOr[scala.Double] = js.undefined
  /** The salt separator. */
  var saltSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** If true, backend will do sanity check(including duplicate email and federated id) when uploading account. */
  var sanityCheck: js.UndefOr[scala.Boolean] = js.undefined
  /** The key for to hash the password. */
  var signerKey: js.UndefOr[java.lang.String] = js.undefined
  /** Specify which project (field value is actually project id) to operate. Only used when provided credential. */
  var targetProjectId: js.UndefOr[java.lang.String] = js.undefined
  /** The account info to be stored. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}

object IdentitytoolkitRelyingpartyUploadAccountRequest {
  @scala.inline
  def apply(
    allowOverwrite: js.UndefOr[scala.Boolean] = js.undefined,
    blockSize: scala.Int | scala.Double = null,
    cpuMemCost: scala.Int | scala.Double = null,
    delegatedProjectNumber: java.lang.String = null,
    dkLen: scala.Int | scala.Double = null,
    hashAlgorithm: java.lang.String = null,
    memoryCost: scala.Int | scala.Double = null,
    parallelization: scala.Int | scala.Double = null,
    rounds: scala.Int | scala.Double = null,
    saltSeparator: java.lang.String = null,
    sanityCheck: js.UndefOr[scala.Boolean] = js.undefined,
    signerKey: java.lang.String = null,
    targetProjectId: java.lang.String = null,
    users: js.Array[UserInfo] = null
  ): IdentitytoolkitRelyingpartyUploadAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverwrite)) __obj.updateDynamic("allowOverwrite")(allowOverwrite)
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (cpuMemCost != null) __obj.updateDynamic("cpuMemCost")(cpuMemCost.asInstanceOf[js.Any])
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber)
    if (dkLen != null) __obj.updateDynamic("dkLen")(dkLen.asInstanceOf[js.Any])
    if (hashAlgorithm != null) __obj.updateDynamic("hashAlgorithm")(hashAlgorithm)
    if (memoryCost != null) __obj.updateDynamic("memoryCost")(memoryCost.asInstanceOf[js.Any])
    if (parallelization != null) __obj.updateDynamic("parallelization")(parallelization.asInstanceOf[js.Any])
    if (rounds != null) __obj.updateDynamic("rounds")(rounds.asInstanceOf[js.Any])
    if (saltSeparator != null) __obj.updateDynamic("saltSeparator")(saltSeparator)
    if (!js.isUndefined(sanityCheck)) __obj.updateDynamic("sanityCheck")(sanityCheck)
    if (signerKey != null) __obj.updateDynamic("signerKey")(signerKey)
    if (targetProjectId != null) __obj.updateDynamic("targetProjectId")(targetProjectId)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyUploadAccountRequest]
  }
}

