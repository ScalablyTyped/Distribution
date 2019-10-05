package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotToolresults.Anon_Alt
import typings.gapiDotClientDotToolresults.Anon_AltExecutionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Retrieves a single screenshot cluster by its ID */
  def get(request: Anon_Alt): Request[ScreenshotCluster]
  /**
    * Lists Screenshot Clusters
    *
    * Returns the list of screenshot clusters corresponding to an execution. Screenshot clusters are created after the execution is finished. Clusters are
    * created from a set of screenshots. Between any two screenshots, a matching score is calculated based off their metadata that determines how similar
    * they are. Screenshots are placed in the cluster that has screens which have the highest matching scores.
    */
  def list(request: Anon_AltExecutionId): Request[ListScreenshotClustersResponse]
}

object ClustersResource {
  @scala.inline
  def apply(
    get: Anon_Alt => Request[ScreenshotCluster],
    list: Anon_AltExecutionId => Request[ListScreenshotClustersResponse]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ClustersResource]
  }
}

