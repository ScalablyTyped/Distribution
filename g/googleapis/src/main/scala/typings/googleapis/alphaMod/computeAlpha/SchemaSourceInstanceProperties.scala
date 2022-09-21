package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceInstanceProperties extends StObject {
  
  /**
    * Enables instances created based on this machine image to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
    */
  var canIpForward: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the instance created from this machine image should be protected against deletion.
    */
  var deletionProtection: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An optional text description for the instances that are created from this machine image.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of disks that are associated with the instances that are created from this machine image.
    */
  var disks: js.UndefOr[js.Array[SchemaSavedAttachedDisk]] = js.undefined
  
  /**
    * A list of guest accelerator cards' type and count to use for instances created from this machine image.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.undefined
  
  /**
    * KeyRevocationActionType of the instance. Supported options are "STOP" and "NONE". The default value is "NONE" if it is not specified.
    */
  var keyRevocationActionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels to apply to instances that are created from this machine image.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The machine type to use for instances that are created from this machine image.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metadata key/value pairs to assign to instances that are created from this machine image. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.undefined
  
  /**
    * Minimum cpu/platform to be used by instances created from this machine image. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
    */
  var minCpuPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of network access configurations for this interface.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.undefined
  
  /**
    * PostKeyRevocationActionType of the instance.
    */
  var postKeyRevocationActionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the scheduling options for the instances that are created from this machine image.
    */
  var scheduling: js.UndefOr[SchemaScheduling] = js.undefined
  
  /**
    * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
    */
  var serviceAccounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.undefined
  
  /**
    * A list of tags to apply to the instances that are created from this machine image. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[SchemaTags] = js.undefined
}
object SchemaSourceInstanceProperties {
  
  inline def apply(): SchemaSourceInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceInstanceProperties]
  }
  
  extension [Self <: SchemaSourceInstanceProperties](x: Self) {
    
    inline def setCanIpForward(value: Boolean): Self = StObject.set(x, "canIpForward", value.asInstanceOf[js.Any])
    
    inline def setCanIpForwardNull: Self = StObject.set(x, "canIpForward", null)
    
    inline def setCanIpForwardUndefined: Self = StObject.set(x, "canIpForward", js.undefined)
    
    inline def setDeletionProtection(value: Boolean): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionNull: Self = StObject.set(x, "deletionProtection", null)
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisks(value: js.Array[SchemaSavedAttachedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaSavedAttachedDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    inline def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    inline def setGuestAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value*))
    
    inline def setKeyRevocationActionType(value: String): Self = StObject.set(x, "keyRevocationActionType", value.asInstanceOf[js.Any])
    
    inline def setKeyRevocationActionTypeNull: Self = StObject.set(x, "keyRevocationActionType", null)
    
    inline def setKeyRevocationActionTypeUndefined: Self = StObject.set(x, "keyRevocationActionType", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMetadata(value: SchemaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformNull: Self = StObject.set(x, "minCpuPlatform", null)
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    inline def setNetworkInterfaces(value: js.Array[SchemaNetworkInterface]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: SchemaNetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setPostKeyRevocationActionType(value: String): Self = StObject.set(x, "postKeyRevocationActionType", value.asInstanceOf[js.Any])
    
    inline def setPostKeyRevocationActionTypeNull: Self = StObject.set(x, "postKeyRevocationActionType", null)
    
    inline def setPostKeyRevocationActionTypeUndefined: Self = StObject.set(x, "postKeyRevocationActionType", js.undefined)
    
    inline def setScheduling(value: SchemaScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setServiceAccounts(value: js.Array[SchemaServiceAccount]): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountsUndefined: Self = StObject.set(x, "serviceAccounts", js.undefined)
    
    inline def setServiceAccountsVarargs(value: SchemaServiceAccount*): Self = StObject.set(x, "serviceAccounts", js.Array(value*))
    
    inline def setTags(value: SchemaTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
