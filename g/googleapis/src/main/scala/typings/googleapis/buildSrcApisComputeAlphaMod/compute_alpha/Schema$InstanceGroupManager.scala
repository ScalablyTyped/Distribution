package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Instance Group Manager resource. (== resource_for
  * beta.instanceGroupManagers ==) (== resource_for v1.instanceGroupManagers
  * ==) (== resource_for beta.regionInstanceGroupManagers ==) (== resource_for
  * v1.regionInstanceGroupManagers ==)
  */
@js.native
trait Schema$InstanceGroupManager extends js.Object {
  /**
    * The autohealing policy for this managed instance group. You can specify
    * only one value.
    */
  var autoHealingPolicies: js.UndefOr[js.Array[Schema$InstanceGroupManagerAutoHealingPolicy]] = js.native
  /**
    * The base instance name to use for instances in this group. The value must
    * be 1-58 characters long. Instances are named by appending a hyphen and a
    * random four-character string to the base instance name. The base instance
    * name must comply with RFC1035.
    */
  var baseInstanceName: js.UndefOr[String] = js.native
  /**
    * [Output Only] The creation timestamp for this managed instance group in
    * RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] The list of instance actions and the number of instances in
    * this managed instance group that are scheduled for each of those actions.
    */
  var currentActions: js.UndefOr[Schema$InstanceGroupManagerActionsSummary] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Policy specifying intended distribution of instances in regional managed
    * instance group.
    */
  var distributionPolicy: js.UndefOr[Schema$DistributionPolicy] = js.native
  /**
    * The action to perform in case of zone failure. Only one value is
    * supported, NO_FAILOVER. The default is NO_FAILOVER.
    */
  var failoverAction: js.UndefOr[String] = js.native
  /**
    * Fingerprint of this resource. This field may be used in optimistic
    * locking. It will be ignored when inserting an InstanceGroupManager. An
    * up-to-date fingerprint must be provided in order to update the
    * InstanceGroupManager, otherwise the request will fail with error 412
    * conditionNotMet.  To see the latest fingerprint, make a get() request to
    * retrieve an InstanceGroupManager.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * [Output Only] A unique identifier for this resource type. The server
    * generates this identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL of the Instance Group resource.
    */
  var instanceGroup: js.UndefOr[String] = js.native
  /**
    * The URL of the instance template that is specified for this managed
    * instance group. The group uses this template to create all new instances
    * in the managed instance group.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
  /**
    * [Output Only] The resource type, which is always
    * compute#instanceGroupManager for managed instance groups.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the managed instance group. The name must be 1-63 characters
    * long, and comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Named ports configured for the Instance Groups complementary to this
    * Instance Group Manager.
    */
  var namedPorts: js.UndefOr[js.Array[Schema$NamedPort]] = js.native
  /**
    * [Output Only] The list of instance actions and the number of instances in
    * this managed instance group that are pending for each of those actions.
    */
  var pendingActions: js.UndefOr[Schema$InstanceGroupManagerPendingActionsSummary] = js.native
  /**
    * [Output Only] The URL of the region where the managed instance group
    * resides (for regional resources).
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL for this managed instance group. The server defines
    * this URL.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * The service account to be used as credentials for all operations
    * performed by the managed instance group on instances. The service
    * accounts needs all permissions required to create and delete instances.
    * By default, the service account
    * {projectNumber}@cloudservices.gserviceaccount.com is used.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  /**
    * Stateful configuration for this Instanced Group Manager
    */
  var statefulPolicy: js.UndefOr[Schema$StatefulPolicy] = js.native
  /**
    * [Output Only] The status of this managed instance group.
    */
  var status: js.UndefOr[Schema$InstanceGroupManagerStatus] = js.native
  /**
    * The URLs for all TargetPool resources to which instances in the
    * instanceGroup field are added. The target pools automatically apply to
    * all of the instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
  /**
    * The target number of running instances for this managed instance group.
    * Deleting or abandoning instances reduces this number. Resizing the group
    * changes this number.
    */
  var targetSize: js.UndefOr[Double] = js.native
  /**
    * The update policy for this managed instance group.
    */
  var updatePolicy: js.UndefOr[Schema$InstanceGroupManagerUpdatePolicy] = js.native
  /**
    * Specifies the instance templates used by this managed instance group to
    * create instances.  Each version is defined by an instanceTemplate. Every
    * template can appear at most once per instance group. This field overrides
    * the top-level instanceTemplate field. Read more about the relationships
    * between these fields. Exactly one version must leave the targetSize field
    * unset. That version will be applied to all remaining instances. For more
    * information, read about canary updates.
    */
  var versions: js.UndefOr[js.Array[Schema$InstanceGroupManagerVersion]] = js.native
  /**
    * [Output Only] The URL of the zone where the managed instance group is
    * located (for zonal resources).
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$InstanceGroupManager {
  @scala.inline
  def apply(
    autoHealingPolicies: js.Array[Schema$InstanceGroupManagerAutoHealingPolicy] = null,
    baseInstanceName: String = null,
    creationTimestamp: String = null,
    currentActions: Schema$InstanceGroupManagerActionsSummary = null,
    description: String = null,
    distributionPolicy: Schema$DistributionPolicy = null,
    failoverAction: String = null,
    fingerprint: String = null,
    id: String = null,
    instanceGroup: String = null,
    instanceTemplate: String = null,
    kind: String = null,
    name: String = null,
    namedPorts: js.Array[Schema$NamedPort] = null,
    pendingActions: Schema$InstanceGroupManagerPendingActionsSummary = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    serviceAccount: String = null,
    statefulPolicy: Schema$StatefulPolicy = null,
    status: Schema$InstanceGroupManagerStatus = null,
    targetPools: js.Array[String] = null,
    targetSize: Int | Double = null,
    updatePolicy: Schema$InstanceGroupManagerUpdatePolicy = null,
    versions: js.Array[Schema$InstanceGroupManagerVersion] = null,
    zone: String = null
  ): Schema$InstanceGroupManager = {
    val __obj = js.Dynamic.literal()
    if (autoHealingPolicies != null) __obj.updateDynamic("autoHealingPolicies")(autoHealingPolicies.asInstanceOf[js.Any])
    if (baseInstanceName != null) __obj.updateDynamic("baseInstanceName")(baseInstanceName.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (currentActions != null) __obj.updateDynamic("currentActions")(currentActions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (distributionPolicy != null) __obj.updateDynamic("distributionPolicy")(distributionPolicy.asInstanceOf[js.Any])
    if (failoverAction != null) __obj.updateDynamic("failoverAction")(failoverAction.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instanceGroup != null) __obj.updateDynamic("instanceGroup")(instanceGroup.asInstanceOf[js.Any])
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedPorts != null) __obj.updateDynamic("namedPorts")(namedPorts.asInstanceOf[js.Any])
    if (pendingActions != null) __obj.updateDynamic("pendingActions")(pendingActions.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (statefulPolicy != null) __obj.updateDynamic("statefulPolicy")(statefulPolicy.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetPools != null) __obj.updateDynamic("targetPools")(targetPools.asInstanceOf[js.Any])
    if (targetSize != null) __obj.updateDynamic("targetSize")(targetSize.asInstanceOf[js.Any])
    if (updatePolicy != null) __obj.updateDynamic("updatePolicy")(updatePolicy.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManager]
  }
}

