package typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager

import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignment
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignmentInsert
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignmentList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.AdminLicenseManager.Collection")
@js.native
object Collection extends js.Object {
  @js.native
  trait LicenseAssignmentsCollection extends js.Object {
    // Get license assignment of a particular product and sku for a user
    def get(productId: String, skuId: String, userId: String): LicenseAssignment = js.native
    // Assign License.
    def insert(resource: LicenseAssignmentInsert, productId: String, skuId: String): LicenseAssignment = js.native
    // List license assignments for given product of the customer.
    def listForProduct(productId: String, customerId: String): LicenseAssignmentList = js.native
    // List license assignments for given product of the customer.
    def listForProduct(productId: String, customerId: String, optionalArgs: js.Object): LicenseAssignmentList = js.native
    // List license assignments for given product and sku of the customer.
    def listForProductAndSku(productId: String, skuId: String, customerId: String): LicenseAssignmentList = js.native
    // List license assignments for given product and sku of the customer.
    def listForProductAndSku(productId: String, skuId: String, customerId: String, optionalArgs: js.Object): LicenseAssignmentList = js.native
    // Assign License. This method supports patch semantics.
    def patch(resource: LicenseAssignment, productId: String, skuId: String, userId: String): LicenseAssignment = js.native
    // Revoke License.
    def remove(productId: String, skuId: String, userId: String): Unit = js.native
    // Assign License.
    def update(resource: LicenseAssignment, productId: String, skuId: String, userId: String): LicenseAssignment = js.native
  }
  
}

