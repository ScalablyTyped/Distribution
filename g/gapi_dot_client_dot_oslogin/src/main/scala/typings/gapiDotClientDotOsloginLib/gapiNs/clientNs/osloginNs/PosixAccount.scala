package typings
package gapiDotClientDotOsloginLib.gapiNs.clientNs.osloginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosixAccount extends js.Object {
  /** The GECOS (user information) entry for this account. */
  var gecos: js.UndefOr[java.lang.String] = js.undefined
  /** The default group ID. */
  var gid: js.UndefOr[java.lang.String] = js.undefined
  /** The path to the home directory for this account. */
  var homeDirectory: js.UndefOr[java.lang.String] = js.undefined
  /** Only one POSIX account can be marked as primary. */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /** The path to the logic shell for this account. */
  var shell: js.UndefOr[java.lang.String] = js.undefined
  /**
    * System identifier for which account the username or uid applies to.
    * By default, the empty value is used.
    */
  var systemId: js.UndefOr[java.lang.String] = js.undefined
  /** The user ID. */
  var uid: js.UndefOr[java.lang.String] = js.undefined
  /** The username of the POSIX account. */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

