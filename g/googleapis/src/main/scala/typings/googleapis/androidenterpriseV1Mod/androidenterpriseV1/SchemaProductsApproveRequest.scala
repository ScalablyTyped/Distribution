package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductsApproveRequest extends StObject {
  
  /**
    * The approval URL that was shown to the user. Only the permissions shown to the user with that URL will be accepted, which may not be the product's entire set of permissions. For example, the URL may only display new permissions from an update after the product was approved, or not include new permissions if the product was updated since the URL was generated.
    */
  var approvalUrlInfo: js.UndefOr[SchemaApprovalUrlInfo] = js.undefined
  
  /**
    * Sets how new permission requests for the product are handled. "allPermissions" automatically approves all current and future permissions for the product. "currentPermissionsOnly" approves the current set of permissions for the product, but any future permissions added through updates will require manual reapproval. If not specified, only the current set of permissions will be approved.
    */
  var approvedPermissions: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductsApproveRequest {
  
  inline def apply(): SchemaProductsApproveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductsApproveRequest]
  }
  
  extension [Self <: SchemaProductsApproveRequest](x: Self) {
    
    inline def setApprovalUrlInfo(value: SchemaApprovalUrlInfo): Self = StObject.set(x, "approvalUrlInfo", value.asInstanceOf[js.Any])
    
    inline def setApprovalUrlInfoUndefined: Self = StObject.set(x, "approvalUrlInfo", js.undefined)
    
    inline def setApprovedPermissions(value: String): Self = StObject.set(x, "approvedPermissions", value.asInstanceOf[js.Any])
    
    inline def setApprovedPermissionsNull: Self = StObject.set(x, "approvedPermissions", null)
    
    inline def setApprovedPermissionsUndefined: Self = StObject.set(x, "approvedPermissions", js.undefined)
  }
}
