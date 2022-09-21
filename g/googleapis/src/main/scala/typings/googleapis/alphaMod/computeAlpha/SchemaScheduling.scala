package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScheduling extends StObject {
  
  /**
    * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
    */
  var automaticRestart: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
    */
  var availabilityDomain: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Current number of vCPUs available for VM. 0 or unset means default vCPUs of the current machine type.
    */
  var currentCpus: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Current amount of memory (in MB) available for VM. 0 or unset means default amount of memory of the current machine type.
    */
  var currentMemoryMb: js.UndefOr[String | Null] = js.undefined
  
  var dynamicResizeProperties: js.UndefOr[SchemaSchedulingDynamicResizeProperties] = js.undefined
  
  /**
    * Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
    */
  var hostErrorTimeoutSeconds: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the termination action for the instance.
    */
  var instanceTerminationAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines whether the instance is tolerant of higher cpu latency. This can only be set during instance creation, or when the instance is not currently running. It must not be set if the preemptible option is also set.
    */
  var latencyTolerant: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
    */
  var locationHint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the number of hours after VM instance creation where the VM won't be scheduled for maintenance.
    */
  var maintenanceFreezeDurationHours: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * For more information about maintenance intervals, see Setting maintenance intervals.
    */
  var maintenanceInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the max run duration for the given instance. If specified, the instance termination action will be performed at the end of the run duration.
    */
  var maxRunDuration: js.UndefOr[SchemaDuration] = js.undefined
  
  /**
    * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
    */
  var minNodeCpus: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
    */
  var nodeAffinities: js.UndefOr[js.Array[SchemaSchedulingNodeAffinity]] = js.undefined
  
  /**
    * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM host maintenance policy.
    */
  var onHostMaintenance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
    */
  var preemptible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the provisioning model of the instance.
    */
  var provisioningModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the timestamp, when the instance will be terminated, in RFC3339 text format. If specified, the instance termination action will be performed at the termination time.
    */
  var terminationTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaScheduling {
  
  inline def apply(): SchemaScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduling]
  }
  
  extension [Self <: SchemaScheduling](x: Self) {
    
    inline def setAutomaticRestart(value: Boolean): Self = StObject.set(x, "automaticRestart", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRestartNull: Self = StObject.set(x, "automaticRestart", null)
    
    inline def setAutomaticRestartUndefined: Self = StObject.set(x, "automaticRestart", js.undefined)
    
    inline def setAvailabilityDomain(value: Double): Self = StObject.set(x, "availabilityDomain", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityDomainNull: Self = StObject.set(x, "availabilityDomain", null)
    
    inline def setAvailabilityDomainUndefined: Self = StObject.set(x, "availabilityDomain", js.undefined)
    
    inline def setCurrentCpus(value: Double): Self = StObject.set(x, "currentCpus", value.asInstanceOf[js.Any])
    
    inline def setCurrentCpusNull: Self = StObject.set(x, "currentCpus", null)
    
    inline def setCurrentCpusUndefined: Self = StObject.set(x, "currentCpus", js.undefined)
    
    inline def setCurrentMemoryMb(value: String): Self = StObject.set(x, "currentMemoryMb", value.asInstanceOf[js.Any])
    
    inline def setCurrentMemoryMbNull: Self = StObject.set(x, "currentMemoryMb", null)
    
    inline def setCurrentMemoryMbUndefined: Self = StObject.set(x, "currentMemoryMb", js.undefined)
    
    inline def setDynamicResizeProperties(value: SchemaSchedulingDynamicResizeProperties): Self = StObject.set(x, "dynamicResizeProperties", value.asInstanceOf[js.Any])
    
    inline def setDynamicResizePropertiesUndefined: Self = StObject.set(x, "dynamicResizeProperties", js.undefined)
    
    inline def setHostErrorTimeoutSeconds(value: Double): Self = StObject.set(x, "hostErrorTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setHostErrorTimeoutSecondsNull: Self = StObject.set(x, "hostErrorTimeoutSeconds", null)
    
    inline def setHostErrorTimeoutSecondsUndefined: Self = StObject.set(x, "hostErrorTimeoutSeconds", js.undefined)
    
    inline def setInstanceTerminationAction(value: String): Self = StObject.set(x, "instanceTerminationAction", value.asInstanceOf[js.Any])
    
    inline def setInstanceTerminationActionNull: Self = StObject.set(x, "instanceTerminationAction", null)
    
    inline def setInstanceTerminationActionUndefined: Self = StObject.set(x, "instanceTerminationAction", js.undefined)
    
    inline def setLatencyTolerant(value: Boolean): Self = StObject.set(x, "latencyTolerant", value.asInstanceOf[js.Any])
    
    inline def setLatencyTolerantNull: Self = StObject.set(x, "latencyTolerant", null)
    
    inline def setLatencyTolerantUndefined: Self = StObject.set(x, "latencyTolerant", js.undefined)
    
    inline def setLocationHint(value: String): Self = StObject.set(x, "locationHint", value.asInstanceOf[js.Any])
    
    inline def setLocationHintNull: Self = StObject.set(x, "locationHint", null)
    
    inline def setLocationHintUndefined: Self = StObject.set(x, "locationHint", js.undefined)
    
    inline def setMaintenanceFreezeDurationHours(value: Double): Self = StObject.set(x, "maintenanceFreezeDurationHours", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceFreezeDurationHoursNull: Self = StObject.set(x, "maintenanceFreezeDurationHours", null)
    
    inline def setMaintenanceFreezeDurationHoursUndefined: Self = StObject.set(x, "maintenanceFreezeDurationHours", js.undefined)
    
    inline def setMaintenanceInterval(value: String): Self = StObject.set(x, "maintenanceInterval", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceIntervalNull: Self = StObject.set(x, "maintenanceInterval", null)
    
    inline def setMaintenanceIntervalUndefined: Self = StObject.set(x, "maintenanceInterval", js.undefined)
    
    inline def setMaxRunDuration(value: SchemaDuration): Self = StObject.set(x, "maxRunDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxRunDurationUndefined: Self = StObject.set(x, "maxRunDuration", js.undefined)
    
    inline def setMinNodeCpus(value: Double): Self = StObject.set(x, "minNodeCpus", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCpusNull: Self = StObject.set(x, "minNodeCpus", null)
    
    inline def setMinNodeCpusUndefined: Self = StObject.set(x, "minNodeCpus", js.undefined)
    
    inline def setNodeAffinities(value: js.Array[SchemaSchedulingNodeAffinity]): Self = StObject.set(x, "nodeAffinities", value.asInstanceOf[js.Any])
    
    inline def setNodeAffinitiesUndefined: Self = StObject.set(x, "nodeAffinities", js.undefined)
    
    inline def setNodeAffinitiesVarargs(value: SchemaSchedulingNodeAffinity*): Self = StObject.set(x, "nodeAffinities", js.Array(value*))
    
    inline def setOnHostMaintenance(value: String): Self = StObject.set(x, "onHostMaintenance", value.asInstanceOf[js.Any])
    
    inline def setOnHostMaintenanceNull: Self = StObject.set(x, "onHostMaintenance", null)
    
    inline def setOnHostMaintenanceUndefined: Self = StObject.set(x, "onHostMaintenance", js.undefined)
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleNull: Self = StObject.set(x, "preemptible", null)
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setProvisioningModel(value: String): Self = StObject.set(x, "provisioningModel", value.asInstanceOf[js.Any])
    
    inline def setProvisioningModelNull: Self = StObject.set(x, "provisioningModel", null)
    
    inline def setProvisioningModelUndefined: Self = StObject.set(x, "provisioningModel", js.undefined)
    
    inline def setTerminationTime(value: String): Self = StObject.set(x, "terminationTime", value.asInstanceOf[js.Any])
    
    inline def setTerminationTimeNull: Self = StObject.set(x, "terminationTime", null)
    
    inline def setTerminationTimeUndefined: Self = StObject.set(x, "terminationTime", js.undefined)
  }
}
