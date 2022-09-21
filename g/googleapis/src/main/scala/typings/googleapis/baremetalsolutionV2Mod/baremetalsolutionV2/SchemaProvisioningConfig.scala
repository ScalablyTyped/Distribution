package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvisioningConfig extends StObject {
  
  /**
    * Output only. URI to Cloud Console UI view of this provisioning config.
    */
  var cloudConsoleUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email provided to send a confirmation with provisioning config to. Deprecated in favour of email field in request messages.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A service account to enable customers to access instance credentials upon handover.
    */
  var handoverServiceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instances to be created.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceConfig]] = js.undefined
  
  /**
    * Optional. Location name of this ProvisioningConfig. It is optional only for Intake UI transition period.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the provisioning config.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Networks to be created.
    */
  var networks: js.UndefOr[js.Array[SchemaNetworkConfig]] = js.undefined
  
  /**
    * Output only. State of ProvisioningConfig.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional status messages associated with the FAILED state.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A generated ticket id to track provisioning request.
    */
  var ticketId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Last update timestamp.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Volumes to be created.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolumeConfig]] = js.undefined
  
  /**
    * If true, VPC SC is enabled for the cluster.
    */
  var vpcScEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaProvisioningConfig {
  
  inline def apply(): SchemaProvisioningConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvisioningConfig]
  }
  
  extension [Self <: SchemaProvisioningConfig](x: Self) {
    
    inline def setCloudConsoleUri(value: String): Self = StObject.set(x, "cloudConsoleUri", value.asInstanceOf[js.Any])
    
    inline def setCloudConsoleUriNull: Self = StObject.set(x, "cloudConsoleUri", null)
    
    inline def setCloudConsoleUriUndefined: Self = StObject.set(x, "cloudConsoleUri", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setHandoverServiceAccount(value: String): Self = StObject.set(x, "handoverServiceAccount", value.asInstanceOf[js.Any])
    
    inline def setHandoverServiceAccountNull: Self = StObject.set(x, "handoverServiceAccount", null)
    
    inline def setHandoverServiceAccountUndefined: Self = StObject.set(x, "handoverServiceAccount", js.undefined)
    
    inline def setInstances(value: js.Array[SchemaInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworks(value: js.Array[SchemaNetworkConfig]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: SchemaNetworkConfig*): Self = StObject.set(x, "networks", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTicketId(value: String): Self = StObject.set(x, "ticketId", value.asInstanceOf[js.Any])
    
    inline def setTicketIdNull: Self = StObject.set(x, "ticketId", null)
    
    inline def setTicketIdUndefined: Self = StObject.set(x, "ticketId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaVolumeConfig]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaVolumeConfig*): Self = StObject.set(x, "volumes", js.Array(value*))
    
    inline def setVpcScEnabled(value: Boolean): Self = StObject.set(x, "vpcScEnabled", value.asInstanceOf[js.Any])
    
    inline def setVpcScEnabledNull: Self = StObject.set(x, "vpcScEnabled", null)
    
    inline def setVpcScEnabledUndefined: Self = StObject.set(x, "vpcScEnabled", js.undefined)
  }
}
