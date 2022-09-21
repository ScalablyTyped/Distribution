package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupLicense extends StObject {
  
  /**
    * How this group license was acquired. "bulkPurchase" means that this Grouplicenses resource was created because the enterprise purchased licenses for this product; otherwise, the value is "free" (for free products).
    */
  var acquisitionKind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the product to which this group license relates is currently approved by the enterprise. Products are approved when a group license is first created, but this approval may be revoked by an enterprise admin via Google Play. Unapproved products will not be visible to end users in collections, and new entitlements to them should not normally be created.
    */
  var approval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of provisioned licenses for this product. Returned by read operations, but ignored in write operations.
    */
  var numProvisioned: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of purchased licenses (possibly in multiple purchases). If this field is omitted, then there is no limit on the number of licenses that can be provisioned (for example, if the acquisition kind is "free").
    */
  var numPurchased: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The permission approval status of the product. This field is only set if the product is approved. Possible states are: - "currentApproved", the current set of permissions is approved, but additional permissions will require the administrator to reapprove the product (If the product was approved without specifying the approved permissions setting, then this is the default behavior.), - "needsReapproval", the product has unapproved permissions. No additional product licenses can be assigned until the product is reapproved, - "allCurrentAndFutureApproved", the current permissions are approved and any future permission updates will be automatically approved without administrator review.
    */
  var permissions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the product that the license is for. For example, "app:com.google.android.gm".
    */
  var productId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroupLicense {
  
  inline def apply(): SchemaGroupLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLicense]
  }
  
  extension [Self <: SchemaGroupLicense](x: Self) {
    
    inline def setAcquisitionKind(value: String): Self = StObject.set(x, "acquisitionKind", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionKindNull: Self = StObject.set(x, "acquisitionKind", null)
    
    inline def setAcquisitionKindUndefined: Self = StObject.set(x, "acquisitionKind", js.undefined)
    
    inline def setApproval(value: String): Self = StObject.set(x, "approval", value.asInstanceOf[js.Any])
    
    inline def setApprovalNull: Self = StObject.set(x, "approval", null)
    
    inline def setApprovalUndefined: Self = StObject.set(x, "approval", js.undefined)
    
    inline def setNumProvisioned(value: Double): Self = StObject.set(x, "numProvisioned", value.asInstanceOf[js.Any])
    
    inline def setNumProvisionedNull: Self = StObject.set(x, "numProvisioned", null)
    
    inline def setNumProvisionedUndefined: Self = StObject.set(x, "numProvisioned", js.undefined)
    
    inline def setNumPurchased(value: Double): Self = StObject.set(x, "numPurchased", value.asInstanceOf[js.Any])
    
    inline def setNumPurchasedNull: Self = StObject.set(x, "numPurchased", null)
    
    inline def setNumPurchasedUndefined: Self = StObject.set(x, "numPurchased", js.undefined)
    
    inline def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
