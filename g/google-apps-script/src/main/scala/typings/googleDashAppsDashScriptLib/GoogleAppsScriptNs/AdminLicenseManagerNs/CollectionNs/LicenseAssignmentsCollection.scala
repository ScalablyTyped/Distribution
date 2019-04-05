package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseAssignmentsCollection extends js.Object {
  // Get license assignment of a particular product and sku for a user
  def get(productId: java.lang.String, skuId: java.lang.String, userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment = js.native
  // Assign License.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignmentInsert,
    productId: java.lang.String,
    skuId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment = js.native
  // List license assignments for given product of the customer.
  def listForProduct(productId: java.lang.String, customerId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignmentList = js.native
  // List license assignments for given product of the customer.
  def listForProduct(productId: java.lang.String, customerId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignmentList = js.native
  // List license assignments for given product and sku of the customer.
  def listForProductAndSku(productId: java.lang.String, skuId: java.lang.String, customerId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignmentList = js.native
  // List license assignments for given product and sku of the customer.
  def listForProductAndSku(
    productId: java.lang.String,
    skuId: java.lang.String,
    customerId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignmentList = js.native
  // Assign License. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment,
    productId: java.lang.String,
    skuId: java.lang.String,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment = js.native
  // Revoke License.
  def remove(productId: java.lang.String, skuId: java.lang.String, userId: java.lang.String): scala.Unit = js.native
  // Assign License.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment,
    productId: java.lang.String,
    skuId: java.lang.String,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment = js.native
}

