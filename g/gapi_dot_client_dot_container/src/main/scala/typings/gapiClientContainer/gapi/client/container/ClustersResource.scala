package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContainer.anon.Alt
import typings.gapiClientContainer.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  var nodePools: NodePoolsResource
  /** Sets the addons of a specific cluster. */
  def addons(request: Alt): Request[Operation]
  /** Completes master IP rotation. */
  def completeIpRotation(request: Alt): Request[Operation]
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
  def create(request: Bearertoken): Request[Operation]
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
  def delete(request: Alt): Request[Operation]
  /** Gets the details of a specific cluster. */
  def get(request: Alt): Request[Cluster]
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def legacyAbac(request: Alt): Request[Operation]
  /**
    * Lists all clusters owned by a project in either the specified zone or all
    * zones.
    */
  def list(request: Bearertoken): Request[ListClustersResponse]
  /** Sets the locations of a specific cluster. */
  def locations(request: Alt): Request[Operation]
  /** Sets the logging service of a specific cluster. */
  def logging(request: Alt): Request[Operation]
  /** Updates the master of a specific cluster. */
  def master(request: Alt): Request[Operation]
  /** Sets the monitoring service of a specific cluster. */
  def monitoring(request: Alt): Request[Operation]
  /** Sets labels on a cluster. */
  def resourceLabels(request: Alt): Request[Operation]
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: Alt): Request[Operation]
  /**
    * Used to set master auth materials. Currently supports :-
    * Changing the admin password of a specific cluster.
    * This can be either via password generation or explicitly set the password.
    */
  def setMasterAuth(request: Alt): Request[Operation]
  /** Enables/Disables Network Policy for a cluster. */
  def setNetworkPolicy(request: Alt): Request[Operation]
  /** Start master IP rotation. */
  def startIpRotation(request: Alt): Request[Operation]
  /** Updates the settings of a specific cluster. */
  def update(request: Alt): Request[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    addons: Alt => Request[Operation],
    completeIpRotation: Alt => Request[Operation],
    create: Bearertoken => Request[Operation],
    delete: Alt => Request[Operation],
    get: Alt => Request[Cluster],
    legacyAbac: Alt => Request[Operation],
    list: Bearertoken => Request[ListClustersResponse],
    locations: Alt => Request[Operation],
    logging: Alt => Request[Operation],
    master: Alt => Request[Operation],
    monitoring: Alt => Request[Operation],
    nodePools: NodePoolsResource,
    resourceLabels: Alt => Request[Operation],
    setMaintenancePolicy: Alt => Request[Operation],
    setMasterAuth: Alt => Request[Operation],
    setNetworkPolicy: Alt => Request[Operation],
    startIpRotation: Alt => Request[Operation],
    update: Alt => Request[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(addons = js.Any.fromFunction1(addons), completeIpRotation = js.Any.fromFunction1(completeIpRotation), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), legacyAbac = js.Any.fromFunction1(legacyAbac), list = js.Any.fromFunction1(list), locations = js.Any.fromFunction1(locations), logging = js.Any.fromFunction1(logging), master = js.Any.fromFunction1(master), monitoring = js.Any.fromFunction1(monitoring), nodePools = nodePools.asInstanceOf[js.Any], resourceLabels = js.Any.fromFunction1(resourceLabels), setMaintenancePolicy = js.Any.fromFunction1(setMaintenancePolicy), setMasterAuth = js.Any.fromFunction1(setMasterAuth), setNetworkPolicy = js.Any.fromFunction1(setNetworkPolicy), startIpRotation = js.Any.fromFunction1(startIpRotation), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ClustersResource]
  }
}

