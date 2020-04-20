package typings.gapiClientLicensing.gapi.client.licensing

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientLicensing.AnonAlt
import typings.gapiClientLicensing.AnonCustomerId
import typings.gapiClientLicensing.AnonFields
import typings.gapiClientLicensing.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentsResource extends js.Object {
  /** Revoke License. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Get license assignment of a particular product and sku for a user */
  def get(request: AnonAlt): Request_[LicenseAssignment]
  /** Assign License. */
  def insert(request: AnonFields): Request_[LicenseAssignment]
  /** List license assignments for given product of the customer. */
  def listForProduct(request: AnonCustomerId): Request_[LicenseAssignmentList]
  /** List license assignments for given product and sku of the customer. */
  def listForProductAndSku(request: AnonKey): Request_[LicenseAssignmentList]
  /** Assign License. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[LicenseAssignment]
  /** Assign License. */
  def update(request: AnonAlt): Request_[LicenseAssignment]
}

object LicenseAssignmentsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[LicenseAssignment],
    insert: AnonFields => Request_[LicenseAssignment],
    listForProduct: AnonCustomerId => Request_[LicenseAssignmentList],
    listForProductAndSku: AnonKey => Request_[LicenseAssignmentList],
    patch: AnonAlt => Request_[LicenseAssignment],
    update: AnonAlt => Request_[LicenseAssignment]
  ): LicenseAssignmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), listForProduct = js.Any.fromFunction1(listForProduct), listForProductAndSku = js.Any.fromFunction1(listForProductAndSku), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LicenseAssignmentsResource]
  }
}

