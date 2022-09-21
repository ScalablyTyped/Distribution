package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceConfig extends StObject {
  
  /**
    * If true networks can be from different projects of the same vendor account.
    */
  var accountNetworksEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Client network address. Filled if InstanceConfig.multivlan_config is false.
    */
  var clientNetwork: js.UndefOr[SchemaNetworkAddress] = js.undefined
  
  /**
    * Whether the instance should be provisioned with Hyperthreading enabled.
    */
  var hyperthreading: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A transient unique identifier to idenfity an instance within an ProvisioningConfig request.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instance type. [Available types](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
    */
  var instanceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of logical interfaces for the instance. The number of logical interfaces will be the same as number of hardware bond/nic on the chosen network template. Filled if InstanceConfig.multivlan_config is true.
    */
  var logicalInterfaces: js.UndefOr[js.Array[SchemaGoogleCloudBaremetalsolutionV2LogicalInterface]] = js.undefined
  
  /**
    * Output only. The name of the instance config.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of network configuration on the instance.
    */
  var networkConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Server network template name. Filled if InstanceConfig.multivlan_config is true.
    */
  var networkTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OS image to initialize the instance. [Available images](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
    */
  var osImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Private network address, if any. Filled if InstanceConfig.multivlan_config is false.
    */
  var privateNetwork: js.UndefOr[SchemaNetworkAddress] = js.undefined
  
  /**
    * User note field, it can be used by customers to add additional information for the BMS Ops team .
    */
  var userNote: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceConfig {
  
  inline def apply(): SchemaInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceConfig]
  }
  
  extension [Self <: SchemaInstanceConfig](x: Self) {
    
    inline def setAccountNetworksEnabled(value: Boolean): Self = StObject.set(x, "accountNetworksEnabled", value.asInstanceOf[js.Any])
    
    inline def setAccountNetworksEnabledNull: Self = StObject.set(x, "accountNetworksEnabled", null)
    
    inline def setAccountNetworksEnabledUndefined: Self = StObject.set(x, "accountNetworksEnabled", js.undefined)
    
    inline def setClientNetwork(value: SchemaNetworkAddress): Self = StObject.set(x, "clientNetwork", value.asInstanceOf[js.Any])
    
    inline def setClientNetworkUndefined: Self = StObject.set(x, "clientNetwork", js.undefined)
    
    inline def setHyperthreading(value: Boolean): Self = StObject.set(x, "hyperthreading", value.asInstanceOf[js.Any])
    
    inline def setHyperthreadingNull: Self = StObject.set(x, "hyperthreading", null)
    
    inline def setHyperthreadingUndefined: Self = StObject.set(x, "hyperthreading", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeNull: Self = StObject.set(x, "instanceType", null)
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setLogicalInterfaces(value: js.Array[SchemaGoogleCloudBaremetalsolutionV2LogicalInterface]): Self = StObject.set(x, "logicalInterfaces", value.asInstanceOf[js.Any])
    
    inline def setLogicalInterfacesUndefined: Self = StObject.set(x, "logicalInterfaces", js.undefined)
    
    inline def setLogicalInterfacesVarargs(value: SchemaGoogleCloudBaremetalsolutionV2LogicalInterface*): Self = StObject.set(x, "logicalInterfaces", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkConfig(value: String): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigNull: Self = StObject.set(x, "networkConfig", null)
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setNetworkTemplate(value: String): Self = StObject.set(x, "networkTemplate", value.asInstanceOf[js.Any])
    
    inline def setNetworkTemplateNull: Self = StObject.set(x, "networkTemplate", null)
    
    inline def setNetworkTemplateUndefined: Self = StObject.set(x, "networkTemplate", js.undefined)
    
    inline def setOsImage(value: String): Self = StObject.set(x, "osImage", value.asInstanceOf[js.Any])
    
    inline def setOsImageNull: Self = StObject.set(x, "osImage", null)
    
    inline def setOsImageUndefined: Self = StObject.set(x, "osImage", js.undefined)
    
    inline def setPrivateNetwork(value: SchemaNetworkAddress): Self = StObject.set(x, "privateNetwork", value.asInstanceOf[js.Any])
    
    inline def setPrivateNetworkUndefined: Self = StObject.set(x, "privateNetwork", js.undefined)
    
    inline def setUserNote(value: String): Self = StObject.set(x, "userNote", value.asInstanceOf[js.Any])
    
    inline def setUserNoteNull: Self = StObject.set(x, "userNote", null)
    
    inline def setUserNoteUndefined: Self = StObject.set(x, "userNote", js.undefined)
  }
}
