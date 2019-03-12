package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  var nodePools: NodePoolsResource
  /** Sets the addons of a specific cluster. */
  def addons(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Completes master IP rotation. */
  def completeIpRotation(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Creates a cluster, consisting of the specified number and type of Google
    * Compute Engine instances.
    *
    * By default, the cluster is created in the project's
    * [default network](/compute/docs/networks-and-firewalls#networks).
    *
    * One firewall is added for the cluster. After cluster creation,
    * the cluster creates routes for each node to allow the containers
    * on that node to communicate with all other instances in the
    * cluster.
    *
    * Finally, an entry is added to the project's global metadata indicating
    * which CIDR range is being used by the cluster.
    */
  def create(request: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Deletes the cluster, including the Kubernetes endpoint and all worker
    * nodes.
    *
    * Firewalls and routes that were configured during cluster creation
    * are also deleted.
    *
    * Other Google Compute Engine resources that might be in use by the cluster
    * (e.g. load balancer resources) will not be deleted if they weren't present
    * at the initial create time.
    */
  def delete(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets the details of a specific cluster. */
  def get(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Cluster]
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def legacyAbac(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Lists all clusters owned by a project in either the specified zone or all
    * zones.
    */
  def list(request: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListClustersResponse]
  /** Sets the locations of a specific cluster. */
  def locations(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the logging service of a specific cluster. */
  def logging(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates the master of a specific cluster. */
  def master(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the monitoring service of a specific cluster. */
  def monitoring(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets labels on a cluster. */
  def resourceLabels(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Used to set master auth materials. Currently supports :-
    * Changing the admin password of a specific cluster.
    * This can be either via password generation or explicitly set the password.
    */
  def setMasterAuth(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Enables/Disables Network Policy for a cluster. */
  def setNetworkPolicy(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Start master IP rotation. */
  def startIpRotation(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates the settings of a specific cluster. */
  def update(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    addons: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    completeIpRotation: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    create: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    delete: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Cluster],
    legacyAbac: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ListClustersResponse],
    locations: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    logging: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    master: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    monitoring: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    nodePools: NodePoolsResource,
    resourceLabels: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    setMaintenancePolicy: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    setMasterAuth: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    setNetworkPolicy: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    startIpRotation: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    update: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(addons = js.Any.fromFunction1(addons), completeIpRotation = js.Any.fromFunction1(completeIpRotation), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), legacyAbac = js.Any.fromFunction1(legacyAbac), list = js.Any.fromFunction1(list), locations = js.Any.fromFunction1(locations), logging = js.Any.fromFunction1(logging), master = js.Any.fromFunction1(master), monitoring = js.Any.fromFunction1(monitoring), nodePools = nodePools, resourceLabels = js.Any.fromFunction1(resourceLabels), setMaintenancePolicy = js.Any.fromFunction1(setMaintenancePolicy), setMasterAuth = js.Any.fromFunction1(setMasterAuth), setNetworkPolicy = js.Any.fromFunction1(setNetworkPolicy), startIpRotation = js.Any.fromFunction1(startIpRotation), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ClustersResource]
  }
}

