package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZonesResource extends js.Object {
  var clusters: ClustersResource
  var operations: OperationsResource
  /** Returns configuration info about the Container Engine service. */
  def getServerconfig(request: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ServerConfig]
}

object ZonesResource {
  @scala.inline
  def apply(
    clusters: ClustersResource,
    getServerconfig: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ServerConfig]
    ],
    operations: OperationsResource
  ): ZonesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clusters")(clusters)
    __obj.updateDynamic("getServerconfig")(getServerconfig)
    __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[ZonesResource]
  }
}

