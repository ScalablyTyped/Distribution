package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.gapiClientToolresults.anon.Alt
import typings.gapiClientToolresults.anon.ExecutionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClustersResource extends js.Object {
  /** Retrieves a single screenshot cluster by its ID */
  def get(request: Alt): Request[ScreenshotCluster] = js.native
  /**
    * Lists Screenshot Clusters
    *
    * Returns the list of screenshot clusters corresponding to an execution. Screenshot clusters are created after the execution is finished. Clusters are
    * created from a set of screenshots. Between any two screenshots, a matching score is calculated based off their metadata that determines how similar
    * they are. Screenshots are placed in the cluster that has screens which have the highest matching scores.
    */
  def list(request: ExecutionId): Request[ListScreenshotClustersResponse] = js.native
}

object ClustersResource {
  @scala.inline
  def apply(
    get: Alt => Request[ScreenshotCluster],
    list: ExecutionId => Request[ListScreenshotClustersResponse]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ClustersResource]
  }
  @scala.inline
  implicit class ClustersResourceOps[Self <: ClustersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Alt => Request[ScreenshotCluster]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ExecutionId => Request[ListScreenshotClustersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

