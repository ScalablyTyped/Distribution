package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermission extends js.Object {
  /**
    * Account profiles associated with this account permission.
    *
    * Possible values are:
    * - "ACCOUNT_PROFILE_BASIC"
    * - "ACCOUNT_PROFILE_STANDARD"
    */
  var accountProfiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** ID of this account permission. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermission". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Administrative level required to enable this account permission. */
  var level: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this account permission. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Permission group of this account permission. */
  var permissionGroupId: js.UndefOr[java.lang.String] = js.undefined
}

