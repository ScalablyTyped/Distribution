package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyUploadAccountRequest extends js.Object {
  /** Whether allow overwrite existing account when user local_id exists. */
  var allowOverwrite: js.UndefOr[Boolean] = js.undefined
  var blockSize: js.UndefOr[Double] = js.undefined
  /** The following 4 fields are for standard scrypt algorithm. */
  var cpuMemCost: js.UndefOr[Double] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  var dkLen: js.UndefOr[Double] = js.undefined
  /** The password hash algorithm. */
  var hashAlgorithm: js.UndefOr[String] = js.undefined
  /** Memory cost for hash calculation. Used by scrypt similar algorithms. */
  var memoryCost: js.UndefOr[Double] = js.undefined
  var parallelization: js.UndefOr[Double] = js.undefined
  /** Rounds for hash calculation. Used by scrypt and similar algorithms. */
  var rounds: js.UndefOr[Double] = js.undefined
  /** The salt separator. */
  var saltSeparator: js.UndefOr[String] = js.undefined
  /** If true, backend will do sanity check(including duplicate email and federated id) when uploading account. */
  var sanityCheck: js.UndefOr[Boolean] = js.undefined
  /** The key for to hash the password. */
  var signerKey: js.UndefOr[String] = js.undefined
  /** Specify which project (field value is actually project id) to operate. Only used when provided credential. */
  var targetProjectId: js.UndefOr[String] = js.undefined
  /** The account info to be stored. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}

object IdentitytoolkitRelyingpartyUploadAccountRequest {
  @scala.inline
  def apply(
    allowOverwrite: js.UndefOr[Boolean] = js.undefined,
    blockSize: Int | Double = null,
    cpuMemCost: Int | Double = null,
    delegatedProjectNumber: String = null,
    dkLen: Int | Double = null,
    hashAlgorithm: String = null,
    memoryCost: Int | Double = null,
    parallelization: Int | Double = null,
    rounds: Int | Double = null,
    saltSeparator: String = null,
    sanityCheck: js.UndefOr[Boolean] = js.undefined,
    signerKey: String = null,
    targetProjectId: String = null,
    users: js.Array[UserInfo] = null
  ): IdentitytoolkitRelyingpartyUploadAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverwrite)) __obj.updateDynamic("allowOverwrite")(allowOverwrite.asInstanceOf[js.Any])
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (cpuMemCost != null) __obj.updateDynamic("cpuMemCost")(cpuMemCost.asInstanceOf[js.Any])
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (dkLen != null) __obj.updateDynamic("dkLen")(dkLen.asInstanceOf[js.Any])
    if (hashAlgorithm != null) __obj.updateDynamic("hashAlgorithm")(hashAlgorithm.asInstanceOf[js.Any])
    if (memoryCost != null) __obj.updateDynamic("memoryCost")(memoryCost.asInstanceOf[js.Any])
    if (parallelization != null) __obj.updateDynamic("parallelization")(parallelization.asInstanceOf[js.Any])
    if (rounds != null) __obj.updateDynamic("rounds")(rounds.asInstanceOf[js.Any])
    if (saltSeparator != null) __obj.updateDynamic("saltSeparator")(saltSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(sanityCheck)) __obj.updateDynamic("sanityCheck")(sanityCheck.asInstanceOf[js.Any])
    if (signerKey != null) __obj.updateDynamic("signerKey")(signerKey.asInstanceOf[js.Any])
    if (targetProjectId != null) __obj.updateDynamic("targetProjectId")(targetProjectId.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyUploadAccountRequest]
  }
}

