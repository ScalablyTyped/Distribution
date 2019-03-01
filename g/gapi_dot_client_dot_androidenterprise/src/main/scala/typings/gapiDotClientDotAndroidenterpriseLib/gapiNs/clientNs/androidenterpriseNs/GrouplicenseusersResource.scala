package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicenseusersResource extends js.Object {
  /** Retrieves the IDs of the users who have been granted entitlements under the license. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsGroupLicenseId): gapiDotClientLib.gapiNs.clientNs.Request[GroupLicenseUsersListResponse]
}

object GrouplicenseusersResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsGroupLicenseId, 
      gapiDotClientLib.gapiNs.clientNs.Request[GroupLicenseUsersListResponse]
    ]
  ): GrouplicenseusersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[GrouplicenseusersResource]
  }
}

