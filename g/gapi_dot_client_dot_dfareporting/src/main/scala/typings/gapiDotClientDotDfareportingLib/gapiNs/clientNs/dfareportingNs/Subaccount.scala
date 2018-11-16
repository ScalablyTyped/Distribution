package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Subaccount extends js.Object {
  /** ID of the account that contains this subaccount. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** IDs of the available user role permissions for this subaccount. */
  var availablePermissionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** ID of this subaccount. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#subaccount". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this subaccount. This is a required field. Must be less than 128 characters long and be unique among subaccounts of the same account. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

