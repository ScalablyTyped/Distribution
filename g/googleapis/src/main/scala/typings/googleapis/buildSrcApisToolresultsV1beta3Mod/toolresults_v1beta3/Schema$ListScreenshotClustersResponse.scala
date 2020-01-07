package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListScreenshotClustersResponse extends js.Object {
  /**
    * The set of clusters associated with an execution Always set
    */
  var clusters: js.UndefOr[js.Array[Schema$ScreenshotCluster]] = js.native
}

object Schema$ListScreenshotClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[Schema$ScreenshotCluster] = null): Schema$ListScreenshotClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListScreenshotClustersResponse]
  }
}

