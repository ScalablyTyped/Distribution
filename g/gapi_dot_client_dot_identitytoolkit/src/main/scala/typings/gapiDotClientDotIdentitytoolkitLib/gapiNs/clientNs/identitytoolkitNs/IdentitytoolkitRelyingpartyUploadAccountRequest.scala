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

