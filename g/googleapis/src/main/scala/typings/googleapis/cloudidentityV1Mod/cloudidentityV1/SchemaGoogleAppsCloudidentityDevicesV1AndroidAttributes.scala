package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1AndroidAttributes extends StObject {
  
  /**
    * Whether applications from unknown sources can be installed on device.
    */
  var enabledUnknownSources: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this account is on an owner/primary profile. For phones, only true for owner profiles. Android 4+ devices can have secondary or restricted user profiles.
    */
  var ownerProfileAccount: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Ownership privileges on device.
    */
  var ownershipPrivilege: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether device supports Android work profiles. If false, this service will not block access to corp data even if an administrator turns on the "Enforce Work Profile" policy.
    */
  var supportsWorkProfile: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1AndroidAttributes {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1AndroidAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1AndroidAttributes]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1AndroidAttributes](x: Self) {
    
    inline def setEnabledUnknownSources(value: Boolean): Self = StObject.set(x, "enabledUnknownSources", value.asInstanceOf[js.Any])
    
    inline def setEnabledUnknownSourcesNull: Self = StObject.set(x, "enabledUnknownSources", null)
    
    inline def setEnabledUnknownSourcesUndefined: Self = StObject.set(x, "enabledUnknownSources", js.undefined)
    
    inline def setOwnerProfileAccount(value: Boolean): Self = StObject.set(x, "ownerProfileAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerProfileAccountNull: Self = StObject.set(x, "ownerProfileAccount", null)
    
    inline def setOwnerProfileAccountUndefined: Self = StObject.set(x, "ownerProfileAccount", js.undefined)
    
    inline def setOwnershipPrivilege(value: String): Self = StObject.set(x, "ownershipPrivilege", value.asInstanceOf[js.Any])
    
    inline def setOwnershipPrivilegeNull: Self = StObject.set(x, "ownershipPrivilege", null)
    
    inline def setOwnershipPrivilegeUndefined: Self = StObject.set(x, "ownershipPrivilege", js.undefined)
    
    inline def setSupportsWorkProfile(value: Boolean): Self = StObject.set(x, "supportsWorkProfile", value.asInstanceOf[js.Any])
    
    inline def setSupportsWorkProfileNull: Self = StObject.set(x, "supportsWorkProfile", null)
    
    inline def setSupportsWorkProfileUndefined: Self = StObject.set(x, "supportsWorkProfile", js.undefined)
  }
}
