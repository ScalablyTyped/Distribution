package typings
package gapiDotClientDotLicensingLib.gapiNs.clientNs.licensingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentsResource extends js.Object {
  /** Revoke License. */
  def delete(request: gapiDotClientDotLicensingLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get license assignment of a particular product and sku for a user */
  def get(request: gapiDotClientDotLicensingLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignment]
  /** Assign License. */
  def insert(request: gapiDotClientDotLicensingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignment]
  /** List license assignments for given product of the customer. */
  def listForProduct(request: gapiDotClientDotLicensingLib.Anon_AltCustomerId): gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignmentList]
  /** List license assignments for given product and sku of the customer. */
  def listForProductAndSku(request: gapiDotClientDotLicensingLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignmentList]
  /** Assign License. This method supports patch semantics. */
  def patch(request: gapiDotClientDotLicensingLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignment]
  /** Assign License. */
  def update(request: gapiDotClientDotLicensingLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignment]
}

object LicenseAssignmentsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotLicensingLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotLicensingLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignment],
    insert: gapiDotClientDotLicensingLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignment],
    listForProduct: gapiDotClientDotLicensingLib.Anon_AltCustomerId => gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignmentList],
    listForProductAndSku: gapiDotClientDotLicensingLib.Anon_AltCustomerIdFields => gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignmentList],
    patch: gapiDotClientDotLicensingLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignment],
    update: gapiDotClientDotLicensingLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[LicenseAssignment]
  ): LicenseAssignmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), listForProduct = js.Any.fromFunction1(listForProduct), listForProductAndSku = js.Any.fromFunction1(listForProductAndSku), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LicenseAssignmentsResource]
  }
}

