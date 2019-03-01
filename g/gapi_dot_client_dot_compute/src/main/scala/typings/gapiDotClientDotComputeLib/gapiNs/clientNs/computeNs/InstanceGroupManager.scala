package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManager extends js.Object {
  /**
    * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a
    * random four-character string to the base instance name. The base instance name must comply with RFC1035.
    */
  var baseInstanceName: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The creation timestamp for this managed instance group in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions. */
  var currentActions: js.UndefOr[InstanceGroupManagerActionsSummary] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The fingerprint of the resource data. You can use this optional field for optimistic locking when you update the resource. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A unique identifier for this resource type. The server generates this identifier. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The URL of the Instance Group resource. */
  var instanceGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the
    * managed instance group.
    */
  var instanceTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The resource type, which is always compute#instanceGroupManager for managed instance groups. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Named ports configured for the Instance Groups complementary to this Instance Group Manager. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.undefined
  /** [Output Only] The URL of the region where the managed instance group resides (for regional resources). */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The URL for this managed instance group. The server defines this URL. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the
    * instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The target number of running instances for this managed instance group. Deleting or abandoning instances reduces this number. Resizing the group
    * changes this number.
    */
  var targetSize: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] The URL of the zone where the managed instance group is located (for zonal resources). */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object InstanceGroupManager {
  @scala.inline
  def apply(
    baseInstanceName: java.lang.String = null,
    creationTimestamp: java.lang.String = null,
    currentActions: InstanceGroupManagerActionsSummary = null,
    description: java.lang.String = null,
    fingerprint: java.lang.String = null,
    id: java.lang.String = null,
    instanceGroup: java.lang.String = null,
    instanceTemplate: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    namedPorts: js.Array[NamedPort] = null,
    region: java.lang.String = null,
    selfLink: java.lang.String = null,
    targetPools: js.Array[java.lang.String] = null,
    targetSize: scala.Int | scala.Double = null,
    zone: java.lang.String = null
  ): InstanceGroupManager = {
    val __obj = js.Dynamic.literal()
    if (baseInstanceName != null) __obj.updateDynamic("baseInstanceName")(baseInstanceName)
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (currentActions != null) __obj.updateDynamic("currentActions")(currentActions)
    if (description != null) __obj.updateDynamic("description")(description)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (id != null) __obj.updateDynamic("id")(id)
    if (instanceGroup != null) __obj.updateDynamic("instanceGroup")(instanceGroup)
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namedPorts != null) __obj.updateDynamic("namedPorts")(namedPorts)
    if (region != null) __obj.updateDynamic("region")(region)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (targetPools != null) __obj.updateDynamic("targetPools")(targetPools)
    if (targetSize != null) __obj.updateDynamic("targetSize")(targetSize.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[InstanceGroupManager]
  }
}

