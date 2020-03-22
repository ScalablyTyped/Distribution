package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContainer.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZonesResource extends js.Object {
  var clusters: ClustersResource
  var operations: OperationsResource
  /** Returns configuration info about the Container Engine service. */
  def getServerconfig(request: AnonBearertoken): Request_[ServerConfig]
}

object ZonesResource {
  @scala.inline
  def apply(
    clusters: ClustersResource,
    getServerconfig: AnonBearertoken => Request_[ServerConfig],
    operations: OperationsResource
  ): ZonesResource = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any], getServerconfig = js.Any.fromFunction1(getServerconfig), operations = operations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZonesResource]
  }
}

