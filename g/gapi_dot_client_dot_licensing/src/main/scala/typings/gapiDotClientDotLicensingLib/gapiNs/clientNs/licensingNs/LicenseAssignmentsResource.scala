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

