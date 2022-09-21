package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDevicePolicy extends StObject {
  
  /**
    * Allowed device management levels, an empty list allows all management levels.
    */
  var allowedDeviceManagementLevels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Allowed encryptions statuses, an empty list allows all statuses.
    */
  var allowedEncryptionStatuses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Allowed OS versions, an empty list allows all types and all versions.
    */
  var osConstraints: js.UndefOr[js.Array[SchemaOsConstraint]] = js.undefined
  
  /**
    * Whether the device needs to be approved by the customer admin.
    */
  var requireAdminApproval: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the device needs to be corp owned.
    */
  var requireCorpOwned: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
    */
  var requireScreenlock: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDevicePolicy {
  
  inline def apply(): SchemaDevicePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicePolicy]
  }
  
  extension [Self <: SchemaDevicePolicy](x: Self) {
    
    inline def setAllowedDeviceManagementLevels(value: js.Array[String]): Self = StObject.set(x, "allowedDeviceManagementLevels", value.asInstanceOf[js.Any])
    
    inline def setAllowedDeviceManagementLevelsNull: Self = StObject.set(x, "allowedDeviceManagementLevels", null)
    
    inline def setAllowedDeviceManagementLevelsUndefined: Self = StObject.set(x, "allowedDeviceManagementLevels", js.undefined)
    
    inline def setAllowedDeviceManagementLevelsVarargs(value: String*): Self = StObject.set(x, "allowedDeviceManagementLevels", js.Array(value*))
    
    inline def setAllowedEncryptionStatuses(value: js.Array[String]): Self = StObject.set(x, "allowedEncryptionStatuses", value.asInstanceOf[js.Any])
    
    inline def setAllowedEncryptionStatusesNull: Self = StObject.set(x, "allowedEncryptionStatuses", null)
    
    inline def setAllowedEncryptionStatusesUndefined: Self = StObject.set(x, "allowedEncryptionStatuses", js.undefined)
    
    inline def setAllowedEncryptionStatusesVarargs(value: String*): Self = StObject.set(x, "allowedEncryptionStatuses", js.Array(value*))
    
    inline def setOsConstraints(value: js.Array[SchemaOsConstraint]): Self = StObject.set(x, "osConstraints", value.asInstanceOf[js.Any])
    
    inline def setOsConstraintsUndefined: Self = StObject.set(x, "osConstraints", js.undefined)
    
    inline def setOsConstraintsVarargs(value: SchemaOsConstraint*): Self = StObject.set(x, "osConstraints", js.Array(value*))
    
    inline def setRequireAdminApproval(value: Boolean): Self = StObject.set(x, "requireAdminApproval", value.asInstanceOf[js.Any])
    
    inline def setRequireAdminApprovalNull: Self = StObject.set(x, "requireAdminApproval", null)
    
    inline def setRequireAdminApprovalUndefined: Self = StObject.set(x, "requireAdminApproval", js.undefined)
    
    inline def setRequireCorpOwned(value: Boolean): Self = StObject.set(x, "requireCorpOwned", value.asInstanceOf[js.Any])
    
    inline def setRequireCorpOwnedNull: Self = StObject.set(x, "requireCorpOwned", null)
    
    inline def setRequireCorpOwnedUndefined: Self = StObject.set(x, "requireCorpOwned", js.undefined)
    
    inline def setRequireScreenlock(value: Boolean): Self = StObject.set(x, "requireScreenlock", value.asInstanceOf[js.Any])
    
    inline def setRequireScreenlockNull: Self = StObject.set(x, "requireScreenlock", null)
    
    inline def setRequireScreenlockUndefined: Self = StObject.set(x, "requireScreenlock", js.undefined)
  }
}
