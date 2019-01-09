package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /**
    * Approves the specified product and the relevant app permissions, if any. The maximum number of products that you can approve per enterprise customer is
    * 1,000.
    *
    * To learn how to use managed Google Play to design and create a store layout to display approved products to your users, see Store Layout Design.
    */
  def approve(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Generates a URL that can be rendered in an iframe to display the permissions (if any) of a product. An enterprise admin must view these permissions and
    * accept them on behalf of their organization in order to approve that product.
    *
    * Admins should accept the displayed permissions by interacting with a separate UI element in the EMM console, which in turn should trigger the use of
    * this URL as the approvalUrlInfo.approvalUrl property in a Products.approve call to approve the product. This URL can only be used to display
    * permissions for up to 1 day.
    */
  def generateApprovalUrl(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyLanguageCode): gapiDotClientLib.gapiNs.clientNs.Request[ProductsGenerateApprovalUrlResponse]
  /** Retrieves details of a product for display to an enterprise admin. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyLanguage): gapiDotClientLib.gapiNs.clientNs.Request[Product]
  /**
    * Retrieves the schema that defines the configurable properties for this product. All products have a schema, but this schema may be empty if no managed
    * configurations have been defined. This schema can be used to populate a UI that allows an admin to configure the product. To apply a managed
    * configuration based on the schema obtained using this API, see Managed Configurations through Play.
    */
  def getAppRestrictionsSchema(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyLanguage): gapiDotClientLib.gapiNs.clientNs.Request[AppRestrictionsSchema]
  /** Retrieves the Android app permissions required by this app. */
  def getPermissions(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ProductPermissions]
  /** Finds approved products that match a query, or all approved products if there is no query. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltApproved): gapiDotClientLib.gapiNs.clientNs.Request[ProductsListResponse]
  /** Unapproves the specified product (and the relevant app permissions, if any) */
  def unapprove(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

