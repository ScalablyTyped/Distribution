package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1AssociationInfo extends StObject {
  
  /**
    * The name of the base entitlement, for which this entitlement is an add-on.
    */
  var baseEntitlement: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1AssociationInfo {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1AssociationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1AssociationInfo]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1AssociationInfo](x: Self) {
    
    inline def setBaseEntitlement(value: String): Self = StObject.set(x, "baseEntitlement", value.asInstanceOf[js.Any])
    
    inline def setBaseEntitlementNull: Self = StObject.set(x, "baseEntitlement", null)
    
    inline def setBaseEntitlementUndefined: Self = StObject.set(x, "baseEntitlement", js.undefined)
  }
}
