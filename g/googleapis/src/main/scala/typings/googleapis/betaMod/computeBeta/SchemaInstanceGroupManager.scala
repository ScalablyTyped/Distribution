package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManager extends StObject {
  
  /**
    * Specifies configuration that overrides the instance template configuration for the group.
    */
  var allInstancesConfig: js.UndefOr[SchemaInstanceGroupManagerAllInstancesConfig] = js.undefined
  
  /**
    * The autohealing policy for this managed instance group. You can specify only one value.
    */
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.undefined
  
  /**
    * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
    */
  var baseInstanceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The creation timestamp for this managed instance group in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
    */
  var currentActions: js.UndefOr[SchemaInstanceGroupManagerActionsSummary] = js.undefined
  
  /**
    * An optional description of this resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
    */
  var distributionPolicy: js.UndefOr[SchemaDistributionPolicy] = js.undefined
  
  /**
    * The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
    */
  var failoverAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A unique identifier for this resource type. The server generates this identifier.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The URL of the Instance Group resource.
    */
  var instanceGroup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
    */
  var instanceTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The resource type, which is always compute#instanceGroupManager for managed instance groups.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination behavior of the listManagedInstances API method for this managed instance group.
    */
  var listManagedInstancesResults: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
    */
  var namedPorts: js.UndefOr[js.Array[SchemaNamedPort]] = js.undefined
  
  /**
    * [Output Only] The URL of the region where the managed instance group resides (for regional resources).
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The URL for this managed instance group. The server defines this URL.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber\}@cloudservices.gserviceaccount.com is used.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Stateful configuration for this Instanced Group Manager
    */
  var statefulPolicy: js.UndefOr[SchemaStatefulPolicy] = js.undefined
  
  /**
    * [Output Only] The status of this managed instance group.
    */
  var status: js.UndefOr[SchemaInstanceGroupManagerStatus] = js.undefined
  
  /**
    * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
    */
  var targetSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The update policy for this managed instance group.
    */
  var updatePolicy: js.UndefOr[SchemaInstanceGroupManagerUpdatePolicy] = js.undefined
  
  /**
    * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
    */
  var versions: js.UndefOr[js.Array[SchemaInstanceGroupManagerVersion]] = js.undefined
  
  /**
    * [Output Only] The URL of a zone where the managed instance group is located (for zonal resources).
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceGroupManager {
  
  inline def apply(): SchemaInstanceGroupManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManager]
  }
  
  extension [Self <: SchemaInstanceGroupManager](x: Self) {
    
    inline def setAllInstancesConfig(value: SchemaInstanceGroupManagerAllInstancesConfig): Self = StObject.set(x, "allInstancesConfig", value.asInstanceOf[js.Any])
    
    inline def setAllInstancesConfigUndefined: Self = StObject.set(x, "allInstancesConfig", js.undefined)
    
    inline def setAutoHealingPolicies(value: js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]): Self = StObject.set(x, "autoHealingPolicies", value.asInstanceOf[js.Any])
    
    inline def setAutoHealingPoliciesUndefined: Self = StObject.set(x, "autoHealingPolicies", js.undefined)
    
    inline def setAutoHealingPoliciesVarargs(value: SchemaInstanceGroupManagerAutoHealingPolicy*): Self = StObject.set(x, "autoHealingPolicies", js.Array(value*))
    
    inline def setBaseInstanceName(value: String): Self = StObject.set(x, "baseInstanceName", value.asInstanceOf[js.Any])
    
    inline def setBaseInstanceNameNull: Self = StObject.set(x, "baseInstanceName", null)
    
    inline def setBaseInstanceNameUndefined: Self = StObject.set(x, "baseInstanceName", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCurrentActions(value: SchemaInstanceGroupManagerActionsSummary): Self = StObject.set(x, "currentActions", value.asInstanceOf[js.Any])
    
    inline def setCurrentActionsUndefined: Self = StObject.set(x, "currentActions", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistributionPolicy(value: SchemaDistributionPolicy): Self = StObject.set(x, "distributionPolicy", value.asInstanceOf[js.Any])
    
    inline def setDistributionPolicyUndefined: Self = StObject.set(x, "distributionPolicy", js.undefined)
    
    inline def setFailoverAction(value: String): Self = StObject.set(x, "failoverAction", value.asInstanceOf[js.Any])
    
    inline def setFailoverActionNull: Self = StObject.set(x, "failoverAction", null)
    
    inline def setFailoverActionUndefined: Self = StObject.set(x, "failoverAction", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstanceGroup(value: String): Self = StObject.set(x, "instanceGroup", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupNull: Self = StObject.set(x, "instanceGroup", null)
    
    inline def setInstanceGroupUndefined: Self = StObject.set(x, "instanceGroup", js.undefined)
    
    inline def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateNull: Self = StObject.set(x, "instanceTemplate", null)
    
    inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setListManagedInstancesResults(value: String): Self = StObject.set(x, "listManagedInstancesResults", value.asInstanceOf[js.Any])
    
    inline def setListManagedInstancesResultsNull: Self = StObject.set(x, "listManagedInstancesResults", null)
    
    inline def setListManagedInstancesResultsUndefined: Self = StObject.set(x, "listManagedInstancesResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamedPorts(value: js.Array[SchemaNamedPort]): Self = StObject.set(x, "namedPorts", value.asInstanceOf[js.Any])
    
    inline def setNamedPortsUndefined: Self = StObject.set(x, "namedPorts", js.undefined)
    
    inline def setNamedPortsVarargs(value: SchemaNamedPort*): Self = StObject.set(x, "namedPorts", js.Array(value*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setStatefulPolicy(value: SchemaStatefulPolicy): Self = StObject.set(x, "statefulPolicy", value.asInstanceOf[js.Any])
    
    inline def setStatefulPolicyUndefined: Self = StObject.set(x, "statefulPolicy", js.undefined)
    
    inline def setStatus(value: SchemaInstanceGroupManagerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetPools(value: js.Array[String]): Self = StObject.set(x, "targetPools", value.asInstanceOf[js.Any])
    
    inline def setTargetPoolsNull: Self = StObject.set(x, "targetPools", null)
    
    inline def setTargetPoolsUndefined: Self = StObject.set(x, "targetPools", js.undefined)
    
    inline def setTargetPoolsVarargs(value: String*): Self = StObject.set(x, "targetPools", js.Array(value*))
    
    inline def setTargetSize(value: Double): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeNull: Self = StObject.set(x, "targetSize", null)
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
    
    inline def setUpdatePolicy(value: SchemaInstanceGroupManagerUpdatePolicy): Self = StObject.set(x, "updatePolicy", value.asInstanceOf[js.Any])
    
    inline def setUpdatePolicyUndefined: Self = StObject.set(x, "updatePolicy", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaInstanceGroupManagerVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaInstanceGroupManagerVersion*): Self = StObject.set(x, "versions", js.Array(value*))
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
