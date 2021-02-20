package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceProperties extends StObject {
  
  /**
    * Enables instances created based on this template to send packets with
    * source IP addresses other than their own and receive packets with
    * destination IP addresses other than their own. If these instances will be
    * used as an IP gateway or it will be set as the next-hop in a Route
    * resource, specify true. If unsure, leave this set to false. See the
    * Enable IP forwarding documentation for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional text description for the instances that are created from this
    * instance template.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * An array of disks that are associated with the instances that are created
    * from this template.
    */
  var disks: js.UndefOr[js.Array[SchemaAttachedDisk]] = js.native
  
  /**
    * Display Device properties to enable support for remote display products
    * like: Teradici, VNC and TeamViewer
    */
  var displayDevice: js.UndefOr[SchemaDisplayDevice] = js.native
  
  /**
    * A list of guest accelerator cards&#39; type and count to use for
    * instances created from the instance template.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
  
  /**
    * Labels to apply to instances that are created from this template.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The machine type to use for instances that are created from this
    * template.
    */
  var machineType: js.UndefOr[String] = js.native
  
  /**
    * The metadata key/value pairs to assign to instances that are created from
    * this template. These pairs can consist of custom metadata or predefined
    * keys. See Project and instance metadata for more information.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.native
  
  /**
    * Minimum cpu/platform to be used by this instance. The instance may be
    * scheduled on the specified or newer cpu/platform. Applicable values are
    * the friendly names of CPU platforms, such as minCpuPlatform: &quot;Intel
    * Haswell&quot; or minCpuPlatform: &quot;Intel Sandy Bridge&quot;. For more
    * information, read Specifying a Minimum CPU Platform.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /**
    * An array of network access configurations for this interface.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.native
  
  /**
    * The configuration of desired reservations which this Instance could
    * consume capacity from.
    */
  var reservationAffinity: js.UndefOr[SchemaReservationAffinity] = js.native
  
  /**
    * Specifies the scheduling options for the instances that are created from
    * this template.
    */
  var scheduling: js.UndefOr[SchemaScheduling] = js.native
  
  /**
    * A list of service accounts with specified scopes. Access tokens for these
    * service accounts are available to the instances that are created from
    * this template. Use metadata queries to obtain the access tokens for these
    * instances.
    */
  var serviceAccounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  
  var shieldedInstanceConfig: js.UndefOr[SchemaShieldedInstanceConfig] = js.native
  
  /**
    * Specifies the Shielded VM options for the instances that are created from
    * this template.
    */
  var shieldedVmConfig: js.UndefOr[SchemaShieldedVmConfig] = js.native
  
  /**
    * A list of tags to apply to the instances that are created from this
    * template. The tags identify valid sources or targets for network
    * firewalls. The setTags method can modify this list of tags. Each tag
    * within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[SchemaTags] = js.native
}
object SchemaInstanceProperties {
  
  @scala.inline
  def apply(): SchemaInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceProperties]
  }
  
  @scala.inline
  implicit class SchemaInstancePropertiesMutableBuilder[Self <: SchemaInstanceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanIpForward(value: Boolean): Self = StObject.set(x, "canIpForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanIpForwardUndefined: Self = StObject.set(x, "canIpForward", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisks(value: js.Array[SchemaAttachedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: SchemaAttachedDisk*): Self = StObject.set(x, "disks", js.Array(value :_*))
    
    @scala.inline
    def setDisplayDevice(value: SchemaDisplayDevice): Self = StObject.set(x, "displayDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDeviceUndefined: Self = StObject.set(x, "displayDevice", js.undefined)
    
    @scala.inline
    def setGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    @scala.inline
    def setGuestAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: js.Array[SchemaNetworkInterface]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: SchemaNetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setReservationAffinity(value: SchemaReservationAffinity): Self = StObject.set(x, "reservationAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationAffinityUndefined: Self = StObject.set(x, "reservationAffinity", js.undefined)
    
    @scala.inline
    def setScheduling(value: SchemaScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    @scala.inline
    def setServiceAccounts(value: js.Array[SchemaServiceAccount]): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountsUndefined: Self = StObject.set(x, "serviceAccounts", js.undefined)
    
    @scala.inline
    def setServiceAccountsVarargs(value: SchemaServiceAccount*): Self = StObject.set(x, "serviceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setShieldedInstanceConfig(value: SchemaShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    @scala.inline
    def setShieldedVmConfig(value: SchemaShieldedVmConfig): Self = StObject.set(x, "shieldedVmConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShieldedVmConfigUndefined: Self = StObject.set(x, "shieldedVmConfig", js.undefined)
    
    @scala.inline
    def setTags(value: SchemaTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
