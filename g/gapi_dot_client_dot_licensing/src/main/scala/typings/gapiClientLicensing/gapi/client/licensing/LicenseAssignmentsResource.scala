package typings.gapiClientLicensing.gapi.client.licensing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLicensing.anon.Alt
import typings.gapiClientLicensing.anon.CustomerId
import typings.gapiClientLicensing.anon.Fields
import typings.gapiClientLicensing.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentsResource extends js.Object {
  /** Revoke License. */
  def delete(request: Alt): Request[Unit]
  /** Get license assignment of a particular product and sku for a user */
  def get(request: Alt): Request[LicenseAssignment]
  /** Assign License. */
  def insert(request: Fields): Request[LicenseAssignment]
  /** List license assignments for given product of the customer. */
  def listForProduct(request: CustomerId): Request[LicenseAssignmentList]
  /** List license assignments for given product and sku of the customer. */
  def listForProductAndSku(request: Key): Request[LicenseAssignmentList]
  /** Assign License. This method supports patch semantics. */
  def patch(request: Alt): Request[LicenseAssignment]
  /** Assign License. */
  def update(request: Alt): Request[LicenseAssignment]
}

object LicenseAssignmentsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[LicenseAssignment],
    insert: Fields => Request[LicenseAssignment],
    listForProduct: CustomerId => Request[LicenseAssignmentList],
    listForProductAndSku: Key => Request[LicenseAssignmentList],
    patch: Alt => Request[LicenseAssignment],
    update: Alt => Request[LicenseAssignment]
  ): LicenseAssignmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), listForProduct = js.Any.fromFunction1(listForProduct), listForProductAndSku = js.Any.fromFunction1(listForProductAndSku), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LicenseAssignmentsResource]
  }
}

