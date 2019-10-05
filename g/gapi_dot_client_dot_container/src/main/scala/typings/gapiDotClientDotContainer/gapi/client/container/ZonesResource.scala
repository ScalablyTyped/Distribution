package typings.gapiDotClientDotContainer.gapi.client.container

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotContainer.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZonesResource extends js.Object {
  var clusters: ClustersResource
  var operations: OperationsResource
  /** Returns configuration info about the Container Engine service. */
  def getServerconfig(request: Anon_AccesstokenAltBearertoken): Request[ServerConfig]
}

object ZonesResource {
  @scala.inline
  def apply(
    clusters: ClustersResource,
    getServerconfig: Anon_AccesstokenAltBearertoken => Request[ServerConfig],
    operations: OperationsResource
  ): ZonesResource = {
    val __obj = js.Dynamic.literal(clusters = clusters, getServerconfig = js.Any.fromFunction1(getServerconfig), operations = operations)
  
    __obj.asInstanceOf[ZonesResource]
  }
}

