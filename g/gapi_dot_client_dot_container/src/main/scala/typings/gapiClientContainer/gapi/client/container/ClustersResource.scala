package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContainer.AnonAccesstokenAlt
import typings.gapiClientContainer.AnonAccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  var nodePools: NodePoolsResource
  /** Sets the addons of a specific cluster. */
  def addons(request: AnonAccesstokenAlt): Request_[Operation]
  /** Completes master IP rotation. */
  def completeIpRotation(request: AnonAccesstokenAlt): Request_[Operation]
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
  def create(request: AnonAccesstokenAltBearertoken): Request_[Operation]
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
  def delete(request: AnonAccesstokenAlt): Request_[Operation]
  /** Gets the details of a specific cluster. */
  def get(request: AnonAccesstokenAlt): Request_[Cluster]
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def legacyAbac(request: AnonAccesstokenAlt): Request_[Operation]
  /**
    * Lists all clusters owned by a project in either the specified zone or all
    * zones.
    */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListClustersResponse]
  /** Sets the locations of a specific cluster. */
  def locations(request: AnonAccesstokenAlt): Request_[Operation]
  /** Sets the logging service of a specific cluster. */
  def logging(request: AnonAccesstokenAlt): Request_[Operation]
  /** Updates the master of a specific cluster. */
  def master(request: AnonAccesstokenAlt): Request_[Operation]
  /** Sets the monitoring service of a specific cluster. */
  def monitoring(request: AnonAccesstokenAlt): Request_[Operation]
  /** Sets labels on a cluster. */
  def resourceLabels(request: AnonAccesstokenAlt): Request_[Operation]
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: AnonAccesstokenAlt): Request_[Operation]
  /**
    * Used to set master auth materials. Currently supports :-
    * Changing the admin password of a specific cluster.
    * This can be either via password generation or explicitly set the password.
    */
  def setMasterAuth(request: AnonAccesstokenAlt): Request_[Operation]
  /** Enables/Disables Network Policy for a cluster. */
  def setNetworkPolicy(request: AnonAccesstokenAlt): Request_[Operation]
  /** Start master IP rotation. */
  def startIpRotation(request: AnonAccesstokenAlt): Request_[Operation]
  /** Updates the settings of a specific cluster. */
  def update(request: AnonAccesstokenAlt): Request_[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    addons: AnonAccesstokenAlt => Request_[Operation],
    completeIpRotation: AnonAccesstokenAlt => Request_[Operation],
    create: AnonAccesstokenAltBearertoken => Request_[Operation],
    delete: AnonAccesstokenAlt => Request_[Operation],
    get: AnonAccesstokenAlt => Request_[Cluster],
    legacyAbac: AnonAccesstokenAlt => Request_[Operation],
    list: AnonAccesstokenAltBearertoken => Request_[ListClustersResponse],
    locations: AnonAccesstokenAlt => Request_[Operation],
    logging: AnonAccesstokenAlt => Request_[Operation],
    master: AnonAccesstokenAlt => Request_[Operation],
    monitoring: AnonAccesstokenAlt => Request_[Operation],
    nodePools: NodePoolsResource,
    resourceLabels: AnonAccesstokenAlt => Request_[Operation],
    setMaintenancePolicy: AnonAccesstokenAlt => Request_[Operation],
    setMasterAuth: AnonAccesstokenAlt => Request_[Operation],
    setNetworkPolicy: AnonAccesstokenAlt => Request_[Operation],
    startIpRotation: AnonAccesstokenAlt => Request_[Operation],
    update: AnonAccesstokenAlt => Request_[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(addons = js.Any.fromFunction1(addons), completeIpRotation = js.Any.fromFunction1(completeIpRotation), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), legacyAbac = js.Any.fromFunction1(legacyAbac), list = js.Any.fromFunction1(list), locations = js.Any.fromFunction1(locations), logging = js.Any.fromFunction1(logging), master = js.Any.fromFunction1(master), monitoring = js.Any.fromFunction1(monitoring), nodePools = nodePools.asInstanceOf[js.Any], resourceLabels = js.Any.fromFunction1(resourceLabels), setMaintenancePolicy = js.Any.fromFunction1(setMaintenancePolicy), setMasterAuth = js.Any.fromFunction1(setMasterAuth), setNetworkPolicy = js.Any.fromFunction1(setNetworkPolicy), startIpRotation = js.Any.fromFunction1(startIpRotation), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ClustersResource]
  }
}

