package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLicense extends js.Object {
  /**
    * How this group license was acquired. "bulkPurchase" means that this Grouplicenses resource was created because the enterprise purchased licenses for
    * this product; otherwise, the value is "free" (for free products).
    */
  var acquisitionKind: js.UndefOr[String] = js.native
  /**
    * Whether the product to which this group license relates is currently approved by the enterprise. Products are approved when a group license is first
    * created, but this approval may be revoked by an enterprise admin via Google Play. Unapproved products will not be visible to end users in collections,
    * and new entitlements to them should not normally be created.
    */
  var approval: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#groupLicense". */
  var kind: js.UndefOr[String] = js.native
  /** The total number of provisioned licenses for this product. Returned by read operations, but ignored in write operations. */
  var numProvisioned: js.UndefOr[Double] = js.native
  /**
    * The number of purchased licenses (possibly in multiple purchases). If this field is omitted, then there is no limit on the number of licenses that can
    * be provisioned (for example, if the acquisition kind is "free").
    */
  var numPurchased: js.UndefOr[Double] = js.native
  /**
    * The permission approval status of the product. This field is only set if the product is approved. Possible states are:
    * - "currentApproved", the current set of permissions is approved, but additional permissions will require the administrator to reapprove the product (If
    * the product was approved without specifying the approved permissions setting, then this is the default behavior.),
    * - "needsReapproval", the product has unapproved permissions. No additional product licenses can be assigned until the product is reapproved,
    * - "allCurrentAndFutureApproved", the current permissions are approved and any future permission updates will be automatically approved without
    * administrator review.
    */
  var permissions: js.UndefOr[String] = js.native
  /** The ID of the product that the license is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.native
}

object GroupLicense {
  @scala.inline
  def apply(): GroupLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicense]
  }
  @scala.inline
  implicit class GroupLicenseOps[Self <: GroupLicense] (val x: Self) extends AnyVal {
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

