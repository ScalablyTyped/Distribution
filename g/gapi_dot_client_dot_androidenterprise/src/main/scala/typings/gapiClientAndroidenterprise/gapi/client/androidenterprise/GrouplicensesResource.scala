package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseIdFields
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseIdFieldsGroupLicenseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicensesResource extends js.Object {
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: AnonAltEnterpriseIdFieldsGroupLicenseId): Request_[GroupLicense]
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: AnonAltEnterpriseIdFields): Request_[GroupLicensesListResponse]
}

object GrouplicensesResource {
  @scala.inline
  def apply(
    get: AnonAltEnterpriseIdFieldsGroupLicenseId => Request_[GroupLicense],
    list: AnonAltEnterpriseIdFields => Request_[GroupLicensesListResponse]
  ): GrouplicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GrouplicensesResource]
  }
}

