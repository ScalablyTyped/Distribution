package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsResource extends js.Object {
  /**
    * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read
    * Adding instances for more information.
    */
  def addInstances(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroup): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of instance groups and sorts them by zone. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[InstanceGroupAggregatedList]
  /**
    * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read
    * Deleting an instance group for more information.
    */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroup): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified instance group. Get a list of available instance groups by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroupKey): gapiDotClientLib.gapiNs.clientNs.Request[InstanceGroup]
  /** Creates an instance group in the specified project using the parameters that are included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of instance groups that are located in the specified project and zone. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[InstanceGroupList]
  /** Lists the instances in the specified instance group. */
  def listInstances(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilterInstanceGroup): gapiDotClientLib.gapiNs.clientNs.Request[InstanceGroupsListInstances]
  /**
    * Removes one or more instances from the specified instance group, but does not delete those instances.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration
    * before the VM instance is removed or deleted.
    */
  def removeInstances(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroup): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the named ports for the specified instance group. */
  def setNamedPorts(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroup): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

