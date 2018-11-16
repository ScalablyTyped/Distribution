package typings
package gapiDotClientDotOsloginLib.gapiNs.clientNs.osloginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoginProfile extends js.Object {
  /** A unique user ID for identifying the user. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The list of POSIX accounts associated with the Directory API user. */
  var posixAccounts: js.UndefOr[js.Array[PosixAccount]] = js.undefined
  /** A map from SSH public key fingerprint to the associated key object. */
  var sshPublicKeys: js.UndefOr[stdLib.Record[java.lang.String, SshPublicKey]] = js.undefined
  /** Indicates if the user is suspended. */
  var suspended: js.UndefOr[scala.Boolean] = js.undefined
}

