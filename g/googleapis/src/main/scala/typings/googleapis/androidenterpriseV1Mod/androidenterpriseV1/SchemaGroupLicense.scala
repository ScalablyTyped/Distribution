package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Group license objects allow you to keep track of licenses (called
  * entitlements) for both free and paid apps. For a free app, a group license
  * is created when an enterprise admin first approves the product in Google
  * Play or when the first entitlement for the product is created for a user
  * via the API. For a paid app, a group license object is only created when an
  * enterprise admin purchases the product in Google Play for the first time.
  * Use the API to query group licenses. A Grouplicenses resource includes the
  * total number of licenses purchased (paid apps only) and the total number of
  * licenses currently in use. In other words, the total number of Entitlements
  * that exist for the product.  Only one group license object is created per
  * product and group license objects are never deleted. If a product is
  * unapproved, its group license remains. This allows enterprise admins to
  * keep track of any remaining entitlements for the product.
  */
@js.native
trait SchemaGroupLicense extends js.Object {
  /**
    * How this group license was acquired. &quot;bulkPurchase&quot; means that
    * this Grouplicenses resource was created because the enterprise purchased
    * licenses for this product; otherwise, the value is &quot;free&quot; (for
    * free products).
    */
  var acquisitionKind: js.UndefOr[String] = js.native
  /**
    * Whether the product to which this group license relates is currently
    * approved by the enterprise. Products are approved when a group license is
    * first created, but this approval may be revoked by an enterprise admin
    * via Google Play. Unapproved products will not be visible to end users in
    * collections, and new entitlements to them should not normally be created.
    */
  var approval: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#groupLicense&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The total number of provisioned licenses for this product. Returned by
    * read operations, but ignored in write operations.
    */
  var numProvisioned: js.UndefOr[Double] = js.native
  /**
    * The number of purchased licenses (possibly in multiple purchases). If
    * this field is omitted, then there is no limit on the number of licenses
    * that can be provisioned (for example, if the acquisition kind is
    * &quot;free&quot;).
    */
  var numPurchased: js.UndefOr[Double] = js.native
  /**
    * The permission approval status of the product. This field is only set if
    * the product is approved. Possible states are:  -
    * &quot;currentApproved&quot;, the current set of permissions is approved,
    * but additional permissions will require the administrator to reapprove
    * the product (If the product was approved without specifying the approved
    * permissions setting, then this is the default behavior.),  -
    * &quot;needsReapproval&quot;, the product has unapproved permissions. No
    * additional product licenses can be assigned until the product is
    * reapproved,  - &quot;allCurrentAndFutureApproved&quot;, the current
    * permissions are approved and any future permission updates will be
    * automatically approved without administrator review.
    */
  var permissions: js.UndefOr[String] = js.native
  /**
    * The ID of the product that the license is for. For example,
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaGroupLicense {
  @scala.inline
  def apply(): SchemaGroupLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLicense]
  }
  @scala.inline
  implicit class SchemaGroupLicenseOps[Self <: SchemaGroupLicense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcquisitionKind(value: String): Self = this.set("acquisitionKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcquisitionKind: Self = this.set("acquisitionKind", js.undefined)
    @scala.inline
    def setApproval(value: String): Self = this.set("approval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproval: Self = this.set("approval", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNumProvisioned(value: Double): Self = this.set("numProvisioned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumProvisioned: Self = this.set("numProvisioned", js.undefined)
    @scala.inline
    def setNumPurchased(value: Double): Self = this.set("numPurchased", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumPurchased: Self = this.set("numPurchased", js.undefined)
    @scala.inline
    def setPermissions(value: String): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
  
}

