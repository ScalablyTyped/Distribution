package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Instance Group Manager resource. (== resource_for
  * beta.instanceGroupManagers ==) (== resource_for v1.instanceGroupManagers
  * ==) (== resource_for beta.regionInstanceGroupManagers ==) (== resource_for
  * v1.regionInstanceGroupManagers ==)
  */
trait SchemaInstanceGroupManager extends StObject {
  
  /**
    * The autohealing policy for this managed instance group. You can specify
    * only one value.
    */
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.undefined
  
  /**
    * The base instance name to use for instances in this group. The value must
    * be 1-58 characters long. Instances are named by appending a hyphen and a
    * random four-character string to the base instance name. The base instance
    * name must comply with RFC1035.
    */
  var baseInstanceName: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The creation timestamp for this managed instance group in
    * RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The list of instance actions and the number of instances in
    * this managed instance group that are scheduled for each of those actions.
    */
  var currentActions: js.UndefOr[SchemaInstanceGroupManagerActionsSummary] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Policy specifying intended distribution of instances in regional managed
    * instance group.
    */
  var distributionPolicy: js.UndefOr[SchemaDistributionPolicy] = js.undefined
  
  /**
    * The action to perform in case of zone failure. Only one value is
    * supported, NO_FAILOVER. The default is NO_FAILOVER.
    */
  var failoverAction: js.UndefOr[String] = js.undefined
  
  /**
    * Fingerprint of this resource. This field may be used in optimistic
    * locking. It will be ignored when inserting an InstanceGroupManager. An
    * up-to-date fingerprint must be provided in order to update the
    * InstanceGroupManager, otherwise the request will fail with error 412
    * conditionNotMet.  To see the latest fingerprint, make a get() request to
    * retrieve an InstanceGroupManager.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] A unique identifier for this resource type. The server
    * generates this identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The URL of the Instance Group resource.
    */
  var instanceGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the instance template that is specified for this managed
    * instance group. The group uses this template to create all new instances
    * in the managed instance group.
    */
  var instanceTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The resource type, which is always
    * compute#instanceGroupManager for managed instance groups.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the managed instance group. The name must be 1-63 characters
    * long, and comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Named ports configured for the Instance Groups complementary to this
    * Instance Group Manager.
    */
  var namedPorts: js.UndefOr[js.Array[SchemaNamedPort]] = js.undefined
  
  /**
    * [Output Only] The list of instance actions and the number of instances in
    * this managed instance group that are pending for each of those actions.
    */
  var pendingActions: js.UndefOr[SchemaInstanceGroupManagerPendingActionsSummary] = js.undefined
  
  /**
    * [Output Only] The URL of the region where the managed instance group
    * resides (for regional resources).
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The URL for this managed instance group. The server defines
    * this URL.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The service account to be used as credentials for all operations
    * performed by the managed instance group on instances. The service
    * accounts needs all permissions required to create and delete instances.
    * By default, the service account
    * {projectNumber}@cloudservices.gserviceaccount.com is used.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The status of this managed instance group.
    */
  var status: js.UndefOr[SchemaInstanceGroupManagerStatus] = js.undefined
  
  /**
    * The URLs for all TargetPool resources to which instances in the
    * instanceGroup field are added. The target pools automatically apply to
    * all of the instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The target number of running instances for this managed instance group.
    * Deleting or abandoning instances reduces this number. Resizing the group
    * changes this number.
    */
  var targetSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The update policy for this managed instance group.
    */
  var updatePolicy: js.UndefOr[SchemaInstanceGroupManagerUpdatePolicy] = js.undefined
  
  /**
    * Specifies the instance templates used by this managed instance group to
    * create instances.  Each version is defined by an instanceTemplate. Every
    * template can appear at most once per instance group. This field overrides
    * the top-level instanceTemplate field. Read more about the relationships
    * between these fields. Exactly one version must leave the targetSize field
    * unset. That version will be applied to all remaining instances. For more
    * information, read about canary updates.
    */
  var versions: js.UndefOr[js.Array[SchemaInstanceGroupManagerVersion]] = js.undefined
  
  /**
    * [Output Only] The URL of the zone where the managed instance group is
    * located (for zonal resources).
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaInstanceGroupManager {
  
  inline def apply(): SchemaInstanceGroupManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManager]
  }
  
  extension [Self <: SchemaInstanceGroupManager](x: Self) {
    
    inline def setAutoHealingPolicies(value: js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]): Self = StObject.set(x, "autoHealingPolicies", value.asInstanceOf[js.Any])
    
    inline def setAutoHealingPoliciesUndefined: Self = StObject.set(x, "autoHealingPolicies", js.undefined)
    
    inline def setAutoHealingPoliciesVarargs(value: SchemaInstanceGroupManagerAutoHealingPolicy*): Self = StObject.set(x, "autoHealingPolicies", js.Array(value :_*))
    
    inline def setBaseInstanceName(value: String): Self = StObject.set(x, "baseInstanceName", value.asInstanceOf[js.Any])
    
    inline def setBaseInstanceNameUndefined: Self = StObject.set(x, "baseInstanceName", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCurrentActions(value: SchemaInstanceGroupManagerActionsSummary): Self = StObject.set(x, "currentActions", value.asInstanceOf[js.Any])
    
    inline def setCurrentActionsUndefined: Self = StObject.set(x, "currentActions", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistributionPolicy(value: SchemaDistributionPolicy): Self = StObject.set(x, "distributionPolicy", value.asInstanceOf[js.Any])
    
    inline def setDistributionPolicyUndefined: Self = StObject.set(x, "distributionPolicy", js.undefined)
    
    inline def setFailoverAction(value: String): Self = StObject.set(x, "failoverAction", value.asInstanceOf[js.Any])
    
    inline def setFailoverActionUndefined: Self = StObject.set(x, "failoverAction", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstanceGroup(value: String): Self = StObject.set(x, "instanceGroup", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupUndefined: Self = StObject.set(x, "instanceGroup", js.undefined)
    
    inline def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamedPorts(value: js.Array[SchemaNamedPort]): Self = StObject.set(x, "namedPorts", value.asInstanceOf[js.Any])
    
    inline def setNamedPortsUndefined: Self = StObject.set(x, "namedPorts", js.undefined)
    
    inline def setNamedPortsVarargs(value: SchemaNamedPort*): Self = StObject.set(x, "namedPorts", js.Array(value :_*))
    
    inline def setPendingActions(value: SchemaInstanceGroupManagerPendingActionsSummary): Self = StObject.set(x, "pendingActions", value.asInstanceOf[js.Any])
    
    inline def setPendingActionsUndefined: Self = StObject.set(x, "pendingActions", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setStatus(value: SchemaInstanceGroupManagerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetPools(value: js.Array[String]): Self = StObject.set(x, "targetPools", value.asInstanceOf[js.Any])
    
    inline def setTargetPoolsUndefined: Self = StObject.set(x, "targetPools", js.undefined)
    
    inline def setTargetPoolsVarargs(value: String*): Self = StObject.set(x, "targetPools", js.Array(value :_*))
    
    inline def setTargetSize(value: Double): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
    
    inline def setUpdatePolicy(value: SchemaInstanceGroupManagerUpdatePolicy): Self = StObject.set(x, "updatePolicy", value.asInstanceOf[js.Any])
    
    inline def setUpdatePolicyUndefined: Self = StObject.set(x, "updatePolicy", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaInstanceGroupManagerVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaInstanceGroupManagerVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
