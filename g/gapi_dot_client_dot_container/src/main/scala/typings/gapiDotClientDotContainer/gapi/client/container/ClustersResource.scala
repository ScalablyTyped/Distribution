package typings.gapiDotClientDotContainer.gapi.client.container

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotContainer.Anon_AccesstokenAlt
import typings.gapiDotClientDotContainer.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  var nodePools: NodePoolsResource
  /** Sets the addons of a specific cluster. */
  def addons(request: Anon_AccesstokenAlt): Request[Operation]
  /** Completes master IP rotation. */
  def completeIpRotation(request: Anon_AccesstokenAlt): Request[Operation]
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
  def create(request: Anon_AccesstokenAltBearertoken): Request[Operation]
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
  def delete(request: Anon_AccesstokenAlt): Request[Operation]
  /** Gets the details of a specific cluster. */
  def get(request: Anon_AccesstokenAlt): Request[Cluster]
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def legacyAbac(request: Anon_AccesstokenAlt): Request[Operation]
  /**
    * Lists all clusters owned by a project in either the specified zone or all
    * zones.
    */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListClustersResponse]
  /** Sets the locations of a specific cluster. */
  def locations(request: Anon_AccesstokenAlt): Request[Operation]
  /** Sets the logging service of a specific cluster. */
  def logging(request: Anon_AccesstokenAlt): Request[Operation]
  /** Updates the master of a specific cluster. */
  def master(request: Anon_AccesstokenAlt): Request[Operation]
  /** Sets the monitoring service of a specific cluster. */
  def monitoring(request: Anon_AccesstokenAlt): Request[Operation]
  /** Sets labels on a cluster. */
  def resourceLabels(request: Anon_AccesstokenAlt): Request[Operation]
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: Anon_AccesstokenAlt): Request[Operation]
  /**
    * Used to set master auth materials. Currently supports :-
    * Changing the admin password of a specific cluster.
    * This can be either via password generation or explicitly set the password.
    */
  def setMasterAuth(request: Anon_AccesstokenAlt): Request[Operation]
  /** Enables/Disables Network Policy for a cluster. */
  def setNetworkPolicy(request: Anon_AccesstokenAlt): Request[Operation]
  /** Start master IP rotation. */
  def startIpRotation(request: Anon_AccesstokenAlt): Request[Operation]
  /** Updates the settings of a specific cluster. */
  def update(request: Anon_AccesstokenAlt): Request[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    addons: Anon_AccesstokenAlt => Request[Operation],
    completeIpRotation: Anon_AccesstokenAlt => Request[Operation],
    create: Anon_AccesstokenAltBearertoken => Request[Operation],
    delete: Anon_AccesstokenAlt => Request[Operation],
    get: Anon_AccesstokenAlt => Request[Cluster],
    legacyAbac: Anon_AccesstokenAlt => Request[Operation],
    list: Anon_AccesstokenAltBearertoken => Request[ListClustersResponse],
    locations: Anon_AccesstokenAlt => Request[Operation],
    logging: Anon_AccesstokenAlt => Request[Operation],
    master: Anon_AccesstokenAlt => Request[Operation],
    monitoring: Anon_AccesstokenAlt => Request[Operation],
    nodePools: NodePoolsResource,
    resourceLabels: Anon_AccesstokenAlt => Request[Operation],
    setMaintenancePolicy: Anon_AccesstokenAlt => Request[Operation],
    setMasterAuth: Anon_AccesstokenAlt => Request[Operation],
    setNetworkPolicy: Anon_AccesstokenAlt => Request[Operation],
    startIpRotation: Anon_AccesstokenAlt => Request[Operation],
    update: Anon_AccesstokenAlt => Request[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(addons = js.Any.fromFunction1(addons), completeIpRotation = js.Any.fromFunction1(completeIpRotation), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), legacyAbac = js.Any.fromFunction1(legacyAbac), list = js.Any.fromFunction1(list), locations = js.Any.fromFunction1(locations), logging = js.Any.fromFunction1(logging), master = js.Any.fromFunction1(master), monitoring = js.Any.fromFunction1(monitoring), nodePools = nodePools, resourceLabels = js.Any.fromFunction1(resourceLabels), setMaintenancePolicy = js.Any.fromFunction1(setMaintenancePolicy), setMasterAuth = js.Any.fromFunction1(setMasterAuth), setNetworkPolicy = js.Any.fromFunction1(setNetworkPolicy), startIpRotation = js.Any.fromFunction1(startIpRotation), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ClustersResource]
  }
}

