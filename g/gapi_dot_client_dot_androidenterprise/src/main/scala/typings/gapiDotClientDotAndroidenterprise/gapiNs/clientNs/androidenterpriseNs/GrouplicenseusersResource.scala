package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFieldsGroupLicenseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicenseusersResource extends js.Object {
  /** Retrieves the IDs of the users who have been granted entitlements under the license. */
  def list(request: Anon_AltEnterpriseIdFieldsGroupLicenseId): Request[GroupLicenseUsersListResponse]
}

object GrouplicenseusersResource {
  @scala.inline
  def apply(list: Anon_AltEnterpriseIdFieldsGroupLicenseId => Request[GroupLicenseUsersListResponse]): GrouplicenseusersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GrouplicenseusersResource]
  }
}

