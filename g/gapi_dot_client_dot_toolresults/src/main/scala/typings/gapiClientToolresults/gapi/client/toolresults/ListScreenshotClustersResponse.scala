package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListScreenshotClustersResponse extends js.Object {
  /** The set of clustres associated with an execution Always set */
  var clusters: js.UndefOr[js.Array[ScreenshotCluster]] = js.undefined
}

object ListScreenshotClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[ScreenshotCluster] = null): ListScreenshotClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListScreenshotClustersResponse]
  }
}

