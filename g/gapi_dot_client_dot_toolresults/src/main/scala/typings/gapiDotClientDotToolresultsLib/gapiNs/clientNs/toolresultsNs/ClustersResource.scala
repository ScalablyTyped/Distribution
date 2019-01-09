package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Retrieves a single screenshot cluster by its ID */
  def get(request: gapiDotClientDotToolresultsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ScreenshotCluster]
  /**
    * Lists Screenshot Clusters
    *
    * Returns the list of screenshot clusters corresponding to an execution. Screenshot clusters are created after the execution is finished. Clusters are
    * created from a set of screenshots. Between any two screenshots, a matching score is calculated based off their metadata that determines how similar
    * they are. Screenshots are placed in the cluster that has screens which have the highest matching scores.
    */
  def list(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionId): gapiDotClientLib.gapiNs.clientNs.Request[ListScreenshotClustersResponse]
}

