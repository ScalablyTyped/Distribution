package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListScreenshotClustersResponse extends js.Object {
  /** The set of clustres associated with an execution Always set */
  var clusters: js.UndefOr[js.Array[ScreenshotCluster]] = js.native
}

object ListScreenshotClustersResponse {
  @scala.inline
  def apply(): ListScreenshotClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScreenshotClustersResponse]
  }
  @scala.inline
  implicit class ListScreenshotClustersResponseOps[Self <: ListScreenshotClustersResponse] (val x: Self) extends AnyVal {
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
    def setClustersVarargs(value: ScreenshotCluster*): Self = this.set("clusters", js.Array(value :_*))
    @scala.inline
    def setClusters(value: js.Array[ScreenshotCluster]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
  }
  
}

