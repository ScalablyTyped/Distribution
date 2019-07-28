package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFields
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFieldsGroupLicenseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicensesResource extends js.Object {
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: Anon_AltEnterpriseIdFieldsGroupLicenseId): Request[GroupLicense]
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: Anon_AltEnterpriseIdFields): Request[GroupLicensesListResponse]
}

object GrouplicensesResource {
  @scala.inline
  def apply(
    get: Anon_AltEnterpriseIdFieldsGroupLicenseId => Request[GroupLicense],
    list: Anon_AltEnterpriseIdFields => Request[GroupLicensesListResponse]
  ): GrouplicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GrouplicensesResource]
  }
}

