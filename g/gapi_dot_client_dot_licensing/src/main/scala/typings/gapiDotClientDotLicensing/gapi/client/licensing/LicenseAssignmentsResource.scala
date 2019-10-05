package typings.gapiDotClientDotLicensing.gapi.client.licensing

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotLicensing.Anon_Alt
import typings.gapiDotClientDotLicensing.Anon_AltCustomerId
import typings.gapiDotClientDotLicensing.Anon_AltCustomerIdFields
import typings.gapiDotClientDotLicensing.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentsResource extends js.Object {
  /** Revoke License. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Get license assignment of a particular product and sku for a user */
  def get(request: Anon_Alt): Request[LicenseAssignment]
  /** Assign License. */
  def insert(request: Anon_AltFields): Request[LicenseAssignment]
  /** List license assignments for given product of the customer. */
  def listForProduct(request: Anon_AltCustomerId): Request[LicenseAssignmentList]
  /** List license assignments for given product and sku of the customer. */
  def listForProductAndSku(request: Anon_AltCustomerIdFields): Request[LicenseAssignmentList]
  /** Assign License. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[LicenseAssignment]
  /** Assign License. */
  def update(request: Anon_Alt): Request[LicenseAssignment]
}

object LicenseAssignmentsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[LicenseAssignment],
    insert: Anon_AltFields => Request[LicenseAssignment],
    listForProduct: Anon_AltCustomerId => Request[LicenseAssignmentList],
    listForProductAndSku: Anon_AltCustomerIdFields => Request[LicenseAssignmentList],
    patch: Anon_Alt => Request[LicenseAssignment],
    update: Anon_Alt => Request[LicenseAssignment]
  ): LicenseAssignmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), listForProduct = js.Any.fromFunction1(listForProduct), listForProductAndSku = js.Any.fromFunction1(listForProductAndSku), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LicenseAssignmentsResource]
  }
}

